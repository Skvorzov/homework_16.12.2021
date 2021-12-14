package com.skvortsov;

import java.util.ArrayList;

public class NumberUtils {
    public int getSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public ArrayList<Integer> multiplyOddNumber(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                result.add(numbers.get(i) * 2);
            }
        }
        return result;
    }
}