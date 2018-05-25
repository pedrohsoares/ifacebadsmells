package menu.commands;

import iface.IFace;
import models.Users;

public class Begin {
	
	public void login(IFace iface) {
		String login = iface.getMenu().login();
		String password = iface.getMenu().password();
		
		for(Users user : iface.getUsers()) {
			if(user.getLogin().equals(login)) {
				if(user.getPassword().equals(password)) {
					iface.setCurrentUser(user);
					System.out.println("Login efetuado");
					return;
				}	
				break;
			}
		}
		
		System.out.println("Login ou Senha incorreto!");
	}
	
	public void register(IFace iface) {
		String login = iface.getMenu().login();
		String password = iface.getMenu().password();
		String name = iface.getMenu().name();

		for(Users user : iface.getUsers()) {
			if(user.getLogin().equals(login)) {
				System.out.println("Ja existe usuario com esse login, tente novamente!");
				return;
			}
		}
		
		iface.getUsers().add(new Users(login,password,name));
		System.out.println("Usuario cadastrado com sucesso!");
	}
	
	public void exit(IFace iface) {
		iface.setWorking(false);
	}
	
	
}
