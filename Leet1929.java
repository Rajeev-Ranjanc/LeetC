import java.util.Arrays;

//concatination of the array
public class Leet1929 {
    public static void main(String[] args) {
    int[] nums={1,2,1};

    //ans=[1,2,1,1,2,1]
        System.out.println ( Arrays.toString (getConcatenation ( nums )));
    }
    static int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        int k=0;
        for(int i=0;i< ans.length;i++){
            ans[i]=nums[k];
            k++;
            if(k== nums.length){
                k=0;
            }
        }

        return ans;
    }
}
