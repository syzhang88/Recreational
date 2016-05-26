import java.util.LinkedList;

public class Calculator {
    static int xInit = -100;
    static int xEnd = 100;
    static int xIncr = 1;

    static double function(int x) {
        return Math.sin(x);
    }

    public static void main(String[] args) {
        String input = "";
        for (String letter: args) {
            input += letter;
            System.out.println(letter);
            //1. eval args (function)
            //2. somehow add to function() method
        }

        LinkedList<Double> yValues = new LinkedList<>();
        for (int i = xInit; i < xEnd; i += xIncr) {
            yValues.add(function(i));
        }
            // 3. draw out stuff
        System.out.println(input);
        System.out.println(input.toLowerCase().contains("sin(".toLowerCase()));
        System.out.println(yValues);

        //5. Make GUI as well
    }

}
