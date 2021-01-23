import java.util.*;
import java.lang.*;

class BubbleSort{

    public int[] bubbleSort(int arr[]) {
        int len = arr.length;
        for(int i=0;i<len - 1;i++) {
            for(int j=1;j<len - i;j++) {
                if(arr[j-1] > arr[j]) {
                    int swap = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        return arr;
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        System.out.println(new BubbleSort().bubbleSort(arr));
    }
}
