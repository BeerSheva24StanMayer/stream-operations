package telran.stream;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static telran.stream.StreamTasks.*;

public class StreamTasksTest {
    int length = 100000;
    @Test
    void shuffleTest() {
        // TODO
        // test of method shuffle of StreamTasks class
        int[] array = new Random().ints(0, length).distinct().limit(length).toArray();   
        assertTrue(shuffleRes(array, shuffle(array)));

    }

    private static boolean shuffleRes(int[] arrrayBefore, int[] arrayShuffled) {
        boolean res = false;
        int count = 0;
        for (Integer number : arrayShuffled) {
            Integer el = arrayShuffled[number];
            if (Arrays.stream(arrrayBefore).anyMatch((el::equals))) {
                count++;
            }
            if (count == arrrayBefore.length && arrrayBefore.length == arrayShuffled.length) {
                res = true;
            }
        }
        return res;
    }
}
