package monolithicactivitydiagram.revisitor.operations.impl;

public class JoinNodeOperationImpl implements monolithicactivitydiagram.revisitor.operations.JoinNodeOperation {
	private final activitydiagram.JoinNode self;
	private final activitydiagram.revisitor.ActivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operations.ActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operations.OfferOperation, ? extends monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.TokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.TraceOperation, ? extends monolithicactivitydiagram.revisitor.operations.ValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.VariableOperation> alg;

	private final monolithicactivitydiagram.revisitor.operations.ControlNodeOperation monolithicactivitydiagramdelegate;

	public JoinNodeOperationImpl(activitydiagram.JoinNode self, activitydiagram.revisitor.ActivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operations.ActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operations.OfferOperation, ? extends monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.TokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.TraceOperation, ? extends monolithicactivitydiagram.revisitor.operations.ValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.VariableOperation> alg) {
		this.self = self;
		this.alg = alg;
		this.monolithicactivitydiagramdelegate = new monolithicactivitydiagram.revisitor.operations.impl.ControlNodeOperationImpl(self, alg);
	}

	@Override
	public Boolean isReady() {
		Boolean ready = true;
		for (activitydiagram.ActivityEdge edge: self.getIncoming()) {
			if (!alg.$(edge).hasOffer()) {
				ready = false;
			} 
		}
		return ready;
	}
	@Override
	public void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
		this.monolithicactivitydiagramdelegate.fire(tokens);
	}
	@Override
	public Boolean isInitialNode() {
		return this.monolithicactivitydiagramdelegate.isInitialNode();
	}
	@Override
	public activitydiagram.InitialNode asInitialNode() {
		return this.monolithicactivitydiagramdelegate.asInitialNode();
	}
	@Override
	public void run() {
		this.monolithicactivitydiagramdelegate.run();
	}
	@Override
	public Boolean isRunning() {
		return this.monolithicactivitydiagramdelegate.isRunning();
	}
	@Override
	public void terminate() {
		this.monolithicactivitydiagramdelegate.terminate();
	}
	@Override
	public void sendOffers(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
		this.monolithicactivitydiagramdelegate.sendOffers(tokens);
	}
	@Override
	public org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens() {
		return this.monolithicactivitydiagramdelegate.takeOfferedTokens();
	}
	@Override
	public void addTokens(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
		this.monolithicactivitydiagramdelegate.addTokens(tokens);
	}
	@Override
	public Boolean hasOffers() {
		return this.monolithicactivitydiagramdelegate.hasOffers();
	}
	@Override
	public void removeToken(activitydiagram.Token token) {
		this.monolithicactivitydiagramdelegate.removeToken(token);
	}
}
