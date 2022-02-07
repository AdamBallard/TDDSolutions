import java.util.Collections;

public class ReverseArray {

    public int[] reverseArray(int[] myIntArray) {

        int[] reversedArray = new int[myIntArray.length];

        int num = myIntArray.length;
        for (int i = 0; i < myIntArray.length; i++) {
            reversedArray[num - 1] = myIntArray[i];
            num = num - 1;
        }
        return reversedArray;
    }
}
