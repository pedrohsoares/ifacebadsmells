package menu.commands.inside;

import Iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideDeleteAccountCommand implements Command{
	Inside inside;
	
	public InsideDeleteAccountCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.deleteAccount(iface);
	}
}
