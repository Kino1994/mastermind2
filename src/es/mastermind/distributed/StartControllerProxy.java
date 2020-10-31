package es.mastermind.distributed;

import es.mastermind.controllers.StartController;
import es.mastermind.distributed.dispatchers.FrameType;
import es.mastermind.models.Session;
import es.mastermind.utils.TCPIP;

public class StartControllerProxy extends StartController {
	
	private TCPIP tcpip;

	public StartControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void start() {
		this.tcpip.send(FrameType.START.name());
	}


}