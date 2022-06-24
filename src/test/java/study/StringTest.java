package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    public void split() throws Exception{
    //given
        String[] split1 = "1,2".split(",");
        String[] split2 = "1".split(",");
        //when

    //then
        assertThat(split1).containsExactly("1", "2");
        assertThat(split2).contains("1");
    }

    @Test
    public void subString() throws Exception{
    //given
        String str = "(1,2)";
    //when
        String result = str.substring(1, str.length() - 1);
        //then
        assertThat(result).isEqualTo("1,2");
    }

    @DisplayName("chatAt메소드가 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는지 테스트")
    @Test
    public void charAt() throws Exception{
    //given
        String target = "abc";
        //when

    //then
        assertThatThrownBy(() ->
            target.charAt(target.length())).isInstanceOf(
            StringIndexOutOfBoundsException.class);
        assertThatThrownBy(() ->
            target.charAt(-1)).isInstanceOf(
            StringIndexOutOfBoundsException.class);
    }

}
