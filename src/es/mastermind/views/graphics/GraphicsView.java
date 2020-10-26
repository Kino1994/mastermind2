package es.mastermind.views.graphics;

import es.mastermind.controllers.PlayController;
import es.mastermind.controllers.ResumeController;
import es.mastermind.controllers.StartController;
import es.mastermind.views.View;

public class GraphicsView extends View {

	private GameView gameView;

	public GraphicsView() {
		this.gameView = new GameView();
	}

	public void visit(StartController startController) {
		this.gameView.interact(startController);
	}

	public void visit(PlayController playController) {
		this.gameView.interact(playController);
	}

	public void visit(ResumeController resumeController) {
		ResumeDialog resumeDialog = new ResumeDialog();
		resumeController.resume(resumeDialog.isNewGame());
		if (resumeDialog.isNewGame()) {
			this.gameView = new GameView();
		} else {
			this.gameView.setVisible(false);
			System.exit(0);
		}
	}

}