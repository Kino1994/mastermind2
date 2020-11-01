package es.mastermind.views;

import es.mastermind.utils.YesNoDialog;

public class ResumeView {

	public boolean read() {
		return new YesNoDialog().read(MessageView.RESUME.getMessage());
	}

}
