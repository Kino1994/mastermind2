package es.mastermind.main;

import es.mastermind.views.View;
import es.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

	protected View createView() {
		return new GraphicsView();
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}