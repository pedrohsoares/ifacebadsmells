package models;

import java.util.ArrayList;

public class Community {
	Users owner;
	ArrayList<Users> participants = new ArrayList<Users>(); 
	private String communityName;
	private String description;
	
	public Community(Users owner, String name, String description)
	{
		this.owner = owner;
		this.communityName = name;
		this.description = description;
	}
	
	public void deleteParticipant(String name)
	{
		for(Users user: participants)
			if(user.getName().equals(name)) {
				participants.remove(user);
				System.out.println("Participante removido da comunidade!");
				return;
			}
		System.out.println("Participante nao encontrado!");
				
	}
	
	
	public void getAllParticipantsName()
	{	
		if(participants.size() == 0)
			System.out.println("Nao ha participantes cadastrados ainda nessa comunidade!");
		
		for(Users u: participants)
			System.out.println(u.getName());
		
	}
	
	public void addParticipant(Users participant)
	{
		this.participants.add(participant);
	}
	
	public String getName()
	{
		return this.communityName;
	}

	public Users getOwner() {
		return owner;
	}

	public void setOwner(Users owner) {
		this.owner = owner;
	}

	public ArrayList<Users> getParticipant() {
		return participants;
	}

	public void setParticipant(ArrayList<Users> participants) {
		this.participants = participants;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
