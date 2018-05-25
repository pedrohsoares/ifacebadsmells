package menu.commands.inside;

import iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideFriendRequestCommand implements Command {
	Inside inside;
	
	public InsideFriendRequestCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.friendsRequest(iface);
	}
}
