package Practise;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNum {

	public static void main(String[] args)
    {
        List<String> numbers = Arrays.asList("10","12","5","2","87","9832","953223","12383","9","8957");

        // sort using a custom function object
        Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));
        Collections.sort(numbers);

        // print the sorted sequence
        numbers.stream().forEach(System.out::print);
    }
}