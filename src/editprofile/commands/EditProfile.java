package editprofile.commands;

import java.util.Scanner;

import models.Profile;

public class EditProfile {
	private Scanner input;
	
	public void editCellphoneNumber(Profile profile) {
		input = new Scanner(System.in);
		System.out.println("Digite o numero do seu celular: ");
		profile.setCellPhoneNumber(input.nextLine());
	}
	
	public void editRelationship(Profile profile) {
		input = new Scanner(System.in);
		System.out.println("Digite o seu estado atual de relacionamento: ");
		profile.setRelationship(input.nextLine());
	}
	
	public void editCity(Profile profile) {
		input = new Scanner(System.in);
		System.out.println("Digite o nome da cidade que voce mora: " );
		profile.setCity(input.nextLine());
	}
	
	public void editJob(Profile profile) {
		input = new Scanner(System.in);
		System.out.println("Digite o nome da sua profissao atual: ");
		profile.setJob(input.nextLine());
	}
	
	public void editAge(Profile profile) {
		input = new Scanner(System.in);
		System.out.println("Digite a sua idade atual:");
		profile.setAge(input.nextLine());
	}
	
	public void editDescription(Profile profile) {
		input = new Scanner(System.in);
		System.out.println("Escreva uma descricao sobre voce: ");
		profile.setDescription(input.nextLine());
	}
}
