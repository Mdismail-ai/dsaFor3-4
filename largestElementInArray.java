public class largestElementInArray {
    // 1 more efficient way to find the largest number from array
    public static  int largestElementInArrays(int []a){
        int max = a[0];
        for(int i = 0; i<a.length; i++){
           if(a[i]>max){
               max = a[i];
           }
        }
        return max;
    }
    // 2 after sorting the all numbers we can find the largest  numbers
    public static int lagestNumberFromArray(int[] a){
        for(int i = 0; i<a.length;i++){
            for(int j =i+1 ; j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }
            }
        }
        int result = a[a.length-1];
        return result;
    }
    public static void main(String[] args) {
        int a [] = {1,3,4,45,23,4,35,23,432,4234,32};
        System.out.println(largestElementInArrays(a));
        System.out.println(lagestNumberFromArray(a));
    }
}