import java.util.HashMap;

public class WordPattern {

    public static boolean check(String pattern, char delimiter, String s){
        HashMap<Character, String> map = new HashMap<>();
        int start = 0;
        for(int i = 0; i < pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i))) {
                int j = start;
                while (s.charAt(j) != delimiter) {
                    j++;
                }
                map.put(pattern.charAt(i), s.substring(start, j));
                start++;
            }else{
                int j = start;
                while (s.charAt(j) != delimiter) {
                    j++;
                }

                if(map.get(pattern.charAt(i)).equals(s.substring(start, j))){
                    return false;
                }
                start++;

            }


            }
        return true;
        }
}



