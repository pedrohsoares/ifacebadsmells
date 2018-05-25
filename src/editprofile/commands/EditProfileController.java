package editprofile.commands;

import models.Profile;

public class EditProfileController {
	EditProfile editProfile = new EditProfile();
	EditProfileCellPhoneCommand cellPhoneCommand = new EditProfileCellPhoneCommand(editProfile);
	EditProfileRelationshipCommand relationshipCommand = new EditProfileRelationshipCommand(editProfile);
	EditProfileCityCommand cityCommand = new EditProfileCityCommand(editProfile);
	EditProfileJobCommand jobCommand = new EditProfileJobCommand(editProfile);
	EditProfileAgeCommand ageCommand = new EditProfileAgeCommand(editProfile);
	EditProfileDescriptionCommand descriptionCommand = new EditProfileDescriptionCommand(editProfile);
	EditProfileNullCommand nullCommand = new EditProfileNullCommand(editProfile);
	EditProfileCommand slot;
	
	public void setCommand(Integer commandOption) {
		switch(commandOption) {
			case 1:
				slot = cellPhoneCommand;
				break;
			case 2:
				slot = relationshipCommand;
				break;
			case 3:
				slot = cityCommand;
				break;
			case 4:
				slot = jobCommand;
				break;
			case 5:
				slot = ageCommand;
				break;
			case 6:
				slot = descriptionCommand;
				break;
			default:
				slot = nullCommand;
		}
	}
 
	public void optionSelected(Profile profile) {
		slot.execute(profile);
	}
}
