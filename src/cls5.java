public class cls5 {
    public static void main (String args[])
    {
//        int[] a = {12,23,24};
//
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }
//    }
//
//    //for each
//    {
//        int[] a = {12,23,24};
//
//        for(int i: a){
//            System.out.println(i);
//        }

//        int[] x = {2,3,5,4,-4,8};
//        int sum = 0;
//        for(int i=0; i<x.length; i++){
//            System.out.println(x[i]);
//            sum = sum+x[i];
//        }
//        System.out.println(sum);


        int[] s = {5,6,1,10,4};
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i<s.length; i++){
          if(s[i]%2==0){
              evenSum = evenSum+s[i];
          }
          else{
              oddSum += s[i];
          }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }



}

