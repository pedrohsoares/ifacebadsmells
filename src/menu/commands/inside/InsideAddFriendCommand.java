package menu.commands.inside;

import Iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideAddFriendCommand implements Command{
	Inside inside;
	
	public InsideAddFriendCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.addFriend(iface);
	}
}
