package menu.commands;

import iface.IFace;
import menu.commands.inside.InsideAddFriendCommand;
import menu.commands.inside.InsideCreateCommunityCommand;
import menu.commands.inside.InsideDeleteAccountCommand;
import menu.commands.inside.InsideEditProfileCommand;
import menu.commands.inside.InsideFriendRequestCommand;
import menu.commands.inside.InsideJoinCommunityCommand;
import menu.commands.inside.InsideLeaveAccountCommand;
import menu.commands.inside.InsideManageCommunityCommand;
import menu.commands.inside.InsideNullCommand;
import menu.commands.inside.InsideReadMessageCommand;
import menu.commands.inside.InsideRecoverInformationCommand;
import menu.commands.inside.InsideSendMessageCommand;
import utils.Command;

public class InsideController implements CommandController{
	Command slot;
	Inside inside = new Inside();
	
	InsideAddFriendCommand addFriendCommand = new InsideAddFriendCommand(inside);
	InsideEditProfileCommand editProfileCommand = new InsideEditProfileCommand(inside);
	InsideSendMessageCommand sendMessageCommand = new InsideSendMessageCommand(inside);
	InsideCreateCommunityCommand createCommunityCommand = new InsideCreateCommunityCommand(inside);
	InsideManageCommunityCommand manageCommunityCommand = new InsideManageCommunityCommand(inside);
	InsideJoinCommunityCommand joinCommunityCommand = new InsideJoinCommunityCommand(inside);
	InsideRecoverInformationCommand recoverInformationCommand = new InsideRecoverInformationCommand(inside);
	InsideDeleteAccountCommand deleteAccountCommand = new InsideDeleteAccountCommand(inside);
	InsideFriendRequestCommand friendRequestCommand = new InsideFriendRequestCommand(inside);
	InsideReadMessageCommand readMessageCommand = new InsideReadMessageCommand(inside);
	InsideLeaveAccountCommand leaveAccountCommand = new InsideLeaveAccountCommand(inside);
	InsideNullCommand nullCommand = new InsideNullCommand(inside);
	 
	public void setCommand(Integer commandOption) {
		switch(commandOption) {
			case 0:
				slot = leaveAccountCommand;
				break;
			case 1:
				slot = editProfileCommand;
				break;
			case 2:
				slot = addFriendCommand;
				break;
			case 3:
				slot = sendMessageCommand;
				break;
			case 4:
				slot = createCommunityCommand;
				break;
			case 5:
				slot = manageCommunityCommand;
				break;
			case 6:
				slot = joinCommunityCommand;
				break;
			case 7:
				slot = recoverInformationCommand;
				break;
			case 8:
				slot = deleteAccountCommand;
				break;
			case 9:
				slot = friendRequestCommand;
				break;
			case 10:
				slot = readMessageCommand;
				break;
			default:
				slot = nullCommand;
		}
		
		
	}
 
	public void optionSelected(IFace iface) {
		slot.execute(iface);
	}
}
