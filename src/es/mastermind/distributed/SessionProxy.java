package es.mastermind.distributed;

import es.mastermind.distributed.dispatchers.FrameType;
import es.mastermind.models.Session;
import es.mastermind.models.StateValue;
import es.mastermind.utils.TCPIP;

public class SessionProxy implements Session {
	
	private TCPIP tcpip;

	public SessionProxy(TCPIP tcpip) {
		this.tcpip = tcpip;
	}
	
	
	public StateValue getValueState() {
		this.tcpip.send(FrameType.STATE.name());
		return StateValue.values()[this.tcpip.receiveInt()];
	}

}
