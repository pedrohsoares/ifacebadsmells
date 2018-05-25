package menu.commands.inside;

import Iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideCreateCommunityCommand implements Command{
	Inside inside;
	
	public InsideCreateCommunityCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.createCommunity(iface);
	}
}
