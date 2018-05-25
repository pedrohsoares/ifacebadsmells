package editprofile.commands;

import models.Profile;

public class EditProfileCellPhoneCommand implements EditProfileCommand{
	EditProfile editProfile;

	public EditProfileCellPhoneCommand(EditProfile editProfile) {
		this.editProfile = editProfile;
	}
	
	@Override
	public void execute(Profile profile) {
		editProfile.editCellphoneNumber(profile);
	}

}
