package menu.commands.inside;

import iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideManageCommunityCommand implements Command {
	Inside inside;
	
	public InsideManageCommunityCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.manageCommunity(iface);
	}
}
