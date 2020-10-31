package es.mastermind.distributed;

import es.mastermind.controllers.ResumeController;
import es.mastermind.distributed.dispatchers.FrameType;
import es.mastermind.models.Session;
import es.mastermind.utils.TCPIP;

public class ResumeControllerProxy extends ResumeController {
	
	private TCPIP tcpip;

	public ResumeControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void resume(boolean newGame) {
		this.tcpip.send(FrameType.NEW_GAME.name());
		this.tcpip.send(newGame);	
	}

}
