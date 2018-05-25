package editprofile.commands;

import models.Profile;

public class EditProfileAgeCommand implements EditProfileCommand{
	EditProfile editProfile;

	public EditProfileAgeCommand(EditProfile editProfile) {
		this.editProfile = editProfile;
	}
	
	@Override
	public void execute(Profile profile) {
		editProfile.editAge(profile);
	}

}
