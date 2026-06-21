public class secondLargestNumber {
    // 1 more effiecint way to find the largest number 
    public static int  secondLargestNumbers(int a []) {
        int largest = Integer.MIN_VALUE;
        int   SecondLargest = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
              SecondLargest = largest;
              largest = a [i];
             
            }else if (a[i]>SecondLargest && largest !=a[i]) {
                SecondLargest = a[i];
            }
        }
        return SecondLargest;
    }
    // 2 find the largest number using sorting not a best way but good to understant 
    public static int secondLargestNumberss(int a []){
        for(int i = 0 ; i<a.length ; i++){
            for(int j = i+1 ; j<a.length; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j]= temp;
                }
            }
        }
        int result = a[a.length-2];
      return result;
    }
    public static void main(String[] args) {
        int a [] = {1,3,4,45,23,4,35,23,432,32};
        System.out.println(secondLargestNumbers(a));
        System.out.println(secondLargestNumberss(a));
    }
}
