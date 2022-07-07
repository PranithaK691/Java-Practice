//import java.util.Arrays;
//import java.util.HashSet;
//
//public class Practice {
//
//import java.util.*;
//    class HelloWorld {
//        public static void main(String[] args) {
//            // HashMap<String, String> map = new HashMap<>();
//            // map.put("sirish","sirish info1");
//            // map.put("sirish","sirish info2");
//
//            int[] arr = {1,2,3,1,2,3,1}; // {1,2,3}
////            1,2,3,0,2,3,0
////            1,2,3,0,0,3,0
////            1,2,3,0,0,0,0
////            1,2,3,0,0,0,0
//             int c2 = 0;
//             for(int i=0;i<arr.length;i++){
//               for(int j=i+1;j<arr.length;j++){
//                   c2++;
//                   if(arr[i] == arr[j]){
//                       arr[j]=0;
//                   }
//               }
//
//             }
//             int c = 0;
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i] !=0){
//                     c++; //to find size
//                 }
//             }
//             int[] res = new int[c];
//             int index = 0;
//             for(int i=0;i<arr.length;i++){
//                  if(arr[i] !=0){
//                     res[index] = arr[i];
//                     index++;
//                 }
//             }
//
//
//             ArrayList<Integer> ArrLst = new ArrayList<Integer>();
//             for(int i=0;i<arr.length;i++){
//                 if(arr[i] !=0){
//                     ArrLst.add(arr[i]);
//                 }
//             }
//
//             System.out.println(c2);
//             System.out.println(Arrays.toString(res));
//
//
//            //-----------------------------------//
//
//            HashSet<Integer> set = new HashSet<Integer>();
//            for(int i=0;i<arr.length;i++){
//                set.add(arr[i]);
//            }
//            System.out.println("after for loop "+set);
//
//        }
//    }
//}
