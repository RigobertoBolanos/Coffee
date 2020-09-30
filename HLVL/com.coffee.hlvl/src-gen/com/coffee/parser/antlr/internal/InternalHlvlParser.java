package com.coffee.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.coffee.services.HlvlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHlvlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'extends'", "'elements:'", "'relations:'", "'operations:'", "','", "'att'", "'boolean'", "'integer'", "'symbolic'", "'comment:'", "'{'", "'}'", "'is'", "'variants:'", "'..'", "'['", "']'", "':'", "'common'", "'('", "')'", "'implies'", "'mutex'", "'decomposition'", "'group'", "'*'", "'visibility'", "'before'", "'after'", "'expression'", "'<=>'", "'=>'", "'OR'", "'AND'", "'='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'/'", "'mod'", "'~'", "'abs'", "'sqrt'", "'instances'", "'entailed'", "'selected'", "'pow'", "'dist'", "'min'", "'max'", "'if'", "'true'", "'false'", "'.'", "'validConfiguration'", "'validModel'", "'numberOfConfigurations'", "'findConfiguration'", "'findAllConfigurations'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalHlvlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHlvlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHlvlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHlvl.g"; }



     	private HlvlGrammarAccess grammarAccess;

        public InternalHlvlParser(TokenStream input, HlvlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected HlvlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHlvl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHlvl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalHlvl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHlvl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extendedModels_3_0= ruleListOfModelRef ) ) )? otherlv_4= 'elements:' ( (lv_elements_5_0= ruleElmDeclaration ) )* otherlv_6= 'relations:' ( (lv_relations_7_0= ruleRelDeclaration ) )* (otherlv_8= 'operations:' ( (lv_operations_9_0= ruleOperations ) ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_extendedModels_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_relations_7_0 = null;

        EObject lv_operations_9_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extendedModels_3_0= ruleListOfModelRef ) ) )? otherlv_4= 'elements:' ( (lv_elements_5_0= ruleElmDeclaration ) )* otherlv_6= 'relations:' ( (lv_relations_7_0= ruleRelDeclaration ) )* (otherlv_8= 'operations:' ( (lv_operations_9_0= ruleOperations ) ) )? ) )
            // InternalHlvl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extendedModels_3_0= ruleListOfModelRef ) ) )? otherlv_4= 'elements:' ( (lv_elements_5_0= ruleElmDeclaration ) )* otherlv_6= 'relations:' ( (lv_relations_7_0= ruleRelDeclaration ) )* (otherlv_8= 'operations:' ( (lv_operations_9_0= ruleOperations ) ) )? )
            {
            // InternalHlvl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extendedModels_3_0= ruleListOfModelRef ) ) )? otherlv_4= 'elements:' ( (lv_elements_5_0= ruleElmDeclaration ) )* otherlv_6= 'relations:' ( (lv_relations_7_0= ruleRelDeclaration ) )* (otherlv_8= 'operations:' ( (lv_operations_9_0= ruleOperations ) ) )? )
            // InternalHlvl.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_extendedModels_3_0= ruleListOfModelRef ) ) )? otherlv_4= 'elements:' ( (lv_elements_5_0= ruleElmDeclaration ) )* otherlv_6= 'relations:' ( (lv_relations_7_0= ruleRelDeclaration ) )* (otherlv_8= 'operations:' ( (lv_operations_9_0= ruleOperations ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalHlvl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHlvl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHlvl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalHlvl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalHlvl.g:101:3: (otherlv_2= 'extends' ( (lv_extendedModels_3_0= ruleListOfModelRef ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalHlvl.g:102:4: otherlv_2= 'extends' ( (lv_extendedModels_3_0= ruleListOfModelRef ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getExtendsKeyword_2_0());
                    			
                    // InternalHlvl.g:106:4: ( (lv_extendedModels_3_0= ruleListOfModelRef ) )
                    // InternalHlvl.g:107:5: (lv_extendedModels_3_0= ruleListOfModelRef )
                    {
                    // InternalHlvl.g:107:5: (lv_extendedModels_3_0= ruleListOfModelRef )
                    // InternalHlvl.g:108:6: lv_extendedModels_3_0= ruleListOfModelRef
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getExtendedModelsListOfModelRefParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_extendedModels_3_0=ruleListOfModelRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"extendedModels",
                    							lv_extendedModels_3_0,
                    							"com.coffee.Hlvl.ListOfModelRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getElementsKeyword_3());
            		
            // InternalHlvl.g:130:3: ( (lv_elements_5_0= ruleElmDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHlvl.g:131:4: (lv_elements_5_0= ruleElmDeclaration )
            	    {
            	    // InternalHlvl.g:131:4: (lv_elements_5_0= ruleElmDeclaration )
            	    // InternalHlvl.g:132:5: lv_elements_5_0= ruleElmDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsElmDeclarationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_5_0=ruleElmDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"com.coffee.Hlvl.ElmDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRelationsKeyword_5());
            		
            // InternalHlvl.g:153:3: ( (lv_relations_7_0= ruleRelDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHlvl.g:154:4: (lv_relations_7_0= ruleRelDeclaration )
            	    {
            	    // InternalHlvl.g:154:4: (lv_relations_7_0= ruleRelDeclaration )
            	    // InternalHlvl.g:155:5: lv_relations_7_0= ruleRelDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRelationsRelDeclarationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_relations_7_0=ruleRelDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_7_0,
            	    						"com.coffee.Hlvl.RelDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalHlvl.g:172:3: (otherlv_8= 'operations:' ( (lv_operations_9_0= ruleOperations ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHlvl.g:173:4: otherlv_8= 'operations:' ( (lv_operations_9_0= ruleOperations ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getOperationsKeyword_7_0());
                    			
                    // InternalHlvl.g:177:4: ( (lv_operations_9_0= ruleOperations ) )
                    // InternalHlvl.g:178:5: (lv_operations_9_0= ruleOperations )
                    {
                    // InternalHlvl.g:178:5: (lv_operations_9_0= ruleOperations )
                    // InternalHlvl.g:179:6: lv_operations_9_0= ruleOperations
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getOperationsOperationsParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operations_9_0=ruleOperations();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"operations",
                    							lv_operations_9_0,
                    							"com.coffee.Hlvl.Operations");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleListOfModelRef"
    // InternalHlvl.g:201:1: entryRuleListOfModelRef returns [EObject current=null] : iv_ruleListOfModelRef= ruleListOfModelRef EOF ;
    public final EObject entryRuleListOfModelRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfModelRef = null;


        try {
            // InternalHlvl.g:201:55: (iv_ruleListOfModelRef= ruleListOfModelRef EOF )
            // InternalHlvl.g:202:2: iv_ruleListOfModelRef= ruleListOfModelRef EOF
            {
             newCompositeNode(grammarAccess.getListOfModelRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfModelRef=ruleListOfModelRef();

            state._fsp--;

             current =iv_ruleListOfModelRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOfModelRef"


    // $ANTLR start "ruleListOfModelRef"
    // InternalHlvl.g:208:1: ruleListOfModelRef returns [EObject current=null] : ( () ( (lv_ids_1_0= ruleModelRef ) ) ( (otherlv_2= ',' )+ ( (lv_ids_3_0= ruleModelRef ) ) )* ) ;
    public final EObject ruleListOfModelRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_ids_1_0 = null;

        EObject lv_ids_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:214:2: ( ( () ( (lv_ids_1_0= ruleModelRef ) ) ( (otherlv_2= ',' )+ ( (lv_ids_3_0= ruleModelRef ) ) )* ) )
            // InternalHlvl.g:215:2: ( () ( (lv_ids_1_0= ruleModelRef ) ) ( (otherlv_2= ',' )+ ( (lv_ids_3_0= ruleModelRef ) ) )* )
            {
            // InternalHlvl.g:215:2: ( () ( (lv_ids_1_0= ruleModelRef ) ) ( (otherlv_2= ',' )+ ( (lv_ids_3_0= ruleModelRef ) ) )* )
            // InternalHlvl.g:216:3: () ( (lv_ids_1_0= ruleModelRef ) ) ( (otherlv_2= ',' )+ ( (lv_ids_3_0= ruleModelRef ) ) )*
            {
            // InternalHlvl.g:216:3: ()
            // InternalHlvl.g:217:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListOfModelRefAccess().getListOfModelRefAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:223:3: ( (lv_ids_1_0= ruleModelRef ) )
            // InternalHlvl.g:224:4: (lv_ids_1_0= ruleModelRef )
            {
            // InternalHlvl.g:224:4: (lv_ids_1_0= ruleModelRef )
            // InternalHlvl.g:225:5: lv_ids_1_0= ruleModelRef
            {

            					newCompositeNode(grammarAccess.getListOfModelRefAccess().getIdsModelRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_ids_1_0=ruleModelRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfModelRefRule());
            					}
            					add(
            						current,
            						"ids",
            						lv_ids_1_0,
            						"com.coffee.Hlvl.ModelRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:242:3: ( (otherlv_2= ',' )+ ( (lv_ids_3_0= ruleModelRef ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHlvl.g:243:4: (otherlv_2= ',' )+ ( (lv_ids_3_0= ruleModelRef ) )
            	    {
            	    // InternalHlvl.g:243:4: (otherlv_2= ',' )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==16) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalHlvl.g:244:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,16,FOLLOW_11); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getListOfModelRefAccess().getCommaKeyword_2_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    // InternalHlvl.g:249:4: ( (lv_ids_3_0= ruleModelRef ) )
            	    // InternalHlvl.g:250:5: (lv_ids_3_0= ruleModelRef )
            	    {
            	    // InternalHlvl.g:250:5: (lv_ids_3_0= ruleModelRef )
            	    // InternalHlvl.g:251:6: lv_ids_3_0= ruleModelRef
            	    {

            	    						newCompositeNode(grammarAccess.getListOfModelRefAccess().getIdsModelRefParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_ids_3_0=ruleModelRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfModelRefRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ids",
            	    							lv_ids_3_0,
            	    							"com.coffee.Hlvl.ModelRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOfModelRef"


    // $ANTLR start "entryRuleModelRef"
    // InternalHlvl.g:273:1: entryRuleModelRef returns [EObject current=null] : iv_ruleModelRef= ruleModelRef EOF ;
    public final EObject entryRuleModelRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRef = null;


        try {
            // InternalHlvl.g:273:49: (iv_ruleModelRef= ruleModelRef EOF )
            // InternalHlvl.g:274:2: iv_ruleModelRef= ruleModelRef EOF
            {
             newCompositeNode(grammarAccess.getModelRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelRef=ruleModelRef();

            state._fsp--;

             current =iv_ruleModelRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelRef"


    // $ANTLR start "ruleModelRef"
    // InternalHlvl.g:280:1: ruleModelRef returns [EObject current=null] : ( (lv_importURI_0_0= RULE_STRING ) ) ;
    public final EObject ruleModelRef() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:286:2: ( ( (lv_importURI_0_0= RULE_STRING ) ) )
            // InternalHlvl.g:287:2: ( (lv_importURI_0_0= RULE_STRING ) )
            {
            // InternalHlvl.g:287:2: ( (lv_importURI_0_0= RULE_STRING ) )
            // InternalHlvl.g:288:3: (lv_importURI_0_0= RULE_STRING )
            {
            // InternalHlvl.g:288:3: (lv_importURI_0_0= RULE_STRING )
            // InternalHlvl.g:289:4: lv_importURI_0_0= RULE_STRING
            {
            lv_importURI_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_importURI_0_0, grammarAccess.getModelRefAccess().getImportURISTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getModelRefRule());
            				}
            				setWithLastConsumed(
            					current,
            					"importURI",
            					lv_importURI_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelRef"


    // $ANTLR start "entryRuleElmDeclaration"
    // InternalHlvl.g:308:1: entryRuleElmDeclaration returns [EObject current=null] : iv_ruleElmDeclaration= ruleElmDeclaration EOF ;
    public final EObject entryRuleElmDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElmDeclaration = null;


        try {
            // InternalHlvl.g:308:55: (iv_ruleElmDeclaration= ruleElmDeclaration EOF )
            // InternalHlvl.g:309:2: iv_ruleElmDeclaration= ruleElmDeclaration EOF
            {
             newCompositeNode(grammarAccess.getElmDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElmDeclaration=ruleElmDeclaration();

            state._fsp--;

             current =iv_ruleElmDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElmDeclaration"


    // $ANTLR start "ruleElmDeclaration"
    // InternalHlvl.g:315:1: ruleElmDeclaration returns [EObject current=null] : ( () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )? ) ;
    public final EObject ruleElmDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_att_1_0=null;
        Token lv_dataType_2_1=null;
        Token lv_dataType_2_2=null;
        Token lv_dataType_2_3=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_comment_7_0=null;
        Token otherlv_8=null;
        EObject lv_declaration_4_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:321:2: ( ( () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )? ) )
            // InternalHlvl.g:322:2: ( () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )? )
            {
            // InternalHlvl.g:322:2: ( () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )? )
            // InternalHlvl.g:323:3: () ( (lv_att_1_0= 'att' ) )? ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) ) ( (lv_name_3_0= RULE_ID ) ) ( (lv_declaration_4_0= ruleDeclaration ) ) (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )?
            {
            // InternalHlvl.g:323:3: ()
            // InternalHlvl.g:324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElmDeclarationAccess().getElmDeclarationAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:330:3: ( (lv_att_1_0= 'att' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHlvl.g:331:4: (lv_att_1_0= 'att' )
                    {
                    // InternalHlvl.g:331:4: (lv_att_1_0= 'att' )
                    // InternalHlvl.g:332:5: lv_att_1_0= 'att'
                    {
                    lv_att_1_0=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(lv_att_1_0, grammarAccess.getElmDeclarationAccess().getAttAttKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getElmDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "att", lv_att_1_0, "att");
                    				

                    }


                    }
                    break;

            }

            // InternalHlvl.g:344:3: ( ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) ) )
            // InternalHlvl.g:345:4: ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) )
            {
            // InternalHlvl.g:345:4: ( (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' ) )
            // InternalHlvl.g:346:5: (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' )
            {
            // InternalHlvl.g:346:5: (lv_dataType_2_1= 'boolean' | lv_dataType_2_2= 'integer' | lv_dataType_2_3= 'symbolic' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHlvl.g:347:6: lv_dataType_2_1= 'boolean'
                    {
                    lv_dataType_2_1=(Token)match(input,18,FOLLOW_3); 

                    						newLeafNode(lv_dataType_2_1, grammarAccess.getElmDeclarationAccess().getDataTypeBooleanKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "dataType", lv_dataType_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:358:6: lv_dataType_2_2= 'integer'
                    {
                    lv_dataType_2_2=(Token)match(input,19,FOLLOW_3); 

                    						newLeafNode(lv_dataType_2_2, grammarAccess.getElmDeclarationAccess().getDataTypeIntegerKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "dataType", lv_dataType_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:369:6: lv_dataType_2_3= 'symbolic'
                    {
                    lv_dataType_2_3=(Token)match(input,20,FOLLOW_3); 

                    						newLeafNode(lv_dataType_2_3, grammarAccess.getElmDeclarationAccess().getDataTypeSymbolicKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "dataType", lv_dataType_2_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalHlvl.g:382:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalHlvl.g:383:4: (lv_name_3_0= RULE_ID )
            {
            // InternalHlvl.g:383:4: (lv_name_3_0= RULE_ID )
            // InternalHlvl.g:384:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_3_0, grammarAccess.getElmDeclarationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElmDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalHlvl.g:400:3: ( (lv_declaration_4_0= ruleDeclaration ) )
            // InternalHlvl.g:401:4: (lv_declaration_4_0= ruleDeclaration )
            {
            // InternalHlvl.g:401:4: (lv_declaration_4_0= ruleDeclaration )
            // InternalHlvl.g:402:5: lv_declaration_4_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getElmDeclarationAccess().getDeclarationDeclarationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_declaration_4_0=ruleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElmDeclarationRule());
            					}
            					set(
            						current,
            						"declaration",
            						lv_declaration_4_0,
            						"com.coffee.Hlvl.Declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:419:3: (otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalHlvl.g:420:4: otherlv_5= 'comment:' otherlv_6= '{' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getElmDeclarationAccess().getCommentKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getElmDeclarationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalHlvl.g:428:4: ( (lv_comment_7_0= RULE_STRING ) )
                    // InternalHlvl.g:429:5: (lv_comment_7_0= RULE_STRING )
                    {
                    // InternalHlvl.g:429:5: (lv_comment_7_0= RULE_STRING )
                    // InternalHlvl.g:430:6: lv_comment_7_0= RULE_STRING
                    {
                    lv_comment_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_comment_7_0, grammarAccess.getElmDeclarationAccess().getCommentSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElmDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getElmDeclarationAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElmDeclaration"


    // $ANTLR start "entryRuleDeclaration"
    // InternalHlvl.g:455:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalHlvl.g:455:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalHlvl.g:456:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalHlvl.g:462:1: ruleDeclaration returns [EObject current=null] : (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantDecl_0 = null;

        EObject this_VariableDecl_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:468:2: ( (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl ) )
            // InternalHlvl.g:469:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            {
            // InternalHlvl.g:469:2: (this_ConstantDecl_0= ruleConstantDecl | this_VariableDecl_1= ruleVariableDecl )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EOF||LA10_0==14||(LA10_0>=17 && LA10_0<=21)||LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalHlvl.g:470:3: this_ConstantDecl_0= ruleConstantDecl
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getConstantDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantDecl_0=ruleConstantDecl();

                    state._fsp--;


                    			current = this_ConstantDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:479:3: this_VariableDecl_1= ruleVariableDecl
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDecl_1=ruleVariableDecl();

                    state._fsp--;


                    			current = this_VariableDecl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleConstantDecl"
    // InternalHlvl.g:491:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // InternalHlvl.g:491:53: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // InternalHlvl.g:492:2: iv_ruleConstantDecl= ruleConstantDecl EOF
            {
             newCompositeNode(grammarAccess.getConstantDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantDecl=ruleConstantDecl();

            state._fsp--;

             current =iv_ruleConstantDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantDecl"


    // $ANTLR start "ruleConstantDecl"
    // InternalHlvl.g:498:1: ruleConstantDecl returns [EObject current=null] : ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )? ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:504:2: ( ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )? ) )
            // InternalHlvl.g:505:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )? )
            {
            // InternalHlvl.g:505:2: ( () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )? )
            // InternalHlvl.g:506:3: () (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )?
            {
            // InternalHlvl.g:506:3: ()
            // InternalHlvl.g:507:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstantDeclAccess().getConstantDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:513:3: (otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHlvl.g:514:4: otherlv_1= 'is' ( (lv_value_2_0= ruleRelational ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstantDeclAccess().getIsKeyword_1_0());
                    			
                    // InternalHlvl.g:518:4: ( (lv_value_2_0= ruleRelational ) )
                    // InternalHlvl.g:519:5: (lv_value_2_0= ruleRelational )
                    {
                    // InternalHlvl.g:519:5: (lv_value_2_0= ruleRelational )
                    // InternalHlvl.g:520:6: lv_value_2_0= ruleRelational
                    {

                    						newCompositeNode(grammarAccess.getConstantDeclAccess().getValueRelationalParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleRelational();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantDeclRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"com.coffee.Hlvl.Relational");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDecl"


    // $ANTLR start "entryRuleVariableDecl"
    // InternalHlvl.g:542:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalHlvl.g:542:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalHlvl.g:543:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDecl=ruleVariableDecl();

            state._fsp--;

             current =iv_ruleVariableDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDecl"


    // $ANTLR start "ruleVariableDecl"
    // InternalHlvl.g:549:1: ruleVariableDecl returns [EObject current=null] : ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variants_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:555:2: ( ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) ) )
            // InternalHlvl.g:556:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            {
            // InternalHlvl.g:556:2: ( () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) ) )
            // InternalHlvl.g:557:3: () (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            {
            // InternalHlvl.g:557:3: ()
            // InternalHlvl.g:558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableDeclAccess().getVariableDeclAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:564:3: (otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) ) )
            // InternalHlvl.g:565:4: otherlv_1= 'variants:' ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            {
            otherlv_1=(Token)match(input,25,FOLLOW_18); 

            				newLeafNode(otherlv_1, grammarAccess.getVariableDeclAccess().getVariantsKeyword_1_0());
            			
            // InternalHlvl.g:569:4: ( (lv_variants_2_0= ruleOptionsDeclaration ) )
            // InternalHlvl.g:570:5: (lv_variants_2_0= ruleOptionsDeclaration )
            {
            // InternalHlvl.g:570:5: (lv_variants_2_0= ruleOptionsDeclaration )
            // InternalHlvl.g:571:6: lv_variants_2_0= ruleOptionsDeclaration
            {

            						newCompositeNode(grammarAccess.getVariableDeclAccess().getVariantsOptionsDeclarationParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_variants_2_0=ruleOptionsDeclaration();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVariableDeclRule());
            						}
            						set(
            							current,
            							"variants",
            							lv_variants_2_0,
            							"com.coffee.Hlvl.OptionsDeclaration");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDecl"


    // $ANTLR start "entryRuleOptionsDeclaration"
    // InternalHlvl.g:593:1: entryRuleOptionsDeclaration returns [EObject current=null] : iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF ;
    public final EObject entryRuleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionsDeclaration = null;


        try {
            // InternalHlvl.g:593:59: (iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF )
            // InternalHlvl.g:594:2: iv_ruleOptionsDeclaration= ruleOptionsDeclaration EOF
            {
             newCompositeNode(grammarAccess.getOptionsDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionsDeclaration=ruleOptionsDeclaration();

            state._fsp--;

             current =iv_ruleOptionsDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionsDeclaration"


    // $ANTLR start "ruleOptionsDeclaration"
    // InternalHlvl.g:600:1: ruleOptionsDeclaration returns [EObject current=null] : (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleOptionsDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Interval_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalHlvl.g:606:2: ( (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration ) )
            // InternalHlvl.g:607:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            {
            // InternalHlvl.g:607:2: (this_Interval_0= ruleInterval | this_Enumeration_1= ruleEnumeration )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalHlvl.g:608:3: this_Interval_0= ruleInterval
                    {

                    			newCompositeNode(grammarAccess.getOptionsDeclarationAccess().getIntervalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interval_0=ruleInterval();

                    state._fsp--;


                    			current = this_Interval_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:617:3: this_Enumeration_1= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getOptionsDeclarationAccess().getEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionsDeclaration"


    // $ANTLR start "entryRuleInterval"
    // InternalHlvl.g:629:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalHlvl.g:629:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalHlvl.g:630:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalHlvl.g:636:1: ruleInterval returns [EObject current=null] : ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token lv_start_0_0=null;
        Token otherlv_1=null;
        Token lv_end_2_0=null;


        	enterRule();

        try {
            // InternalHlvl.g:642:2: ( ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) ) )
            // InternalHlvl.g:643:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            {
            // InternalHlvl.g:643:2: ( ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) ) )
            // InternalHlvl.g:644:3: ( (lv_start_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_end_2_0= RULE_INT ) )
            {
            // InternalHlvl.g:644:3: ( (lv_start_0_0= RULE_INT ) )
            // InternalHlvl.g:645:4: (lv_start_0_0= RULE_INT )
            {
            // InternalHlvl.g:645:4: (lv_start_0_0= RULE_INT )
            // InternalHlvl.g:646:5: lv_start_0_0= RULE_INT
            {
            lv_start_0_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_start_0_0, grammarAccess.getIntervalAccess().getStartINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1());
            		
            // InternalHlvl.g:666:3: ( (lv_end_2_0= RULE_INT ) )
            // InternalHlvl.g:667:4: (lv_end_2_0= RULE_INT )
            {
            // InternalHlvl.g:667:4: (lv_end_2_0= RULE_INT )
            // InternalHlvl.g:668:5: lv_end_2_0= RULE_INT
            {
            lv_end_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_end_2_0, grammarAccess.getIntervalAccess().getEndINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleEnumeration"
    // InternalHlvl.g:688:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalHlvl.g:688:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalHlvl.g:689:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalHlvl.g:695:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:701:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' ) )
            // InternalHlvl.g:702:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            {
            // InternalHlvl.g:702:2: (otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']' )
            // InternalHlvl.g:703:3: otherlv_0= '[' ( (lv_list_1_0= ruleListOfValues ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHlvl.g:707:3: ( (lv_list_1_0= ruleListOfValues ) )
            // InternalHlvl.g:708:4: (lv_list_1_0= ruleListOfValues )
            {
            // InternalHlvl.g:708:4: (lv_list_1_0= ruleListOfValues )
            // InternalHlvl.g:709:5: lv_list_1_0= ruleListOfValues
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getListListOfValuesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_list_1_0=ruleListOfValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_1_0,
            						"com.coffee.Hlvl.ListOfValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleRelDeclaration"
    // InternalHlvl.g:734:1: entryRuleRelDeclaration returns [EObject current=null] : iv_ruleRelDeclaration= ruleRelDeclaration EOF ;
    public final EObject entryRuleRelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelDeclaration = null;


        try {
            // InternalHlvl.g:734:55: (iv_ruleRelDeclaration= ruleRelDeclaration EOF )
            // InternalHlvl.g:735:2: iv_ruleRelDeclaration= ruleRelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelDeclaration=ruleRelDeclaration();

            state._fsp--;

             current =iv_ruleRelDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelDeclaration"


    // $ANTLR start "ruleRelDeclaration"
    // InternalHlvl.g:741:1: ruleRelDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) ) ) ;
    public final EObject ruleRelDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:747:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) ) ) )
            // InternalHlvl.g:748:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) ) )
            {
            // InternalHlvl.g:748:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) ) )
            // InternalHlvl.g:749:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleRelation ) )
            {
            // InternalHlvl.g:749:3: ()
            // InternalHlvl.g:750:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelDeclarationAccess().getRelDeclarationAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:756:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHlvl.g:757:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHlvl.g:757:4: (lv_name_1_0= RULE_ID )
            // InternalHlvl.g:758:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRelDeclarationAccess().getColonKeyword_2());
            		
            // InternalHlvl.g:778:3: ( (lv_exp_3_0= ruleRelation ) )
            // InternalHlvl.g:779:4: (lv_exp_3_0= ruleRelation )
            {
            // InternalHlvl.g:779:4: (lv_exp_3_0= ruleRelation )
            // InternalHlvl.g:780:5: lv_exp_3_0= ruleRelation
            {

            					newCompositeNode(grammarAccess.getRelDeclarationAccess().getExpRelationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleRelation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelDeclarationRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"com.coffee.Hlvl.Relation");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelDeclaration"


    // $ANTLR start "entryRuleRelation"
    // InternalHlvl.g:801:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalHlvl.g:801:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalHlvl.g:802:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalHlvl.g:808:1: ruleRelation returns [EObject current=null] : (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Common_0 = null;

        EObject this_Pair_1 = null;

        EObject this_VarList_2 = null;

        EObject this_Order_3 = null;

        EObject this_Decomposition_4 = null;

        EObject this_Group_5 = null;

        EObject this_Constraint_6 = null;

        EObject this_Visibility_7 = null;

        EObject this_ComplexImplies_8 = null;

        EObject this_ComplexMutex_9 = null;



        	enterRule();

        try {
            // InternalHlvl.g:814:2: ( (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex ) )
            // InternalHlvl.g:815:2: (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex )
            {
            // InternalHlvl.g:815:2: (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex )
            int alt13=10;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalHlvl.g:816:3: this_Common_0= ruleCommon
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getCommonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Common_0=ruleCommon();

                    state._fsp--;


                    			current = this_Common_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:825:3: this_Pair_1= rulePair
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getPairParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pair_1=rulePair();

                    state._fsp--;


                    			current = this_Pair_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:834:3: this_VarList_2= ruleVarList
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getVarListParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarList_2=ruleVarList();

                    state._fsp--;


                    			current = this_VarList_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:843:3: this_Order_3= ruleOrder
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getOrderParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Order_3=ruleOrder();

                    state._fsp--;


                    			current = this_Order_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalHlvl.g:852:3: this_Decomposition_4= ruleDecomposition
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getDecompositionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decomposition_4=ruleDecomposition();

                    state._fsp--;


                    			current = this_Decomposition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalHlvl.g:861:3: this_Group_5= ruleGroup
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getGroupParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_5=ruleGroup();

                    state._fsp--;


                    			current = this_Group_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalHlvl.g:870:3: this_Constraint_6= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getConstraintParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_6=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalHlvl.g:879:3: this_Visibility_7= ruleVisibility
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getVisibilityParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visibility_7=ruleVisibility();

                    state._fsp--;


                    			current = this_Visibility_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalHlvl.g:888:3: this_ComplexImplies_8= ruleComplexImplies
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getComplexImpliesParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexImplies_8=ruleComplexImplies();

                    state._fsp--;


                    			current = this_ComplexImplies_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalHlvl.g:897:3: this_ComplexMutex_9= ruleComplexMutex
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getComplexMutexParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexMutex_9=ruleComplexMutex();

                    state._fsp--;


                    			current = this_ComplexMutex_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleCommon"
    // InternalHlvl.g:909:1: entryRuleCommon returns [EObject current=null] : iv_ruleCommon= ruleCommon EOF ;
    public final EObject entryRuleCommon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommon = null;


        try {
            // InternalHlvl.g:909:47: (iv_ruleCommon= ruleCommon EOF )
            // InternalHlvl.g:910:2: iv_ruleCommon= ruleCommon EOF
            {
             newCompositeNode(grammarAccess.getCommonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommon=ruleCommon();

            state._fsp--;

             current =iv_ruleCommon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommon"


    // $ANTLR start "ruleCommon"
    // InternalHlvl.g:916:1: ruleCommon returns [EObject current=null] : ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleMixedListOfIDs ) ) otherlv_4= ')' ) ;
    public final EObject ruleCommon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:922:2: ( ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleMixedListOfIDs ) ) otherlv_4= ')' ) )
            // InternalHlvl.g:923:2: ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleMixedListOfIDs ) ) otherlv_4= ')' )
            {
            // InternalHlvl.g:923:2: ( () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleMixedListOfIDs ) ) otherlv_4= ')' )
            // InternalHlvl.g:924:3: () otherlv_1= 'common' otherlv_2= '(' ( (lv_elements_3_0= ruleMixedListOfIDs ) ) otherlv_4= ')'
            {
            // InternalHlvl.g:924:3: ()
            // InternalHlvl.g:925:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommonAccess().getCommonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonAccess().getCommonKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCommonAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:939:3: ( (lv_elements_3_0= ruleMixedListOfIDs ) )
            // InternalHlvl.g:940:4: (lv_elements_3_0= ruleMixedListOfIDs )
            {
            // InternalHlvl.g:940:4: (lv_elements_3_0= ruleMixedListOfIDs )
            // InternalHlvl.g:941:5: lv_elements_3_0= ruleMixedListOfIDs
            {

            					newCompositeNode(grammarAccess.getCommonAccess().getElementsMixedListOfIDsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_elements_3_0=ruleMixedListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommonRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"com.coffee.Hlvl.MixedListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCommonAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommon"


    // $ANTLR start "entryRulePair"
    // InternalHlvl.g:966:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalHlvl.g:966:45: (iv_rulePair= rulePair EOF )
            // InternalHlvl.g:967:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalHlvl.g:973:1: rulePair returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' ( ( ruleGeneralQualifiedName ) ) otherlv_5= ')' ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalHlvl.g:979:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' ( ( ruleGeneralQualifiedName ) ) otherlv_5= ')' ) )
            // InternalHlvl.g:980:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' ( ( ruleGeneralQualifiedName ) ) otherlv_5= ')' )
            {
            // InternalHlvl.g:980:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' ( ( ruleGeneralQualifiedName ) ) otherlv_5= ')' )
            // InternalHlvl.g:981:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' ( ( ruleGeneralQualifiedName ) ) otherlv_5= ')'
            {
            // InternalHlvl.g:981:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHlvl.g:982:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHlvl.g:982:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHlvl.g:983:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHlvl.g:983:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHlvl.g:984:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,33,FOLLOW_24); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getPairAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPairRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:995:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,34,FOLLOW_24); 

                    						newLeafNode(lv_operator_0_2, grammarAccess.getPairAccess().getOperatorMutexKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPairRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1012:3: ( ( ruleGeneralQualifiedName ) )
            // InternalHlvl.g:1013:4: ( ruleGeneralQualifiedName )
            {
            // InternalHlvl.g:1013:4: ( ruleGeneralQualifiedName )
            // InternalHlvl.g:1014:5: ruleGeneralQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPairAccess().getVar1ElmDeclarationCrossReference_2_0());
            				
            pushFollow(FOLLOW_26);
            ruleGeneralQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPairAccess().getCommaKeyword_3());
            		
            // InternalHlvl.g:1032:3: ( ( ruleGeneralQualifiedName ) )
            // InternalHlvl.g:1033:4: ( ruleGeneralQualifiedName )
            {
            // InternalHlvl.g:1033:4: ( ruleGeneralQualifiedName )
            // InternalHlvl.g:1034:5: ruleGeneralQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPairAccess().getVar2ElmDeclarationCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleGeneralQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPairAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRuleComplexImplies"
    // InternalHlvl.g:1056:1: entryRuleComplexImplies returns [EObject current=null] : iv_ruleComplexImplies= ruleComplexImplies EOF ;
    public final EObject entryRuleComplexImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexImplies = null;


        try {
            // InternalHlvl.g:1056:55: (iv_ruleComplexImplies= ruleComplexImplies EOF )
            // InternalHlvl.g:1057:2: iv_ruleComplexImplies= ruleComplexImplies EOF
            {
             newCompositeNode(grammarAccess.getComplexImpliesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexImplies=ruleComplexImplies();

            state._fsp--;

             current =iv_ruleComplexImplies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexImplies"


    // $ANTLR start "ruleComplexImplies"
    // InternalHlvl.g:1063:1: ruleComplexImplies returns [EObject current=null] : (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) ;
    public final EObject ruleComplexImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_exp_3_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1069:2: ( (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) )
            // InternalHlvl.g:1070:2: (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalHlvl.g:1070:2: (otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            // InternalHlvl.g:1071:3: otherlv_0= 'implies' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexImpliesAccess().getImpliesKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexImpliesAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1083:3: ( (lv_exp_3_0= ruleRelational ) )
            // InternalHlvl.g:1084:4: (lv_exp_3_0= ruleRelational )
            {
            // InternalHlvl.g:1084:4: (lv_exp_3_0= ruleRelational )
            // InternalHlvl.g:1085:5: lv_exp_3_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getComplexImpliesAccess().getExpRelationalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_exp_3_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexImpliesRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexImpliesAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexImpliesAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexImpliesAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalHlvl.g:1114:3: ( (lv_elements_7_0= ruleMixedListOfIDs ) )
            // InternalHlvl.g:1115:4: (lv_elements_7_0= ruleMixedListOfIDs )
            {
            // InternalHlvl.g:1115:4: (lv_elements_7_0= ruleMixedListOfIDs )
            // InternalHlvl.g:1116:5: lv_elements_7_0= ruleMixedListOfIDs
            {

            					newCompositeNode(grammarAccess.getComplexImpliesAccess().getElementsMixedListOfIDsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_elements_7_0=ruleMixedListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexImpliesRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_7_0,
            						"com.coffee.Hlvl.MixedListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexImpliesAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexImpliesAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexImplies"


    // $ANTLR start "entryRuleComplexMutex"
    // InternalHlvl.g:1145:1: entryRuleComplexMutex returns [EObject current=null] : iv_ruleComplexMutex= ruleComplexMutex EOF ;
    public final EObject entryRuleComplexMutex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexMutex = null;


        try {
            // InternalHlvl.g:1145:53: (iv_ruleComplexMutex= ruleComplexMutex EOF )
            // InternalHlvl.g:1146:2: iv_ruleComplexMutex= ruleComplexMutex EOF
            {
             newCompositeNode(grammarAccess.getComplexMutexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexMutex=ruleComplexMutex();

            state._fsp--;

             current =iv_ruleComplexMutex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexMutex"


    // $ANTLR start "ruleComplexMutex"
    // InternalHlvl.g:1152:1: ruleComplexMutex returns [EObject current=null] : (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) ;
    public final EObject ruleComplexMutex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_exp_3_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1158:2: ( (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' ) )
            // InternalHlvl.g:1159:2: (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalHlvl.g:1159:2: (otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')' )
            // InternalHlvl.g:1160:3: otherlv_0= 'mutex' otherlv_1= '(' otherlv_2= '(' ( (lv_exp_3_0= ruleRelational ) ) otherlv_4= ')' otherlv_5= ',' otherlv_6= '[' ( (lv_elements_7_0= ruleMixedListOfIDs ) ) otherlv_8= ']' otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexMutexAccess().getMutexKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexMutexAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexMutexAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1172:3: ( (lv_exp_3_0= ruleRelational ) )
            // InternalHlvl.g:1173:4: (lv_exp_3_0= ruleRelational )
            {
            // InternalHlvl.g:1173:4: (lv_exp_3_0= ruleRelational )
            // InternalHlvl.g:1174:5: lv_exp_3_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getComplexMutexAccess().getExpRelationalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_exp_3_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexMutexRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexMutexAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexMutexAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexMutexAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalHlvl.g:1203:3: ( (lv_elements_7_0= ruleMixedListOfIDs ) )
            // InternalHlvl.g:1204:4: (lv_elements_7_0= ruleMixedListOfIDs )
            {
            // InternalHlvl.g:1204:4: (lv_elements_7_0= ruleMixedListOfIDs )
            // InternalHlvl.g:1205:5: lv_elements_7_0= ruleMixedListOfIDs
            {

            					newCompositeNode(grammarAccess.getComplexMutexAccess().getElementsMixedListOfIDsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_elements_7_0=ruleMixedListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexMutexRule());
            					}
            					set(
            						current,
            						"elements",
            						lv_elements_7_0,
            						"com.coffee.Hlvl.MixedListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexMutexAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexMutexAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexMutex"


    // $ANTLR start "entryRuleVarList"
    // InternalHlvl.g:1234:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalHlvl.g:1234:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalHlvl.g:1235:2: iv_ruleVarList= ruleVarList EOF
            {
             newCompositeNode(grammarAccess.getVarListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarList=ruleVarList();

            state._fsp--;

             current =iv_ruleVarList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarList"


    // $ANTLR start "ruleVarList"
    // InternalHlvl.g:1241:1: ruleVarList returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) ;
    public final EObject ruleVarList() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_list_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1247:2: ( ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1248:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1248:2: ( ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedListOfIDs ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1249:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) ) otherlv_1= '(' ( ( ruleGeneralQualifiedName ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedListOfIDs ) ) otherlv_6= ']' otherlv_7= ')'
            {
            // InternalHlvl.g:1249:3: ( ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) ) )
            // InternalHlvl.g:1250:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            {
            // InternalHlvl.g:1250:4: ( (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' ) )
            // InternalHlvl.g:1251:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            {
            // InternalHlvl.g:1251:5: (lv_operator_0_1= 'implies' | lv_operator_0_2= 'mutex' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalHlvl.g:1252:6: lv_operator_0_1= 'implies'
                    {
                    lv_operator_0_1=(Token)match(input,33,FOLLOW_24); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getVarListAccess().getOperatorImpliesKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarListRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1263:6: lv_operator_0_2= 'mutex'
                    {
                    lv_operator_0_2=(Token)match(input,34,FOLLOW_24); 

                    						newLeafNode(lv_operator_0_2, grammarAccess.getVarListAccess().getOperatorMutexKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarListRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1280:3: ( ( ruleGeneralQualifiedName ) )
            // InternalHlvl.g:1281:4: ( ruleGeneralQualifiedName )
            {
            // InternalHlvl.g:1281:4: ( ruleGeneralQualifiedName )
            // InternalHlvl.g:1282:5: ruleGeneralQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarListRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVarListAccess().getVar1ElmDeclarationCrossReference_2_0());
            				
            pushFollow(FOLLOW_26);
            ruleGeneralQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getVarListAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVarListAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1304:3: ( (lv_list_5_0= ruleMixedListOfIDs ) )
            // InternalHlvl.g:1305:4: (lv_list_5_0= ruleMixedListOfIDs )
            {
            // InternalHlvl.g:1305:4: (lv_list_5_0= ruleMixedListOfIDs )
            // InternalHlvl.g:1306:5: lv_list_5_0= ruleMixedListOfIDs
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getListMixedListOfIDsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_list_5_0=ruleMixedListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarListRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_5_0,
            						"com.coffee.Hlvl.MixedListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getVarListAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVarListAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarList"


    // $ANTLR start "entryRuleDecomposition"
    // InternalHlvl.g:1335:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // InternalHlvl.g:1335:54: (iv_ruleDecomposition= ruleDecomposition EOF )
            // InternalHlvl.g:1336:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecomposition"


    // $ANTLR start "ruleDecomposition"
    // InternalHlvl.g:1342:1: ruleDecomposition returns [EObject current=null] : ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_min_10_0=null;
        Token otherlv_11=null;
        Token lv_max_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_children_6_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1348:2: ( ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' ) )
            // InternalHlvl.g:1349:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' )
            {
            // InternalHlvl.g:1349:2: ( () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')' )
            // InternalHlvl.g:1350:3: () otherlv_1= 'decomposition' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= RULE_INT ) ) otherlv_13= ']' otherlv_14= ')'
            {
            // InternalHlvl.g:1350:3: ()
            // InternalHlvl.g:1351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecompositionAccess().getDecompositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecompositionKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDecompositionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1365:3: ( (otherlv_3= RULE_ID ) )
            // InternalHlvl.g:1366:4: (otherlv_3= RULE_ID )
            {
            // InternalHlvl.g:1366:4: (otherlv_3= RULE_ID )
            // InternalHlvl.g:1367:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getDecompositionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHlvl.g:1386:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHlvl.g:1387:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1387:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHlvl.g:1388:5: lv_children_6_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getDecompositionAccess().getChildrenListOfIDsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_children_6_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecompositionRule());
            					}
            					set(
            						current,
            						"children",
            						lv_children_6_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getDecompositionAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalHlvl.g:1417:3: ( (lv_min_10_0= RULE_INT ) )
            // InternalHlvl.g:1418:4: (lv_min_10_0= RULE_INT )
            {
            // InternalHlvl.g:1418:4: (lv_min_10_0= RULE_INT )
            // InternalHlvl.g:1419:5: lv_min_10_0= RULE_INT
            {
            lv_min_10_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_min_10_0, grammarAccess.getDecompositionAccess().getMinINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_11, grammarAccess.getDecompositionAccess().getCommaKeyword_11());
            		
            // InternalHlvl.g:1439:3: ( (lv_max_12_0= RULE_INT ) )
            // InternalHlvl.g:1440:4: (lv_max_12_0= RULE_INT )
            {
            // InternalHlvl.g:1440:4: (lv_max_12_0= RULE_INT )
            // InternalHlvl.g:1441:5: lv_max_12_0= RULE_INT
            {
            lv_max_12_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_max_12_0, grammarAccess.getDecompositionAccess().getMaxINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_13, grammarAccess.getDecompositionAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDecompositionAccess().getRightParenthesisKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecomposition"


    // $ANTLR start "entryRuleGroup"
    // InternalHlvl.g:1469:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalHlvl.g:1469:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalHlvl.g:1470:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalHlvl.g:1476:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_min_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_children_6_0 = null;

        EObject lv_max_12_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1482:2: ( ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' ) )
            // InternalHlvl.g:1483:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' )
            {
            // InternalHlvl.g:1483:2: ( () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')' )
            // InternalHlvl.g:1484:3: () otherlv_1= 'group' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' otherlv_5= '[' ( (lv_children_6_0= ruleListOfIDs ) ) otherlv_7= ']' otherlv_8= ',' otherlv_9= '[' ( (lv_min_10_0= RULE_INT ) ) otherlv_11= ',' ( (lv_max_12_0= ruleRange ) ) otherlv_13= ']' otherlv_14= ')'
            {
            // InternalHlvl.g:1484:3: ()
            // InternalHlvl.g:1485:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupAccess().getGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2());
            		
            // InternalHlvl.g:1499:3: ( (otherlv_3= RULE_ID ) )
            // InternalHlvl.g:1500:4: (otherlv_3= RULE_ID )
            {
            // InternalHlvl.g:1500:4: (otherlv_3= RULE_ID )
            // InternalHlvl.g:1501:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getParentElmDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalHlvl.g:1520:3: ( (lv_children_6_0= ruleListOfIDs ) )
            // InternalHlvl.g:1521:4: (lv_children_6_0= ruleListOfIDs )
            {
            // InternalHlvl.g:1521:4: (lv_children_6_0= ruleListOfIDs )
            // InternalHlvl.g:1522:5: lv_children_6_0= ruleListOfIDs
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getChildrenListOfIDsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_children_6_0=ruleListOfIDs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"children",
            						lv_children_6_0,
            						"com.coffee.Hlvl.ListOfIDs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalHlvl.g:1551:3: ( (lv_min_10_0= RULE_INT ) )
            // InternalHlvl.g:1552:4: (lv_min_10_0= RULE_INT )
            {
            // InternalHlvl.g:1552:4: (lv_min_10_0= RULE_INT )
            // InternalHlvl.g:1553:5: lv_min_10_0= RULE_INT
            {
            lv_min_10_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_min_10_0, grammarAccess.getGroupAccess().getMinINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getCommaKeyword_11());
            		
            // InternalHlvl.g:1573:3: ( (lv_max_12_0= ruleRange ) )
            // InternalHlvl.g:1574:4: (lv_max_12_0= ruleRange )
            {
            // InternalHlvl.g:1574:4: (lv_max_12_0= ruleRange )
            // InternalHlvl.g:1575:5: lv_max_12_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getMaxRangeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_21);
            lv_max_12_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_12_0,
            						"com.coffee.Hlvl.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getGroupAccess().getRightParenthesisKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleRange"
    // InternalHlvl.g:1604:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalHlvl.g:1604:46: (iv_ruleRange= ruleRange EOF )
            // InternalHlvl.g:1605:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalHlvl.g:1611:1: ruleRange returns [EObject current=null] : ( () ( (lv_value_1_0= ruleWildcard ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1617:2: ( ( () ( (lv_value_1_0= ruleWildcard ) ) ) )
            // InternalHlvl.g:1618:2: ( () ( (lv_value_1_0= ruleWildcard ) ) )
            {
            // InternalHlvl.g:1618:2: ( () ( (lv_value_1_0= ruleWildcard ) ) )
            // InternalHlvl.g:1619:3: () ( (lv_value_1_0= ruleWildcard ) )
            {
            // InternalHlvl.g:1619:3: ()
            // InternalHlvl.g:1620:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeAccess().getRangeAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:1626:3: ( (lv_value_1_0= ruleWildcard ) )
            // InternalHlvl.g:1627:4: (lv_value_1_0= ruleWildcard )
            {
            // InternalHlvl.g:1627:4: (lv_value_1_0= ruleWildcard )
            // InternalHlvl.g:1628:5: lv_value_1_0= ruleWildcard
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getValueWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"com.coffee.Hlvl.Wildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleWildcard"
    // InternalHlvl.g:1649:1: entryRuleWildcard returns [String current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final String entryRuleWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildcard = null;


        try {
            // InternalHlvl.g:1649:48: (iv_ruleWildcard= ruleWildcard EOF )
            // InternalHlvl.g:1650:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // InternalHlvl.g:1656:1: ruleWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:1662:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalHlvl.g:1663:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalHlvl.g:1663:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==37) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalHlvl.g:1664:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getWildcardAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1672:3: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWildcardAccess().getAsteriskKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleVisibility"
    // InternalHlvl.g:1681:1: entryRuleVisibility returns [EObject current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final EObject entryRuleVisibility() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibility = null;


        try {
            // InternalHlvl.g:1681:51: (iv_ruleVisibility= ruleVisibility EOF )
            // InternalHlvl.g:1682:2: iv_ruleVisibility= ruleVisibility EOF
            {
             newCompositeNode(grammarAccess.getVisibilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisibility=ruleVisibility();

            state._fsp--;

             current =iv_ruleVisibility; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibility"


    // $ANTLR start "ruleVisibility"
    // InternalHlvl.g:1688:1: ruleVisibility returns [EObject current=null] : (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')' ) ;
    public final EObject ruleVisibility() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_list_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1694:2: ( (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalHlvl.g:1695:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalHlvl.g:1695:2: (otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalHlvl.g:1696:3: otherlv_0= 'visibility' otherlv_1= '(' ( (lv_condition_2_0= ruleRelational ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_list_5_0= ruleMixedList ) ) otherlv_6= ']' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibilityAccess().getVisibilityKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getVisibilityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1704:3: ( (lv_condition_2_0= ruleRelational ) )
            // InternalHlvl.g:1705:4: (lv_condition_2_0= ruleRelational )
            {
            // InternalHlvl.g:1705:4: (lv_condition_2_0= ruleRelational )
            // InternalHlvl.g:1706:5: lv_condition_2_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getConditionRelationalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_condition_2_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getVisibilityAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVisibilityAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalHlvl.g:1731:3: ( (lv_list_5_0= ruleMixedList ) )
            // InternalHlvl.g:1732:4: (lv_list_5_0= ruleMixedList )
            {
            // InternalHlvl.g:1732:4: (lv_list_5_0= ruleMixedList )
            // InternalHlvl.g:1733:5: lv_list_5_0= ruleMixedList
            {

            					newCompositeNode(grammarAccess.getVisibilityAccess().getListMixedListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_list_5_0=ruleMixedList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_5_0,
            						"com.coffee.Hlvl.MixedList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getVisibilityAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVisibilityAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "entryRuleOrder"
    // InternalHlvl.g:1762:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalHlvl.g:1762:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalHlvl.g:1763:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalHlvl.g:1769:1: ruleOrder returns [EObject current=null] : ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1775:2: ( ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) ) )
            // InternalHlvl.g:1776:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            {
            // InternalHlvl.g:1776:2: ( ( (lv_operator_0_0= 'before' ) ) | (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            else if ( (LA17_0==40) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalHlvl.g:1777:3: ( (lv_operator_0_0= 'before' ) )
                    {
                    // InternalHlvl.g:1777:3: ( (lv_operator_0_0= 'before' ) )
                    // InternalHlvl.g:1778:4: (lv_operator_0_0= 'before' )
                    {
                    // InternalHlvl.g:1778:4: (lv_operator_0_0= 'before' )
                    // InternalHlvl.g:1779:5: lv_operator_0_0= 'before'
                    {
                    lv_operator_0_0=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_operator_0_0, grammarAccess.getOrderAccess().getOperatorBeforeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOrderRule());
                    					}
                    					setWithLastConsumed(current, "operator", lv_operator_0_0, "before");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:1792:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    {
                    // InternalHlvl.g:1792:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']' )
                    // InternalHlvl.g:1793:4: otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_right_5_0= ruleListOfIDs ) ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getAfterKeyword_1_0());
                    			
                    // InternalHlvl.g:1797:4: ( (otherlv_2= RULE_ID ) )
                    // InternalHlvl.g:1798:5: (otherlv_2= RULE_ID )
                    {
                    // InternalHlvl.g:1798:5: (otherlv_2= RULE_ID )
                    // InternalHlvl.g:1799:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrderRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getLeftElmDeclarationCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrderAccess().getCommaKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getLeftSquareBracketKeyword_1_3());
                    			
                    // InternalHlvl.g:1818:4: ( (lv_right_5_0= ruleListOfIDs ) )
                    // InternalHlvl.g:1819:5: (lv_right_5_0= ruleListOfIDs )
                    {
                    // InternalHlvl.g:1819:5: (lv_right_5_0= ruleListOfIDs )
                    // InternalHlvl.g:1820:6: lv_right_5_0= ruleListOfIDs
                    {

                    						newCompositeNode(grammarAccess.getOrderAccess().getRightListOfIDsParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_right_5_0=ruleListOfIDs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderRule());
                    						}
                    						add(
                    							current,
                    							"right",
                    							lv_right_5_0,
                    							"com.coffee.Hlvl.ListOfIDs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getOrderAccess().getRightSquareBracketKeyword_1_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleConstraint"
    // InternalHlvl.g:1846:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalHlvl.g:1846:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalHlvl.g:1847:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalHlvl.g:1853:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1859:2: ( (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' ) )
            // InternalHlvl.g:1860:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            {
            // InternalHlvl.g:1860:2: (otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')' )
            // InternalHlvl.g:1861:3: otherlv_0= 'expression' otherlv_1= '(' ( (lv_exp_2_0= ruleRelational ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getExpressionKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalHlvl.g:1869:3: ( (lv_exp_2_0= ruleRelational ) )
            // InternalHlvl.g:1870:4: (lv_exp_2_0= ruleRelational )
            {
            // InternalHlvl.g:1870:4: (lv_exp_2_0= ruleRelational )
            // InternalHlvl.g:1871:5: lv_exp_2_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getExpRelationalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_exp_2_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRelational"
    // InternalHlvl.g:1896:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalHlvl.g:1896:51: (iv_ruleRelational= ruleRelational EOF )
            // InternalHlvl.g:1897:2: iv_ruleRelational= ruleRelational EOF
            {
             newCompositeNode(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelational=ruleRelational();

            state._fsp--;

             current =iv_ruleRelational; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelational"


    // $ANTLR start "ruleRelational"
    // InternalHlvl.g:1903:1: ruleRelational returns [EObject current=null] : this_Iff_0= ruleIff ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Iff_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1909:2: (this_Iff_0= ruleIff )
            // InternalHlvl.g:1910:2: this_Iff_0= ruleIff
            {

            		newCompositeNode(grammarAccess.getRelationalAccess().getIffParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Iff_0=ruleIff();

            state._fsp--;


            		current = this_Iff_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelational"


    // $ANTLR start "entryRuleIff"
    // InternalHlvl.g:1921:1: entryRuleIff returns [EObject current=null] : iv_ruleIff= ruleIff EOF ;
    public final EObject entryRuleIff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIff = null;


        try {
            // InternalHlvl.g:1921:44: (iv_ruleIff= ruleIff EOF )
            // InternalHlvl.g:1922:2: iv_ruleIff= ruleIff EOF
            {
             newCompositeNode(grammarAccess.getIffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIff=ruleIff();

            state._fsp--;

             current =iv_ruleIff; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIff"


    // $ANTLR start "ruleIff"
    // InternalHlvl.g:1928:1: ruleIff returns [EObject current=null] : (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) ;
    public final EObject ruleIff() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implies_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1934:2: ( (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* ) )
            // InternalHlvl.g:1935:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            {
            // InternalHlvl.g:1935:2: (this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )* )
            // InternalHlvl.g:1936:3: this_Implies_0= ruleImplies ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            {

            			newCompositeNode(grammarAccess.getIffAccess().getImpliesParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Implies_0=ruleImplies();

            state._fsp--;


            			current = this_Implies_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:1944:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHlvl.g:1945:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImplies ) )
            	    {
            	    // InternalHlvl.g:1945:4: ()
            	    // InternalHlvl.g:1946:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getIffAccess().getIffLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIffAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:1956:4: ( (lv_right_3_0= ruleImplies ) )
            	    // InternalHlvl.g:1957:5: (lv_right_3_0= ruleImplies )
            	    {
            	    // InternalHlvl.g:1957:5: (lv_right_3_0= ruleImplies )
            	    // InternalHlvl.g:1958:6: lv_right_3_0= ruleImplies
            	    {

            	    						newCompositeNode(grammarAccess.getIffAccess().getRightImpliesParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleImplies();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIffRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Implies");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIff"


    // $ANTLR start "entryRuleImplies"
    // InternalHlvl.g:1980:1: entryRuleImplies returns [EObject current=null] : iv_ruleImplies= ruleImplies EOF ;
    public final EObject entryRuleImplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplies = null;


        try {
            // InternalHlvl.g:1980:48: (iv_ruleImplies= ruleImplies EOF )
            // InternalHlvl.g:1981:2: iv_ruleImplies= ruleImplies EOF
            {
             newCompositeNode(grammarAccess.getImpliesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplies=ruleImplies();

            state._fsp--;

             current =iv_ruleImplies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplies"


    // $ANTLR start "ruleImplies"
    // InternalHlvl.g:1987:1: ruleImplies returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImplies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:1993:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalHlvl.g:1994:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalHlvl.g:1994:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalHlvl.g:1995:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2003:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalHlvl.g:2004:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalHlvl.g:2004:4: ()
            	    // InternalHlvl.g:2005:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImpliesAccess().getImpliesLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImpliesAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalHlvl.g:2015:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalHlvl.g:2016:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalHlvl.g:2016:5: (lv_right_3_0= ruleOr )
            	    // InternalHlvl.g:2017:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImpliesRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Or");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplies"


    // $ANTLR start "entryRuleOr"
    // InternalHlvl.g:2039:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalHlvl.g:2039:43: (iv_ruleOr= ruleOr EOF )
            // InternalHlvl.g:2040:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalHlvl.g:2046:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2052:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalHlvl.g:2053:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalHlvl.g:2053:2: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalHlvl.g:2054:3: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2062:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHlvl.g:2063:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalHlvl.g:2063:4: ()
            	    // InternalHlvl.g:2064:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	    			
            	    // InternalHlvl.g:2074:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalHlvl.g:2075:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalHlvl.g:2075:5: (lv_right_3_0= ruleAnd )
            	    // InternalHlvl.g:2076:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalHlvl.g:2098:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalHlvl.g:2098:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalHlvl.g:2099:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalHlvl.g:2105:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2111:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalHlvl.g:2112:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalHlvl.g:2112:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalHlvl.g:2113:3: this_Equality_0= ruleEquality ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2121:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalHlvl.g:2122:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalHlvl.g:2122:4: ()
            	    // InternalHlvl.g:2123:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	    			
            	    // InternalHlvl.g:2133:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalHlvl.g:2134:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalHlvl.g:2134:5: (lv_right_3_0= ruleEquality )
            	    // InternalHlvl.g:2135:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalHlvl.g:2157:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalHlvl.g:2157:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalHlvl.g:2158:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalHlvl.g:2164:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2170:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalHlvl.g:2171:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalHlvl.g:2171:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalHlvl.g:2172:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2180:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=46 && LA23_0<=47)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalHlvl.g:2181:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalHlvl.g:2181:4: ()
            	    // InternalHlvl.g:2182:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2188:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) ) )
            	    // InternalHlvl.g:2189:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalHlvl.g:2189:5: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' ) )
            	    // InternalHlvl.g:2190:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    {
            	    // InternalHlvl.g:2190:6: (lv_op_2_1= '=' | lv_op_2_2= '!=' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==46) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==47) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalHlvl.g:2191:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,46,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2202:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,47,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalHlvl.g:2215:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalHlvl.g:2216:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalHlvl.g:2216:5: (lv_right_3_0= ruleComparison )
            	    // InternalHlvl.g:2217:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalHlvl.g:2239:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalHlvl.g:2239:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalHlvl.g:2240:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalHlvl.g:2246:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2252:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalHlvl.g:2253:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalHlvl.g:2253:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalHlvl.g:2254:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2262:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=48 && LA25_0<=51)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalHlvl.g:2263:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalHlvl.g:2263:4: ()
            	    // InternalHlvl.g:2264:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2270:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalHlvl.g:2271:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalHlvl.g:2271:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalHlvl.g:2272:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalHlvl.g:2272:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt24=4;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // InternalHlvl.g:2273:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,48,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2284:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,49,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2295:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,50,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalHlvl.g:2306:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,51,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalHlvl.g:2319:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalHlvl.g:2320:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalHlvl.g:2320:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalHlvl.g:2321:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalHlvl.g:2343:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalHlvl.g:2343:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalHlvl.g:2344:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalHlvl.g:2350:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2356:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalHlvl.g:2357:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalHlvl.g:2357:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalHlvl.g:2358:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2366:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=52 && LA27_0<=53)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalHlvl.g:2367:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalHlvl.g:2367:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==52) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==53) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalHlvl.g:2368:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalHlvl.g:2368:5: ( () otherlv_2= '+' )
            	            // InternalHlvl.g:2369:6: () otherlv_2= '+'
            	            {
            	            // InternalHlvl.g:2369:6: ()
            	            // InternalHlvl.g:2370:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,52,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2382:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalHlvl.g:2382:5: ( () otherlv_4= '-' )
            	            // InternalHlvl.g:2383:6: () otherlv_4= '-'
            	            {
            	            // InternalHlvl.g:2383:6: ()
            	            // InternalHlvl.g:2384:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,53,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalHlvl.g:2396:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalHlvl.g:2397:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalHlvl.g:2397:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalHlvl.g:2398:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.coffee.Hlvl.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalHlvl.g:2420:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalHlvl.g:2420:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalHlvl.g:2421:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalHlvl.g:2427:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2433:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalHlvl.g:2434:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalHlvl.g:2434:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalHlvl.g:2435:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHlvl.g:2443:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==37||(LA29_0>=54 && LA29_0<=55)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalHlvl.g:2444:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalHlvl.g:2444:4: ()
            	    // InternalHlvl.g:2445:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalHlvl.g:2451:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) ) )
            	    // InternalHlvl.g:2452:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    {
            	    // InternalHlvl.g:2452:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' ) )
            	    // InternalHlvl.g:2453:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    {
            	    // InternalHlvl.g:2453:6: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= 'mod' )
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // InternalHlvl.g:2454:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,37,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalHlvl.g:2465:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,54,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalHlvl.g:2476:7: lv_op_2_3= 'mod'
            	            {
            	            lv_op_2_3=(Token)match(input,55,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpModKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalHlvl.g:2489:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalHlvl.g:2490:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalHlvl.g:2490:5: (lv_right_3_0= rulePrimary )
            	    // InternalHlvl.g:2491:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.coffee.Hlvl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalHlvl.g:2513:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalHlvl.g:2513:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalHlvl.g:2514:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalHlvl.g:2520:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' ) | ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) | ( () otherlv_22= 'selected' otherlv_23= '(' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' ) | ( () ( ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) ) ) otherlv_28= '(' ( (lv_left_29_0= rulePrimary ) ) otherlv_30= ',' ( (lv_right_31_0= rulePrimary ) ) otherlv_32= ')' ) | this_Atomic_33= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_op_7_1=null;
        Token lv_op_7_2=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_number_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_op_27_1=null;
        Token lv_op_27_2=null;
        Token lv_op_27_3=null;
        Token lv_op_27_4=null;
        Token lv_op_27_5=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        EObject this_Relational_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_left_29_0 = null;

        EObject lv_right_31_0 = null;

        EObject this_Atomic_33 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2526:2: ( ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' ) | ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) | ( () otherlv_22= 'selected' otherlv_23= '(' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' ) | ( () ( ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) ) ) otherlv_28= '(' ( (lv_left_29_0= rulePrimary ) ) otherlv_30= ',' ( (lv_right_31_0= rulePrimary ) ) otherlv_32= ')' ) | this_Atomic_33= ruleAtomic ) )
            // InternalHlvl.g:2527:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' ) | ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) | ( () otherlv_22= 'selected' otherlv_23= '(' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' ) | ( () ( ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) ) ) otherlv_28= '(' ( (lv_left_29_0= rulePrimary ) ) otherlv_30= ',' ( (lv_right_31_0= rulePrimary ) ) otherlv_32= ')' ) | this_Atomic_33= ruleAtomic )
            {
            // InternalHlvl.g:2527:2: ( (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' ) | ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' ) | ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) | ( () otherlv_22= 'selected' otherlv_23= '(' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' ) | ( () ( ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) ) ) otherlv_28= '(' ( (lv_left_29_0= rulePrimary ) ) otherlv_30= ',' ( (lv_right_31_0= rulePrimary ) ) otherlv_32= ')' ) | this_Atomic_33= ruleAtomic )
            int alt32=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt32=1;
                }
                break;
            case 56:
                {
                alt32=2;
                }
                break;
            case 57:
            case 58:
                {
                alt32=3;
                }
                break;
            case 59:
                {
                alt32=4;
                }
                break;
            case 60:
                {
                alt32=5;
                }
                break;
            case 61:
                {
                alt32=6;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt32=7;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 67:
            case 68:
                {
                alt32=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalHlvl.g:2528:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    {
                    // InternalHlvl.g:2528:3: (otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')' )
                    // InternalHlvl.g:2529:4: otherlv_0= '(' this_Relational_1= ruleRelational otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getRelationalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_Relational_1=ruleRelational();

                    state._fsp--;


                    				current = this_Relational_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:2547:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalHlvl.g:2547:3: ( () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalHlvl.g:2548:4: () otherlv_4= '~' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalHlvl.g:2548:4: ()
                    // InternalHlvl.g:2549:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNegationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,56,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getTildeKeyword_1_1());
                    			
                    // InternalHlvl.g:2559:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalHlvl.g:2560:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalHlvl.g:2560:5: (lv_expression_5_0= rulePrimary )
                    // InternalHlvl.g:2561:6: lv_expression_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHlvl.g:2580:3: ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalHlvl.g:2580:3: ( () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalHlvl.g:2581:4: () ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) ) ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalHlvl.g:2581:4: ()
                    // InternalHlvl.g:2582:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUnaryFunctionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2588:4: ( ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) ) )
                    // InternalHlvl.g:2589:5: ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) )
                    {
                    // InternalHlvl.g:2589:5: ( (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' ) )
                    // InternalHlvl.g:2590:6: (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' )
                    {
                    // InternalHlvl.g:2590:6: (lv_op_7_1= 'abs' | lv_op_7_2= 'sqrt' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==57) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==58) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalHlvl.g:2591:7: lv_op_7_1= 'abs'
                            {
                            lv_op_7_1=(Token)match(input,57,FOLLOW_17); 

                            							newLeafNode(lv_op_7_1, grammarAccess.getPrimaryAccess().getOpAbsKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalHlvl.g:2602:7: lv_op_7_2= 'sqrt'
                            {
                            lv_op_7_2=(Token)match(input,58,FOLLOW_17); 

                            							newLeafNode(lv_op_7_2, grammarAccess.getPrimaryAccess().getOpSqrtKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalHlvl.g:2615:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalHlvl.g:2616:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalHlvl.g:2616:5: (lv_expression_8_0= rulePrimary )
                    // InternalHlvl.g:2617:6: lv_expression_8_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalHlvl.g:2636:3: ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' )
                    {
                    // InternalHlvl.g:2636:3: ( () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')' )
                    // InternalHlvl.g:2637:4: () otherlv_10= 'instances' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' ( (lv_number_14_0= RULE_INT ) ) otherlv_15= ')'
                    {
                    // InternalHlvl.g:2637:4: ()
                    // InternalHlvl.g:2638:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getInstancesAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,59,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getInstancesKeyword_3_1());
                    			
                    otherlv_11=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalHlvl.g:2652:4: ( (otherlv_12= RULE_ID ) )
                    // InternalHlvl.g:2653:5: (otherlv_12= RULE_ID )
                    {
                    // InternalHlvl.g:2653:5: (otherlv_12= RULE_ID )
                    // InternalHlvl.g:2654:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_12, grammarAccess.getPrimaryAccess().getElementElmDeclarationCrossReference_3_3_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getCommaKeyword_3_4());
                    			
                    // InternalHlvl.g:2669:4: ( (lv_number_14_0= RULE_INT ) )
                    // InternalHlvl.g:2670:5: (lv_number_14_0= RULE_INT )
                    {
                    // InternalHlvl.g:2670:5: (lv_number_14_0= RULE_INT )
                    // InternalHlvl.g:2671:6: lv_number_14_0= RULE_INT
                    {
                    lv_number_14_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_number_14_0, grammarAccess.getPrimaryAccess().getNumberINTTerminalRuleCall_3_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_14_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_6());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHlvl.g:2693:3: ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
                    {
                    // InternalHlvl.g:2693:3: ( () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
                    // InternalHlvl.g:2694:4: () otherlv_17= 'entailed' otherlv_18= '(' ( (otherlv_19= RULE_ID ) ) otherlv_20= ')'
                    {
                    // InternalHlvl.g:2694:4: ()
                    // InternalHlvl.g:2695:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getEntailedAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_17=(Token)match(input,60,FOLLOW_24); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrimaryAccess().getEntailedKeyword_4_1());
                    			
                    otherlv_18=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2());
                    			
                    // InternalHlvl.g:2709:4: ( (otherlv_19= RULE_ID ) )
                    // InternalHlvl.g:2710:5: (otherlv_19= RULE_ID )
                    {
                    // InternalHlvl.g:2710:5: (otherlv_19= RULE_ID )
                    // InternalHlvl.g:2711:6: otherlv_19= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    					
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_19, grammarAccess.getPrimaryAccess().getElementElmDeclarationCrossReference_4_3_0());
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHlvl.g:2728:3: ( () otherlv_22= 'selected' otherlv_23= '(' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' )
                    {
                    // InternalHlvl.g:2728:3: ( () otherlv_22= 'selected' otherlv_23= '(' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' )
                    // InternalHlvl.g:2729:4: () otherlv_22= 'selected' otherlv_23= '(' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')'
                    {
                    // InternalHlvl.g:2729:4: ()
                    // InternalHlvl.g:2730:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getSelectedAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_22=(Token)match(input,61,FOLLOW_24); 

                    				newLeafNode(otherlv_22, grammarAccess.getPrimaryAccess().getSelectedKeyword_5_1());
                    			
                    otherlv_23=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_5_2());
                    			
                    // InternalHlvl.g:2744:4: ( (otherlv_24= RULE_ID ) )
                    // InternalHlvl.g:2745:5: (otherlv_24= RULE_ID )
                    {
                    // InternalHlvl.g:2745:5: (otherlv_24= RULE_ID )
                    // InternalHlvl.g:2746:6: otherlv_24= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    					
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_24, grammarAccess.getPrimaryAccess().getElementElmDeclarationCrossReference_5_3_0());
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHlvl.g:2763:3: ( () ( ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) ) ) otherlv_28= '(' ( (lv_left_29_0= rulePrimary ) ) otherlv_30= ',' ( (lv_right_31_0= rulePrimary ) ) otherlv_32= ')' )
                    {
                    // InternalHlvl.g:2763:3: ( () ( ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) ) ) otherlv_28= '(' ( (lv_left_29_0= rulePrimary ) ) otherlv_30= ',' ( (lv_right_31_0= rulePrimary ) ) otherlv_32= ')' )
                    // InternalHlvl.g:2764:4: () ( ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) ) ) otherlv_28= '(' ( (lv_left_29_0= rulePrimary ) ) otherlv_30= ',' ( (lv_right_31_0= rulePrimary ) ) otherlv_32= ')'
                    {
                    // InternalHlvl.g:2764:4: ()
                    // InternalHlvl.g:2765:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getBinaryFunctionAction_6_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2771:4: ( ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) ) )
                    // InternalHlvl.g:2772:5: ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) )
                    {
                    // InternalHlvl.g:2772:5: ( (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' ) )
                    // InternalHlvl.g:2773:6: (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' )
                    {
                    // InternalHlvl.g:2773:6: (lv_op_27_1= 'pow' | lv_op_27_2= 'dist' | lv_op_27_3= 'min' | lv_op_27_4= 'max' | lv_op_27_5= 'if' )
                    int alt31=5;
                    switch ( input.LA(1) ) {
                    case 62:
                        {
                        alt31=1;
                        }
                        break;
                    case 63:
                        {
                        alt31=2;
                        }
                        break;
                    case 64:
                        {
                        alt31=3;
                        }
                        break;
                    case 65:
                        {
                        alt31=4;
                        }
                        break;
                    case 66:
                        {
                        alt31=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // InternalHlvl.g:2774:7: lv_op_27_1= 'pow'
                            {
                            lv_op_27_1=(Token)match(input,62,FOLLOW_24); 

                            							newLeafNode(lv_op_27_1, grammarAccess.getPrimaryAccess().getOpPowKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_27_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalHlvl.g:2785:7: lv_op_27_2= 'dist'
                            {
                            lv_op_27_2=(Token)match(input,63,FOLLOW_24); 

                            							newLeafNode(lv_op_27_2, grammarAccess.getPrimaryAccess().getOpDistKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_27_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalHlvl.g:2796:7: lv_op_27_3= 'min'
                            {
                            lv_op_27_3=(Token)match(input,64,FOLLOW_24); 

                            							newLeafNode(lv_op_27_3, grammarAccess.getPrimaryAccess().getOpMinKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_27_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalHlvl.g:2807:7: lv_op_27_4= 'max'
                            {
                            lv_op_27_4=(Token)match(input,65,FOLLOW_24); 

                            							newLeafNode(lv_op_27_4, grammarAccess.getPrimaryAccess().getOpMaxKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_27_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalHlvl.g:2818:7: lv_op_27_5= 'if'
                            {
                            lv_op_27_5=(Token)match(input,66,FOLLOW_24); 

                            							newLeafNode(lv_op_27_5, grammarAccess.getPrimaryAccess().getOpIfKeyword_6_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimaryRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_27_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_28=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_28, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_6_2());
                    			
                    // InternalHlvl.g:2835:4: ( (lv_left_29_0= rulePrimary ) )
                    // InternalHlvl.g:2836:5: (lv_left_29_0= rulePrimary )
                    {
                    // InternalHlvl.g:2836:5: (lv_left_29_0= rulePrimary )
                    // InternalHlvl.g:2837:6: lv_left_29_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_left_29_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_29_0,
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_30=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_30, grammarAccess.getPrimaryAccess().getCommaKeyword_6_4());
                    			
                    // InternalHlvl.g:2858:4: ( (lv_right_31_0= rulePrimary ) )
                    // InternalHlvl.g:2859:5: (lv_right_31_0= rulePrimary )
                    {
                    // InternalHlvl.g:2859:5: (lv_right_31_0= rulePrimary )
                    // InternalHlvl.g:2860:6: lv_right_31_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getRightPrimaryParserRuleCall_6_5_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_right_31_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_31_0,
                    							"com.coffee.Hlvl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_32=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_32, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_6_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalHlvl.g:2883:3: this_Atomic_33= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_33=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_33;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalHlvl.g:2895:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalHlvl.g:2895:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalHlvl.g:2896:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalHlvl.g:2902:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_3=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        EObject lv_attribute_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:2908:2: ( ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) ) )
            // InternalHlvl.g:2909:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) )
            {
            // InternalHlvl.g:2909:2: ( ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 67:
            case 68:
                {
                alt34=1;
                }
                break;
            case RULE_ID:
                {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==69) ) {
                    alt34=3;
                }
                else if ( (LA34_2==EOF||LA34_2==14||(LA34_2>=16 && LA34_2<=21)||LA34_2==28||LA34_2==32||LA34_2==37||(LA34_2>=42 && LA34_2<=55)) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt34=4;
                }
                break;
            case RULE_INT:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalHlvl.g:2910:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    {
                    // InternalHlvl.g:2910:3: ( () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) ) )
                    // InternalHlvl.g:2911:4: () ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    {
                    // InternalHlvl.g:2911:4: ()
                    // InternalHlvl.g:2912:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2918:4: ( ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) ) )
                    // InternalHlvl.g:2919:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    {
                    // InternalHlvl.g:2919:5: ( (lv_value_1_1= 'true' | lv_value_1_2= 'false' ) )
                    // InternalHlvl.g:2920:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    {
                    // InternalHlvl.g:2920:6: (lv_value_1_1= 'true' | lv_value_1_2= 'false' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==67) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==68) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalHlvl.g:2921:7: lv_value_1_1= 'true'
                            {
                            lv_value_1_1=(Token)match(input,67,FOLLOW_2); 

                            							newLeafNode(lv_value_1_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalHlvl.g:2932:7: lv_value_1_2= 'false'
                            {
                            lv_value_1_2=(Token)match(input,68,FOLLOW_2); 

                            							newLeafNode(lv_value_1_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:2947:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalHlvl.g:2947:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalHlvl.g:2948:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalHlvl.g:2948:4: ()
                    // InternalHlvl.g:2949:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2955:4: ( (otherlv_3= RULE_ID ) )
                    // InternalHlvl.g:2956:5: (otherlv_3= RULE_ID )
                    {
                    // InternalHlvl.g:2956:5: (otherlv_3= RULE_ID )
                    // InternalHlvl.g:2957:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getVariableElmDeclarationCrossReference_1_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHlvl.g:2970:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    {
                    // InternalHlvl.g:2970:3: ( () ( (lv_attribute_5_0= ruleQualifiedName ) ) )
                    // InternalHlvl.g:2971:4: () ( (lv_attribute_5_0= ruleQualifiedName ) )
                    {
                    // InternalHlvl.g:2971:4: ()
                    // InternalHlvl.g:2972:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getAttributeRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:2978:4: ( (lv_attribute_5_0= ruleQualifiedName ) )
                    // InternalHlvl.g:2979:5: (lv_attribute_5_0= ruleQualifiedName )
                    {
                    // InternalHlvl.g:2979:5: (lv_attribute_5_0= ruleQualifiedName )
                    // InternalHlvl.g:2980:6: lv_attribute_5_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getAttributeQualifiedNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attribute_5_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_5_0,
                    							"com.coffee.Hlvl.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalHlvl.g:2999:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalHlvl.g:2999:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalHlvl.g:3000:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalHlvl.g:3000:4: ()
                    // InternalHlvl.g:3001:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getSymbolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:3007:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalHlvl.g:3008:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalHlvl.g:3008:5: (lv_value_7_0= RULE_STRING )
                    // InternalHlvl.g:3009:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalHlvl.g:3027:3: ( () ( (lv_value_9_0= RULE_INT ) ) )
                    {
                    // InternalHlvl.g:3027:3: ( () ( (lv_value_9_0= RULE_INT ) ) )
                    // InternalHlvl.g:3028:4: () ( (lv_value_9_0= RULE_INT ) )
                    {
                    // InternalHlvl.g:3028:4: ()
                    // InternalHlvl.g:3029:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:3035:4: ( (lv_value_9_0= RULE_INT ) )
                    // InternalHlvl.g:3036:5: (lv_value_9_0= RULE_INT )
                    {
                    // InternalHlvl.g:3036:5: (lv_value_9_0= RULE_INT )
                    // InternalHlvl.g:3037:6: lv_value_9_0= RULE_INT
                    {
                    lv_value_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_9_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalHlvl.g:3058:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalHlvl.g:3058:54: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalHlvl.g:3059:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalHlvl.g:3065:1: ruleQualifiedName returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3071:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalHlvl.g:3072:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalHlvl.g:3072:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalHlvl.g:3073:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalHlvl.g:3073:3: ( (otherlv_0= RULE_ID ) )
            // InternalHlvl.g:3074:4: (otherlv_0= RULE_ID )
            {
            // InternalHlvl.g:3074:4: (otherlv_0= RULE_ID )
            // InternalHlvl.g:3075:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedNameRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_0, grammarAccess.getQualifiedNameAccess().getElementElmDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1());
            		
            // InternalHlvl.g:3090:3: ( (otherlv_2= RULE_ID ) )
            // InternalHlvl.g:3091:4: (otherlv_2= RULE_ID )
            {
            // InternalHlvl.g:3091:4: (otherlv_2= RULE_ID )
            // InternalHlvl.g:3092:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedNameRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getQualifiedNameAccess().getAttElmDeclarationCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleGeneralQualifiedName"
    // InternalHlvl.g:3107:1: entryRuleGeneralQualifiedName returns [String current=null] : iv_ruleGeneralQualifiedName= ruleGeneralQualifiedName EOF ;
    public final String entryRuleGeneralQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGeneralQualifiedName = null;


        try {
            // InternalHlvl.g:3107:60: (iv_ruleGeneralQualifiedName= ruleGeneralQualifiedName EOF )
            // InternalHlvl.g:3108:2: iv_ruleGeneralQualifiedName= ruleGeneralQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getGeneralQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralQualifiedName=ruleGeneralQualifiedName();

            state._fsp--;

             current =iv_ruleGeneralQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralQualifiedName"


    // $ANTLR start "ruleGeneralQualifiedName"
    // InternalHlvl.g:3114:1: ruleGeneralQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleGeneralQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3120:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalHlvl.g:3121:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalHlvl.g:3121:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalHlvl.g:3122:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getGeneralQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalHlvl.g:3129:3: (kw= '.' this_ID_2= RULE_ID )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==69) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalHlvl.g:3130:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,69,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getGeneralQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getGeneralQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralQualifiedName"


    // $ANTLR start "entryRuleOperations"
    // InternalHlvl.g:3147:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalHlvl.g:3147:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalHlvl.g:3148:2: iv_ruleOperations= ruleOperations EOF
            {
             newCompositeNode(grammarAccess.getOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperations=ruleOperations();

            state._fsp--;

             current =iv_ruleOperations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalHlvl.g:3154:1: ruleOperations returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3160:2: ( ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* ) )
            // InternalHlvl.g:3161:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            {
            // InternalHlvl.g:3161:2: ( ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )* )
            // InternalHlvl.g:3162:3: ( (lv_op_0_0= ruleOperation ) ) ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            {
            // InternalHlvl.g:3162:3: ( (lv_op_0_0= ruleOperation ) )
            // InternalHlvl.g:3163:4: (lv_op_0_0= ruleOperation )
            {
            // InternalHlvl.g:3163:4: (lv_op_0_0= ruleOperation )
            // InternalHlvl.g:3164:5: lv_op_0_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_op_0_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationsRule());
            					}
            					add(
            						current,
            						"op",
            						lv_op_0_0,
            						"com.coffee.Hlvl.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:3181:3: ( (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==16) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalHlvl.g:3182:4: (otherlv_1= ',' )+ ( (lv_op_2_0= ruleOperation ) )
            	    {
            	    // InternalHlvl.g:3182:4: (otherlv_1= ',' )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==16) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3183:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,16,FOLLOW_39); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getOperationsAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt36 >= 1 ) break loop36;
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);

            	    // InternalHlvl.g:3188:4: ( (lv_op_2_0= ruleOperation ) )
            	    // InternalHlvl.g:3189:5: (lv_op_2_0= ruleOperation )
            	    {
            	    // InternalHlvl.g:3189:5: (lv_op_2_0= ruleOperation )
            	    // InternalHlvl.g:3190:6: lv_op_2_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getOpOperationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_op_2_0=ruleOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"com.coffee.Hlvl.Operation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleOperation"
    // InternalHlvl.g:3212:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalHlvl.g:3212:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalHlvl.g:3213:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalHlvl.g:3219:1: ruleOperation returns [EObject current=null] : this_Sample_0= ruleSample ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Sample_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3225:2: (this_Sample_0= ruleSample )
            // InternalHlvl.g:3226:2: this_Sample_0= ruleSample
            {

            		newCompositeNode(grammarAccess.getOperationAccess().getSampleParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Sample_0=ruleSample();

            state._fsp--;


            		current = this_Sample_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSample"
    // InternalHlvl.g:3237:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalHlvl.g:3237:47: (iv_ruleSample= ruleSample EOF )
            // InternalHlvl.g:3238:2: iv_ruleSample= ruleSample EOF
            {
             newCompositeNode(grammarAccess.getSampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSample=ruleSample();

            state._fsp--;

             current =iv_ruleSample; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSample"


    // $ANTLR start "ruleSample"
    // InternalHlvl.g:3244:1: ruleSample returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_valuations_5_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3250:2: ( ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) ) )
            // InternalHlvl.g:3251:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            {
            // InternalHlvl.g:3251:2: ( ( () ( (lv_name_1_0= ruleOperationName ) ) ) | ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=71 && LA38_0<=74)) ) {
                alt38=1;
            }
            else if ( (LA38_0==70) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalHlvl.g:3252:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    {
                    // InternalHlvl.g:3252:3: ( () ( (lv_name_1_0= ruleOperationName ) ) )
                    // InternalHlvl.g:3253:4: () ( (lv_name_1_0= ruleOperationName ) )
                    {
                    // InternalHlvl.g:3253:4: ()
                    // InternalHlvl.g:3254:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getSingleInstructionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalHlvl.g:3260:4: ( (lv_name_1_0= ruleOperationName ) )
                    // InternalHlvl.g:3261:5: (lv_name_1_0= ruleOperationName )
                    {
                    // InternalHlvl.g:3261:5: (lv_name_1_0= ruleOperationName )
                    // InternalHlvl.g:3262:6: lv_name_1_0= ruleOperationName
                    {

                    						newCompositeNode(grammarAccess.getSampleAccess().getNameOperationNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleOperationName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSampleRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"com.coffee.Hlvl.OperationName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3281:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    {
                    // InternalHlvl.g:3281:3: ( () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')' )
                    // InternalHlvl.g:3282:4: () otherlv_3= 'validConfiguration' otherlv_4= '(' ( (lv_valuations_5_0= ruleListOfValuation ) ) otherlv_6= ')'
                    {
                    // InternalHlvl.g:3282:4: ()
                    // InternalHlvl.g:3283:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSampleAccess().getValidConfAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,70,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getValidConfigurationKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalHlvl.g:3297:4: ( (lv_valuations_5_0= ruleListOfValuation ) )
                    // InternalHlvl.g:3298:5: (lv_valuations_5_0= ruleListOfValuation )
                    {
                    // InternalHlvl.g:3298:5: (lv_valuations_5_0= ruleListOfValuation )
                    // InternalHlvl.g:3299:6: lv_valuations_5_0= ruleListOfValuation
                    {

                    						newCompositeNode(grammarAccess.getSampleAccess().getValuationsListOfValuationParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_valuations_5_0=ruleListOfValuation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSampleRule());
                    						}
                    						set(
                    							current,
                    							"valuations",
                    							lv_valuations_5_0,
                    							"com.coffee.Hlvl.ListOfValuation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSampleAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSample"


    // $ANTLR start "entryRuleOperationName"
    // InternalHlvl.g:3325:1: entryRuleOperationName returns [String current=null] : iv_ruleOperationName= ruleOperationName EOF ;
    public final String entryRuleOperationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationName = null;


        try {
            // InternalHlvl.g:3325:53: (iv_ruleOperationName= ruleOperationName EOF )
            // InternalHlvl.g:3326:2: iv_ruleOperationName= ruleOperationName EOF
            {
             newCompositeNode(grammarAccess.getOperationNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationName=ruleOperationName();

            state._fsp--;

             current =iv_ruleOperationName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationName"


    // $ANTLR start "ruleOperationName"
    // InternalHlvl.g:3332:1: ruleOperationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) ;
    public final AntlrDatatypeRuleToken ruleOperationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHlvl.g:3338:2: ( (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' ) )
            // InternalHlvl.g:3339:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            {
            // InternalHlvl.g:3339:2: (kw= 'validModel' | kw= 'numberOfConfigurations' | kw= 'findConfiguration' | kw= 'findAllConfigurations' )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt39=1;
                }
                break;
            case 72:
                {
                alt39=2;
                }
                break;
            case 73:
                {
                alt39=3;
                }
                break;
            case 74:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalHlvl.g:3340:3: kw= 'validModel'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getValidModelKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHlvl.g:3346:3: kw= 'numberOfConfigurations'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getNumberOfConfigurationsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalHlvl.g:3352:3: kw= 'findConfiguration'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getFindConfigurationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalHlvl.g:3358:3: kw= 'findAllConfigurations'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationNameAccess().getFindAllConfigurationsKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationName"


    // $ANTLR start "entryRuleListOfValues"
    // InternalHlvl.g:3367:1: entryRuleListOfValues returns [EObject current=null] : iv_ruleListOfValues= ruleListOfValues EOF ;
    public final EObject entryRuleListOfValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValues = null;


        try {
            // InternalHlvl.g:3367:53: (iv_ruleListOfValues= ruleListOfValues EOF )
            // InternalHlvl.g:3368:2: iv_ruleListOfValues= ruleListOfValues EOF
            {
             newCompositeNode(grammarAccess.getListOfValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfValues=ruleListOfValues();

            state._fsp--;

             current =iv_ruleListOfValues; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOfValues"


    // $ANTLR start "ruleListOfValues"
    // InternalHlvl.g:3374:1: ruleListOfValues returns [EObject current=null] : ( ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )* ) ;
    public final EObject ruleListOfValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3380:2: ( ( ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )* ) )
            // InternalHlvl.g:3381:2: ( ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )* )
            {
            // InternalHlvl.g:3381:2: ( ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )* )
            // InternalHlvl.g:3382:3: ( (lv_values_0_0= ruleRelational ) ) ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )*
            {
            // InternalHlvl.g:3382:3: ( (lv_values_0_0= ruleRelational ) )
            // InternalHlvl.g:3383:4: (lv_values_0_0= ruleRelational )
            {
            // InternalHlvl.g:3383:4: (lv_values_0_0= ruleRelational )
            // InternalHlvl.g:3384:5: lv_values_0_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesRelationalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_values_0_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:3401:3: ( (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==16) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalHlvl.g:3402:4: (otherlv_1= ',' )+ ( (lv_values_2_0= ruleRelational ) )
            	    {
            	    // InternalHlvl.g:3402:4: (otherlv_1= ',' )+
            	    int cnt40=0;
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==16) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3403:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,16,FOLLOW_40); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt40 >= 1 ) break loop40;
            	                EarlyExitException eee =
            	                    new EarlyExitException(40, input);
            	                throw eee;
            	        }
            	        cnt40++;
            	    } while (true);

            	    // InternalHlvl.g:3408:4: ( (lv_values_2_0= ruleRelational ) )
            	    // InternalHlvl.g:3409:5: (lv_values_2_0= ruleRelational )
            	    {
            	    // InternalHlvl.g:3409:5: (lv_values_2_0= ruleRelational )
            	    // InternalHlvl.g:3410:6: lv_values_2_0= ruleRelational
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuesAccess().getValuesRelationalParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_values_2_0=ruleRelational();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfValuesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"com.coffee.Hlvl.Relational");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOfValues"


    // $ANTLR start "entryRuleListOfIDs"
    // InternalHlvl.g:3432:1: entryRuleListOfIDs returns [EObject current=null] : iv_ruleListOfIDs= ruleListOfIDs EOF ;
    public final EObject entryRuleListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfIDs = null;


        try {
            // InternalHlvl.g:3432:50: (iv_ruleListOfIDs= ruleListOfIDs EOF )
            // InternalHlvl.g:3433:2: iv_ruleListOfIDs= ruleListOfIDs EOF
            {
             newCompositeNode(grammarAccess.getListOfIDsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfIDs=ruleListOfIDs();

            state._fsp--;

             current =iv_ruleListOfIDs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOfIDs"


    // $ANTLR start "ruleListOfIDs"
    // InternalHlvl.g:3439:1: ruleListOfIDs returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHlvl.g:3445:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3446:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3446:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            // InternalHlvl.g:3447:3: () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3447:3: ()
            // InternalHlvl.g:3448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListOfIDsAccess().getListOfIDsAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:3454:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3455:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3455:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3456:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListOfIDsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_1_0());
            				

            }


            }

            // InternalHlvl.g:3467:3: ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==16) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalHlvl.g:3468:4: (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3468:4: (otherlv_2= ',' )+
            	    int cnt42=0;
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==16) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3469:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,16,FOLLOW_41); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getListOfIDsAccess().getCommaKeyword_2_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt42 >= 1 ) break loop42;
            	                EarlyExitException eee =
            	                    new EarlyExitException(42, input);
            	                throw eee;
            	        }
            	        cnt42++;
            	    } while (true);

            	    // InternalHlvl.g:3474:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalHlvl.g:3475:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalHlvl.g:3475:5: (otherlv_3= RULE_ID )
            	    // InternalHlvl.g:3476:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getListOfIDsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_3, grammarAccess.getListOfIDsAccess().getValuesElmDeclarationCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOfIDs"


    // $ANTLR start "entryRuleMixedListOfIDs"
    // InternalHlvl.g:3492:1: entryRuleMixedListOfIDs returns [EObject current=null] : iv_ruleMixedListOfIDs= ruleMixedListOfIDs EOF ;
    public final EObject entryRuleMixedListOfIDs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixedListOfIDs = null;


        try {
            // InternalHlvl.g:3492:55: (iv_ruleMixedListOfIDs= ruleMixedListOfIDs EOF )
            // InternalHlvl.g:3493:2: iv_ruleMixedListOfIDs= ruleMixedListOfIDs EOF
            {
             newCompositeNode(grammarAccess.getMixedListOfIDsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixedListOfIDs=ruleMixedListOfIDs();

            state._fsp--;

             current =iv_ruleMixedListOfIDs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMixedListOfIDs"


    // $ANTLR start "ruleMixedListOfIDs"
    // InternalHlvl.g:3499:1: ruleMixedListOfIDs returns [EObject current=null] : ( () ( ( ruleGeneralQualifiedName ) ) ( (otherlv_2= ',' )+ ( ( ruleGeneralQualifiedName ) ) )* ) ;
    public final EObject ruleMixedListOfIDs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalHlvl.g:3505:2: ( ( () ( ( ruleGeneralQualifiedName ) ) ( (otherlv_2= ',' )+ ( ( ruleGeneralQualifiedName ) ) )* ) )
            // InternalHlvl.g:3506:2: ( () ( ( ruleGeneralQualifiedName ) ) ( (otherlv_2= ',' )+ ( ( ruleGeneralQualifiedName ) ) )* )
            {
            // InternalHlvl.g:3506:2: ( () ( ( ruleGeneralQualifiedName ) ) ( (otherlv_2= ',' )+ ( ( ruleGeneralQualifiedName ) ) )* )
            // InternalHlvl.g:3507:3: () ( ( ruleGeneralQualifiedName ) ) ( (otherlv_2= ',' )+ ( ( ruleGeneralQualifiedName ) ) )*
            {
            // InternalHlvl.g:3507:3: ()
            // InternalHlvl.g:3508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMixedListOfIDsAccess().getMixedListOfIDsAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:3514:3: ( ( ruleGeneralQualifiedName ) )
            // InternalHlvl.g:3515:4: ( ruleGeneralQualifiedName )
            {
            // InternalHlvl.g:3515:4: ( ruleGeneralQualifiedName )
            // InternalHlvl.g:3516:5: ruleGeneralQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixedListOfIDsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMixedListOfIDsAccess().getValuesElmDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_10);
            ruleGeneralQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:3530:3: ( (otherlv_2= ',' )+ ( ( ruleGeneralQualifiedName ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==16) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalHlvl.g:3531:4: (otherlv_2= ',' )+ ( ( ruleGeneralQualifiedName ) )
            	    {
            	    // InternalHlvl.g:3531:4: (otherlv_2= ',' )+
            	    int cnt44=0;
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==16) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3532:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,16,FOLLOW_41); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getMixedListOfIDsAccess().getCommaKeyword_2_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt44 >= 1 ) break loop44;
            	                EarlyExitException eee =
            	                    new EarlyExitException(44, input);
            	                throw eee;
            	        }
            	        cnt44++;
            	    } while (true);

            	    // InternalHlvl.g:3537:4: ( ( ruleGeneralQualifiedName ) )
            	    // InternalHlvl.g:3538:5: ( ruleGeneralQualifiedName )
            	    {
            	    // InternalHlvl.g:3538:5: ( ruleGeneralQualifiedName )
            	    // InternalHlvl.g:3539:6: ruleGeneralQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMixedListOfIDsRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMixedListOfIDsAccess().getValuesElmDeclarationCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleGeneralQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMixedListOfIDs"


    // $ANTLR start "entryRuleMixedList"
    // InternalHlvl.g:3558:1: entryRuleMixedList returns [EObject current=null] : iv_ruleMixedList= ruleMixedList EOF ;
    public final EObject entryRuleMixedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixedList = null;


        try {
            // InternalHlvl.g:3558:50: (iv_ruleMixedList= ruleMixedList EOF )
            // InternalHlvl.g:3559:2: iv_ruleMixedList= ruleMixedList EOF
            {
             newCompositeNode(grammarAccess.getMixedListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixedList=ruleMixedList();

            state._fsp--;

             current =iv_ruleMixedList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMixedList"


    // $ANTLR start "ruleMixedList"
    // InternalHlvl.g:3565:1: ruleMixedList returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleMixedList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalHlvl.g:3571:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalHlvl.g:3572:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalHlvl.g:3572:2: ( () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )* )
            // InternalHlvl.g:3573:3: () ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalHlvl.g:3573:3: ()
            // InternalHlvl.g:3574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMixedListAccess().getMixedListAction_0(),
            					current);
            			

            }

            // InternalHlvl.g:3580:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3581:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3581:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3582:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixedListRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getMixedListAccess().getIdsNamedItemCrossReference_1_0());
            				

            }


            }

            // InternalHlvl.g:3593:3: ( (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==16) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalHlvl.g:3594:4: (otherlv_2= ',' )+ ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalHlvl.g:3594:4: (otherlv_2= ',' )+
            	    int cnt46=0;
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==16) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3595:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,16,FOLLOW_41); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getMixedListAccess().getCommaKeyword_2_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt46 >= 1 ) break loop46;
            	                EarlyExitException eee =
            	                    new EarlyExitException(46, input);
            	                throw eee;
            	        }
            	        cnt46++;
            	    } while (true);

            	    // InternalHlvl.g:3600:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalHlvl.g:3601:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalHlvl.g:3601:5: (otherlv_3= RULE_ID )
            	    // InternalHlvl.g:3602:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMixedListRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMixedListAccess().getIdsNamedItemCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMixedList"


    // $ANTLR start "entryRuleValuation"
    // InternalHlvl.g:3618:1: entryRuleValuation returns [EObject current=null] : iv_ruleValuation= ruleValuation EOF ;
    public final EObject entryRuleValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuation = null;


        try {
            // InternalHlvl.g:3618:50: (iv_ruleValuation= ruleValuation EOF )
            // InternalHlvl.g:3619:2: iv_ruleValuation= ruleValuation EOF
            {
             newCompositeNode(grammarAccess.getValuationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValuation=ruleValuation();

            state._fsp--;

             current =iv_ruleValuation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValuation"


    // $ANTLR start "ruleValuation"
    // InternalHlvl.g:3625:1: ruleValuation returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')' ) ;
    public final EObject ruleValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3631:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')' ) )
            // InternalHlvl.g:3632:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')' )
            {
            // InternalHlvl.g:3632:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')' )
            // InternalHlvl.g:3633:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (lv_value_3_0= ruleRelational ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValuationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalHlvl.g:3637:3: ( (otherlv_1= RULE_ID ) )
            // InternalHlvl.g:3638:4: (otherlv_1= RULE_ID )
            {
            // InternalHlvl.g:3638:4: (otherlv_1= RULE_ID )
            // InternalHlvl.g:3639:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValuationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getValuationAccess().getElementElmDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getValuationAccess().getCommaKeyword_2());
            		
            // InternalHlvl.g:3654:3: ( (lv_value_3_0= ruleRelational ) )
            // InternalHlvl.g:3655:4: (lv_value_3_0= ruleRelational )
            {
            // InternalHlvl.g:3655:4: (lv_value_3_0= ruleRelational )
            // InternalHlvl.g:3656:5: lv_value_3_0= ruleRelational
            {

            					newCompositeNode(grammarAccess.getValuationAccess().getValueRelationalParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_value_3_0=ruleRelational();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValuationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"com.coffee.Hlvl.Relational");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getValuationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValuation"


    // $ANTLR start "entryRuleListOfValuation"
    // InternalHlvl.g:3681:1: entryRuleListOfValuation returns [EObject current=null] : iv_ruleListOfValuation= ruleListOfValuation EOF ;
    public final EObject entryRuleListOfValuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListOfValuation = null;


        try {
            // InternalHlvl.g:3681:56: (iv_ruleListOfValuation= ruleListOfValuation EOF )
            // InternalHlvl.g:3682:2: iv_ruleListOfValuation= ruleListOfValuation EOF
            {
             newCompositeNode(grammarAccess.getListOfValuationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListOfValuation=ruleListOfValuation();

            state._fsp--;

             current =iv_ruleListOfValuation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListOfValuation"


    // $ANTLR start "ruleListOfValuation"
    // InternalHlvl.g:3688:1: ruleListOfValuation returns [EObject current=null] : ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) ;
    public final EObject ruleListOfValuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pairs_0_0 = null;

        EObject lv_pairs_2_0 = null;



        	enterRule();

        try {
            // InternalHlvl.g:3694:2: ( ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* ) )
            // InternalHlvl.g:3695:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            {
            // InternalHlvl.g:3695:2: ( ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )* )
            // InternalHlvl.g:3696:3: ( (lv_pairs_0_0= ruleValuation ) ) ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            {
            // InternalHlvl.g:3696:3: ( (lv_pairs_0_0= ruleValuation ) )
            // InternalHlvl.g:3697:4: (lv_pairs_0_0= ruleValuation )
            {
            // InternalHlvl.g:3697:4: (lv_pairs_0_0= ruleValuation )
            // InternalHlvl.g:3698:5: lv_pairs_0_0= ruleValuation
            {

            					newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_pairs_0_0=ruleValuation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListOfValuationRule());
            					}
            					add(
            						current,
            						"pairs",
            						lv_pairs_0_0,
            						"com.coffee.Hlvl.Valuation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHlvl.g:3715:3: ( (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==16) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalHlvl.g:3716:4: (otherlv_1= ',' )+ ( (lv_pairs_2_0= ruleValuation ) )
            	    {
            	    // InternalHlvl.g:3716:4: (otherlv_1= ',' )+
            	    int cnt48=0;
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==16) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalHlvl.g:3717:5: otherlv_1= ','
            	    	    {
            	    	    otherlv_1=(Token)match(input,16,FOLLOW_42); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getListOfValuationAccess().getCommaKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt48 >= 1 ) break loop48;
            	                EarlyExitException eee =
            	                    new EarlyExitException(48, input);
            	                throw eee;
            	        }
            	        cnt48++;
            	    } while (true);

            	    // InternalHlvl.g:3722:4: ( (lv_pairs_2_0= ruleValuation ) )
            	    // InternalHlvl.g:3723:5: (lv_pairs_2_0= ruleValuation )
            	    {
            	    // InternalHlvl.g:3723:5: (lv_pairs_2_0= ruleValuation )
            	    // InternalHlvl.g:3724:6: lv_pairs_2_0= ruleValuation
            	    {

            	    						newCompositeNode(grammarAccess.getListOfValuationAccess().getPairsValuationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_pairs_2_0=ruleValuation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListOfValuationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"pairs",
            	    							lv_pairs_2_0,
            	    							"com.coffee.Hlvl.Valuation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListOfValuation"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\36\1\uffff\2\37\5\uffff\2\4\1\20\2\uffff\2\4\1\20\2\uffff";
    static final String dfa_3s = "\1\51\1\uffff\2\37\5\uffff\2\37\1\105\2\uffff\1\4\1\33\1\105\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\3\uffff\1\11\1\12\3\uffff\1\2\1\3";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\1\3\1\5\1\6\1\uffff\1\10\2\4\1\7",
            "",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\13\32\uffff\1\14",
            "\1\13\32\uffff\1\15",
            "\1\17\64\uffff\1\16",
            "",
            "",
            "\1\20",
            "\1\21\26\uffff\1\22",
            "\1\17\64\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "815:2: (this_Common_0= ruleCommon | this_Pair_1= rulePair | this_VarList_2= ruleVarList | this_Order_3= ruleOrder | this_Decomposition_4= ruleDecomposition | this_Group_5= ruleGroup | this_Constraint_6= ruleConstraint | this_Visibility_7= ruleVisibility | this_ComplexImplies_8= ruleComplexImplies | this_ComplexMutex_9= ruleComplexMutex )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001E4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xFF00000080000070L,0x000000000000001FL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000003DE40000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00C0002000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000010000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xFF00000080010070L,0x000000000000001FL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000080010000L});

}