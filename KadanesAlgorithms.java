public class KadanesAlgorithms {
    public static int KadanesAlgorithmss(int a []){
        int curr = a[0];
        int max = a[0];
        for(int i = 1 ; i< a.length ; i++){
            curr = Math.max(a[i] , curr+a[i]);
            max = Math.max(max, curr);
        }
    return  max;
    }
    public static void main(String[] args) {
        int a [] ={5,4,-1,7,8};
        System.out.println(KadanesAlgorithmss(a));
    }
}