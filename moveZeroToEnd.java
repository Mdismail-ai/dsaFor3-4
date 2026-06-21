import java.util.Arrays;

public class moveZeroToEnd {
    public static int  [] moveZeroToEnds(int a []){
        int j = 0 ;
    for(int i = 0 ; i< a.length ; i++){
        if(a[i]!=0){
           int temp  = a[i];
           a[i] = a[j];
           a[j] = temp;
           j++;
        }
    }
    return a;
    }
    public static void main(String[] args) {
         int a[] = {0, 1, 0, 3, 12, 0, 5};
         System.out.println(Arrays.toString(moveZeroToEnds(a)));
    }
}
