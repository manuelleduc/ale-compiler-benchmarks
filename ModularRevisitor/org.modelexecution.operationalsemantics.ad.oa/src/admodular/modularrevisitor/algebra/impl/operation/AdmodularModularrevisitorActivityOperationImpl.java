package admodular.modularrevisitor.algebra.impl.operation;
public class AdmodularModularrevisitorActivityOperationImpl implements admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityOperation { 
			
			
	private class EListCollector<T> implements java.util.stream.Collector<T, org.eclipse.emf.common.util.EList<T>, org.eclipse.emf.common.util.EList<T>> {

		@Override
		public java.util.function.Supplier<org.eclipse.emf.common.util.EList<T>> supplier() {
			return org.eclipse.emf.common.util.BasicEList::new;
		}

		@Override
		public java.util.function.BiConsumer<org.eclipse.emf.common.util.EList<T>, T> accumulator() {
			return (a, b) -> a.add(b);
		}

		@Override
		public java.util.function.BinaryOperator<org.eclipse.emf.common.util.EList<T>> combiner() {
			return (a, b) -> {
				a.addAll(b);
				return a;
			};
		}

		@Override
		public java.util.function.Function<org.eclipse.emf.common.util.EList<T>, org.eclipse.emf.common.util.EList<T>> finisher() {
			return java.util.function.Function.identity();
		}

		@Override
		public java.util.Set<java.util.stream.Collector.Characteristics> characteristics() {
			java.util.HashSet<java.util.stream.Collector.Characteristics> hashSet = new java.util.HashSet<>();
			hashSet.add(java.util.stream.Collector.Characteristics.UNORDERED);
			return hashSet;
		}

	}
		
	private final admodular.Activity self;
	private final modularrevisitor.algebra.ModularrevisitorAlgebra<? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorAction_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityEdgeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorActivityEdge_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityFinalNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorActivityFinalNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorActivityNode_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorActivity_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanBinaryExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanBinaryExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanUnaryExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanUnaryExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanValueOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanValue_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanVariableOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanVariable_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorControlFlowOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorControlFlow_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorControlNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorControlNode_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorControlTokenOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorDecisionNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorDecisionNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorExecutableNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorExecutableNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorExpressionOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorFinalNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorFinalNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorForkNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorForkNode_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorForkedTokenOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorInitialNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorInitialNode_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorInputOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorInputValueOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerCalculationExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerCalculationExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerComparisonExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerComparisonExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerValueOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerValue_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerVariableOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerVariable_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorJoinNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorJoinNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorMergeNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorMergeNode_AspectOperation, ? extends admodular.$default.algebra.operation.Admodular$defaultNamedElementOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorOfferOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorOpaqueActionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorOpaqueAction_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorTokenOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorTraceOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorValueOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorVariableOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorVariable_AspectOperation> algebra;
	
	public AdmodularModularrevisitorActivityOperationImpl(final admodular.Activity self, final modularrevisitor.algebra.ModularrevisitorAlgebra<? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorAction_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityEdgeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorActivityEdge_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityFinalNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorActivityFinalNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorActivityNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorActivityNode_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorActivity_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanBinaryExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanBinaryExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanUnaryExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanUnaryExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanValueOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanValue_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorBooleanVariableOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorBooleanVariable_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorControlFlowOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorControlFlow_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorControlNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorControlNode_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorControlTokenOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorDecisionNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorDecisionNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorExecutableNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorExecutableNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorExpressionOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorFinalNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorFinalNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorForkNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorForkNode_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorForkedTokenOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorInitialNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorInitialNode_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorInputOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorInputValueOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerCalculationExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerCalculationExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerComparisonExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerComparisonExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerExpressionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerExpression_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerValueOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerValue_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorIntegerVariableOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorIntegerVariable_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorJoinNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorJoinNode_AspectOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorMergeNodeOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorMergeNode_AspectOperation, ? extends admodular.$default.algebra.operation.Admodular$defaultNamedElementOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorOfferOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorOpaqueActionOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorOpaqueAction_AspectOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorTokenOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorTraceOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorValueOperation, ? extends admodular.modularrevisitor.algebra.operation.AdmodularModularrevisitorVariableOperation, ? extends modularrevisitor.modularrevisitor.algebra.operation.ModularrevisitorModularrevisitorVariable_AspectOperation> algebra) {
		this.self = self;
		this.algebra = algebra;
	}
	
	
	
	
	public modularrevisitor.Trace getTrace() {
return null;
	}
	public void setTrace(modularrevisitor.Trace trace) {
	}
	public void initialize(org.eclipse.emf.common.util.EList<modularrevisitor.InputValue> inputValues) {
	}
	public void main(org.eclipse.emf.common.util.EList<modularrevisitor.InputValue> inputValues) {
	}
	public void run() {
	}
	public admodular.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<admodular.ActivityNode> activityNodes) {
return null;
	}
	public org.eclipse.emf.common.util.EList<admodular.ActivityNode> getEnabledNodes() {
return null;
	}
	public void fireInitialNode() {
	}
	public void fireNode(admodular.ActivityNode node) {
	}
	public admodular.InitialNode getInitialNode() {
return null;
	}
	public void runNodes() {
	}
	public void initializeTrace() {
	}
	public void terminate() {
	}
}
