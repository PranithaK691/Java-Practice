public class HashMap {
    public static void main (String args[]){
        java.util.HashMap<String, String> hash = new  java.util.HashMap<String, String>();
        hash.put("name", "Pranitha");
        hash.put("number", "12345");
        hash.put("email", "testing@gmail.com");

        //for single step print
        System.out.println(hash.get("name"));

        //for multiple step print-1st method
        java.util.Iterator<String> iterator = hash.keySet().iterator();

        while(iterator.hasNext());{
            String Key = iterator.next();
            System.out.println(Key + ":" + hash.get(Key));





        }
    }
}
