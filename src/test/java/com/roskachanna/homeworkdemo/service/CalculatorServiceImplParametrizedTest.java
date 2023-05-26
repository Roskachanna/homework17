package com.roskachanna.homeworkdemo.service;

import com.roskachanna.homeworkdemo.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParametrizedTest {

    public  final CalculatorService calculatorService = new CalculatorServiceImpl();
    public static Stream<Arguments> argumentsSourceForSumTest(){
        return Stream.of(
                Arguments.of (1, 1, 2),
                Arguments.of (-1, 1, 0),
                Arguments.of (0, 0, 0)
        );

    }
    public static Stream<Arguments> argumentsSourceForMultiplyTest(){
        return Stream.of(
                Arguments.of (0, 0, 0),
                Arguments.of (-1, 0, 0),
                Arguments.of (-5, 5, -25 )
        );

    }
    @ParameterizedTest
    @MethodSource("argumentsSourceForSumTest")
    public void plus(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("argumentsSourceForMultiplyTest")
    public void multiply(Integer num1, Integer num2, Integer expectedResult) {
        Assertions.assertEquals(expectedResult, calculatorService.multiply(num1, num2));
    }
}
