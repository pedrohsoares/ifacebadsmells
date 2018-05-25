package menu.commands.inside;

import Iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideLeaveAccountCommand implements Command{
	Inside inside;
	
	public InsideLeaveAccountCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.leaveAccount(iface);
	}
}
