//Java imports
import java.util.HashMap;
import java.util.List;
//imports for hlcl 
import com.variamos.hlcl.core.HlclProgram; 
import com.variamos.hlcl.model.expressions.HlclFactory; 
import com.variamos.hlcl.model.domains.BinaryDomain;
import com.variamos.hlcl.model.domains.IntervalDomain;
import com.variamos.hlcl.model.domains.RangeDomain;
import com.variamos.hlcl.model.domains.StringDomain;
import com.variamos.hlcl.model.expressions.Identifier;
import com.variamos.hlcl.model.expressions.IntBooleanExpression;
import com.variamos.hlcl.model.expressions.NumericIdentifier;
import com.variamos.hlcl.model.expressions.SymbolicExpression;
import com.variamos.hlcl.model.expressions.IntNumericExpression;

//imports for solver
import com.variamos.solver.core.SWIPrologSolver;
import com.variamos.solver.core.compiler.Hlcl2SWIProlog;
import com.variamos.solver.model.SolverSolution;

/**
* This class is automatically generated from a product line model described in 
* constraint programming HLCL
* @author Angela Villota 
* @version CP-HLCL Version1
*
*/
public class EX1_PLM_Michel_2011 { 			
	
	private String modelName;
	private HlclFactory factory;
	private HlclProgram hlclProgram;
	private SWIPrologSolver swiSolver;
	private String prologProgram;
	private HashMap<String,IntBooleanExpression> constraints;
	private HashMap<String,Identifier> variables;
	private HashMap<String,NumericIdentifier> numbers;
	/**
	* This is an autogenerated method* Constructor method
	* @param modelName is the name of the model in the  CP-HLCL specification
	*/
	public EX1_PLM_Michel_2011(String modelName){ 				
		
		this.modelName= modelName;
		hlclProgram= new HlclProgram();
		factory = new HlclFactory();
		variables= new HashMap<String,Identifier>();
		constraints= new HashMap<String,IntBooleanExpression>();
		numbers= new HashMap<String,NumericIdentifier>();
		NumericIdentifier one = factory.number(1);
		NumericIdentifier zero= factory.number(0);
		numbers.put("1", one);
		numbers.put("0", zero);
	} 			
	public static void main(String[] args) {
		EX1_PLM_Michel_2011 obj = new EX1_PLM_Michel_2011("EX1_PLM_Michel_2011");
		obj.run();
	}
	public void run(){
		// first obtain a HlclProgram from the specification
		transformVars();
		transformConstraints(); 
		// use the solver to solve the constraint program
		evaluateSatisfiability();
		//show the output
		System.out.println(prologProgram);
	}
	public void transformVars() {
//declaring variable Document
Identifier Document = factory.newIdentifier("Document");
  			BinaryDomain DocumentDom= new BinaryDomain();
Document.setDomain(DocumentDom);	
variables.put("Document", Document); //including the variable in the map
//declaring variable Type
Identifier Type = factory.newIdentifier("Type");
  			BinaryDomain TypeDom= new BinaryDomain();
Type.setDomain(TypeDom);	
variables.put("Type", Type); //including the variable in the map
//declaring variable Binding
Identifier Binding = factory.newIdentifier("Binding");
  			BinaryDomain BindingDom= new BinaryDomain();
Binding.setDomain(BindingDom);	
variables.put("Binding", Binding); //including the variable in the map
//declaring variable Normal
Identifier Normal = factory.newIdentifier("Normal");
  			BinaryDomain NormalDom= new BinaryDomain();
Normal.setDomain(NormalDom);	
variables.put("Normal", Normal); //including the variable in the map
//declaring variable Booklet
Identifier Booklet = factory.newIdentifier("Booklet");
  			BinaryDomain BookletDom= new BinaryDomain();
Booklet.setDomain(BookletDom);	
variables.put("Booklet", Booklet); //including the variable in the map
//declaring variable Top
Identifier Top = factory.newIdentifier("Top");
  			BinaryDomain TopDom= new BinaryDomain();
Top.setDomain(TopDom);	
variables.put("Top", Top); //including the variable in the map
//declaring variable Left
Identifier Left = factory.newIdentifier("Left");
  			BinaryDomain LeftDom= new BinaryDomain();
Left.setDomain(LeftDom);	
variables.put("Left", Left); //including the variable in the map
//declaring variable Right
Identifier Right = factory.newIdentifier("Right");
  			BinaryDomain RightDom= new BinaryDomain();
Right.setDomain(RightDom);	
variables.put("Right", Right); //including the variable in the map
	}
	public void transformConstraints() {
//
//declaring constraint c0


Identifier c0_left = variables.get("Document");

NumericIdentifier c0_right = getValue("1");
IntBooleanExpression c0=
factory.equals(c0_left, c0_right);
constraints.put("c0", c0);
hlclProgram.add(c0);
//
//declaring constraint c1



Identifier c1_left_left = variables.get("Normal");



Identifier c1_left_right_left_negation = variables.get("Booklet");
IntBooleanExpression c1_left_right_left=factory.not(c1_left_right_left_negation);

Identifier c1_left_right_right = variables.get("Type");
IntBooleanExpression c1_left_right=factory.and(c1_left_right_left, c1_left_right_right);		
IntBooleanExpression c1_left=factory.doubleImplies(c1_left_left, c1_left_right);		


Identifier c1_right_left = variables.get("Booklet");



Identifier c1_right_right_left_negation = variables.get("Normal");
IntBooleanExpression c1_right_right_left=factory.not(c1_right_right_left_negation);

Identifier c1_right_right_right = variables.get("Type");
IntBooleanExpression c1_right_right=factory.and(c1_right_right_left, c1_right_right_right);		
IntBooleanExpression c1_right=factory.doubleImplies(c1_right_left, c1_right_right);		
IntBooleanExpression c1=factory.and(c1_left, c1_right);		
constraints.put("c1", c1);
hlclProgram.add(c1);
//
//declaring constraint c2




Identifier c2_left_left_left = variables.get("Top");




Identifier c2_left_left_right_left_left_negation = variables.get("Left");
IntBooleanExpression c2_left_left_right_left_left=factory.not(c2_left_left_right_left_left_negation);


Identifier c2_left_left_right_left_right_negation = variables.get("Right");
IntBooleanExpression c2_left_left_right_left_right=factory.not(c2_left_left_right_left_right_negation);
IntBooleanExpression c2_left_left_right_left=factory.and(c2_left_left_right_left_left, c2_left_left_right_left_right);		

Identifier c2_left_left_right_right = variables.get("Binding");
IntBooleanExpression c2_left_left_right=factory.and(c2_left_left_right_left, c2_left_left_right_right);		
IntBooleanExpression c2_left_left=factory.doubleImplies(c2_left_left_left, c2_left_left_right);		


Identifier c2_left_right_left = variables.get("Left");




Identifier c2_left_right_right_left_left_negation = variables.get("Top");
IntBooleanExpression c2_left_right_right_left_left=factory.not(c2_left_right_right_left_left_negation);


Identifier c2_left_right_right_left_right_negation = variables.get("Right");
IntBooleanExpression c2_left_right_right_left_right=factory.not(c2_left_right_right_left_right_negation);
IntBooleanExpression c2_left_right_right_left=factory.and(c2_left_right_right_left_left, c2_left_right_right_left_right);		

Identifier c2_left_right_right_right = variables.get("Binding");
IntBooleanExpression c2_left_right_right=factory.and(c2_left_right_right_left, c2_left_right_right_right);		
IntBooleanExpression c2_left_right=factory.doubleImplies(c2_left_right_left, c2_left_right_right);		
IntBooleanExpression c2_left=factory.and(c2_left_left, c2_left_right);		


Identifier c2_right_left = variables.get("Right");




Identifier c2_right_right_left_left_negation = variables.get("Top");
IntBooleanExpression c2_right_right_left_left=factory.not(c2_right_right_left_left_negation);


Identifier c2_right_right_left_right_negation = variables.get("Left");
IntBooleanExpression c2_right_right_left_right=factory.not(c2_right_right_left_right_negation);
IntBooleanExpression c2_right_right_left=factory.and(c2_right_right_left_left, c2_right_right_left_right);		

Identifier c2_right_right_right = variables.get("Binding");
IntBooleanExpression c2_right_right=factory.and(c2_right_right_left, c2_right_right_right);		
IntBooleanExpression c2_right=factory.doubleImplies(c2_right_left, c2_right_right);		
IntBooleanExpression c2=factory.and(c2_left, c2_right);		
constraints.put("c2", c2);
hlclProgram.add(c2);
//
//declaring constraint c3



Identifier c3_negation_left = variables.get("Booklet");

Identifier c3_negation_right = variables.get("Binding");
IntBooleanExpression c3_negation=factory.and(c3_negation_left, c3_negation_right);		
IntBooleanExpression c3=factory.not(c3_negation);
constraints.put("c3", c3);
hlclProgram.add(c3);
	}
	public boolean evaluateSatisfiability(){
		// the output
		boolean evaluation= false;
		// //to transform the hllcl program into a prolog  file, 
		// //these lines are commented because they are useful for debugging 
		Hlcl2SWIProlog swiPrologTransformer = new Hlcl2SWIProlog(); 
		prologProgram = swiPrologTransformer.transform(hlclProgram);
				
		// an instance of the solver for Swiprolog 
		swiSolver= new SWIPrologSolver();
		swiSolver.setHLCLProgram(hlclProgram); //passing the hlcl program to the solver
		swiSolver.solve(); // This methhod prepares the solver 
		List<SolverSolution> solutions = swiSolver.getAllSolutions(); // Consulting if the solver has one solution
			evaluation= solutions.size()>0;
			for (SolverSolution solverSolution : solutions) {
				System.out.println(solverSolution.toString());
			}	return evaluation;
	}
	/** 
	* To obtain the NumericIdentifier representation of a value 
	* @param id the string with the value 
	* @return the NumericIdentifier 
	*/
	public NumericIdentifier getValue(String id) {	NumericIdentifier value= numbers.get(id); 
	 	if (value==null) { 
	 		if (id.equals("selected")) { 
	 			value= numbers.get("1"); 
	 		} 
	 		else if(id.equals("unselected")) {
				value= numbers.get("0"); 
			} 
			else { 
				value= factory.number(Integer.parseInt(id)); 
				numbers.put(id, value);
			}
	 	} 
	 	return value; 
	 } 
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public HlclFactory getFactory() {
			return factory;
		}
		public void setFactory(HlclFactory factory) {
			this.factory = factory;
		}
		public HlclProgram getHlclProgram() {
			return hlclProgram;
		}
		public void setHlclProgram(HlclProgram hlclProgram) {
			this.hlclProgram = hlclProgram;
		}
} 	