package menu.commands;

import iface.IFace;
import editprofile.commands.EditProfileController;
import models.Community;
import models.Messages;
import models.NullUsers;
import models.Users;

public class Inside {
	
	public void editProfile(IFace iface) {
		EditProfileController controller = new EditProfileController();
		int optionChoosed = iface.getMenu().editProfile();
		controller.setCommand(optionChoosed);
		controller.optionSelected(iface.getCurrentUser().getProfile());
	}
	
	public void addFriend(IFace iface) {
		String name = iface.getMenu().addFriends();
		for(Users user: iface.getUsers()) {
			if(name.equals(user.getName())){
				user.getFriends().addRequest(iface.getCurrentUser().getName());
				System.out.println("Aguardando aceitacao de amizade por parte do seu amigo");
				break;
			}
		}
		
		System.out.println("Usuario nao encontrado!");
	}
	
	public void sendMessage(IFace iface) {
		String name = iface.getMenu().messageReceiver();
		for(Users user : iface.getUsers()) {
			if(user.getName().equals(name)) {
				String message = iface.getMenu().sendMessage();
				iface.getCurrentUser().getMessages().add(new Messages(true, message, user.getName(), true));
				user.getMessages().add(new Messages(false, message, iface.getCurrentUser().getName(), false));
			}
		}
		
		System.out.println("Usuario nao encontrado!");
	}
	
	public void createCommunity(IFace iface) {
		String name = iface.getMenu().communityName();
		for(Community community : iface.getCommunity()) {
			if(community.getName().equals(name)) {
				System.out.println("Ja existe uma comunidade com esse nome!");
				return;
			}
		}
		Community newCommunity = new Community((Users) iface.getCurrentUser(),name,iface.getMenu().communityDescription());
		iface.getCommunity().add(newCommunity);
		iface.getCurrentUser().setOwnCommunity(newCommunity);
		System.out.println("Comunidade criada com sucesso!");
	}
	
	public void manageCommunity(IFace iface) {
		Community community = iface.getCurrentUser().getOwnCommunity();
		
		try {
			int optionChoosed = iface.getMenu().manageCommunity(iface.getCurrentUser().getName());
			if(optionChoosed == 1)
				community.getAllParticipantsName();
			else if(optionChoosed == 2)
				community.deleteParticipant(iface.getMenu().deleteParticipant());				
		}catch(NullPointerException err) {
			System.out.println("Voce nao tem comunidade cadastrada em seu nome!");
		}
	}
	
	public void joinCommunity(IFace iface) {
		String name = iface.getMenu().joinCommunity();
		for(Community community: iface.getCommunity()) {
			if(community.getName().equals(name)) {
				iface.getCurrentUser().addCommunity(community);
				community.addParticipant((Users) iface.getCurrentUser());
				
				System.out.println("Voce entrou na comunidade!");
				return;
			}
		}
		
		System.out.println("Nao foi possivel encontrar comunidade com este nome!");
	}
	
	public void recoverInformations(IFace iface) {
		int optionChoosed = iface.getMenu().recoverInformation();
		
		switch(optionChoosed) {
			case 1:
				System.out.println("Nome: "+ iface.getCurrentUser().getName());
				iface.getCurrentUser().getProfile().allInformations();
				break;
			case 2:
				iface.getCurrentUser().allMessages();
				break;
			case 3:
				iface.getCurrentUser().allFriends();
				break;
			case 4:
				iface.getCurrentUser().allCommunities();
				break;
			default:
				System.out.println("Opcao invalida!");
		}
	}
	
	public void deleteAccount(IFace iface) {
		String name = iface.getCurrentUser().getName();
		for(Users user : iface.getUsers())
			user.messagesFriendDelete(name);
		iface.getUsers().remove(iface.getCurrentUser());
		
		iface.setCurrentUser(new NullUsers());
	}
	
	public void friendsRequest(IFace iface) {
		String name;
		int size = iface.getCurrentUser().getFriends().requestsSize();
		if(size == 0)
			System.out.println("Voce nao possui solicitacao de amizade!");
		
		while(size > 0) {
			name = iface.getCurrentUser().getFriends().verifyRequests();
			if(!name.equals("Empty"))
				for(Users u: iface.getUsers())
					if(u.getName().equals(name))
						u.getFriends().addFriends(iface.getCurrentUser().getName());
			--size;
		}
	}
	
	public void readMessages(IFace iface) {
		iface.getCurrentUser().readMessages();
	}
	
	public void leaveAccount(IFace iface) {
		iface.setCurrentUser(new NullUsers());
	}
}
