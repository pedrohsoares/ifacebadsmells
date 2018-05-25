package menu.commands.begin;

import iface.IFace;
import menu.commands.Begin;
import utils.Command;

public class BeginExitCommand implements Command{
	Begin begin;
	
	public BeginExitCommand(Begin begin) {
		this.begin = begin;
	}
 
	@Override
	public void execute(IFace iface) {
		begin.exit(iface);
	}
}
