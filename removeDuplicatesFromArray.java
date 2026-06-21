public class removeDuplicatesFromArray {
    public static int removeDuplicatesFromArrays(int a []){
    int j= 0 ;
    for(int i = 1 ;  i < a.length; i++){
        if(a[i]!=a[j]){
            j++;
            a[j] = a[i];
        } 
    } 
        return j+1;
    }
    public static void main(String[] args) {
        
    }
}
