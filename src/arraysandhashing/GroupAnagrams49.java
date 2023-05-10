package src.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    /**
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a list of lists to put the agregation of anagrams words of the String array.
        List<List<String>> result = new ArrayList<>();
        // Edge case
        if(strs == null ||strs.length == 0) return result;
        // The key is the result of an array of ints, which it will common to all the words which is the anagram
        // of each other, so the int array will be the common key to identifier and group the words together as a value
        // since the value type we defined as list of strings.
        HashMap<String, List<String>> map = new HashMap<>();
        // Interation in the initial String array
        for (String s: strs) {
            // An int array, with the fixed size of 25 (alphabetic), so this array is initialize with zeros
            int []hash = new int[26];
            // Here we iterate through which word, so we can compute each letter of the word to the it's index
            // in the array.
            for (char c : s.toCharArray()) {
                // Here the c -'a' means we are operation with chars, as an int. chars from a to z converted to int
                // has a value, for example char 'a' is 97 as int, e has a value of 101 as an int. So whe calculate this
                // 'e' - 'a' it's 101 - 97 as an int, which result in 4, so we are giving the index for the hash array.
                // Then we increment it, to say for that index we have to increment (imagine we have more letters 'e' in
                // the word to process.
                hash[c -'a']++;
            }
            //So after the loop through the word (as char array) we have the result of the int array as something like this
            // [0,1,0,0,2,0,3,.....] -> 0 letter 'a', 1 letter 'b', 0 letter 'c', 0 letter 'd', 2 letter 'e' and so on
            // with this we have the word as a sequence of numbers that the index means de order of alphabet so doesn't matter
            // what the word is if you have the same int array sequence they are anagrams, because they have same letters in the
            // same quantity.
            String key =  new String(Arrays.toString(hash)); // Here we need to transform the int array in String key, so
            // we need to transform the array sequence in the string like [1,2,0,1...] into "1201...". Only using the
            // String overload constructor of String doesn't help much since it will transform the integers in as a unicode
            // points.So we need use Arrays.toSring() method, so it will create a String representation of int array

            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        // map.values are the values and which value is a list added by the first loop
        result.addAll(map.values());
        return result;
    }
}
