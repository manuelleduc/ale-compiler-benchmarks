package monolithicactivitydiagram.revisitor.operations.impl;

public class IntegerComparisonExpressionOperationImpl implements monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation {
	private final activitydiagram.IntegerComparisonExpression self;
	private final activitydiagram.revisitor.ActivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operations.ActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operations.OfferOperation, ? extends monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.TokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.TraceOperation, ? extends monolithicactivitydiagram.revisitor.operations.ValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.VariableOperation> alg;

	private final monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation monolithicactivitydiagramdelegate;

	public IntegerComparisonExpressionOperationImpl(activitydiagram.IntegerComparisonExpression self, activitydiagram.revisitor.ActivitydiagramRevisitor<? extends monolithicactivitydiagram.revisitor.operations.ActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityEdgeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityFinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ActivityNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanBinaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanUnaryExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.BooleanVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlFlowOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ControlTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.DecisionNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExecutableNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.FinalNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.ForkedTokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.InitialNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputOperation, ? extends monolithicactivitydiagram.revisitor.operations.InputValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerCalculationExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerComparisonExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerExpressionOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.IntegerVariableOperation, ? extends monolithicactivitydiagram.revisitor.operations.JoinNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.MergeNodeOperation, ? extends monolithicactivitydiagram.revisitor.operations.NamedElementOperation, ? extends monolithicactivitydiagram.revisitor.operations.OfferOperation, ? extends monolithicactivitydiagram.revisitor.operations.OpaqueActionOperation, ? extends monolithicactivitydiagram.revisitor.operations.TokenOperation, ? extends monolithicactivitydiagram.revisitor.operations.TraceOperation, ? extends monolithicactivitydiagram.revisitor.operations.ValueOperation, ? extends monolithicactivitydiagram.revisitor.operations.VariableOperation> alg) {
		this.self = self;
		this.alg = alg;
		this.monolithicactivitydiagramdelegate = new monolithicactivitydiagram.revisitor.operations.impl.IntegerExpressionOperationImpl(self, alg);
	}

	@Override
	public void execute() {
		Integer operandValue1 = alg.$(self).getCurrentValue(self.getOperand1());
		Integer operandValue2 = alg.$(self).getCurrentValue(self.getOperand2());
		Boolean result = null;
		if (java.util.Objects.equals(self.getOperator(), activitydiagram.IntegerComparisonOperator.EQUALS)) {
			result = java.util.Objects.equals(operandValue1, operandValue2);
		}  else {
			if (java.util.Objects.equals(self.getOperator(), activitydiagram.IntegerComparisonOperator.GREATER)) {
				result = operandValue1 > operandValue2;
			}  else {
				if (java.util.Objects.equals(self.getOperator(), activitydiagram.IntegerComparisonOperator.GREATER_EQUALS)) {
					result = operandValue1 >= operandValue2;
				}  else {
					if (java.util.Objects.equals(self.getOperator(), activitydiagram.IntegerComparisonOperator.SMALLER)) {
						result = operandValue1 < operandValue2;
					}  else {
						result = operandValue1 <= operandValue2;
					} 
				} 
			} 
		} 
		activitydiagram.BooleanValue resultValue = activitydiagram.ActivitydiagramFactory.eINSTANCE.createBooleanValue();
		resultValue.setValue(result);
		self.getAssignee().setCurrentValue(resultValue);
	}
	@Override
	public Integer getCurrentValue(activitydiagram.Variable variable) {
		return this.monolithicactivitydiagramdelegate.getCurrentValue(variable);
	}
}
