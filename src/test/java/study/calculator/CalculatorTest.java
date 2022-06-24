package study.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {


    @ParameterizedTest
    @CsvSource(value = {
        "2 + 3 / 4 * 2, 2",
        "-5 + -5 * 6, 0",
    })
    public void success(String input, int result) throws Exception{
    //given

    //when

    //then
    }

}
