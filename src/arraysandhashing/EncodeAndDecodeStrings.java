package src.arraysandhashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static String encode(List<String> strs){
        StringBuilder encodeString = new StringBuilder();
        for (String str : strs){
            encodeString.append(str.length()).append("#").append(str);
        }
        return encodeString.toString();
    }

    public static List<String> decode(String s){
        List<String> decodeString = new ArrayList<>();
        int i = 0;
        while (i < s.length()){
            int j = i;
            while (j < s.length() && s.charAt(j) != '#'){
                j++;
            }
            decodeString.add(s.substring(i, j));
            i = j + 1;
        }
        return decodeString;
    }


}
