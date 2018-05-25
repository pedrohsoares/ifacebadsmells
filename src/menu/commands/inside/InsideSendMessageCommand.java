package menu.commands.inside;

import Iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideSendMessageCommand implements Command {
	Inside inside;
	
	public InsideSendMessageCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.sendMessage(iface);
	}
	

}
