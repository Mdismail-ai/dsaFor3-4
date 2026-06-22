import java.util.Arrays;

public class reverseArrayByKSteps {
    public static void reverseArrayByKStepss(int a [] , int steps){
         reverseArray(a,0,steps-1);
         reverseArray(a, steps,a.length-1);
         reverseArray(a, 0, a.length-1);

    }
    public static void reverseArray(int[] a, int start, int end) {
        while (start<=end) {
           int temp = a[start];
           a[start] = a[end];
           a[end] = temp;
           start++;
           end--;
            
        }
    }
    public static void main(String[] args) {
        int a [] = {1234,23,532545,654,65,46,456,5,6,5};
        reverseArrayByKStepss(a, 7);
        System.out.println(Arrays.toString(a));
    }
}
