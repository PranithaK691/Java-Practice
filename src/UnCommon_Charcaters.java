import java.util.HashMap;

public class UnCommon_Charcaters {
    public static void main(String args[]){
        String A = "Pranitha"; String B = "Praneetha";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<A.length()-1; i++) {
            if (map.containsKey(A.charAt(i))) {
                map.put(A.charAt(i), map.get(A.charAt(i)) + 1);
            } else {
                map.put(A.charAt(i), 1);
            }
        }

            for(int i=0; i<B.length()-1; i++){
                if(map.containsKey(A.charAt(i))){
                    map.put(A.charAt(i), map.get(A.charAt(i))+1);
                }
                else{
                    map.put(A.charAt(i), 1);
                }
            }
            StringBuilder sb = new StringBuilder();
            char[] arr = new char[26];

            for (Character key: map.keySet()){
                if(map.get(key)==1){
                    arr[key- 'a'] = key;
                }
            }

            for(char i: arr){
                if(i != '.'){
                    sb.append(i);
                }
            }
        System.out.println(sb);
    }
}

