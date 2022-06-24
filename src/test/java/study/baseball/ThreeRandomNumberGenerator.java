package study.baseball;

import java.util.Random;

public class ThreeRandomNumberGenerator {

    private Random random;

    public ThreeRandomNumberGenerator() {
        this.random = new Random();
    }

    public String generate(int numLength, int offset, int range) {
        StringBuilder result = new StringBuilder(numLength);
        while(result.length() < numLength) {
            int num = random.nextInt(9) + offset;
            String numString = Integer.valueOf(num).toString();
            appendRandomNumberIfNotExistInResult(result, numString);
    }
        return result.toString();
}

    private void appendRandomNumberIfNotExistInResult(StringBuilder result, String numString) {
        if (result.indexOf(numString) == -1) {
            result.append(numString);
        } else if (result.indexOf(numString) != -1) {
            return;
        }
    }
    }
