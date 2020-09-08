package com.coffe.generator.hlvlExtended;

import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.VarList;

public interface IHlvlExtendedRules {

	public CharSequence getImpliesList(VarList rel);
	public CharSequence getMutexList(VarList rel);
	
	public CharSequence getImpliesPair(ElmDeclaration left, ElmDeclaration right);
	public CharSequence getMutexPair(ElmDeclaration left, ElmDeclaration right);
}
