
import java.util.HashSet;

public class findDuplicatesFromArray {
    public static void findDuplicatesFromArrays(int a []){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< a.length ; i++){
            if(set.contains(a[i])){
                System.out.println(a[i]);
            }
            set.add(a[i]);
        }
       

    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 4, 5, 1};
        findDuplicatesFromArrays(a);
    }
}
