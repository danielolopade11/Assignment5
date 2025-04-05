import java.util.*;

public class RadixSort {

    public static String[] sort(String[] arr) {
        int maxLength = 0;
        for (String str : arr) {
            maxLength = Math.max(maxLength, str.length());
        }

        for (int pos = maxLength - 1; pos >= 0; pos--) {
            buckets(arr, pos);
        }

        return arr;
    }

    private static void buckets(String[] arr, int charPos) {
        int n = arr.length;
        List<String>[] buckets = new ArrayList[256];

        for (int i = 0; i < 256; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (String str : arr) {
            if(charPos < str.length()){
                buckets[str.charAt(charPos)].add(str);
            }else{
                buckets[0].add(str);
            }

        }

        int idx = 0;
        for (List<String> bucket : buckets) {
            for (String word : bucket) {
                arr[idx++] = word;
            }
        }
    }
}
