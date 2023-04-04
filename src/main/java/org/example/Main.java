package org.example;
import lesson1.Calculator;
import lesson1.PrimeNumber;
import lesson1.ProductNumber;
import lesson1.TriangularNumber;
import lesson2.BubbleSort;
import lesson2.StringParse;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TriangularNumber.getTriangularNumber();
        ProductNumber.getProductNumber();
        PrimeNumber.getPrimeNumber();
        Calculator.calculator();
        StringParse.parse();
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        BubbleSort.print(BubbleSort.bubbleSorting(sortArr));
    }
}
