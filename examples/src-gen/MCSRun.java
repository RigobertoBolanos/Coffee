//Java imports
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
public class MCSRun { 			
	
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
	public MCSRun(String modelName){ 				
		
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
		MCS obj = new MCS("MCS");
		obj.run();
	}
	public void run(){
		// first obtain a HlclProgram from the specification
		transformVars();
		transformConstraints(); 
		// use the solver to solve the constraint program
		try {
			evaluateSatisfiability();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//show the output
		System.out.println(prologProgram);
	}
	public void transformVars() {
//declaring variable MCS
Identifier MCS = factory.newIdentifier("MCS");
  			BinaryDomain MCSDom= new BinaryDomain();
MCS.setDomain(MCSDom);	
variables.put("MCS", MCS); //including the variable in the map
//declaring variable SpeedSensor
Identifier SpeedSensor = factory.newIdentifier("SpeedSensor");
  			BinaryDomain SpeedSensorDom= new BinaryDomain();
SpeedSensor.setDomain(SpeedSensorDom);	
variables.put("SpeedSensor", SpeedSensor); //including the variable in the map
//declaring variable PosSensor
Identifier PosSensor = factory.newIdentifier("PosSensor");
  			BinaryDomain PosSensorDom= new BinaryDomain();
PosSensor.setDomain(PosSensorDom);	
variables.put("PosSensor", PosSensor); //including the variable in the map
//declaring variable PosSensor1
Identifier PosSensor1 = factory.newIdentifier("PosSensor1");
  			BinaryDomain PosSensor1Dom= new BinaryDomain();
PosSensor1.setDomain(PosSensor1Dom);	
variables.put("PosSensor1", PosSensor1); //including the variable in the map
//declaring variable PosSensor2
Identifier PosSensor2 = factory.newIdentifier("PosSensor2");
  			BinaryDomain PosSensor2Dom= new BinaryDomain();
PosSensor2.setDomain(PosSensor2Dom);	
variables.put("PosSensor2", PosSensor2); //including the variable in the map
//declaring variable Procesor
Identifier Procesor = factory.newIdentifier("Procesor");
  			BinaryDomain ProcesorDom= new BinaryDomain();
Procesor.setDomain(ProcesorDom);	
variables.put("Procesor", Procesor); //including the variable in the map
//declaring variable Feedback
Identifier Feedback = factory.newIdentifier("Feedback");
  			BinaryDomain FeedbackDom= new BinaryDomain();
Feedback.setDomain(FeedbackDom);	
variables.put("Feedback", Feedback); //including the variable in the map
//declaring variable Visual
Identifier Visual = factory.newIdentifier("Visual");
  			BinaryDomain VisualDom= new BinaryDomain();
Visual.setDomain(VisualDom);	
variables.put("Visual", Visual); //including the variable in the map
//declaring variable Audio
Identifier Audio = factory.newIdentifier("Audio");
  			BinaryDomain AudioDom= new BinaryDomain();
Audio.setDomain(AudioDom);	
variables.put("Audio", Audio); //including the variable in the map
//declaring variable Vibration
Identifier Vibration = factory.newIdentifier("Vibration");
  			BinaryDomain VibrationDom= new BinaryDomain();
Vibration.setDomain(VibrationDom);	
variables.put("Vibration", Vibration); //including the variable in the map
//declaring variable Memory
Identifier Memory = factory.newIdentifier("Memory");
  			BinaryDomain MemoryDom= new BinaryDomain();
Memory.setDomain(MemoryDom);	
variables.put("Memory", Memory); //including the variable in the map
//declaring variable Core
Identifier Core = factory.newIdentifier("Core");
 				RangeDomain CoreDom= new RangeDomain(0, 7);
Core.setDomain(CoreDom);	
variables.put("Core", Core); //including the variable in the map
//declaring variable Size
Identifier Size = factory.newIdentifier("Size");
 				RangeDomain SizeDom= new RangeDomain(0, 32);
Size.setDomain(SizeDom);	
variables.put("Size", Size); //including the variable in the map
	}
	public void transformConstraints() {
//
//declaring constraint C_MCS


Identifier C_MCS_left = variables.get("MCS");

NumericIdentifier C_MCS_right = getValue("1");
IntBooleanExpression C_MCS=
factory.equals(C_MCS_left, C_MCS_right);
constraints.put("C_MCS", C_MCS);
hlclProgram.add(C_MCS);
//
//declaring constraint cl1


Identifier cl1_left = variables.get("PosSensor1");

Identifier cl1_right = variables.get("PosSensor");
IntBooleanExpression cl1=factory.implies(cl1_left, cl1_right);		
constraints.put("cl1", cl1);
hlclProgram.add(cl1);
//
//declaring constraint cl2


Identifier cl2_left = variables.get("PosSensor2");

Identifier cl2_right = variables.get("PosSensor");
IntBooleanExpression cl2=factory.implies(cl2_left, cl2_right);		
constraints.put("cl2", cl2);
hlclProgram.add(cl2);
//
//declaring constraint cl3


Identifier cl3_left = variables.get("PosSensor");



NumericIdentifier cl3_right_left_left = getValue("0");


Identifier cl3_right_left_right_left = variables.get("PosSensor1");

Identifier cl3_right_left_right_right = variables.get("PosSensor2");
IntNumericExpression cl3_right_left_right=factory.sum(cl3_right_left_right_left, cl3_right_left_right_right);	
IntBooleanExpression cl3_right_left=
factory.lessOrEqualsThan(cl3_right_left_left, cl3_right_left_right);


NumericIdentifier cl3_right_right_left = getValue("2");


Identifier cl3_right_right_right_left = variables.get("PosSensor1");

Identifier cl3_right_right_right_right = variables.get("PosSensor2");
IntNumericExpression cl3_right_right_right=factory.sum(cl3_right_right_right_left, cl3_right_right_right_right);	
IntBooleanExpression cl3_right_right=
factory.greaterOrEqualsThan(cl3_right_right_left, cl3_right_right_right);
IntBooleanExpression cl3_right=factory.and(cl3_right_left, cl3_right_right);		
IntBooleanExpression cl3=factory.implies(cl3_left, cl3_right);		
constraints.put("cl3", cl3);
hlclProgram.add(cl3);
//
//declaring constraint c9


Identifier c9_left = variables.get("MCS");

Identifier c9_right = variables.get("SpeedSensor");
IntBooleanExpression c9=
factory.greaterOrEqualsThan(c9_left, c9_right);
constraints.put("c9", c9);
hlclProgram.add(c9);
//
//declaring constraint C10


Identifier C10_left = variables.get("MCS");

Identifier C10_right = variables.get("PosSensor");
IntBooleanExpression C10=
factory.greaterOrEqualsThan(C10_left, C10_right);
constraints.put("C10", C10);
hlclProgram.add(C10);
//
//declaring constraint C3


Identifier C3_left = variables.get("MCS");

Identifier C3_right = variables.get("Procesor");
IntBooleanExpression C3=
factory.greaterOrEqualsThan(C3_left, C3_right);
constraints.put("C3", C3);
hlclProgram.add(C3);
//
//declaring constraint C4


Identifier C4_left = variables.get("MCS");

Identifier C4_right = variables.get("Memory");
IntBooleanExpression C4=
factory.greaterOrEqualsThan(C4_left, C4_right);
constraints.put("C4", C4);
hlclProgram.add(C4);
//
//declaring constraint C5


Identifier C5_left = variables.get("MCS");

Identifier C5_right = variables.get("Feedback");
IntBooleanExpression C5=
factory.greaterOrEqualsThan(C5_left, C5_right);
constraints.put("C5", C5);
hlclProgram.add(C5);
//
//declaring constraint c6


Identifier c6_left = variables.get("Memory");


Identifier c6_right_left = variables.get("Size");

NumericIdentifier c6_right_right = getValue("0");
IntBooleanExpression c6_right=
factory.greaterThan(c6_right_left, c6_right_right);
IntBooleanExpression c6=factory.doubleImplies(c6_left, c6_right);		
constraints.put("c6", c6);
hlclProgram.add(c6);
//
//declaring constraint c7


Identifier c7_left = variables.get("Procesor");


Identifier c7_right_left = variables.get("Core");

NumericIdentifier c7_right_right = getValue("0");
IntBooleanExpression c7_right=
factory.greaterThan(c7_right_left, c7_right_right);
IntBooleanExpression c7=factory.doubleImplies(c7_left, c7_right);		
constraints.put("c7", c7);
hlclProgram.add(c7);
//
//declaring constraint C11







Identifier C11_left_left_left_left_left_left = variables.get("Visual");

Identifier C11_left_left_left_left_left_right = variables.get("Feedback");
IntBooleanExpression C11_left_left_left_left_left=factory.implies(C11_left_left_left_left_left_left, C11_left_left_left_left_left_right);		


Identifier C11_left_left_left_left_right_left = variables.get("Audio");

Identifier C11_left_left_left_left_right_right = variables.get("Feedback");
IntBooleanExpression C11_left_left_left_left_right=factory.implies(C11_left_left_left_left_right_left, C11_left_left_left_left_right_right);		
IntBooleanExpression C11_left_left_left_left=factory.and(C11_left_left_left_left_left, C11_left_left_left_left_right);		


Identifier C11_left_left_left_right_left = variables.get("Vibration");

Identifier C11_left_left_left_right_right = variables.get("Feedback");
IntBooleanExpression C11_left_left_left_right=factory.implies(C11_left_left_left_right_left, C11_left_left_left_right_right);		
IntBooleanExpression C11_left_left_left=factory.and(C11_left_left_left_left, C11_left_left_left_right);		


Identifier C11_left_left_right_left = variables.get("Feedback");

NumericIdentifier C11_left_left_right_right = getValue("1");
IntBooleanExpression C11_left_left_right=
factory.greaterOrEqualsThan(C11_left_left_right_left, C11_left_left_right_right);
IntBooleanExpression C11_left_left=factory.and(C11_left_left_left, C11_left_left_right);		





Identifier C11_left_right_left_left_left_left = variables.get("Visual");

Identifier C11_left_right_left_left_left_right = variables.get("Audio");
IntNumericExpression C11_left_right_left_left_left=factory.sum(C11_left_right_left_left_left_left, C11_left_right_left_left_left_right);	

Identifier C11_left_right_left_left_right = variables.get("Vibration");
IntNumericExpression C11_left_right_left_left=factory.sum(C11_left_right_left_left_left, C11_left_right_left_left_right);	

NumericIdentifier C11_left_right_left_right = getValue("1");
IntBooleanExpression C11_left_right_left=
factory.greaterOrEqualsThan(C11_left_right_left_left, C11_left_right_left_right);


Identifier C11_left_right_right_left = variables.get("Feedback");

NumericIdentifier C11_left_right_right_right = getValue("1");
IntBooleanExpression C11_left_right_right=
factory.greaterOrEqualsThan(C11_left_right_right_left, C11_left_right_right_right);
IntBooleanExpression C11_left_right=factory.and(C11_left_right_left, C11_left_right_right);		
IntBooleanExpression C11_left=factory.implies(C11_left_left, C11_left_right);		




Identifier C11_right_left_left_left = variables.get("Visual");

Identifier C11_right_left_left_right = variables.get("Audio");
IntNumericExpression C11_right_left_left=factory.sum(C11_right_left_left_left, C11_right_left_left_right);	

Identifier C11_right_left_right = variables.get("Vibration");
IntNumericExpression C11_right_left=factory.sum(C11_right_left_left, C11_right_left_right);	

NumericIdentifier C11_right_right = getValue("2");
IntBooleanExpression C11_right=
factory.lessOrEqualsThan(C11_right_left, C11_right_right);
IntBooleanExpression C11=factory.implies(C11_left, C11_right);		
constraints.put("C11", C11);
hlclProgram.add(C11);


NumericIdentifier[][] tuples= new NumericIdentifier[6][2];
tuples[0][0]= getValue("1");
tuples[0][1]= getValue("2");

tuples[1][0]= getValue("2");
tuples[1][1]= getValue("4");

tuples[2][0]= getValue("3");
tuples[2][1]= getValue("8");

tuples[3][0]= getValue("4");
tuples[3][1]= getValue("16");

tuples[4][0]= getValue("5");
tuples[4][1]= getValue("32");

tuples[5][0]= getValue("0");
tuples[5][1]= getValue("0");

SymbolicExpression C12 = factory.newSymbolicRelation(tuples, 
		variables.get("Core"),variables.get("Size"));
constraints.put("C12", C12);
hlclProgram.add(C12);
	}
	public boolean evaluateSatisfiability() throws FileNotFoundException, UnsupportedEncodingException{
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
			PrintWriter writer = new PrintWriter("file.txt", "UTF-8");

			
			for (SolverSolution solverSolution : solutions) {
				writer.println(solverSolution.toString());
				System.out.println(solverSolution.toString());
			}
			writer.close();
			return evaluation;
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