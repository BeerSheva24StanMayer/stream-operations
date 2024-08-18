package telran.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class StreamTasks {
public static int[] shuffle(int[] arr) {
    //TODO
    //only one pipeline to get new array of ints
    //with all numbers from a given array but with differnt order
    //each method call returns new array in some random order
    // int[] nn = new int[arr.length];
    // int i 
    // Arrays.stream(vowels).anyMatch("O"::equals);
    return new Random().ints(0, arr.length).distinct().limit(arr.length).map(n -> arr[n]).toArray();
}
}
