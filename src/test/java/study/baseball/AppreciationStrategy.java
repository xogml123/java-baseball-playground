package study.baseball;

public class AppreciationStrategy {

    public boolean appreciate(String answer, String target,
        AppreciationResultDto appreciationResultDto) {
        for (int targetIndex = 0; targetIndex < target.length(); targetIndex++) {
            appreciateEachTargetCharacter(appreciationResultDto, answer, target,
                target.charAt(targetIndex));
        }
        if (appreciationResultDto.getStrikeCount() == 3) {
            return true;
        }
            return false;
    }

    private void appreciateEachTargetCharacter(AppreciationResultDto appreciationResultDto, String answer,
        String target, char targetChar) {
        for (int answerIndex = 0; answerIndex < answer.length(); answerIndex++) {
            char answerChar = answer.charAt(answerIndex);
            compareOneTargetCharToAnswer(appreciationResultDto, target, targetChar, answerIndex,
                answerChar);
        }
    }

    private void compareOneTargetCharToAnswer(AppreciationResultDto appreciationResultDto,
        String target,
        char targetChar, int answerIndex, char answerChar) {
        if (answerChar == targetChar && answerIndex == target.indexOf(targetChar)) {
            appreciationResultDto.setStrikeCount(appreciationResultDto.getStrikeCount() + 1);
        } else if (answerChar == targetChar && answerIndex != target.indexOf(targetChar)) {
            appreciationResultDto.setBallCount(appreciationResultDto.getBallCount() + 1);
        }
    }
}
