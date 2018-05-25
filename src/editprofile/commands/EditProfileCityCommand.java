package editprofile.commands;

import models.Profile;

public class EditProfileCityCommand implements EditProfileCommand {
	EditProfile editProfile;

	public EditProfileCityCommand(EditProfile editProfile) {
		this.editProfile = editProfile;
	}
	
	@Override
	public void execute(Profile profile) {
		editProfile.editCity(profile);
	}

}
