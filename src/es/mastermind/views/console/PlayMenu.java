package es.mastermind.views.console;

import es.mastermind.controllers.PlayController;
import es.mastermind.utils.Menu;

public class PlayMenu extends Menu {

  public PlayMenu(PlayController playController) {
    this.addCommand(new PlayCommand(playController));
    this.addCommand(new UndoCommand(playController));
    this.addCommand(new RedoCommand(playController));
  }

}