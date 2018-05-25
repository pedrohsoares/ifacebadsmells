package editprofile.commands;

import models.Profile;

public interface EditProfileCommand {
	public void execute(Profile profile);
}
