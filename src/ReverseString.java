public class ReverseString {
    public static void main(String args[]) {
//
//        String name = "educative";
//        int length = name.length();
//
//        String c = "";
//        for (int i = length - 1; i >= 0; i--) {
//
////            System.out.print(name.charAt(i));
//            c = c + name.charAt(i);
//        }
////        String name1 = String.valueOf(c);
//        System.out.println(c);
//    }


        //sum of arraya elements
//    class sum_of_array_elements {
//        public static void main(String args[]) {
//
//            int[] x = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
//            int sum = 0;
//            for( int i = 0;i<=x.length; i++)
//            {
//                sum = sum + i;
//            }
//            System.out.println(sum);
//        }
//    }

//    class max_of_array{
//    public static void main(String args[]){
//        int[] s = new int[]{5, 0, 6, 1, 4};
//        int max =s[0];
//        for(int i=0; i<s.length; i++){
//            if (max<s[i])
//            {
//                max = s[i];
//            }
//        }
//        System.out.println(max);
//      }
//    }

//    class min_of_array{
//    public static void main(String args[]){
//        int[] s = new int[]{2,0,5,8};
//        int min =s[0];
//        for(int i=0; i<s.length; i++){
//            if(min>s[i]){
//               min = s[i];
//            }
//        }
//        System.out.println(min);
//    }
//    }

        // sum of max & min of an integer
//        int[] x = new int[]{1, 2, 6, 0, 8};
//        int max = x[0];
//        int min = x[0];
//        for (int i = 0; i < x.length; i++) {
//            if (max > x[i]) {
//                max = x[i];
//            } else if (min < x[i]) {
//                min = x[i];
//            }
//        }
//        System.out.println("sum = " + (max + min));

//        String s = "sms";
//        int length = s.length();
//        String c = "";
//        for (int i = length - 1; i >= 0; i--) {
//            c = c + s.charAt(i);
//        }
//            if(c==s){
//                System.out.println(c+ " given string is a polyndrim");
//            }
//            else {
//                System.out.println(c+" given string is not a polyndrim");
//            }

//            int[] k = new int[]{2, 4, 6,0, 9};
//            int even = 0; int odd = 0;
//            for(int i=0; i<k.length; i++){
//                if(k[i]%2==0){
//                    even = k[i];
//
//                }
//                else{
//                    odd = k[i];
//                }
//            }
//        System.out.println("even numbers =" + even);
//        System.out.println("Odd numbers =" + odd);


        String s = "Pranitha"; String rev = "";
        for(int i= s.length()-1; i<0; i--){

            System.out.print(s.charAt(i));
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

    }

}



//}


