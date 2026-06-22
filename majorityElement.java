public class majorityElement {
    public static int majorityElements(int a[]){
        int candidate = 0;
        int count = 0;
        for(int i = 0 ; i<a.length;i++){
            if(count == 0){
                candidate = a[i];
            }if(a[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
         int a [] = {2,2,1,1,1,2,2,1,1};
         System.out.println(majorityElements(a));
    }
}
