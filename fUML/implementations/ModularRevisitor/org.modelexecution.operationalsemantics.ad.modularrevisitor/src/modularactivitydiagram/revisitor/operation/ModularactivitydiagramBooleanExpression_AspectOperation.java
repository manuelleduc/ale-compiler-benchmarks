package modularactivitydiagram.revisitor.operation;

public interface ModularactivitydiagramBooleanExpression_AspectOperation
extends modularactivitydiagram.revisitor.operation.ModularactivitydiagramBooleanExpressionOperation 
{
	void assignValue(Boolean value);
	Boolean getCurrentValue(adwithoutruntime.BooleanVariable variable);
}