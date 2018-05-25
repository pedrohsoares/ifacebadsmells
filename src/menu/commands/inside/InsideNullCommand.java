package menu.commands.inside;

import iface.IFace;
import menu.commands.Inside;
import utils.Command;

public class InsideNullCommand implements Command {
	Inside inside;
	
	public InsideNullCommand(Inside inside) {
		this.inside = inside;
	}
 
	@Override
	public void execute(IFace iface) {
		System.out.println("Nao foi possivel efetuar esta operacao");
	}
	

}
