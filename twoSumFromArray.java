import java.util.Arrays;

public class twoSumFromArray {
    public static int [] twoSumFromArrays(int [] a , int target) {
        int s [] = new int[2];
        for(int i =0 ; i < a.length ; i++){
           for(int j =i+1 ; j < a.length ; j++){
            if(a[i]+a[j]==target){
                s[0]=i;
                s[1]=j;
            }
           }
        }
        return s;
    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,6,7,8,9};
        System.out.println(Arrays.toString(twoSumFromArrays(a, 3)));
    }
}
