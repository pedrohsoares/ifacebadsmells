package menu.commands;

import iface.IFace;

public interface CommandController {

	public void setCommand(Integer commandOption);
	public void optionSelected(IFace iface);
	
}
