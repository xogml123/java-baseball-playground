package study.calculator;

public class ArithmeticUnit {

    public int calculate(Integer[] integers, String[] operations) {
        int result = integers[0];
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                result += integers[i + 1];
            } else if (operations[i].equals("-")) {
                result -= integers[i + 1];
            } else if (operations[i].equals("*")) {
                result *= integers[i + 1];
            } else if (operations[i].equals("/")) {
                result /= integers[i + 1];
            }
        }
        return result;
    }
}
