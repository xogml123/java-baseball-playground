package study.baseball;

public class OutputView {
    public void printStrikeBall(int ballCount, int strikeCount) {
        if (ballCount == 0 && strikeCount == 0) {
            System.out.println("Nothing");
        } else if (ballCount != 0 || strikeCount != 0) {
            System.out.println(ballCount + " ball, " + strikeCount + " strike");
        }
    }

    public void printAllCorrect(boolean correctAnswer) {
        if (correctAnswer) {
            System.out.println("Correct!, Game Over");
            System.out.println("1 new, 2 exit");
        }
    }

}
