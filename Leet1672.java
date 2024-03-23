//leetcode1672: richest man problem
import java.util.Arrays;
//Done


public class Leet1672 {
    public static void main(String[] args) {
        int[][] arr={{1,5},{7,3},{3,5}};
        System.out.println ( maximumWealth ( arr));
    }
    static int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for (int person = 0; person <accounts.length ; person++) {
            //maxwealth
            int rowsum=0;
            for (int account = 0; account < accounts[person].length; account++) {
             rowsum+=accounts[person][account];
            }
            if(maxwealth<rowsum){
                maxwealth=rowsum;
            }
            
        }
        return maxwealth;
    }
}
