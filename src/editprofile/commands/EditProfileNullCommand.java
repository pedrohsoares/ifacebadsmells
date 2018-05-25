package editprofile.commands;

import models.Profile;

public class EditProfileNullCommand implements EditProfileCommand{
	EditProfile editProfile;

	public EditProfileNullCommand(EditProfile editProfile) {
		this.editProfile = editProfile;
	}
	
	@Override
	public void execute(Profile profile) {
		System.out.println("Opcao invalida");
	}

}
