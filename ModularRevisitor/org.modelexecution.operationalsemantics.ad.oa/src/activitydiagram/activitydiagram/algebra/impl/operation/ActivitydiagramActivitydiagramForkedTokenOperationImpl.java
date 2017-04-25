package activitydiagram.activitydiagram.algebra.impl.operation;
public class ActivitydiagramActivitydiagramForkedTokenOperationImpl implements activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedTokenOperation { 
			
			
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
		
	private final activitydiagram.ForkedToken self;
	private final activitydiagram.algebra.ActivitydiagramAlgebra<? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramAction_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityEdgeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdge_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivity_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanBinaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanUnaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultBooleanValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlFlowOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlow_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramDecisionNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExecutableNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExpressionOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramForkNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramInitialNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerCalculationExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerComparisonExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultIntegerValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramJoinNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramMergeNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNode_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultNamedElementOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOfferOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramOpaqueActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTraceOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariable_AspectOperation> algebra;
	private final activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramTokenOperationImpl delegateToken;
	
	public ActivitydiagramActivitydiagramForkedTokenOperationImpl(final activitydiagram.ForkedToken self, final activitydiagram.algebra.ActivitydiagramAlgebra<? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramAction_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityEdgeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdge_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramActivityNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivity_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanBinaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanUnaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultBooleanValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramBooleanVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlFlowOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlow_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramControlNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramDecisionNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExecutableNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramExpressionOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramForkNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedTokenOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramInitialNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerCalculationExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerComparisonExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpression_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpression_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultIntegerValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramIntegerVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariable_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramJoinNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNode_AspectOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramMergeNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNode_AspectOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultNamedElementOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOfferOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramOpaqueActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTraceOperation, ? extends activitydiagramoa.$default.algebra.operation.Activitydiagramoa$defaultValueOperation, ? extends activitydiagramoa.activitydiagram.algebra.operation.ActivitydiagramoaActivitydiagramVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariable_AspectOperation> algebra) {
		this.self = self;
		this.algebra = algebra;
		this.delegateToken = new activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramTokenOperationImpl(self, algebra);
	}
	
	
	
	
	public activitydiagram.Token getBaseToken() {
		return this.self.getBaseToken();
			}
	public void setBaseToken(activitydiagram.Token baseToken) {
		this.self.setBaseToken(baseToken);
	}
	public Integer getRemainingOffersCount() {
		return this.self.getRemainingOffersCount();
			}
	public void setRemainingOffersCount(Integer remainingOffersCount) {
		this.self.setRemainingOffersCount(remainingOffersCount);
	}
	public activitydiagramoa.ActivityNode getHolder() {
		return this.delegateToken.getHolder();
			}
	public void setHolder(activitydiagramoa.ActivityNode holder) {
		this.delegateToken.setHolder(holder);
	}
	public void withdraw() {
if(!algebra.$(self.getBaseToken()).isWithdrawn()) {
			algebra.$(self.getBaseToken()).withdraw();
		} 
if(self.getRemainingOffersCount() > 0) {
			self.setRemainingOffersCount(self.getRemainingOffersCount() - 1);
		} 
if(java.util.Objects.equals(self.getRemainingOffersCount(), 0)) {
			this.delegateToken.withdraw();
		} 
	}
	public Boolean isWithdrawn() {
return java.util.Objects.equals(this.delegateToken.getHolder(), null);
	}
	public activitydiagram.Token transfer(activitydiagramoa.ActivityNode holder) {
if(this.delegateToken.getHolder() != null) {
			this.withdraw();
		} 
this.delegateToken.setHolder(holder);
return self;
	}
}
