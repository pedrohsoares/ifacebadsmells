package iface;

import java.util.ArrayList;

import menu.commands.BeginController;
import menu.commands.InsideController;
import models.Community;
import models.NullUsers;
import models.Users;
import utils.UsersHandler;

public class IFace {
	private Menu menu;
	private ArrayList<Users> users;
	private ArrayList<Community> community;
	private UsersHandler currentUser;
	private boolean working;
	
	public IFace() {
		menu = new Menu();
		users = new ArrayList<Users>();
		community = new ArrayList<Community>();
		currentUser = new NullUsers();
		working = true;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public ArrayList<Users> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<Users> users) {
		this.users = users;
	}

	public ArrayList<Community> getCommunity() {
		return community;
	}

	public void setCommunity(ArrayList<Community> community) {
		this.community = community;
	}

	public UsersHandler getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(UsersHandler currentUser) {
		this.currentUser = currentUser;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}
	
	public void execute() {
		int optionChoosed;
		BeginController beginController = new BeginController();
		InsideController insideController = new InsideController();
		
		while(working) {
			if(currentUser instanceof NullUsers) {
				optionChoosed = menu.begin();
				beginController.setCommand(optionChoosed);
				beginController.optionSelected(this);
			}else {
				optionChoosed = menu.inside();
				insideController.setCommand(optionChoosed);
				insideController.optionSelected(this);
			}
		}
	}
	
}
