
public class chackArraySortedOrNot {
    // best way to fing the array is sorted or not using a single loop by comparing next element 
    public static boolean isSorted(int a []){
        for(int i = 0; i< a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            } 
           
        }
        return true;
    }
    public static void main(String[] args) {
        int a [] = {1,2,9,4,67,5,6,7,8};
        System.out.println(isSorted(a));
    }
}
