/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.jonahhenriksson.ron.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.jonahhenriksson.ron.language.psi.RONTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>__RONLexer.flex</tt>
 */
public class __RONLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int IN_RAW_STRING = 2;
  public static final int IN_RAW_STRING_SUFFIX = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\1\1\2\22\0\1\32\1\31\1\34\1\35\3\31\1\30\1\40\1\41\1\31\1"+
    "\16\1\46\1\16\1\26\1\4\1\17\11\21\1\45\6\31\4\22\1\27\1\22\14\15\1\47\7\15"+
    "\1\36\1\33\1\42\1\31\1\23\1\31\1\12\1\25\2\22\1\10\1\11\5\15\1\13\1\50\1\37"+
    "\1\24\2\15\1\6\1\14\1\5\1\7\2\15\1\20\2\15\1\43\1\31\1\44\1\31\6\0\1\1\32"+
    "\0\1\3\337\0\1\3\177\0\13\3\35\0\2\1\5\0\1\3\57\0\1\3\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\1\4\3\1\1\2\4\1\1"+
    "\1\5\3\1\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\3\1\16\1\17\1\20\1\21\1\3"+
    "\1\22\1\0\1\3\1\0\1\4\1\0\1\23\1\5"+
    "\3\0\1\24\3\0\3\3\1\4\1\0\1\24\1\0"+
    "\1\3\1\25\1\23\1\0\1\26\10\0\1\27\4\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[72];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e\0\u0267"+
    "\0\u0290\0\u02b9\0\173\0\173\0\173\0\173\0\173\0\173"+
    "\0\173\0\173\0\u02e2\0\173\0\u030b\0\173\0\u0334\0\u035d"+
    "\0\173\0\u0386\0\u03af\0\u03d8\0\u0401\0\u042a\0\u0453\0\173"+
    "\0\u047c\0\u0290\0\u04a5\0\173\0\u04ce\0\u04f7\0\u0520\0\u0549"+
    "\0\u0572\0\u059b\0\u05c4\0\u05ed\0\u0290\0\u0616\0\u063f\0\u0148"+
    "\0\u05ed\0\u0668\0\u0148\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735"+
    "\0\u075e\0\u0787\0\u07b0\0\u04ce\0\u07d9\0\u0802\0\u082b\0\u0854";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[72];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\3\5\1\6\1\7\1\10\2\11\1\12\4\11"+
    "\1\13\1\14\1\11\1\15\4\11\1\16\1\11\1\17"+
    "\1\4\1\5\1\20\1\21\1\22\1\23\1\11\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\11"+
    "\34\34\1\35\14\34\51\36\52\0\3\5\26\0\1\5"+
    "\22\0\1\37\51\0\1\11\1\40\7\11\2\0\1\11"+
    "\1\0\4\11\1\0\1\11\7\0\1\11\7\0\2\11"+
    "\5\0\11\11\2\0\1\11\1\0\4\11\1\0\1\11"+
    "\4\0\1\41\1\42\1\0\1\11\7\0\2\11\5\0"+
    "\11\11\2\0\1\11\1\0\4\11\1\0\1\11\7\0"+
    "\1\11\7\0\2\11\5\0\5\11\1\43\3\11\2\0"+
    "\1\11\1\0\4\11\1\0\1\11\7\0\1\11\7\0"+
    "\2\11\17\0\1\14\1\0\1\15\46\0\1\15\1\44"+
    "\1\15\1\0\1\45\2\46\1\47\41\0\1\15\1\0"+
    "\1\15\1\0\1\45\2\0\1\47\41\0\1\47\1\0"+
    "\1\47\33\0\24\50\1\0\2\50\1\0\15\50\33\0"+
    "\1\51\15\0\2\52\1\0\30\52\1\53\1\54\14\52"+
    "\10\55\1\56\25\55\1\57\12\55\5\0\11\11\2\0"+
    "\1\11\1\0\2\11\1\60\1\11\1\0\1\11\7\0"+
    "\1\11\7\0\2\11\35\0\1\35\13\0\1\37\2\0"+
    "\46\37\5\0\2\11\1\61\6\11\2\0\1\11\1\0"+
    "\4\11\1\0\1\11\7\0\1\11\7\0\2\11\34\0"+
    "\1\41\1\42\20\0\6\11\1\62\2\11\2\0\1\11"+
    "\1\0\4\11\1\0\1\11\7\0\1\11\7\0\2\11"+
    "\10\0\3\63\4\0\1\63\1\0\2\63\2\0\1\63"+
    "\1\0\1\63\40\0\1\45\1\0\1\45\1\0\1\45"+
    "\44\0\1\45\1\0\1\45\37\0\1\64\6\0\1\47"+
    "\1\0\1\47\5\0\1\64\51\0\1\50\20\0\2\52"+
    "\1\0\30\52\1\53\1\65\14\52\10\55\1\56\50\55"+
    "\1\56\26\55\1\66\62\55\5\0\11\11\2\0\1\11"+
    "\1\0\4\11\1\0\1\11\7\0\1\11\7\0\1\11"+
    "\1\67\5\0\3\11\1\70\5\11\2\0\1\11\1\0"+
    "\4\11\1\0\1\11\7\0\1\11\7\0\2\11\5\0"+
    "\7\11\1\61\1\11\2\0\1\11\1\0\4\11\1\0"+
    "\1\11\7\0\1\11\7\0\2\11\10\0\3\63\4\0"+
    "\1\63\1\0\3\63\1\0\1\63\1\0\1\63\40\0"+
    "\1\71\1\0\1\71\27\0\10\55\1\56\1\55\1\72"+
    "\36\55\5\0\3\11\1\73\5\11\2\0\1\11\1\0"+
    "\4\11\1\0\1\11\7\0\1\11\7\0\2\11\10\55"+
    "\1\56\14\55\1\74\33\55\1\56\2\55\1\75\45\55"+
    "\1\76\50\55\1\56\26\55\1\66\1\77\15\55\3\100"+
    "\1\101\5\100\2\55\1\100\1\55\4\100\1\55\1\100"+
    "\7\55\1\100\7\55\2\100\5\55\3\100\1\101\5\100"+
    "\2\55\1\100\1\55\4\100\1\55\1\100\7\55\1\100"+
    "\1\55\1\102\5\55\2\100\5\55\3\100\1\101\5\100"+
    "\2\55\1\100\1\55\4\100\1\55\1\100\7\55\1\103"+
    "\1\55\1\102\5\55\2\100\10\55\1\56\31\55\1\104"+
    "\13\55\3\100\1\101\1\100\1\105\3\100\2\55\1\100"+
    "\1\55\4\100\1\55\1\100\7\55\1\100\1\55\1\102"+
    "\5\55\2\100\5\55\3\100\1\101\5\100\2\55\1\100"+
    "\1\55\3\100\1\106\1\55\1\100\7\55\1\100\1\55"+
    "\1\102\5\55\2\100\5\55\3\100\1\101\2\100\1\107"+
    "\2\100\2\55\1\100\1\55\4\100\1\55\1\100\7\55"+
    "\1\100\1\55\1\102\5\55\2\100\5\55\3\100\1\110"+
    "\5\100\2\55\1\100\1\55\4\100\1\55\1\100\7\55"+
    "\1\100\1\55\1\102\5\55\2\100\5\55\3\100\1\101"+
    "\5\100\2\55\1\100\1\55\4\100\1\55\1\100\7\55"+
    "\1\103\1\77\1\102\5\55\2\100";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2173];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\16\1\10\11\1\1\1\11\1\1\1\11"+
    "\2\1\1\11\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\11\3\0\1\11\3\0\4\1\1\0\1\1\1\0"+
    "\3\1\1\0\1\1\10\0\1\1\4\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[72];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public __RONLexer() {
    this((java.io.Reader)null);
  }
  private int zzShaStride = -1;

  private int zzPostponedMarkedPos = -1;
  IElementType imbueRawLiteral() {
    yybegin(YYINITIAL);

    zzStartRead = zzPostponedMarkedPos;
    zzShaStride = -1;
    zzPostponedMarkedPos = -1;

    return RAW_STRING;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public __RONLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        switch (zzLexicalState) {
            case IN_RAW_STRING: {
              return imbueRawLiteral();
            }  // fall though
            case 73: break;
            case IN_RAW_STRING_SUFFIX: {
              return imbueRawLiteral();
            }  // fall though
            case 74: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 24: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 25: break;
          case 3: 
            { return IDENT;
            } 
            // fall through
          case 26: break;
          case 4: 
            { return INTEGER;
            } 
            // fall through
          case 27: break;
          case 5: 
            { return CHAR;
            } 
            // fall through
          case 28: break;
          case 6: 
            { return BRACKETL;
            } 
            // fall through
          case 29: break;
          case 7: 
            { return PARENTHESISL;
            } 
            // fall through
          case 30: break;
          case 8: 
            { return PARENTHESISR;
            } 
            // fall through
          case 31: break;
          case 9: 
            { return BRACKETR;
            } 
            // fall through
          case 32: break;
          case 10: 
            { return BRACEL;
            } 
            // fall through
          case 33: break;
          case 11: 
            { return BRACER;
            } 
            // fall through
          case 34: break;
          case 12: 
            { return COLON;
            } 
            // fall through
          case 35: break;
          case 13: 
            { return COMMA;
            } 
            // fall through
          case 36: break;
          case 14: 
            { 
            } 
            // fall through
          case 37: break;
          case 15: 
            { int shaExcess = yylength() - 1 - zzShaStride;
    if (shaExcess >= 0) {
      yybegin(IN_RAW_STRING_SUFFIX);
      yypushback(shaExcess);
    }
            } 
            // fall through
          case 38: break;
          case 16: 
            { yypushback(1); return imbueRawLiteral();
            } 
            // fall through
          case 39: break;
          case 17: 
            { return COMMENT;
            } 
            // fall through
          case 40: break;
          case 18: 
            { yybegin(IN_RAW_STRING);
                        zzPostponedMarkedPos = zzStartRead;
                        zzShaStride = yylength() - 2;
            } 
            // fall through
          case 41: break;
          case 19: 
            { return FLOAT;
            } 
            // fall through
          case 42: break;
          case 20: 
            { return STRING;
            } 
            // fall through
          case 43: break;
          case 21: 
            { return BOOLEAN;
            } 
            // fall through
          case 44: break;
          case 22: 
            { return SOME;
            } 
            // fall through
          case 45: break;
          case 23: 
            { return EXTENSION;
            } 
            // fall through
          case 46: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
