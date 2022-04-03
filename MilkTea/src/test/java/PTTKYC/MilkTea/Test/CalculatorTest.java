package PTTKYC.MilkTea.Test;

import PTTKYC.MilkTea.Entity.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    private int TESTING_NUMBER_1 = 1;
    private int TESTING_NUMBER_2 = 2;

    @Test
    public void TestAdd(){
        Assertions.assertEquals(TESTING_NUMBER_1 + TESTING_NUMBER_2, calculator.add(TESTING_NUMBER_1, TESTING_NUMBER_2));
    }

    @Test
    public void TestMultiply(){
        Assertions.assertEquals(TESTING_NUMBER_1 * TESTING_NUMBER_2, calculator.multiply(TESTING_NUMBER_1,TESTING_NUMBER_2));
    }
}
