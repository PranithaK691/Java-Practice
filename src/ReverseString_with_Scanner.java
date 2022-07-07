import java.util.Scanner;

public class ReverseString_with_Scanner {
    public static void main(String args[]) {
//        String s;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the String");
//        s = sc.nextLine();
//
//        String c = "";
//        for (int i = s.length()- 1; i >= 0; i--) {
//            c = c + s.charAt(i);
//        }
//        System.out.println(c);


//        String s = "Pranitha";
//        StringBuilder rev = new StringBuilder();
//        for(int i= s.length()-1; i>=0; i--){
//
////            System.out.print(s.charAt(i));
//            rev = rev.append(s.charAt(i));
//        }
//        System.out.println(rev);
//        System.out.println(rev.reverse());


        //letter replacement in String

//        String s = "Loptopo";
//        System.out.println(s.replace("o", "a"));
//
//        String str = "kasam family";

        //Reveerse string by using string builder
//        StringBuilder sb = new StringBuilder(str);
//        int i = 0; int j = str.length()-1;
//        while(i<j){
//             char temp = sb.charAt(i);
//             sb.setCharAt(i, str.charAt(j));
//             sb.setCharAt(j,temp);
//             i++; j--;
//        }
//    System.out.println(sb.toString());

        //Reverse words in a given String
//        String S= "My name is Pranitha";
//        String a[] = S.split(" ");
//        for(int k=a.length-1; k>=0; k--){
//            System.out.print(a[k] + " ");
//        }

//        String str = "i want to learn java language";
//        String x[] = str.split(" ");
//        for(int l=0; l<x.length; l++){
//            System.out.print(x[l] + " ");
//        }
//        System.out.println("");
//        for(int l=x.length-1; l>=0; l--){
//            System.out.print(x[l] + " ");
//        }


        String k = "jaj";
        StringBuilder sb = new StringBuilder(k);
        int x = 0; String rev = "";
        int y = k.length() - 1;
        while (x < y) {
            char temp = sb.charAt(x);
            sb.setCharAt(x, sb.charAt(y));
            sb.setCharAt(y, temp);
            x++;
            y--;
        }
        rev = sb.toString();
        System.out.println(rev);
        if(rev==k){
            System.out.println("Given string is a polindrium");
        }
        else{
            System.out.println("Given string is not a polindrium");
        }
    }
}





