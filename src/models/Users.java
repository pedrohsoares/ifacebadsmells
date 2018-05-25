package models;
import java.util.*;

import utils.UsersHandler;

public class Users implements UsersHandler {
	
	private Profile profile = new Profile();
	private Friends friends = new Friends();
	private ArrayList<Messages> messages = new ArrayList<Messages>();
	private ArrayList<Community> communities = new ArrayList<Community>();
	private Community ownCommunity;
	private String login;
	private String password;
	private String name;
	
	public Users(String login, String password, String name){
		this.login = login;
		this.password = password;
		this.name = name;
	}
	
	public void readMessages()
	{
		boolean flag = true;
		for(Messages m: messages)
			if(m.viewMessage() == false)
			{
				m.readMessage();
				flag = false;
			}
		
		if(flag == true)
		{
			System.out.println("Voce nao tem mensagens ou ja visualizou todas!");
			System.out.println("Volte para o menu e recupere informacoes da sua conta para ver mensagens ja vistas");
		}
				
	}
	
	public void addCommunity(Community community)
	{
		communities.add(community);
	}
	
	public Community getOwnCommunity()
	{
		return this.ownCommunity;
	}
	
	public void setOwnCommunity(Community community)
	{
		this.ownCommunity = community;
	}
	
	public void allFriends()
	{
		friends.allFriends();
	}
	
	public void allCommunities()
	{
		try {
			System.out.println("Voce eh dono da comunidade " + ownCommunity.getName());
		}catch(NullPointerException err) {
			System.out.println("Voce nao eh dono de nenhuma comunidade!");
		}
		
		if(communities.size() == 0)
			System.out.println("Voce nao esta associado a nenhuma comunidade");
		else
		{
			System.out.println("Essas sao as comunidades que voce esta associado:");
			for(Community community: communities)
				System.out.println(community.getName());
		}
	}
	
	public void messagesFriendDelete(String name)
	{
		for(Messages message : messages)
			if(message.getFriendName().equals(name))
				messages.remove(message);

	}
	
	public void allMessages()
	{
		if(messages.size() == 0)
			System.out.println("Voce nunca mandou nem recebeu mensagens!");

			
		for(Messages m : messages)
			m.infoMessages();
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getLogin()
	{
		return this.login;
	}
	
	public void setLogin(String login)
	{
		this.login = login;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Friends getFriends() {
		return friends;
	}

	public void setFriends(Friends friends) {
		this.friends = friends;
	}

	public ArrayList<Messages> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<Messages> messages) {
		this.messages = messages;
	}

	public ArrayList<Community> getCommunities() {
		return communities;
	}

	public void setCommunities(ArrayList<Community> communities) {
		this.communities = communities;
	}
	
	
}
