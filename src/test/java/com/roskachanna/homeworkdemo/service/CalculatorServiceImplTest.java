package com.roskachanna.homeworkdemo.service;

import com.roskachanna.homeworkdemo.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {

    public  final CalculatorService calculatorService = new CalculatorServiceImpl();
    @Test
    public void plus(){
         Integer num1 = 10;
         Integer num2 = 20;
         Integer expectedResult = num1 + num2;

        Assertions.assertEquals(expectedResult, calculatorService.plus(num1, num2));
    }
    @Test
    public void minus(){
        Integer num1 = 20;
        Integer num2 = 10;
        Integer expectedResult = num1 - num2;

        Assertions.assertEquals(expectedResult, calculatorService.minus(num1, num2));
    }
    @Test
    public void multiply(){
        Integer num1 = 20;
        Integer num2 = 10;
        Integer expectedResult = num1 * num2;

        Assertions.assertEquals(expectedResult, calculatorService.multiply(num1, num2));
    }
    @Test
    public void divide(){
        Integer num1 = 20;
        Integer num2 = 10;
        Integer expectedResult = num1 / num2;

        Assertions.assertEquals(expectedResult, calculatorService.divide(num1, num2));
    }
    @Test
    public void shouldTrowExceptionWhenSecondArgumentIsZero() {
        Integer num1 = 10;
        Integer num2 = 0;

        Assertions.assertThrows(IllegalArgumentException.class,()-> calculatorService.divide(num1, num2));
    }
}
