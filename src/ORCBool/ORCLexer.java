
package ORCBool;

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class ORCLexer extends Lexer {

    public static final int EOF = -1;
    public static final int T__20 = 20;
    public static final int T__21 = 21;
    public static final int T__22 = 22;
    public static final int T__23 = 23;
    public static final int T__24 = 24;
    public static final int T__25 = 25;
    public static final int T__26 = 26;
    public static final int DIGIT = 4;
    public static final int FALSE = 5;
    public static final int IF = 6;
    public static final int LET = 7;
    public static final int LNAME = 8;
    public static final int LOWER = 9;
    public static final int LP = 10;
    public static final int NUM = 11;
    public static final int OTHER = 12;
    public static final int PAR = 13;
    public static final int RP = 14;
    public static final int SEL = 15;
    public static final int TRUE = 16;
    public static final int UNAME = 17;
    public static final int UPPER = 18;
    public static final int WS = 19;

    
    
    public Lexer[] getDelegates() {
        return new Lexer[]{};
    }

    public ORCLexer() {
    }

    public ORCLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public ORCLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public String getGrammarFileName() {
        return "C:\\Users\\nyanco\\Documents\\NetBeansProjects\\ProbOrc\\src\\ORC.g";
    }

    
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match("false");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match("If");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match('1');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
             
        }
    }
    

    
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match('(');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mOTHER() throws RecognitionException {
        try {
            int _type = OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
                match(';');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mPAR() throws RecognitionException {
        try {
            int _type = PAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match('|');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match(')');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mSEL() throws RecognitionException {
        try {
            int _type = SEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match('!');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match("true");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match("!=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match(',');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match('<');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match("<=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match('=');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match('>');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                match(">=");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    


    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                
                int cnt1 = 0;
                loop1:
                while (true) {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                        case 1: 
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt1 >= 1) {
                                break loop1;
                            }
                            EarlyExitException eee = new EarlyExitException(1, input);
                            throw eee;
                    }
                    cnt1++;
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mUNAME() throws RecognitionException {
        try {
            int _type = UNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                mUPPER();

                
                loop2:
                while (true) {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if (((LA2_0 >= '0' && LA2_0 <= '9') || (LA2_0 >= 'A' && LA2_0 <= 'Z') || (LA2_0 >= 'a' && LA2_0 <= 'z'))) {
                        alt2 = 1;
                    }

                    switch (alt2) {
                        case 1: 
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            break loop2;
                    }
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mLNAME() throws RecognitionException {
        try {
            int _type = LNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                mLOWER();

                
                loop3:
                while (true) {
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);
                    if (((LA3_0 >= '0' && LA3_0 <= '9') || (LA3_0 >= 'A' && LA3_0 <= 'Z') || (LA3_0 >= 'a' && LA3_0 <= 'z'))) {
                        alt3 = 1;
                    }

                    switch (alt3) {
                        case 1: 
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            break loop3;
                    }
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    
    public final void mDIGIT() throws RecognitionException {
        try {
            
            
            {
                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            
        }
    }
    

    
    public final void mLOWER() throws RecognitionException {
        try {
            
            
            {
                if ((input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            
        }
    }
    

    
    public final void mUPPER() throws RecognitionException {
        try {
            
            
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            
        }
    }
    

    
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            
            
            {
                if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
                _channel = HIDDEN;
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            
        }
    }
    

    @Override
    public void mTokens() throws RecognitionException {
        
        int alt4 = 20;
        switch (input.LA(1)) {
            case 'f': {
                int LA4_1 = input.LA(2);
                if ((LA4_1 == 'a')) {
                    int LA4_18 = input.LA(3);
                    if ((LA4_18 == 'l')) {
                        int LA4_28 = input.LA(4);
                        if ((LA4_28 == 's')) {
                            int LA4_31 = input.LA(5);
                            if ((LA4_31 == 'e')) {
                                int LA4_33 = input.LA(6);
                                if (((LA4_33 >= '0' && LA4_33 <= '9') || (LA4_33 >= 'A' && LA4_33 <= 'Z') || (LA4_33 >= 'a' && LA4_33 <= 'z'))) {
                                    alt4 = 19;
                                } else {
                                    alt4 = 1;
                                }

                            } else {
                                alt4 = 19;
                            }

                        } else {
                            alt4 = 19;
                        }

                    } else {
                        alt4 = 19;
                    }

                } else {
                    alt4 = 19;
                }

            }
            break;
            case 'I': {
                int LA4_2 = input.LA(2);
                if ((LA4_2 == 'f')) {
                    int LA4_19 = input.LA(3);
                    if (((LA4_19 >= '0' && LA4_19 <= '9') || (LA4_19 >= 'A' && LA4_19 <= 'Z') || (LA4_19 >= 'a' && LA4_19 <= 'z'))) {
                        alt4 = 18;
                    } else {
                        alt4 = 2;
                    }

                } else {
                    alt4 = 18;
                }

            }
            break;
            case '1': {
                int LA4_3 = input.LA(2);
                if (((LA4_3 >= '0' && LA4_3 <= '9'))) {
                    alt4 = 17;
                } else {
                    alt4 = 3;
                }

            }
            break;
            case '(': {
                alt4 = 4;
            }
            break;
            case ';': {
                alt4 = 5;
            }
            break;
            case '|': {
                alt4 = 6;
            }
            break;
            case ')': {
                alt4 = 7;
            }
            break;
            case '!': {
                int LA4_8 = input.LA(2);
                if ((LA4_8 == '=')) {
                    alt4 = 10;
                } else {
                    alt4 = 8;
                }

            }
            break;
            case 't': {
                int LA4_9 = input.LA(2);
                if ((LA4_9 == 'r')) {
                    int LA4_23 = input.LA(3);
                    if ((LA4_23 == 'u')) {
                        int LA4_30 = input.LA(4);
                        if ((LA4_30 == 'e')) {
                            int LA4_32 = input.LA(5);
                            if (((LA4_32 >= '0' && LA4_32 <= '9') || (LA4_32 >= 'A' && LA4_32 <= 'Z') || (LA4_32 >= 'a' && LA4_32 <= 'z'))) {
                                alt4 = 19;
                            } else {
                                alt4 = 9;
                            }

                        } else {
                            alt4 = 19;
                        }

                    } else {
                        alt4 = 19;
                    }

                } else {
                    alt4 = 19;
                }

            }
            break;
            case ',': {
                alt4 = 11;
            }
            break;
            case '<': {
                int LA4_11 = input.LA(2);
                if ((LA4_11 == '=')) {
                    alt4 = 13;
                } else {
                    alt4 = 12;
                }

            }
            break;
            case '=': {
                alt4 = 14;
            }
            break;
            case '>': {
                int LA4_13 = input.LA(2);
                if ((LA4_13 == '=')) {
                    alt4 = 16;
                } else {
                    alt4 = 15;
                }

            }
            break;
            case '0':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9': {
                alt4 = 17;
            }
            break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z': {
                alt4 = 18;
            }
            break;
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z': {
                alt4 = 19;
            }
            break;
            case '\t':
            case '\n':
            case '\r':
            case ' ': {
                alt4 = 20;
            }
            break;
            default:
                NoViableAltException nvae =
                        new NoViableAltException("", 4, 0, input);
                throw nvae;
        }
        switch (alt4) {
            case 1: 
            {
                mFALSE();

            }
            break;
            case 2: 
            {
                mIF();

            }
            break;
            case 3: 
            {
                mLET();

            }
            break;
            case 4: 
            {
                mLP();

            }
            break;
            case 5: 
            {
                mOTHER();

            }
            break;
            case 6: 
            {
                mPAR();

            }
            break;
            case 7: 
            {
                mRP();

            }
            break;
            case 8: 
            {
                mSEL();

            }
            break;
            case 9: 
            {
                mTRUE();

            }
            break;
            case 10: 
            {
                mT__20();

            }
            break;
            case 11: 
            {
                mT__21();

            }
            break;
            case 12: 
            {
                mT__22();

            }
            break;
            case 13: 
            {
                mT__23();

            }
            break;
            case 14: 
            {
                mT__24();

            }
            break;
            case 15: 
            {
                mT__25();

            }
            break;
            case 16: 
            {
                mT__26();

            }
            break;
            case 17: 
            {
                mNUM();

            }
            break;
            case 18: 
            {
                mUNAME();

            }
            break;
            case 19: 
            {
                mLNAME();

            }
            break;
            case 20: 
            {
                mWS();

            }
            break;
        }
    }
}
