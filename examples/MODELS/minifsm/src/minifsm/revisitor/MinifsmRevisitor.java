package minifsm.revisitor;

public interface MinifsmRevisitor<Minifsm__FinalStateT extends Minifsm__StateT, Minifsm__MachineT, Minifsm__StateT, Minifsm__TransitionT> {
	Minifsm__FinalStateT finalState(final minifsm.FinalState f);
	Minifsm__StateT state_finalState(final minifsm.FinalState f);
	Minifsm__MachineT machine(final minifsm.Machine m);
	Minifsm__StateT state(final minifsm.State s);
	Minifsm__TransitionT transition(final minifsm.Transition t);

	default Minifsm__FinalStateT $(final minifsm.FinalState it) {
		return finalState(it);
	}
	default Minifsm__MachineT $(final minifsm.Machine it) {
		return machine(it);
	}
	default Minifsm__StateT $(final minifsm.State it) {
		if (it.getClass() == minifsm.impl.FinalStateImpl.class)
			return finalState((minifsm.FinalState) it);
		return state(it);
	}
	default Minifsm__TransitionT $(final minifsm.Transition it) {
		return transition(it);
	}
}
