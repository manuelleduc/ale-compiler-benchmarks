package printexp.revisitor;

import boolexp.And;
import boolexp.Fals;
import boolexp.Or;
import boolexp.Tru;
import boolexp.revisitor.BoolexpRevisitor;
import printexp.revisitor.operations.AndOperation;
import printexp.revisitor.operations.ExpOperation;
import printexp.revisitor.operations.FalsOperation;
import printexp.revisitor.operations.OrOperation;
import printexp.revisitor.operations.TruOperation;

@SuppressWarnings("all")
public interface PrintexpRevisitor extends BoolexpRevisitor<AndOperation, ExpOperation, ExpOperation, FalsOperation, ExpOperation, OrOperation, TruOperation> {
  @Override
  public default AndOperation and(final And a) {
    return new printexp.revisitor.operations.impl.AndOperationImpl(a, this);
  }
  
  @Override
  public default AndOperation exp_and(final And a) {
    return new printexp.revisitor.operations.impl.AndOperationImpl(a, this); 
  }
  
  @Override
  public default AndOperation binaryExp_and(final And a) {
    return new printexp.revisitor.operations.impl.AndOperationImpl(a, this); 
  }
  
  @Override
  public default FalsOperation fals(final Fals f) {
    return new printexp.revisitor.operations.impl.FalsOperationImpl(f, this);
  }
  
  @Override
  public default FalsOperation exp_fals(final Fals f) {
    return new printexp.revisitor.operations.impl.FalsOperationImpl(f, this); 
  }
  
  @Override
  public default FalsOperation lit_fals(final Fals f) {
    return new printexp.revisitor.operations.impl.FalsOperationImpl(f, this); 
  }
  
  @Override
  public default OrOperation or(final Or o) {
    return new printexp.revisitor.operations.impl.OrOperationImpl(o, this);
  }
  
  @Override
  public default OrOperation exp_or(final Or o) {
    return new printexp.revisitor.operations.impl.OrOperationImpl(o, this); 
  }
  
  @Override
  public default OrOperation binaryExp_or(final Or o) {
    return new printexp.revisitor.operations.impl.OrOperationImpl(o, this); 
  }
  
  @Override
  public default TruOperation tru(final Tru t) {
    return new printexp.revisitor.operations.impl.TruOperationImpl(t, this);
  }
  
  @Override
  public default TruOperation exp_tru(final Tru t) {
    return new printexp.revisitor.operations.impl.TruOperationImpl(t, this); 
  }
  
  @Override
  public default TruOperation lit_tru(final Tru t) {
    return new printexp.revisitor.operations.impl.TruOperationImpl(t, this); 
  }
}