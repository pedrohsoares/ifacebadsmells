package editprofile.commands;

import models.Profile;

public class EditProfileRelationshipCommand implements EditProfileCommand{
	EditProfile editProfile;

	public EditProfileRelationshipCommand(EditProfile editProfile) {
		this.editProfile = editProfile;
	}
	
	@Override
	public void execute(Profile profile) {
		editProfile.editRelationship(profile);
	}

}
