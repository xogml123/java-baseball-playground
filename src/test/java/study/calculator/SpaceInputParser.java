package study.calculator;

import java.util.Arrays;
import java.util.Set;

public class SpaceInputParser implements InputParser {

    private static final String seperator = " ";
    private static final Set<String> operators = Set.of("+", "-", "*", "/");

    @Override
    public String[] parseOperation(String input) {
        String[] split = input.split(seperator);
        String[] strings = Arrays.stream(split)
            .filter(s -> operators.contains(s))
            .toArray(String[]::new);
        return strings;
    }

    @Override
    public Integer[] parseInt(String input) {
        String[] split = input.split(seperator);
        Integer[] strings = Arrays.stream(split)
            .filter(s -> !operators.contains(s))
            .map(Integer::parseInt)
            .toArray(Integer[]::new);
        return strings;
    }
}

