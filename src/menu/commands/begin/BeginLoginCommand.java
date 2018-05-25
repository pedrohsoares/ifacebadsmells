package menu.commands.begin;

import Iface.IFace;
import menu.commands.Begin;
import utils.Command;

public class BeginLoginCommand implements Command{
	Begin begin;
	
	public BeginLoginCommand(Begin begin) {
		this.begin = begin;
	}
 
	@Override
	public void execute(IFace iface) {
		begin.login(iface);
	}


}
