package study.baseball.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import study.baseball.ThreeRandomNumberGenerator;

class ThreeRandomNumberGeneratorTest {

    private final ThreeRandomNumberGenerator generator = new ThreeRandomNumberGenerator();
    @Test
    void generate() {
        System.out.println(        generator.generate(3, 1, 9));

    }
}