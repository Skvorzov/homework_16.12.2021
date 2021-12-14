import com.skvortsov.NumberUtils;
import com.skvortsov.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestingMethods {
    @Test
    void getSumTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        NumberUtils numberUtils = new NumberUtils();
        int sum = numberUtils.getSum(arrayList);
        Assertions.assertEquals(sum, 15);
    }

    @Test
    void numberUtilsTest() {
        ArrayList<Integer> actualFinalList = new ArrayList<Integer>(List.of(2, 6, 10));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        NumberUtils numberUtils = new NumberUtils();
        Assertions.assertEquals(numberUtils.multiplyOddNumber(arrayList), actualFinalList);
        Assertions.assertTrue(numberUtils.multiplyOddNumber(arrayList).equals(actualFinalList));
    }

    @Test
    void getShortestWordTest() {
        ArrayList<String> arrayList = new ArrayList<String>(List.of("one", "two", "three", "four", "five"));
        StringUtils stringUtils = new StringUtils();
        String result = stringUtils.getShortestWord(arrayList);
        Assertions.assertEquals(result, "one");
        Assertions.assertTrue(result.equals("one"));
    }
}