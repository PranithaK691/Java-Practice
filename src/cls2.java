public class cls2 {
    public static void main (String args[])
//    {
//        //for(intialization, condition, increment/decrement)
//        int number = 2;
//        System.out.println("table for 2");
//
//        for(int i=0; i<=10; i++)
//        {
//            System.out.println("2x" + i + "=" + 2*i);
//        }
//    }

//    nested loop
 {
    int i;
    for(i = 1; i<=10; i++){
        System.out.println("Table for" + i);
    for (int j = 0; j<= 10; j++) {

        System.out.println(i + "x" + j + "=" + i * j);

       }
    }
 }

}
