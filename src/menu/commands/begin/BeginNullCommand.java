package menu.commands.begin;

import Iface.IFace;
import menu.commands.Begin;
import utils.Command;

public class BeginNullCommand implements Command {

	Begin begin;
	
	public BeginNullCommand(Begin begin) {
		this.begin = begin;
	}
 
	@Override
	public void execute(IFace iface) {
		System.out.println("Nao foi possivel efetuar esta operacao");
	}


}
