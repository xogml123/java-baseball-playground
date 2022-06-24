package study.baseball;

public class BaseballGame {

    private InputView inputView;
    private OutputView outputView;

    private boolean correctAnswer;
    private boolean finishOption;
    private String answer;
    private ThreeRandomNumberGenerator threeRandomNumberGenerator;

    private AppreciationStrategy appreciationStrategy;

    public BaseballGame(InputView inputView, OutputView outputView,
        ThreeRandomNumberGenerator threeRandomNumberGenerator,
        AppreciationStrategy appreciationStrategy) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.threeRandomNumberGenerator = threeRandomNumberGenerator;
        this.appreciationStrategy = appreciationStrategy;
        correctAnswer = false;
        answer = threeRandomNumberGenerator.generate(3, 1, 9);

    }

    public void start() {
        while (true) {
            String input = inputView.takeInput();
            AppreciationResultDto appreciationResultDto = new AppreciationResultDto();
            correctAnswer = appreciationStrategy.appreciate(answer, input,
                appreciationResultDto);
            outputView.printStrikeBall(appreciationResultDto.getBallCount(),
                appreciationResultDto.getStrikeCount());
            outputView.printAllCorrect(correctAnswer);
            questionUserFinish();
            finishGame(finishOption);
        }
    }

    private void questionUserFinish() {
        if (correctAnswer == true) {
            finishOption = inputView.finishProgramInput();
        }
    }

    private void finishGame(boolean finishOption) {
        if (finishOption == true) {
            System.exit(0);
        } else if (finishOption == false) {
            correctAnswer = false;
        }
    }


    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame(
            new InputView(),
            new OutputView(),
            new ThreeRandomNumberGenerator(),
            new AppreciationStrategy()
        );
        baseballGame.start();
    }

}
