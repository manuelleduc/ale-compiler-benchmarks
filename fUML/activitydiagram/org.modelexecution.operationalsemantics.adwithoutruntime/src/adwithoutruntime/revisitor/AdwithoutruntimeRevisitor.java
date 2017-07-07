package adwithoutruntime.revisitor;

public interface AdwithoutruntimeRevisitor<Adwithoutruntime__ActionT extends Adwithoutruntime__ExecutableNodeT,Adwithoutruntime__ActivityT extends Adwithoutruntime__NamedElementT,Adwithoutruntime__ActivityEdgeT extends Adwithoutruntime__NamedElementT,Adwithoutruntime__ActivityFinalNodeT extends Adwithoutruntime__FinalNodeT,Adwithoutruntime__ActivityNodeT extends Adwithoutruntime__NamedElementT,Adwithoutruntime__BooleanBinaryExpressionT extends Adwithoutruntime__BooleanExpressionT,Adwithoutruntime__BooleanExpressionT extends Adwithoutruntime__ExpressionT,Adwithoutruntime__BooleanUnaryExpressionT extends Adwithoutruntime__BooleanExpressionT,Adwithoutruntime__BooleanValueT extends Adwithoutruntime__ValueT,Adwithoutruntime__BooleanVariableT extends Adwithoutruntime__VariableT,Adwithoutruntime__ControlFlowT extends Adwithoutruntime__ActivityEdgeT,Adwithoutruntime__ControlNodeT extends Adwithoutruntime__ActivityNodeT,Adwithoutruntime__DecisionNodeT extends Adwithoutruntime__ControlNodeT,Adwithoutruntime__ExecutableNodeT extends Adwithoutruntime__ActivityNodeT,Adwithoutruntime__ExpressionT,Adwithoutruntime__FinalNodeT extends Adwithoutruntime__ControlNodeT,Adwithoutruntime__ForkNodeT extends Adwithoutruntime__ControlNodeT,Adwithoutruntime__InitialNodeT extends Adwithoutruntime__ControlNodeT,Adwithoutruntime__IntegerCalculationExpressionT extends Adwithoutruntime__IntegerExpressionT,Adwithoutruntime__IntegerComparisonExpressionT extends Adwithoutruntime__IntegerExpressionT,Adwithoutruntime__IntegerExpressionT extends Adwithoutruntime__ExpressionT,Adwithoutruntime__IntegerValueT extends Adwithoutruntime__ValueT,Adwithoutruntime__IntegerVariableT extends Adwithoutruntime__VariableT,Adwithoutruntime__JoinNodeT extends Adwithoutruntime__ControlNodeT,Adwithoutruntime__MergeNodeT extends Adwithoutruntime__ControlNodeT,Adwithoutruntime__NamedElementT,Adwithoutruntime__OpaqueActionT extends Adwithoutruntime__ActionT,Adwithoutruntime__ValueT,Adwithoutruntime__VariableT>
	
	 {
Adwithoutruntime__ActivityT activity(final adwithoutruntime.Activity activity);
Adwithoutruntime__NamedElementT namedElement_activity(final adwithoutruntime.Activity activity);

Adwithoutruntime__ActivityFinalNodeT activityFinalNode(final adwithoutruntime.ActivityFinalNode activityFinalNode);
Adwithoutruntime__ActivityNodeT activityNode_activityFinalNode(final adwithoutruntime.ActivityFinalNode activityFinalNode);
Adwithoutruntime__NamedElementT namedElement_activityFinalNode(final adwithoutruntime.ActivityFinalNode activityFinalNode);
Adwithoutruntime__FinalNodeT finalNode_activityFinalNode(final adwithoutruntime.ActivityFinalNode activityFinalNode);
Adwithoutruntime__ControlNodeT controlNode_activityFinalNode(final adwithoutruntime.ActivityFinalNode activityFinalNode);

Adwithoutruntime__BooleanBinaryExpressionT booleanBinaryExpression(final adwithoutruntime.BooleanBinaryExpression booleanBinaryExpression);
Adwithoutruntime__BooleanExpressionT booleanExpression_booleanBinaryExpression(final adwithoutruntime.BooleanBinaryExpression booleanBinaryExpression);
Adwithoutruntime__ExpressionT expression_booleanBinaryExpression(final adwithoutruntime.BooleanBinaryExpression booleanBinaryExpression);

Adwithoutruntime__BooleanUnaryExpressionT booleanUnaryExpression(final adwithoutruntime.BooleanUnaryExpression booleanUnaryExpression);
Adwithoutruntime__BooleanExpressionT booleanExpression_booleanUnaryExpression(final adwithoutruntime.BooleanUnaryExpression booleanUnaryExpression);
Adwithoutruntime__ExpressionT expression_booleanUnaryExpression(final adwithoutruntime.BooleanUnaryExpression booleanUnaryExpression);

Adwithoutruntime__BooleanValueT booleanValue(final adwithoutruntime.BooleanValue booleanValue);
Adwithoutruntime__ValueT value_booleanValue(final adwithoutruntime.BooleanValue booleanValue);

Adwithoutruntime__BooleanVariableT booleanVariable(final adwithoutruntime.BooleanVariable booleanVariable);
Adwithoutruntime__VariableT variable_booleanVariable(final adwithoutruntime.BooleanVariable booleanVariable);

Adwithoutruntime__ControlFlowT controlFlow(final adwithoutruntime.ControlFlow controlFlow);
Adwithoutruntime__NamedElementT namedElement_controlFlow(final adwithoutruntime.ControlFlow controlFlow);
Adwithoutruntime__ActivityEdgeT activityEdge_controlFlow(final adwithoutruntime.ControlFlow controlFlow);

Adwithoutruntime__DecisionNodeT decisionNode(final adwithoutruntime.DecisionNode decisionNode);
Adwithoutruntime__ActivityNodeT activityNode_decisionNode(final adwithoutruntime.DecisionNode decisionNode);
Adwithoutruntime__NamedElementT namedElement_decisionNode(final adwithoutruntime.DecisionNode decisionNode);
Adwithoutruntime__ControlNodeT controlNode_decisionNode(final adwithoutruntime.DecisionNode decisionNode);

Adwithoutruntime__ForkNodeT forkNode(final adwithoutruntime.ForkNode forkNode);
Adwithoutruntime__ActivityNodeT activityNode_forkNode(final adwithoutruntime.ForkNode forkNode);
Adwithoutruntime__NamedElementT namedElement_forkNode(final adwithoutruntime.ForkNode forkNode);
Adwithoutruntime__ControlNodeT controlNode_forkNode(final adwithoutruntime.ForkNode forkNode);

Adwithoutruntime__InitialNodeT initialNode(final adwithoutruntime.InitialNode initialNode);
Adwithoutruntime__ActivityNodeT activityNode_initialNode(final adwithoutruntime.InitialNode initialNode);
Adwithoutruntime__NamedElementT namedElement_initialNode(final adwithoutruntime.InitialNode initialNode);
Adwithoutruntime__ControlNodeT controlNode_initialNode(final adwithoutruntime.InitialNode initialNode);

Adwithoutruntime__IntegerCalculationExpressionT integerCalculationExpression(final adwithoutruntime.IntegerCalculationExpression integerCalculationExpression);
Adwithoutruntime__ExpressionT expression_integerCalculationExpression(final adwithoutruntime.IntegerCalculationExpression integerCalculationExpression);
Adwithoutruntime__IntegerExpressionT integerExpression_integerCalculationExpression(final adwithoutruntime.IntegerCalculationExpression integerCalculationExpression);

Adwithoutruntime__IntegerComparisonExpressionT integerComparisonExpression(final adwithoutruntime.IntegerComparisonExpression integerComparisonExpression);
Adwithoutruntime__ExpressionT expression_integerComparisonExpression(final adwithoutruntime.IntegerComparisonExpression integerComparisonExpression);
Adwithoutruntime__IntegerExpressionT integerExpression_integerComparisonExpression(final adwithoutruntime.IntegerComparisonExpression integerComparisonExpression);

Adwithoutruntime__IntegerValueT integerValue(final adwithoutruntime.IntegerValue integerValue);
Adwithoutruntime__ValueT value_integerValue(final adwithoutruntime.IntegerValue integerValue);

Adwithoutruntime__IntegerVariableT integerVariable(final adwithoutruntime.IntegerVariable integerVariable);
Adwithoutruntime__VariableT variable_integerVariable(final adwithoutruntime.IntegerVariable integerVariable);

Adwithoutruntime__JoinNodeT joinNode(final adwithoutruntime.JoinNode joinNode);
Adwithoutruntime__ActivityNodeT activityNode_joinNode(final adwithoutruntime.JoinNode joinNode);
Adwithoutruntime__NamedElementT namedElement_joinNode(final adwithoutruntime.JoinNode joinNode);
Adwithoutruntime__ControlNodeT controlNode_joinNode(final adwithoutruntime.JoinNode joinNode);

Adwithoutruntime__MergeNodeT mergeNode(final adwithoutruntime.MergeNode mergeNode);
Adwithoutruntime__ActivityNodeT activityNode_mergeNode(final adwithoutruntime.MergeNode mergeNode);
Adwithoutruntime__NamedElementT namedElement_mergeNode(final adwithoutruntime.MergeNode mergeNode);
Adwithoutruntime__ControlNodeT controlNode_mergeNode(final adwithoutruntime.MergeNode mergeNode);

Adwithoutruntime__OpaqueActionT opaqueAction(final adwithoutruntime.OpaqueAction opaqueAction);
Adwithoutruntime__ActivityNodeT activityNode_opaqueAction(final adwithoutruntime.OpaqueAction opaqueAction);
Adwithoutruntime__NamedElementT namedElement_opaqueAction(final adwithoutruntime.OpaqueAction opaqueAction);
Adwithoutruntime__ExecutableNodeT executableNode_opaqueAction(final adwithoutruntime.OpaqueAction opaqueAction);
Adwithoutruntime__ActionT action_opaqueAction(final adwithoutruntime.OpaqueAction opaqueAction);

	
	default Adwithoutruntime__ControlFlowT $(final adwithoutruntime.ControlFlow self) {
		return controlFlow(self);
	}
	default Adwithoutruntime__InitialNodeT $(final adwithoutruntime.InitialNode self) {
		return initialNode(self);
	}
	default Adwithoutruntime__ValueT $(final adwithoutruntime.Value self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_VALUE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return booleanValue((adwithoutruntime.BooleanValue) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_VALUE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return integerValue((adwithoutruntime.IntegerValue) self);
		return null;
	}
	default Adwithoutruntime__BooleanUnaryExpressionT $(final adwithoutruntime.BooleanUnaryExpression self) {
		return booleanUnaryExpression(self);
	}
	default Adwithoutruntime__VariableT $(final adwithoutruntime.Variable self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_VARIABLE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return booleanVariable((adwithoutruntime.BooleanVariable) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_VARIABLE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return integerVariable((adwithoutruntime.IntegerVariable) self);
		return null;
	}
	default Adwithoutruntime__BooleanVariableT $(final adwithoutruntime.BooleanVariable self) {
		return booleanVariable(self);
	}
	default Adwithoutruntime__BooleanValueT $(final adwithoutruntime.BooleanValue self) {
		return booleanValue(self);
	}
	default Adwithoutruntime__ActivityT $(final adwithoutruntime.Activity self) {
		return activity(self);
	}
	default Adwithoutruntime__IntegerComparisonExpressionT $(final adwithoutruntime.IntegerComparisonExpression self) {
		return integerComparisonExpression(self);
	}
	default Adwithoutruntime__ActivityNodeT $(final adwithoutruntime.ActivityNode self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INITIAL_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return initialNode((adwithoutruntime.InitialNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.DECISION_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return decisionNode((adwithoutruntime.DecisionNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.FORK_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return forkNode((adwithoutruntime.ForkNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return activityFinalNode((adwithoutruntime.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.MERGE_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return mergeNode((adwithoutruntime.MergeNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.OPAQUE_ACTION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return opaqueAction((adwithoutruntime.OpaqueAction) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.JOIN_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return joinNode((adwithoutruntime.JoinNode) self);
		return null;
	}
	default Adwithoutruntime__DecisionNodeT $(final adwithoutruntime.DecisionNode self) {
		return decisionNode(self);
	}
	default Adwithoutruntime__BooleanExpressionT $(final adwithoutruntime.BooleanExpression self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_UNARY_EXPRESSION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return booleanUnaryExpression((adwithoutruntime.BooleanUnaryExpression) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return booleanBinaryExpression((adwithoutruntime.BooleanBinaryExpression) self);
		return null;
	}
	default Adwithoutruntime__ForkNodeT $(final adwithoutruntime.ForkNode self) {
		return forkNode(self);
	}
	default Adwithoutruntime__ExecutableNodeT $(final adwithoutruntime.ExecutableNode self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.OPAQUE_ACTION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return opaqueAction((adwithoutruntime.OpaqueAction) self);
		return null;
	}
	default Adwithoutruntime__ControlNodeT $(final adwithoutruntime.ControlNode self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INITIAL_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return initialNode((adwithoutruntime.InitialNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.DECISION_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return decisionNode((adwithoutruntime.DecisionNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.FORK_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return forkNode((adwithoutruntime.ForkNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return activityFinalNode((adwithoutruntime.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.MERGE_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return mergeNode((adwithoutruntime.MergeNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.JOIN_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return joinNode((adwithoutruntime.JoinNode) self);
		return null;
	}
	default Adwithoutruntime__IntegerValueT $(final adwithoutruntime.IntegerValue self) {
		return integerValue(self);
	}
	default Adwithoutruntime__ActivityFinalNodeT $(final adwithoutruntime.ActivityFinalNode self) {
		return activityFinalNode(self);
	}
	default Adwithoutruntime__BooleanBinaryExpressionT $(final adwithoutruntime.BooleanBinaryExpression self) {
		return booleanBinaryExpression(self);
	}
	default Adwithoutruntime__MergeNodeT $(final adwithoutruntime.MergeNode self) {
		return mergeNode(self);
	}
	default Adwithoutruntime__FinalNodeT $(final adwithoutruntime.FinalNode self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return activityFinalNode((adwithoutruntime.ActivityFinalNode) self);
		return null;
	}
	default Adwithoutruntime__ActivityEdgeT $(final adwithoutruntime.ActivityEdge self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.CONTROL_FLOW && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return controlFlow((adwithoutruntime.ControlFlow) self);
		return null;
	}
	default Adwithoutruntime__OpaqueActionT $(final adwithoutruntime.OpaqueAction self) {
		return opaqueAction(self);
	}
	default Adwithoutruntime__NamedElementT $(final adwithoutruntime.NamedElement self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.CONTROL_FLOW && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return controlFlow((adwithoutruntime.ControlFlow) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INITIAL_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return initialNode((adwithoutruntime.InitialNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return activity((adwithoutruntime.Activity) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.DECISION_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return decisionNode((adwithoutruntime.DecisionNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.FORK_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return forkNode((adwithoutruntime.ForkNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.ACTIVITY_FINAL_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return activityFinalNode((adwithoutruntime.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.MERGE_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return mergeNode((adwithoutruntime.MergeNode) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.OPAQUE_ACTION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return opaqueAction((adwithoutruntime.OpaqueAction) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.JOIN_NODE && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return joinNode((adwithoutruntime.JoinNode) self);
		return null;
	}
	default Adwithoutruntime__IntegerExpressionT $(final adwithoutruntime.IntegerExpression self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return integerComparisonExpression((adwithoutruntime.IntegerComparisonExpression) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return integerCalculationExpression((adwithoutruntime.IntegerCalculationExpression) self);
		return null;
	}
	default Adwithoutruntime__ActionT $(final adwithoutruntime.Action self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.OPAQUE_ACTION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return opaqueAction((adwithoutruntime.OpaqueAction) self);
		return null;
	}
	default Adwithoutruntime__ExpressionT $(final adwithoutruntime.Expression self) {
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_UNARY_EXPRESSION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return booleanUnaryExpression((adwithoutruntime.BooleanUnaryExpression) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_COMPARISON_EXPRESSION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return integerComparisonExpression((adwithoutruntime.IntegerComparisonExpression) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.BOOLEAN_BINARY_EXPRESSION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return booleanBinaryExpression((adwithoutruntime.BooleanBinaryExpression) self);
		if(self.eClass().getClassifierID() == adwithoutruntime.AdwithoutruntimePackage.INTEGER_CALCULATION_EXPRESSION && self.eClass().getEPackage() == adwithoutruntime.AdwithoutruntimePackage.eINSTANCE) return integerCalculationExpression((adwithoutruntime.IntegerCalculationExpression) self);
		return null;
	}
	default Adwithoutruntime__IntegerCalculationExpressionT $(final adwithoutruntime.IntegerCalculationExpression self) {
		return integerCalculationExpression(self);
	}
	default Adwithoutruntime__JoinNodeT $(final adwithoutruntime.JoinNode self) {
		return joinNode(self);
	}
	default Adwithoutruntime__IntegerVariableT $(final adwithoutruntime.IntegerVariable self) {
		return integerVariable(self);
	}
}
