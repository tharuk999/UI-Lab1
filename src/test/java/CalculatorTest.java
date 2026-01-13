import java.util.Scanner;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeEach
    public void setup(){
        Scanner scanner = new Scanner(System.in);

    }

    @ParameterizedTest
    @ValueSource(strings = {"", "123456", "hello world"})
    public void NonValidStringTest(String candidate){

    }


    @Test
    public void validTest() {
        assertEquals(1, 1);
    }


}
