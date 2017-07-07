package modularactivitydiagram.revisitor.operations.impl;

public class IntegerVariableOperationImpl implements modularactivitydiagram.revisitor.operations.IntegerVariableOperation {
	private final adwithoutruntime.IntegerVariable self;
	private final adruntime.revisitor.AdruntimeRevisitor<? extends modularactivitydiagram.revisitor.operations.ActionOperation, ? extends modularactivitydiagram.revisitor.operations.Action_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.Activity_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends modularactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends modularactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.InputOperation, ? extends modularactivitydiagram.revisitor.operations.InputValueOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.NamedElementOperation, ? extends modularactivitydiagram.revisitor.operations.OfferOperation, ? extends modularactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.TokenOperation, ? extends modularactivitydiagram.revisitor.operations.TraceOperation, ? extends modularactivitydiagram.revisitor.operations.ValueOperation, ? extends modularactivitydiagram.revisitor.operations.VariableOperation, ? extends modularactivitydiagram.revisitor.operations.Variable_AspectOperation> alg;


	public IntegerVariableOperationImpl(adwithoutruntime.IntegerVariable self, adruntime.revisitor.AdruntimeRevisitor<? extends modularactivitydiagram.revisitor.operations.ActionOperation, ? extends modularactivitydiagram.revisitor.operations.Action_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityEdge_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityFinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ActivityNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.Activity_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanBinaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanUnaryExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends modularactivitydiagram.revisitor.operations.BooleanVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends modularactivitydiagram.revisitor.operations.ControlFlow_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ControlNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends modularactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends modularactivitydiagram.revisitor.operations.DecisionNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ExecutableNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends modularactivitydiagram.revisitor.operations.FinalNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends modularactivitydiagram.revisitor.operations.ForkNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends modularactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends modularactivitydiagram.revisitor.operations.InitialNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.InputOperation, ? extends modularactivitydiagram.revisitor.operations.InputValueOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerCalculationExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerComparisonExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerExpression_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends modularactivitydiagram.revisitor.operations.IntegerVariable_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends modularactivitydiagram.revisitor.operations.JoinNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends modularactivitydiagram.revisitor.operations.MergeNode_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.NamedElementOperation, ? extends modularactivitydiagram.revisitor.operations.OfferOperation, ? extends modularactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends modularactivitydiagram.revisitor.operations.OpaqueAction_AspectOperation, ? extends modularactivitydiagram.revisitor.operations.TokenOperation, ? extends modularactivitydiagram.revisitor.operations.TraceOperation, ? extends modularactivitydiagram.revisitor.operations.ValueOperation, ? extends modularactivitydiagram.revisitor.operations.VariableOperation, ? extends modularactivitydiagram.revisitor.operations.Variable_AspectOperation> alg) {
		this.self = self;
		this.alg = alg;
	}

}
