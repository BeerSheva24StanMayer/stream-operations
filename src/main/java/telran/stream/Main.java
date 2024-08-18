package telran.stream;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        new Random().ints(1, 50).limit(6).forEach(n -> System.out.print(n + " "));
    }
}