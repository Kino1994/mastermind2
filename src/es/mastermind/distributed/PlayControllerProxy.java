package es.mastermind.distributed;

import java.util.List;

import es.mastermind.controllers.ControllersVisitor;
import es.mastermind.controllers.PlayController;
import es.mastermind.distributed.dispatchers.FrameType;
import es.mastermind.utils.TCPIP;
import es.mastermind.models.ProposedCombination;
import es.mastermind.models.Session;
import es.mastermind.types.Color;

public class PlayControllerProxy extends PlayController {

	private TCPIP tcpip;

	PlayControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void undo() {
		this.tcpip.send(FrameType.UNDO.name());
	}

	@Override
	public void redo() {
		this.tcpip.send(FrameType.REDO.name());
	}

	@Override
	public boolean undoable() {
		this.tcpip.send(FrameType.UNDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public boolean redoable() {
		this.tcpip.send(FrameType.REDOABLE.name());
		return this.tcpip.receiveBoolean();
	}

	@Override
	public void put(List<Color> colors) {
		this.tcpip.send(FrameType.PUT_COMBINATION.name());
		this.tcpip.send(colors);
	}
	
	@Override
	public List<Color> getColors() {
		this.tcpip.send(FrameType.BOARD_COMPLETE.name());
		return this.tcpip.recieveColors();
	}

	@Override
	public ProposedCombination getProposedCombination() {
		this.tcpip.send(FrameType.GET_COMBINATION.name());
		return this.tcpip.receiveCombination();
	}

	@Override
	public int getAttempts() {
		this.tcpip.send(FrameType.ATEMPTS.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public int getBlacks(int position) {
		this.tcpip.send(FrameType.BLACKS.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public int getWhites(int position) {
		this.tcpip.send(FrameType.WHITES.name());
		return this.tcpip.receiveInt();
	}

	@Override
	public boolean isWinner() {
		this.tcpip.send(FrameType.WINNER.name());
		return this.tcpip.receiveBoolean();
	}
	
	@Override
	public boolean isLooser() {
		this.tcpip.send(FrameType.ATEMPTS.name());
		return this.tcpip.receiveBoolean();
	}
	
	@Override
	public boolean isBoardComplete() {
		return this.tcpip.receiveBoolean();
	}
	
	@Override
	public int getWidth() {
		return super.getWidth();
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
