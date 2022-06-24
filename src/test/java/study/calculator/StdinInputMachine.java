package study.calculator;

import java.util.Scanner;

public class StdinInputMachine implements InputMachine {

    public final Scanner scanner;

    public StdinInputMachine() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getOneLineInput() {
        return scanner.nextLine();
    }
}

