package menu.commands.inside;

import iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideRecoverInformationCommand implements Command {
	Inside inside;
	
	public InsideRecoverInformationCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.recoverInformations(iface);
	}
}
