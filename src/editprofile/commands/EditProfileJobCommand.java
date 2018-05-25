package editprofile.commands;

import models.Profile;

public class EditProfileJobCommand implements EditProfileCommand{
	
	EditProfile editProfile;

	public EditProfileJobCommand(EditProfile editProfile) {
		this.editProfile = editProfile;
	}
	
	@Override
	public void execute(Profile profile) {
		editProfile.editJob(profile);
	}

}
