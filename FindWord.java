/*
//https://leetcode.com/problems/find-words-containing-character/

this problem is asking that there is given string of array and a character if that string array elements contains the given
character then add the index of the word into a list then return that list so simply i have run a loop to traverse the entire array
and one another loop to traverse in the words of the string array and if present then simply add that index i and break the loop
finally return the list
 */
import java.util.ArrayList;
import java.util.List;

public class FindWord {
    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';
        System.out.println(words.length);
        System.out.println(findWordsContaining(words , x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {

                if (words[i].charAt(j) == x) {

                    list.add(i);
                    break;

                }
            }
        }
        return list;
    }
}
