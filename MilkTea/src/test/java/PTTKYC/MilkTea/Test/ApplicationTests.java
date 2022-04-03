package PTTKYC.MilkTea.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class ApplicationTests {
    private static final String  message = "Demo";

    @Test
    public void TestMessage(){
        Assertions.assertEquals(message, "Demo");
    }
}
