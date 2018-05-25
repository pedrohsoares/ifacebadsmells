package menu.commands;

import iface.IFace;
import menu.commands.begin.BeginExitCommand;
import menu.commands.begin.BeginLoginCommand;
import menu.commands.begin.BeginNullCommand;
import menu.commands.begin.BeginRegisterCommand;
import utils.Command;

public class BeginController implements CommandController{
	Begin begin = new Begin();
	BeginLoginCommand loginCommand = new BeginLoginCommand(begin);
	BeginRegisterCommand registerCommand = new BeginRegisterCommand(begin);
	BeginExitCommand exitCommand = new BeginExitCommand(begin);
	BeginNullCommand nullCommand = new BeginNullCommand(begin);
	Command slot;
	 
	public void setCommand(Integer commandOption) {
		switch(commandOption) {
			case 0:
				slot = exitCommand;
				break;
			case 1:
				slot = loginCommand;
				break;
			case 2:
				slot = registerCommand;
				break;
			default:
				slot = nullCommand;
		}
	}
 
	public void optionSelected(IFace iface) {
		slot.execute(iface);
	}
}
