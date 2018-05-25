package menu.commands.inside;

import Iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideEditProfileCommand implements Command{
	Inside inside;
	
	public InsideEditProfileCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		inside.editProfile(iface);
	}
}
