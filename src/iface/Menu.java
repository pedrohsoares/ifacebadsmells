package Iface;
import java.util.*;

public class Menu {
	private Scanner input;
	private int confirmation;

	
	public int begin()
	{
		input = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("[1]Fazer Login");
		System.out.println("[2]Cadastrar Usuario");
		System.out.println("[0]Sair do Iface");
		System.out.println("===========================");
		
		try {
			confirmation = Integer.parseInt(input.nextLine());
			while(confirmation < 0 || confirmation > 2) {
				System.out.println("Voce precisa digitar um numero entre 0 e 2");
				confirmation = Integer.parseInt(input.nextLine());
			}
			
		}catch(NumberFormatException err) {
			System.out.println("Só é permitido numeros");
			confirmation = 3;
		}
		
		return confirmation;
	}
	
	public String login()
	{
		input = new Scanner(System.in);
		System.out.println("Digite seu Login:");
		return input.nextLine();
	}
	
	public String password()
	{
		input = new Scanner(System.in);
		System.out.println("Digite sua Senha:");
		return input.nextLine();
	}
	
	public String name()
	{
		input = new Scanner(System.in);
		System.out.println("Digite seu Nome:");
		return input.nextLine();
	}
	
	public int inside()
	{
		input = new Scanner(System.in);
		
		System.out.println("Escolha uma das seguintes acoes:");
		System.out.println("[1]Criar ou Editar atributos do perfil");
		System.out.println("[2]Adicionar um amigo");
		System.out.println("[3]Enviar uma mensagem");
		System.out.println("[4]Criar uma comunidade");
		System.out.println("[5]Gerenciar sua comunidade");
		System.out.println("[6]Entrar em uma comunidade");
		System.out.println("[7]Recuperar suas informacoes de conta");
		System.out.println("[8]Apagar sua conta");
		System.out.println("[9]Solicitacoes de amizade");
		System.out.println("[10]Ler mensagens nao visualizadas");
		System.out.println("[0]Sair da conta");
		
		try {
			confirmation = Integer.parseInt(input.nextLine());
			while(confirmation < 0 || confirmation > 10) {
				System.out.println("Voce precisa digitar um numero entre 0 e 2");
				confirmation = Integer.parseInt(input.nextLine());
			}
			
		}catch(NumberFormatException err) {
			System.out.println("Só é permitido numeros");
			confirmation = 11;
		}
		
		return confirmation;
	}
	
	public String joinCommunity()
	{
		input = new Scanner(System.in);
		System.out.println("Qual comunidade voce gostaria de entrar?");
		System.out.println("Digite o nome dela:");
		return input.nextLine();
	}
	
	public String deleteParticipant()
	{
		input = new Scanner(System.in);
		System.out.println("Digite o nome do participante que voce gostaria de excluir da sua comunidade:");
		return input.nextLine();
	}
	public int manageCommunity(String name)
	{
		input = new Scanner(System.in);
		
		System.out.println("Ola " + name);
		System.out.println("Qual das opcoes a seguir voce gostaria de escolher?");
		System.out.println("[1]Ver participantes da sua comunidade");
		System.out.println("[2]Deletar algum participante da sua comunidade");
		System.out.println("[0]Voltar ao menu do usuario");
		
		try {
			confirmation = Integer.parseInt(input.nextLine());
			while(confirmation < 0 || confirmation > 2) {
				System.out.println("Voce precisa digitar um numero entre 0 e 2");
				confirmation = Integer.parseInt(input.nextLine());
			}
			
		}catch(NumberFormatException err) {
			System.out.println("Só é permitido numeros");
			confirmation = 3;
		}
		return confirmation;
	}
	
	public String addFriends()
	{
		input = new Scanner(System.in);
		System.out.println("Digite o nome do amigo que voc� gostaria de adicionar:");
		return input.nextLine();
	}
	
	public String communityName()
	{
		input = new Scanner(System.in);
		System.out.println("Digite o nome da comunidade que voce gostaria de criar: ");
		return input.nextLine();
	}
	
	public String communityDescription()
	{
		input = new Scanner(System.in);
		System.out.println("Escreva uma breve descricao sobre sua comunidade:");
		return input.nextLine();
	}
	
	public int editProfile()
	{
		int option;
		input = new Scanner(System.in);
		System.out.println("Qual dos atributos voce gostaria de criar/editar?");
		System.out.println("[1]Numero do celular");
		System.out.println("[2]Status de relacionamento");
		System.out.println("[3]Cidade");
		System.out.println("[4]Trabalho");
		System.out.println("[5]Idade");
		System.out.println("[6]Descricao sobre voce");
		
		try {
			option = Integer.parseInt(input.nextLine());
			
			while(option < 1 || option > 6)  {
				System.out.println("Opcao invalida, digite novamente:");
				option = Integer.parseInt(input.nextLine());
			}
			
		}catch(NumberFormatException err) {
			option = 7;
		}
	
		return option;
	}
	
	public String messageReceiver()
	{
		input = new Scanner(System.in);
		System.out.println("Qual o nome do usuario que voce gostaria de mandar uma mensagem?");
		return input.nextLine();
	}
	
	public String sendMessage()
	{
		input = new Scanner(System.in);
		System.out.println("Digite a mensagem para ser enviada:");
		return input.nextLine();
	}
	
	public int recoverInformation()
	{
		input = new Scanner(System.in);
		
		System.out.println("Voce quer recuperar informacoes de que?");
		System.out.println("[1]Perfil");
		System.out.println("[2]Mensagens");
		System.out.println("[3]Amigos");
		System.out.println("[4]Comunidades");
		
		try {
			confirmation = Integer.parseInt(input.nextLine());
			
			while(confirmation < 1 || confirmation > 4)  {
				System.out.println("Opcao invalida, digite novamente:");
				confirmation = Integer.parseInt(input.nextLine());
			}
			
		}catch(NumberFormatException err) {
			System.out.println("Voce somente pode digitar numeros");
			confirmation = 7;
		}
		
		return confirmation;
			
	}
	
	
}
