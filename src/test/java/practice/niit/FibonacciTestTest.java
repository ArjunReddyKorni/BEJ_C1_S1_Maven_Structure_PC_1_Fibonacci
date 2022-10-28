package practice.niit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.niit.fibonacci.Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTestTest {

    Fibonacci fibonacci;
    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        fibonacci = null;
    }

    @Test
    void checkFibonacci(){
        int fbSeries[] = fibonacci.fibonacci(5);
        int expected[] = {0,1,1,2,3};
        assertArrayEquals(expected,fbSeries);
    }

    @Test
    void failCheckFibonacci(){
        int fbSeries[] = fibonacci.fibonacci(5);
        int expected[] = {0,1,3,2,3};
        assertNotEquals(expected,fbSeries);
    }
}