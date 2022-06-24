package study.baseball;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String takeInput() {
        System.out.println("Input a number: ");
        return scanner.nextLine();
    }

    public boolean finishProgramInput() {
        return scanner.nextLine().equals("2");
    }
}
