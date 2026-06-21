public class findMissingNumberInArray {
    public static int findMissingNumberInArrays(int[] a) {
        int n = a.length+1;
        int expectedSum  = n*(n+1)/2; // important formula to find the sum of natural numbers 
        int actualSum = 0;
        for(int i = 0; i<a.length ; i++){
            actualSum+=a[i];
        }
         return  expectedSum  -actualSum;
      
    }
    public static void main(String[] args) {
        int a []={1,2,3,4,6};
        System.out.println(findMissingNumberInArrays(a));
    }
}
