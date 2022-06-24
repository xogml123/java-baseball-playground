package study.calculator;

public class Calculator {

    private InputMachine inputMachine;
    private InputParser inputParser;
    private ArithmeticUnit arithmeticUnit;

    public Calculator(InputMachine inputMachine, InputParser inputParser,
        ArithmeticUnit arithmeticUnit) {
        this.inputMachine = inputMachine;
        this.inputParser = inputParser;
        this.arithmeticUnit = arithmeticUnit;
    }

    public int use() {
        String input = inputMachine.getOneLineInput();
        Integer[] integers = inputParser.parseInt(input);
        String[] operations = inputParser.parseOperation(input);
        return arithmeticUnit.calculate(integers, operations);

    }

    public static void main(String[] args) {
        InputMachine inputMachine = new StdinInputMachine();
        InputParser inputParser = new SpaceInputParser();
        ArithmeticUnit arithmeticUnit = new ArithmeticUnit();
        Calculator calculator = new Calculator(inputMachine, inputParser, arithmeticUnit);
        while (true) {
            System.out.println(calculator.use());

        }
    }


}
