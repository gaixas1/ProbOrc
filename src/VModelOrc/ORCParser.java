package VModelOrc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ORCParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "FALSE", "IF", "LET",
		"LNAME", "LOWER", "LP", "NUM", "OTHER", "PAR", "RP", "SEL", "TRUE", "UNAME",
		"UPPER", "WS", "'!='", "','", "'<'", "'<='", "'='", "'>'", "'>='"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int DIGIT=4;
	public static final int FALSE=5;
	public static final int IF=6;
	public static final int LET=7;
	public static final int LNAME=8;
	public static final int LOWER=9;
	public static final int LP=10;
	public static final int NUM=11;
	public static final int OTHER=12;
	public static final int PAR=13;
	public static final int RP=14;
	public static final int SEL=15;
	public static final int TRUE=16;
	public static final int UNAME=17;
	public static final int UPPER=18;
	public static final int WS=19;


	public Parser[] getDelegates() {
		return new Parser[] {};
	}




	public ORCParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ORCParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ORCParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\nyanco\\Documents\\NetBeansProjects\\ProbOrc\\src\\ORC.g"; }


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.expr_return expr() throws Exception  {
		ORCParser.expr_return retval = new ORCParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal3=null;
		ParserRuleReturnScope nameExpr1 =null;
		ParserRuleReturnScope varList2 =null;
		ParserRuleReturnScope pruExpr4 =null;

		CommonTree char_literal3_tree=null;

		try {


			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_nameExpr_in_expr161);
			nameExpr1=nameExpr();
			state._fsp--;

			root_0 = (CommonTree)adaptor.becomeRoot(nameExpr1.getTree(), root_0);
			pushFollow(FOLLOW_varList_in_expr164);
			varList2=varList();
			state._fsp--;

			adaptor.addChild(root_0, varList2.getTree());

			char_literal3=(Token)match(input,24,FOLLOW_24_in_expr166);
			pushFollow(FOLLOW_pruExpr_in_expr169);
			pruExpr4=pruExpr();
			state._fsp--;

			adaptor.addChild(root_0, pruExpr4.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class pruExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.pruExpr_return pruExpr() throws Exception  {
		ORCParser.pruExpr_return retval = new ORCParser.pruExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal6=null;
		Token char_literal8=null;
		Token SEL9=null;
		ParserRuleReturnScope othExpr5 =null;
		ParserRuleReturnScope nameVar7 =null;
		ParserRuleReturnScope pruExpr10 =null;

		CommonTree char_literal6_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree SEL9_tree=null;

		try {


			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_othExpr_in_pruExpr179);
			othExpr5=othExpr();
			state._fsp--;

			adaptor.addChild(root_0, othExpr5.getTree());


			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==22) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :

					{
					char_literal6=(Token)match(input,22,FOLLOW_22_in_pruExpr182);
					char_literal6_tree = (CommonTree)adaptor.create(char_literal6);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal6_tree, root_0);


					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==LNAME) ) {
						alt1=1;
					}
					else if ( (LA1_0==SEL) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :

							{
							pushFollow(FOLLOW_nameVar_in_pruExpr186);
							nameVar7=nameVar();
							state._fsp--;

							adaptor.addChild(root_0, nameVar7.getTree());

							char_literal8=(Token)match(input,22,FOLLOW_22_in_pruExpr188);
							}
							break;
						case 2 :

							{
							SEL9=(Token)match(input,SEL,FOLLOW_SEL_in_pruExpr193);
							SEL9_tree = (CommonTree)adaptor.create(SEL9);
							adaptor.addChild(root_0, SEL9_tree);

							}
							break;

					}

					pushFollow(FOLLOW_pruExpr_in_pruExpr196);
					pruExpr10=pruExpr();
					state._fsp--;

					adaptor.addChild(root_0, pruExpr10.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class othExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.othExpr_return othExpr() throws Exception  {
		ORCParser.othExpr_return retval = new ORCParser.othExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OTHER12=null;
		ParserRuleReturnScope parExpr11 =null;
		ParserRuleReturnScope othExpr13 =null;

		CommonTree OTHER12_tree=null;

		try {


			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_parExpr_in_othExpr214);
			parExpr11=parExpr();
			state._fsp--;

			adaptor.addChild(root_0, parExpr11.getTree());


			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==OTHER) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :

					{
					OTHER12=(Token)match(input,OTHER,FOLLOW_OTHER_in_othExpr217);
					OTHER12_tree = (CommonTree)adaptor.create(OTHER12);
					root_0 = (CommonTree)adaptor.becomeRoot(OTHER12_tree, root_0);

					pushFollow(FOLLOW_othExpr_in_othExpr220);
					othExpr13=othExpr();
					state._fsp--;

					adaptor.addChild(root_0, othExpr13.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class parExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.parExpr_return parExpr() throws Exception  {
		ORCParser.parExpr_return retval = new ORCParser.parExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PAR14=null;
		Token PAR18=null;
		ParserRuleReturnScope num15 =null;
		ParserRuleReturnScope seqExpr16 =null;
		ParserRuleReturnScope seqExpr17 =null;
		ParserRuleReturnScope parExpr19 =null;

		CommonTree PAR14_tree=null;
		CommonTree PAR18_tree=null;

		try {

			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==PAR) ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= IF && LA5_0 <= LET)||LA5_0==LP||LA5_0==UNAME) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :

					{
					root_0 = (CommonTree)adaptor.nil();


					PAR14=(Token)match(input,PAR,FOLLOW_PAR_in_parExpr239);
					PAR14_tree = (CommonTree)adaptor.create(PAR14);
					root_0 = (CommonTree)adaptor.becomeRoot(PAR14_tree, root_0);

					pushFollow(FOLLOW_num_in_parExpr242);
					num15=num();
					state._fsp--;

					adaptor.addChild(root_0, num15.getTree());

					pushFollow(FOLLOW_seqExpr_in_parExpr244);
					seqExpr16=seqExpr();
					state._fsp--;

					adaptor.addChild(root_0, seqExpr16.getTree());

					}
					break;
				case 2 :

					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_seqExpr_in_parExpr252);
					seqExpr17=seqExpr();
					state._fsp--;

					adaptor.addChild(root_0, seqExpr17.getTree());


					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==PAR) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :

							{
							PAR18=(Token)match(input,PAR,FOLLOW_PAR_in_parExpr255);
							PAR18_tree = (CommonTree)adaptor.create(PAR18);
							root_0 = (CommonTree)adaptor.becomeRoot(PAR18_tree, root_0);

							pushFollow(FOLLOW_parExpr_in_parExpr258);
							parExpr19=parExpr();
							state._fsp--;

							adaptor.addChild(root_0, parExpr19.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class seqExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.seqExpr_return seqExpr() throws Exception  {
		ORCParser.seqExpr_return retval = new ORCParser.seqExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal21=null;
		Token char_literal23=null;
		ParserRuleReturnScope atom20 =null;
		ParserRuleReturnScope nameVar22 =null;
		ParserRuleReturnScope seqExpr24 =null;

		CommonTree char_literal21_tree=null;
		CommonTree char_literal23_tree=null;

		try {


			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atom_in_seqExpr279);
			atom20=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom20.getTree());


			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==25) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :

					{
					char_literal21=(Token)match(input,25,FOLLOW_25_in_seqExpr282);
					char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal21_tree, root_0);


					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==LNAME) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :

							{
							pushFollow(FOLLOW_nameVar_in_seqExpr285);
							nameVar22=nameVar();
							state._fsp--;

							adaptor.addChild(root_0, nameVar22.getTree());

							}
							break;

					}

					char_literal23=(Token)match(input,25,FOLLOW_25_in_seqExpr288);
					pushFollow(FOLLOW_seqExpr_in_seqExpr291);
					seqExpr24=seqExpr();
					state._fsp--;

					adaptor.addChild(root_0, seqExpr24.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.atom_return atom() throws Exception  {
		ORCParser.atom_return retval = new ORCParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IF25=null;
		Token LP26=null;
		Token RP28=null;
		Token LET29=null;
		Token LP33=null;
		Token RP35=null;
		ParserRuleReturnScope evalExpr27 =null;
		ParserRuleReturnScope varList30 =null;
		ParserRuleReturnScope nameSite31 =null;
		ParserRuleReturnScope varList32 =null;
		ParserRuleReturnScope pruExpr34 =null;

		CommonTree IF25_tree=null;
		CommonTree LP26_tree=null;
		CommonTree RP28_tree=null;
		CommonTree LET29_tree=null;
		CommonTree LP33_tree=null;
		CommonTree RP35_tree=null;

		try {

			int alt8=4;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt8=1;
				}
				break;
			case LET:
				{
				alt8=2;
				}
				break;
			case UNAME:
				{
				alt8=3;
				}
				break;
			case LP:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :

					{
					root_0 = (CommonTree)adaptor.nil();


					IF25=(Token)match(input,IF,FOLLOW_IF_in_atom308);
					IF25_tree = (CommonTree)adaptor.create(IF25);
					root_0 = (CommonTree)adaptor.becomeRoot(IF25_tree, root_0);

					LP26=(Token)match(input,LP,FOLLOW_LP_in_atom311);
					pushFollow(FOLLOW_evalExpr_in_atom314);
					evalExpr27=evalExpr();
					state._fsp--;

					adaptor.addChild(root_0, evalExpr27.getTree());

					RP28=(Token)match(input,RP,FOLLOW_RP_in_atom316);
					}
					break;
				case 2 :

					{
					root_0 = (CommonTree)adaptor.nil();


					LET29=(Token)match(input,LET,FOLLOW_LET_in_atom325);
					LET29_tree = (CommonTree)adaptor.create(LET29);
					root_0 = (CommonTree)adaptor.becomeRoot(LET29_tree, root_0);

					pushFollow(FOLLOW_varList_in_atom328);
					varList30=varList();
					state._fsp--;

					adaptor.addChild(root_0, varList30.getTree());

					}
					break;
				case 3 :

					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nameSite_in_atom336);
					nameSite31=nameSite();
					state._fsp--;

					root_0 = (CommonTree)adaptor.becomeRoot(nameSite31.getTree(), root_0);
					pushFollow(FOLLOW_varList_in_atom339);
					varList32=varList();
					state._fsp--;

					adaptor.addChild(root_0, varList32.getTree());

					}
					break;
				case 4 :

					{
					root_0 = (CommonTree)adaptor.nil();


					LP33=(Token)match(input,LP,FOLLOW_LP_in_atom347);
					pushFollow(FOLLOW_pruExpr_in_atom350);
					pruExpr34=pruExpr();
					state._fsp--;

					adaptor.addChild(root_0, pruExpr34.getTree());

					RP35=(Token)match(input,RP,FOLLOW_RP_in_atom352);
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class evalExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.evalExpr_return evalExpr() throws Exception  {
		ORCParser.evalExpr_return retval = new ORCParser.evalExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set38=null;
		ParserRuleReturnScope nameVar36 =null;
		ParserRuleReturnScope value37 =null;
		ParserRuleReturnScope nameVar39 =null;
		ParserRuleReturnScope value40 =null;

		CommonTree set38_tree=null;

		try {

			{
			root_0 = (CommonTree)adaptor.nil();



			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==LNAME) ) {
				alt9=1;
			}
			else if ( (LA9_0==FALSE||LA9_0==TRUE) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :

					{
					pushFollow(FOLLOW_nameVar_in_evalExpr364);
					nameVar36=nameVar();
					state._fsp--;

					adaptor.addChild(root_0, nameVar36.getTree());

					}
					break;
				case 2 :

					{
					pushFollow(FOLLOW_value_in_evalExpr368);
					value37=value();
					state._fsp--;

					adaptor.addChild(root_0, value37.getTree());

					}
					break;

			}


			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==20||(LA11_0 >= 22 && LA11_0 <= 26)) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :

					{
					set38=input.LT(1);
					set38=input.LT(1);
					if ( input.LA(1)==20||(input.LA(1) >= 22 && input.LA(1) <= 26) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set38), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==LNAME) ) {
						alt10=1;
					}
					else if ( (LA10_0==FALSE||LA10_0==TRUE) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :

							{
							pushFollow(FOLLOW_nameVar_in_evalExpr407);
							nameVar39=nameVar();
							state._fsp--;

							adaptor.addChild(root_0, nameVar39.getTree());

							}
							break;
						case 2 :

							{
							pushFollow(FOLLOW_value_in_evalExpr411);
							value40=value();
							state._fsp--;

							adaptor.addChild(root_0, value40.getTree());

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class value_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.value_return value() throws Exception  {
		ORCParser.value_return retval = new ORCParser.value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set41=null;

		CommonTree set41_tree=null;

		try {


			{
			root_0 = (CommonTree)adaptor.nil();


			set41=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set41));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class varList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.varList_return varList() throws Exception  {
		ORCParser.varList_return retval = new ORCParser.varList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LP42=null;
		Token char_literal44=null;
		Token RP46=null;
		ParserRuleReturnScope nameVar43 =null;
		ParserRuleReturnScope nameVar45 =null;

		CommonTree LP42_tree=null;
		CommonTree char_literal44_tree=null;
		CommonTree RP46_tree=null;

		try {

			{
			root_0 = (CommonTree)adaptor.nil();


			LP42=(Token)match(input,LP,FOLLOW_LP_in_varList436);
			LP42_tree = (CommonTree)adaptor.create(LP42);
			root_0 = (CommonTree)adaptor.becomeRoot(LP42_tree, root_0);


			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==LNAME) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :

					{
					pushFollow(FOLLOW_nameVar_in_varList440);
					nameVar43=nameVar();
					state._fsp--;

					adaptor.addChild(root_0, nameVar43.getTree());


					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==21) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :

							{
							char_literal44=(Token)match(input,21,FOLLOW_21_in_varList443);
							pushFollow(FOLLOW_nameVar_in_varList446);
							nameVar45=nameVar();
							state._fsp--;

							adaptor.addChild(root_0, nameVar45.getTree());

							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			RP46=(Token)match(input,RP,FOLLOW_RP_in_varList452);
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class nameExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.nameExpr_return nameExpr() throws Exception  {
		ORCParser.nameExpr_return retval = new ORCParser.nameExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAME47=null;

		CommonTree UNAME47_tree=null;

		try {


			{
			root_0 = (CommonTree)adaptor.nil();


			UNAME47=(Token)match(input,UNAME,FOLLOW_UNAME_in_nameExpr461);
			UNAME47_tree = (CommonTree)adaptor.create(UNAME47);
			adaptor.addChild(root_0, UNAME47_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class nameSite_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.nameSite_return nameSite() throws Exception  {
		ORCParser.nameSite_return retval = new ORCParser.nameSite_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token UNAME48=null;

		CommonTree UNAME48_tree=null;

		try {


			{
			root_0 = (CommonTree)adaptor.nil();


			UNAME48=(Token)match(input,UNAME,FOLLOW_UNAME_in_nameSite469);
			UNAME48_tree = (CommonTree)adaptor.create(UNAME48);
			adaptor.addChild(root_0, UNAME48_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class nameVar_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.nameVar_return nameVar() throws Exception  {
		ORCParser.nameVar_return retval = new ORCParser.nameVar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LNAME49=null;

		CommonTree LNAME49_tree=null;

		try {


			{
			root_0 = (CommonTree)adaptor.nil();


			LNAME49=(Token)match(input,LNAME,FOLLOW_LNAME_in_nameVar478);
			LNAME49_tree = (CommonTree)adaptor.create(LNAME49);
			adaptor.addChild(root_0, LNAME49_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}



	public static class num_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};




	public final ORCParser.num_return num() throws Exception  {
		ORCParser.num_return retval = new ORCParser.num_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NUM50=null;

		CommonTree NUM50_tree=null;

		try {


			{
			root_0 = (CommonTree)adaptor.nil();



			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==NUM) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :

					{
					NUM50=(Token)match(input,NUM,FOLLOW_NUM_in_num487);
					NUM50_tree = (CommonTree)adaptor.create(NUM50);
					adaptor.addChild(root_0, NUM50_tree);

					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {

		}
		return retval;
	}






	public static final BitSet FOLLOW_nameExpr_in_expr161 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_varList_in_expr164 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_expr166 = new BitSet(new long[]{0x00000000000224C0L});
	public static final BitSet FOLLOW_pruExpr_in_expr169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_othExpr_in_pruExpr179 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_pruExpr182 = new BitSet(new long[]{0x0000000000008100L});
	public static final BitSet FOLLOW_nameVar_in_pruExpr186 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_pruExpr188 = new BitSet(new long[]{0x00000000000224C0L});
	public static final BitSet FOLLOW_SEL_in_pruExpr193 = new BitSet(new long[]{0x00000000000224C0L});
	public static final BitSet FOLLOW_pruExpr_in_pruExpr196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parExpr_in_othExpr214 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_OTHER_in_othExpr217 = new BitSet(new long[]{0x00000000000224C0L});
	public static final BitSet FOLLOW_othExpr_in_othExpr220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAR_in_parExpr239 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_num_in_parExpr242 = new BitSet(new long[]{0x00000000000204C0L});
	public static final BitSet FOLLOW_seqExpr_in_parExpr244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_seqExpr_in_parExpr252 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_PAR_in_parExpr255 = new BitSet(new long[]{0x00000000000224C0L});
	public static final BitSet FOLLOW_parExpr_in_parExpr258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_seqExpr279 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_seqExpr282 = new BitSet(new long[]{0x0000000002000100L});
	public static final BitSet FOLLOW_nameVar_in_seqExpr285 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_seqExpr288 = new BitSet(new long[]{0x00000000000204C0L});
	public static final BitSet FOLLOW_seqExpr_in_seqExpr291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_atom308 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_LP_in_atom311 = new BitSet(new long[]{0x0000000000010120L});
	public static final BitSet FOLLOW_evalExpr_in_atom314 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_RP_in_atom316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_atom325 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_varList_in_atom328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameSite_in_atom336 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_varList_in_atom339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_atom347 = new BitSet(new long[]{0x00000000000224C0L});
	public static final BitSet FOLLOW_pruExpr_in_atom350 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_RP_in_atom352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameVar_in_evalExpr364 = new BitSet(new long[]{0x0000000007D00002L});
	public static final BitSet FOLLOW_value_in_evalExpr368 = new BitSet(new long[]{0x0000000007D00002L});
	public static final BitSet FOLLOW_set_in_evalExpr372 = new BitSet(new long[]{0x0000000000010120L});
	public static final BitSet FOLLOW_nameVar_in_evalExpr407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_evalExpr411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_varList436 = new BitSet(new long[]{0x0000000000004100L});
	public static final BitSet FOLLOW_nameVar_in_varList440 = new BitSet(new long[]{0x0000000000204000L});
	public static final BitSet FOLLOW_21_in_varList443 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_nameVar_in_varList446 = new BitSet(new long[]{0x0000000000204000L});
	public static final BitSet FOLLOW_RP_in_varList452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAME_in_nameExpr461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNAME_in_nameSite469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LNAME_in_nameVar478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_num487 = new BitSet(new long[]{0x0000000000000802L});
}
