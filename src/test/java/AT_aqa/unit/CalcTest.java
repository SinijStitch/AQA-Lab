package AT_aqa.unit;

import day_2.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Optional;

public class CalcTest {
    @DataProvider
    public static Object[][] addingDataProvider() {
        Object[][] res = new Object[4][3];
        res [0][0] = 1.0; res [0][1] = 2.0; res [0][2] = 3.0;
        res [1][0] = 2.0; res [1][1] = 2.0; res [1][2] = 4.0;
        res [2][0] = 3.0; res [2][1] = 2.0; res [2][2] = 6.0;
        res [3][0] = -4.0; res [3][1] = 2.0; res [3][2] = -2.0;
        return res;
    }

    @Test
    void DivideTest() throws Exception {
        Assert.assertEquals(Calculator.divide(1,1),new Double(1d),
                "invalid divide");
    }
    @Test
    void MinusTest() throws Exception {
        Assert.assertEquals(Calculator.minus(1,1),new Double(0d),
                "invalid divide");
    }
    @Test
    void MultTest() throws Exception {
        Assert.assertEquals(Calculator.mult(2,2),new Double(4d),
                "invalid divide");
    }

    @Test(dataProvider = "addingDataProvider")
    void AddTest(Double a, Double b, Double expected) throws Exception {
        Assert.assertEquals(Calculator.add(a, b),expected,"invalid divide");
    }
}