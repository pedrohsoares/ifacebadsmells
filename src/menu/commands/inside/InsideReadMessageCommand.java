package menu.commands.inside;

import Iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideReadMessageCommand implements Command{
	Inside inside;
	
	public InsideReadMessageCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.readMessages(iface);
	}
}
