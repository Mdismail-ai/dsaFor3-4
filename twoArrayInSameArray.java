import java.util.Arrays;

public class twoArrayInSameArray {
    // best way to two arrays in same array 
    public static int [] twoArrayInSameArrays(int a [] , int b []){
        int c [] = new int[a.length+b.length];
        for(int i = 0 ; i< a.length ; i++){
            c[i]= a[i];
        }
        for(int j = 0; j<b.length ; j++){
            c[a.length+j]=b[j];
        }
      return c;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(Arrays.toString(twoArrayInSameArrays(a, b)));
    }
}
