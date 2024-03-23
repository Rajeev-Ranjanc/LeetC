//leetcode-1295
//Done
//no of even digits number

public class leet1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
//        System.out.println (findNumbers ( nums ));
        System.out.println (digits2 ( 12345 ));
    }
    static int findNumbers(int[] nums) {
        int count=0;
//    for (int i=0;i<nums.length;i++)
        for(int num :nums)
        {
            if(even(num)){
                count++;
            }

        }

        return count;
    }
    static boolean even(int num){
        int numberofdigits=digits(num);
//        if(numberofdigits%2==0){
//            return true;
//        }
//        return false;
        return numberofdigits%2==0;

    }
    static int digits(int num){
        if(num<0){
            return 0;
        }
        int count=0;
        while(num>0){
            count++;
            num/=10;

        }
        return count;


    }

    //shortcut to find the number of digits
    static int digits2(int nums){
        return (int) Math.log10 ( nums )+1;
    }
}
