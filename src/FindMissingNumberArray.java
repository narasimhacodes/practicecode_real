public class FindMissingNumberArray {
    public static void main(String[] args){
        int[] arr = {6,2,7,4,5,1};
        int n=7;
//        int arrsum =0;
//        int originalsum = n * (n+1)/2;
//        for (int num : arr){
//            arrsum = arrsum+num;
//        }
//        System.out.println(originalsum - arrsum);

       int nsum = n * (n+1)/2;
       int arrsum =0;
       for (int number : arr){
           arrsum = arrsum+number;
       }
        System.out.println(nsum);
        System.out.println(arrsum);
        System.out.println("Missing number is : "+ (nsum-arrsum));
    }

}
