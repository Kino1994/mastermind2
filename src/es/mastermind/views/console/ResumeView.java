package es.mastermind.views.console;

import es.mastermind.controllers.ResumeController;
import es.mastermind.views.MessageView;
import es.mastermind.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}