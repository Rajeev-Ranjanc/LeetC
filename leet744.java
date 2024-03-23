//find smallest number greater than the target
public class leet744 {
    public static void main(String[] args) {
        char[] leeters={'c','f','j'};
        char target='k';
        System.out.println (nextGreatestLetter ( leeters,target ));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        if(target>letters[letters.length-1]){
            return letters[0];
        }
        return '\0';
    }
}

