public class ArrayList {

    public static void main(String args[])
    {
       java.util.ArrayList<String> arr = new  java.util.ArrayList<String>();
        arr.add("A");
        arr.add("B");
        arr.add(1, "-");
        arr.add("c");
        arr.remove("c");

        for(String str : arr){
            System.out.print(str);
        }



    }
}
