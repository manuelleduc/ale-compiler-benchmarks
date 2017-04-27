package monolithicactivitydiagram.revisitor;

public interface MonolithicactivitydiagramRevisitor<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT,Activitydiagram__ActivityT extends Activitydiagram__NamedElementT,Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT,Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT,Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT,Activitydiagram__BooleanBinaryExpressionT extends Activitydiagram__BooleanExpressionT,Activitydiagram__BooleanExpressionT extends Activitydiagram__ExpressionT,Activitydiagram__BooleanUnaryExpressionT extends Activitydiagram__BooleanExpressionT,Activitydiagram__BooleanValueT extends Activitydiagram__ValueT,Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT,Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT,Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT,Activitydiagram__ControlTokenT extends Activitydiagram__TokenT,Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT,Activitydiagram__ExpressionT,Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__ForkedTokenT extends Activitydiagram__TokenT,Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__InputT,Activitydiagram__InputValueT,Activitydiagram__IntegerCalculationExpressionT extends Activitydiagram__IntegerExpressionT,Activitydiagram__IntegerComparisonExpressionT extends Activitydiagram__IntegerExpressionT,Activitydiagram__IntegerExpressionT extends Activitydiagram__ExpressionT,Activitydiagram__IntegerValueT extends Activitydiagram__ValueT,Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT,Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT,Activitydiagram__NamedElementT,Activitydiagram__OfferT,Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT,Activitydiagram__TokenT,Activitydiagram__TraceT,Activitydiagram__ValueT,Activitydiagram__VariableT>
	 extends activitydiagram.revisitor.ActivitydiagramRevisitor<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanBinaryExpressionT, Activitydiagram__BooleanExpressionT, Activitydiagram__BooleanUnaryExpressionT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__ControlTokenT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__ForkedTokenT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerCalculationExpressionT, Activitydiagram__IntegerComparisonExpressionT, Activitydiagram__IntegerExpressionT, Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedElementT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT>
	
	 {
	
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable self) {
		return booleanVariable(self);
	}
	default Activitydiagram__ActivityT $(final activitydiagram.Activity self) {
		return activity(self);
	}
	default Activitydiagram__ControlFlowT $(final activitydiagram.ControlFlow self) {
		return controlFlow(self);
	}
	default Activitydiagram__ExpressionT $(final activitydiagram.Expression self) {
		if(self instanceof activitydiagram.IntegerCalculationExpression) return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) self);
		if(self instanceof activitydiagram.BooleanUnaryExpression) return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) self);
		if(self instanceof activitydiagram.IntegerComparisonExpression) return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) self);
		if(self instanceof activitydiagram.BooleanBinaryExpression) return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) self);
		return null;
	}
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue self) {
		return integerValue(self);
	}
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode self) {
		return mergeNode(self);
	}
	default Activitydiagram__IntegerVariableT $(final activitydiagram.IntegerVariable self) {
		return integerVariable(self);
	}
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode self) {
		if(self instanceof activitydiagram.OpaqueAction) return opaqueAction((activitydiagram.OpaqueAction) self);
		return null;
	}
	default Activitydiagram__ControlNodeT $(final activitydiagram.ControlNode self) {
		if(self instanceof activitydiagram.MergeNode) return mergeNode((activitydiagram.MergeNode) self);
		if(self instanceof activitydiagram.JoinNode) return joinNode((activitydiagram.JoinNode) self);
		if(self instanceof activitydiagram.ActivityFinalNode) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self instanceof activitydiagram.ForkNode) return forkNode((activitydiagram.ForkNode) self);
		if(self instanceof activitydiagram.DecisionNode) return decisionNode((activitydiagram.DecisionNode) self);
		if(self instanceof activitydiagram.InitialNode) return initialNode((activitydiagram.InitialNode) self);
		return null;
	}
	default Activitydiagram__ActionT $(final activitydiagram.Action self) {
		if(self instanceof activitydiagram.OpaqueAction) return opaqueAction((activitydiagram.OpaqueAction) self);
		return null;
	}
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode self) {
		return joinNode(self);
	}
	default Activitydiagram__ActivityFinalNodeT $(final activitydiagram.ActivityFinalNode self) {
		return activityFinalNode(self);
	}
	default Activitydiagram__VariableT $(final activitydiagram.Variable self) {
		if(self instanceof activitydiagram.BooleanVariable) return booleanVariable((activitydiagram.BooleanVariable) self);
		if(self instanceof activitydiagram.IntegerVariable) return integerVariable((activitydiagram.IntegerVariable) self);
		return null;
	}
	default Activitydiagram__BooleanExpressionT $(final activitydiagram.BooleanExpression self) {
		if(self instanceof activitydiagram.BooleanUnaryExpression) return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) self);
		if(self instanceof activitydiagram.BooleanBinaryExpression) return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) self);
		return null;
	}
	default Activitydiagram__ActivityEdgeT $(final activitydiagram.ActivityEdge self) {
		if(self instanceof activitydiagram.ControlFlow) return controlFlow((activitydiagram.ControlFlow) self);
		return null;
	}
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction self) {
		return opaqueAction(self);
	}
	default Activitydiagram__OfferT $(final activitydiagram.Offer self) {
		return offer(self);
	}
	default Activitydiagram__ForkedTokenT $(final activitydiagram.ForkedToken self) {
		return forkedToken(self);
	}
	default Activitydiagram__ControlTokenT $(final activitydiagram.ControlToken self) {
		return controlToken(self);
	}
	default Activitydiagram__IntegerCalculationExpressionT $(final activitydiagram.IntegerCalculationExpression self) {
		return integerCalculationExpression(self);
	}
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode self) {
		return forkNode(self);
	}
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode self) {
		return decisionNode(self);
	}
	default Activitydiagram__BooleanUnaryExpressionT $(final activitydiagram.BooleanUnaryExpression self) {
		return booleanUnaryExpression(self);
	}
	default Activitydiagram__IntegerComparisonExpressionT $(final activitydiagram.IntegerComparisonExpression self) {
		return integerComparisonExpression(self);
	}
	default Activitydiagram__IntegerExpressionT $(final activitydiagram.IntegerExpression self) {
		if(self instanceof activitydiagram.IntegerCalculationExpression) return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) self);
		if(self instanceof activitydiagram.IntegerComparisonExpression) return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) self);
		return null;
	}
	default Activitydiagram__ActivityNodeT $(final activitydiagram.ActivityNode self) {
		if(self instanceof activitydiagram.MergeNode) return mergeNode((activitydiagram.MergeNode) self);
		if(self instanceof activitydiagram.JoinNode) return joinNode((activitydiagram.JoinNode) self);
		if(self instanceof activitydiagram.ActivityFinalNode) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self instanceof activitydiagram.OpaqueAction) return opaqueAction((activitydiagram.OpaqueAction) self);
		if(self instanceof activitydiagram.ForkNode) return forkNode((activitydiagram.ForkNode) self);
		if(self instanceof activitydiagram.DecisionNode) return decisionNode((activitydiagram.DecisionNode) self);
		if(self instanceof activitydiagram.InitialNode) return initialNode((activitydiagram.InitialNode) self);
		return null;
	}
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue self) {
		return booleanValue(self);
	}
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode self) {
		if(self instanceof activitydiagram.ActivityFinalNode) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		return null;
	}
	default Activitydiagram__TokenT $(final activitydiagram.Token self) {
		if(self instanceof activitydiagram.ForkedToken) return forkedToken((activitydiagram.ForkedToken) self);
		if(self instanceof activitydiagram.ControlToken) return controlToken((activitydiagram.ControlToken) self);
		return null;
	}
	default Activitydiagram__TraceT $(final activitydiagram.Trace self) {
		return trace(self);
	}
	default Activitydiagram__BooleanBinaryExpressionT $(final activitydiagram.BooleanBinaryExpression self) {
		return booleanBinaryExpression(self);
	}
	default Activitydiagram__InputValueT $(final activitydiagram.InputValue self) {
		return inputValue(self);
	}
	default Activitydiagram__NamedElementT $(final activitydiagram.NamedElement self) {
		if(self instanceof activitydiagram.Activity) return activity((activitydiagram.Activity) self);
		if(self instanceof activitydiagram.ControlFlow) return controlFlow((activitydiagram.ControlFlow) self);
		if(self instanceof activitydiagram.MergeNode) return mergeNode((activitydiagram.MergeNode) self);
		if(self instanceof activitydiagram.JoinNode) return joinNode((activitydiagram.JoinNode) self);
		if(self instanceof activitydiagram.ActivityFinalNode) return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if(self instanceof activitydiagram.OpaqueAction) return opaqueAction((activitydiagram.OpaqueAction) self);
		if(self instanceof activitydiagram.ForkNode) return forkNode((activitydiagram.ForkNode) self);
		if(self instanceof activitydiagram.DecisionNode) return decisionNode((activitydiagram.DecisionNode) self);
		if(self instanceof activitydiagram.InitialNode) return initialNode((activitydiagram.InitialNode) self);
		return null;
	}
	default Activitydiagram__InputT $(final activitydiagram.Input self) {
		return input(self);
	}
	default Activitydiagram__ValueT $(final activitydiagram.Value self) {
		if(self instanceof activitydiagram.IntegerValue) return integerValue((activitydiagram.IntegerValue) self);
		if(self instanceof activitydiagram.BooleanValue) return booleanValue((activitydiagram.BooleanValue) self);
		return null;
	}
	default Activitydiagram__InitialNodeT $(final activitydiagram.InitialNode self) {
		return initialNode(self);
	}
}
