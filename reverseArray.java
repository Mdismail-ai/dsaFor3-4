

import java.util.Arrays;

public class reverseArray {
    // best way to revese an array 
    public static int [] reverseArrays(int [] a) {
        for(int i = 0; i<a.length/2 ;i++){
            int temp = a[i];
             a[i] = a[a.length-1-i]; // in this we are using i becuse we must beckword direction 
             a[a.length-1-i] = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a [] = {1,3,4,45,23,4,35,23,432,32};
        System.out.println(Arrays.toString(reverseArrays(a)));
    }
}
