package modularactivitydiagram.revisitor.operation.impl;

public  class ModularactivitydiagramExecutableNodeOperationImpl implements modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNodeOperation
{
	
	private final adwithoutruntime.ExecutableNode self;
	private final modularactivitydiagram.revisitor.ModularactivitydiagramRevisitor<? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityEdgeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityEdge_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivity_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanBinaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanBinaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanUnaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanUnaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanValueOperation, ? extends common.revisitor.operation.CommonBooleanVariableOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlFlowOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlFlow_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlTokenOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramDecisionNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramDecisionNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkedTokenOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramInitialNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramInitialNode_AspectOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerCalculationExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerCalculationExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerComparisonExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerComparisonExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerValueOperation, ? extends common.revisitor.operation.CommonIntegerVariableOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramJoinNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramJoinNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramMergeNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramMergeNode_AspectOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOfferOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOpaqueActionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOpaqueAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation, ? extends common.revisitor.operation.CommonVariable_AspectOperation> alg;
	
	private final modularactivitydiagram.revisitor.operation.impl.ModularactivitydiagramActivityNodeOperationImpl modularactivitydiagramdelegate;
	
	public ModularactivitydiagramExecutableNodeOperationImpl(adwithoutruntime.ExecutableNode self, modularactivitydiagram.revisitor.ModularactivitydiagramRevisitor<? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityEdgeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityEdge_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivityNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramActivity_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanBinaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanBinaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanUnaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanUnaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanValueOperation, ? extends common.revisitor.operation.CommonBooleanVariableOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlFlowOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlFlow_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramControlTokenOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramDecisionNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramDecisionNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExecutableNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramForkedTokenOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramInitialNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramInitialNode_AspectOperation, ? extends common.revisitor.operation.CommonInputOperation, ? extends common.revisitor.operation.CommonInputValueOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerCalculationExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerCalculationExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerComparisonExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerComparisonExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerExpressionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerValueOperation, ? extends common.revisitor.operation.CommonIntegerVariableOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramIntegerVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramJoinNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramJoinNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramMergeNodeOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramMergeNode_AspectOperation, ? extends common.revisitor.operation.CommonNamedElementOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOfferOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOpaqueActionOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramOpaqueAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramTokenOperation, ? extends common.revisitor.operation.CommonTraceOperation, ? extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramValueOperation, ? extends common.revisitor.operation.CommonVariableOperation, ? extends common.revisitor.operation.CommonVariable_AspectOperation>  alg) {
		this.self = self;
		
		this.alg = alg;
		this.modularactivitydiagramdelegate = new modularactivitydiagram.revisitor.operation.impl.ModularactivitydiagramActivityNodeOperationImpl(self, alg);
	}
	@Override
	public Boolean isReady() {
		return this.modularactivitydiagramdelegate.isReady();
	}
	@Override
	public org.eclipse.emf.common.util.EList<adruntime.Token> takeOfferedTokens() {
		return this.modularactivitydiagramdelegate.takeOfferedTokens();
	}
	@Override
	public void fire(org.eclipse.emf.common.util.EList<adruntime.Token> tokens) {
		this.modularactivitydiagramdelegate.fire(tokens);
	}
	@Override
	public Boolean isInitialNode() {
		return this.modularactivitydiagramdelegate.isInitialNode();
	}
	@Override
	public adwithoutruntime.InitialNode asInitialNode() {
		return this.modularactivitydiagramdelegate.asInitialNode();
	}
	@Override
	public void run() {
		this.modularactivitydiagramdelegate.run();
	}
	@Override
	public void terminate() {
		this.modularactivitydiagramdelegate.terminate();
	}
	@Override
	public void removeToken(adruntime.Token token) {
		this.modularactivitydiagramdelegate.removeToken(token);
	}
}