package models;

public class Profile {
	private String cellphoneNumber;
	private String relationship;
	private String city;
	private String job;
	private String age;
	private String description;
	
	public Profile()
	{
		this.cellphoneNumber = "Vazio";
		this.relationship  = "Vazio";
		this.city  = "Vazio";
		this.job  = "Vazio";
		this.age  = "Vazio";
		this.description  = "Vazio";
	}
	
	public void allInformations()
	{
		System.out.println("Numero do celular: " + this.cellphoneNumber);
		System.out.println("Estado de relacionamento: " + this.relationship);
		System.out.println("Cidade: " + this.city);
		System.out.println("Trabalho: " + this.job);
		System.out.println("Idade: " + this.age);
		System.out.println("Descricao sobre voce: '"+ this.description + "'");
	}
	
	public void setCellPhoneNumber(String number)
	{
		try {
			Integer numberInt = Integer.parseInt(number);
			this.cellphoneNumber = numberInt.toString();
		}catch(NumberFormatException err) {
			System.out.println("Possui letras no numero de telefone.");
		}
	}
	
	public String getCellPhoneNumber()
	{
		return cellphoneNumber;
	}
	
	public void setRelationship(String relationship)
	{
		this.relationship = relationship;
	}
	
	public String getRelationship()
	{
		return relationship;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setJob(String job)
	{
		this.job = job;
	}
	
	public String getJob()
	{
		return job;
	}
	
	public void setAge(String age)
	{
		try {
			Integer ageInt = Integer.parseInt(age);
			this.age = ageInt.toString();
		}catch(NumberFormatException err) {
			System.out.println("Possui letras na idade!");
		}
		
	}
	
	public String getAge()
	{
		return age;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	
}
