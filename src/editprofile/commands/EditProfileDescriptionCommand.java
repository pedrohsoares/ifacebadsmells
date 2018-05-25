package editprofile.commands;

import models.Profile;

public class EditProfileDescriptionCommand implements EditProfileCommand{
	EditProfile editProfile;

	public EditProfileDescriptionCommand(EditProfile editProfile) {
		this.editProfile = editProfile;
	}
	
	@Override
	public void execute(Profile profile) {
		editProfile.editDescription(profile);
	}

}
