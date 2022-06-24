package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    public void SetUp() {
        numbers = Set.of(1, 2, 3, 4, 5);
    }

    @Test
    public void contains() throws Exception{
    //given
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();

        //when

    //then
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 6})
    public void parametrizedTest(int number) throws Exception{
    //given

    //when
        assertThat(numbers.contains(number)).isTrue();
    //then
    }

    @ParameterizedTest
    @CsvSource(value = {
        "1:true",
        "6:false"
    }, delimiter = ':')
    public void parametrizedTestWithDiverseValue(int number, boolean result) throws Exception{
    //given

    //when
        assertThat(numbers.contains(number)).isEqualTo(result);

        //then
    }


}
