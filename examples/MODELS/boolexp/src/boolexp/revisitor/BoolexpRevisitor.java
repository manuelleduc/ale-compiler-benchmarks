package boolexp.revisitor;

public interface BoolexpRevisitor<Boolexp__AndT extends Boolexp__BinaryExpT, Boolexp__BinaryExpT extends Boolexp__ExpT, Boolexp__ExpT, Boolexp__FalsT extends Boolexp__LitT, Boolexp__LitT extends Boolexp__ExpT, Boolexp__OrT extends Boolexp__BinaryExpT, Boolexp__TruT extends Boolexp__LitT> {
	Boolexp__AndT and(final boolexp.And a);
	Boolexp__ExpT exp_and(final boolexp.And a);
	Boolexp__BinaryExpT binaryExp_and(final boolexp.And a);
	Boolexp__FalsT fals(final boolexp.Fals f);
	Boolexp__ExpT exp_fals(final boolexp.Fals f);
	Boolexp__LitT lit_fals(final boolexp.Fals f);
	Boolexp__OrT or(final boolexp.Or o);
	Boolexp__ExpT exp_or(final boolexp.Or o);
	Boolexp__BinaryExpT binaryExp_or(final boolexp.Or o);
	Boolexp__TruT tru(final boolexp.Tru t);
	Boolexp__ExpT exp_tru(final boolexp.Tru t);
	Boolexp__LitT lit_tru(final boolexp.Tru t);

	default Boolexp__AndT $(final boolexp.And self) {
		return and(self);
	}
	default Boolexp__BinaryExpT $(final boolexp.BinaryExp self) {
		if (self.eClass().getClassifierID() == boolexp.BoolexpPackage.AND
			&& self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE)
			return and((boolexp.And) self);
		if (self.eClass().getClassifierID() == boolexp.BoolexpPackage.OR
			&& self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE)
			return or((boolexp.Or) self);
		return null;
	}
	default Boolexp__ExpT $(final boolexp.Exp self) {
		if (self.eClass().getClassifierID() == boolexp.BoolexpPackage.AND
			&& self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE)
			return and((boolexp.And) self);
		if (self.eClass().getClassifierID() == boolexp.BoolexpPackage.FALS
			&& self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE)
			return fals((boolexp.Fals) self);
		if (self.eClass().getClassifierID() == boolexp.BoolexpPackage.OR
			&& self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE)
			return or((boolexp.Or) self);
		if (self.eClass().getClassifierID() == boolexp.BoolexpPackage.TRU
			&& self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE)
			return tru((boolexp.Tru) self);
		return null;
	}
	default Boolexp__FalsT $(final boolexp.Fals self) {
		return fals(self);
	}
	default Boolexp__LitT $(final boolexp.Lit self) {
		if (self.eClass().getClassifierID() == boolexp.BoolexpPackage.FALS
			&& self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE)
			return fals((boolexp.Fals) self);
		if (self.eClass().getClassifierID() == boolexp.BoolexpPackage.TRU
			&& self.eClass().getEPackage() == boolexp.BoolexpPackage.eINSTANCE)
			return tru((boolexp.Tru) self);
		return null;
	}
	default Boolexp__OrT $(final boolexp.Or self) {
		return or(self);
	}
	default Boolexp__TruT $(final boolexp.Tru self) {
		return tru(self);
	}
}
