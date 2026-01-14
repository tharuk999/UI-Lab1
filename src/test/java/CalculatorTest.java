import java.util.Scanner;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setup(){
        Scanner scanner = new Scanner(System.in);
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "123456", "hello world"})
    void NonValidStringTest(String candidate){

    }


    @Test
    public void validTest() {
        String[] data = {"4","2"};
//        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Calculator.main(data);
        assertEquals("Enter first number:\nEnter second number:\nSum: 6\nDifference: 2\nProduct: 8\nQuotient: 2", outContent.toString());

    }


}
