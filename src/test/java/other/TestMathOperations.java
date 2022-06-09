package other;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperations {

    @Test
    public void checkSum() {
        Assert.assertEquals(sum(3, 5), 8);
    }

    @Test
    public void checkMultiply() {
        Assert.assertEquals(multiply(3, 5), 15);
    }

    // методи, які тестуються
    public int sum(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }
}