package menu.commands.begin;

import Iface.IFace;
import menu.commands.Begin;
import utils.Command;

public class BeginRegisterCommand implements Command{
	Begin begin;
	
	public BeginRegisterCommand(Begin begin) {
		this.begin = begin;
	}
 
	@Override
	public void execute(IFace iface) {
		begin.register(iface);
	}
}
