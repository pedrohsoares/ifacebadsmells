package utils;

import java.util.ArrayList;

import models.Community;
import models.Friends;
import models.Messages;
import models.Profile;

public interface UsersHandler {

	public void readMessages();
	public void addCommunity(Community name);
	public Community getOwnCommunity();
	public void setOwnCommunity(Community name);
	public void allFriends();
	public void allCommunities();
	public void messagesFriendDelete(String name);
	public void allMessages();
	public String getName();
	public void setName(String name);
	public String getPassword();
	public void setPassword(String password);
	public String getLogin();
	public void setLogin(String login);
	public Profile getProfile();
	public void setProfile(Profile profile);
	public Friends getFriends();
	public void setFriends(Friends friends);
	public ArrayList<Messages> getMessages();
	public void setMessages(ArrayList<Messages> messages);
	public ArrayList<Community> getCommunities();
	public void setCommunities(ArrayList<Community> communities);
	
}
