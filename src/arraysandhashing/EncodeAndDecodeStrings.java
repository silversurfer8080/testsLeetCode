package src.arraysandhashing;

import java.util.List;

public class EncodeAndDecodeStrings {
    public static String encode(List<String> strs){
        StringBuilder encodeString = new StringBuilder();
        for (String str : strs){
            encodeString.append(str.length()).append("#").append(str);
        }
        return encodeString.toString();
    }



}
