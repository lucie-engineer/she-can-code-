import java.util.Arrays;

public class GenericArrayUtil {

    public static <T> int getArrayLength(T[] array) {
        return array.length;
    }

    public static <T> T[] mergeArrays(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);

        for (int i = 0; i < second.length; i++) {
            result[first.length + i] = second[i];
        }

        return result;
    }
}
