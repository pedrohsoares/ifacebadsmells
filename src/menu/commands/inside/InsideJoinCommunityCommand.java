package menu.commands.inside;

import Iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideJoinCommunityCommand implements Command {
	Inside inside;
	
	public InsideJoinCommunityCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.joinCommunity(iface);
	}
}
