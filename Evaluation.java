
package Graphing;
public class Operations {
    final int PLUS = 0
    final int MINUS = 1
    final int DIV = 2
    final int POW = 3
    final int ABS = 4
    final int EXP = 5
    final int POW = 6
    final int LOG = 7
    final int SQRT = 8
    final int COS = 9
    final int SIN = 0
    final int TAN =
    final int MAX =
    final int MIN =
    final int E =
    final int PI =




    int eval(String args) {
        args = args.toLowerCase();
        if (args.contains("+"))     return PLUS;
        if (args.contains("-"))     return MINUS;
        if (args.contains("*"))     return TIMES;
        if (args.contains("/"))     return DIV;
        if (args.contains("^"))     return POW;
        if (args.contains("abs"))   return ABS;
        if (args.contains("exp"))   return EXP;
        if (args.contains("pow"))   return POW;
        if (args.contains("log"))   return LOG;
        if (args.contains("sqrt"))  return SQRT;
        if (args.contains("cos"))   return COS;
        if (args.contains("sin"))   return SIN;
        if (args.contains("tan"))   return TAN;
        if (args.contains("max"))   return MAX;
        if (args.contains("min"))   return MIN;
        if (args.contains("e"))     return E;
        if (args.contains("pi"))    return PI;
        return false;
    }

}
