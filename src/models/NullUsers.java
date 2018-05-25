package models;

import java.util.ArrayList;

import utils.UsersHandler;

public class NullUsers implements UsersHandler{
	private String login;
	private String password;
	private String name;
	
	@Override
	public void readMessages() {
		System.out.println("Voce precisa estar logado pra ler as mensagens!");
	}

	@Override
	public void addCommunity(Community name) {
		System.out.println("Voce precisa estar logado pra adicionar uma comunidade!");
	}

	@Override
	public Community getOwnCommunity() {
		return null;
	}

	@Override
	public void setOwnCommunity(Community name) {
		System.out.println("Voce precisa estar logado pra entrar numa comunidade");
	}

	@Override
	public void allFriends() {
		System.out.println("Voce precisa estar logado pra visualizar seus amigos!");
	}

	@Override
	public void allCommunities() {
		System.out.println("Voce precisa estar logado pra visualizar suas comunidades!");
	}

	@Override
	public void messagesFriendDelete(String name) {
		System.out.println("Voce precisa estar logado pra apagar as mensagens de amigos!");
	}

	@Override
	public void allMessages() {
		System.out.println("Voce precisa estar logado pra visualizar todas as mensagens!");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getLogin() {
		return login;
	}

	@Override
	public void setLogin(String login) {
		this.login = login;
	}
	
	@Override
	public Profile getProfile() {
		return null;
	}
	
	@Override
	public void setProfile(Profile profile) {
		System.out.println("Voce precisa estar logado pra mudar o perfil!");
	}
	
	@Override
	public Friends getFriends() {
		return null;
	}
	
	@Override
	public void setFriends(Friends friends) {
		System.out.println("Voce precisa estar logado pra adicionar uma lista de amigos!");
	}
	
	@Override
	public ArrayList<Messages> getMessages() {
		return null;
	}
	
	@Override
	public void setMessages(ArrayList<Messages> messages) {
		System.out.println("Voce precisa estar logado pra adicionar uma lista de mensagens!");
	}

	@Override
	public ArrayList<Community> getCommunities() {
		return null;
	}

	@Override
	public void setCommunities(ArrayList<Community> communities) {
		System.out.println("Voce precisa estar logado para adicionar uma lista de comunidades!");
	}
	

}
