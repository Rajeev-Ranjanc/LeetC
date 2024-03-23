//https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1
import java.util.*;

public class StrignDuplicate {
    public static void main(String[] args) {
        String str = "geEksforGEeks";
        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                continue;
            }
            else{
                sb.append(str.charAt(i));
                set.add(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
