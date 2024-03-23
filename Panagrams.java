//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

import java.util.HashSet;
import java.util.Set;
/*

First approach I can think about the set first declare a set and put all the elements of
string into set and finally check the size of the set is 26 or not
declare a chat , int map
count the frequency ( easier than vector count )
check if map size is equal to 26
- return true if it is
- or false if its not
 */
public class Panagrams {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
       Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
