package com.pintosoft.fibonacci;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
 
public class IterativeFibonacciTest {

    private final IterativeFibonacci iterativeFibonacci = new IterativeFibonacci();

    @DataProvider
    public Object[][] ValidNumberData() {
        return new Object[][] {
            {0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {7, 13}, {8, 21}, {9, 34}, {10, 55},
            {11, 89}, {12, 144}, {13, 233}, {14, 377}, {15, 610}, {16, 987}, {17, 1597}, {18, 2584}, {19, 4181},
            {20, 6765}, {21, 10946}, {22, 17711}, {23, 28657}, {24, 46368}, {25, 75025}, {26, 121393}, {27, 196418},
            {28, 317811}, {29, 514229}
        };
    }

    @Test(dataProvider = "ValidNumberData")
    public void givenValidNumbers_ReturnCorrectResponse(final Integer num, final Integer result) {
        assertEquals(iterativeFibonacci.fibonacci(num), result.intValue());
    }
}