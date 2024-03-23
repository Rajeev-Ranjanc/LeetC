//https://leetcode.com/problems/defanging-an-ip-address/
public class Ipaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        /*
        its just simple you just need to check if condition
         */
        String ans = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                ans += address.charAt(i);
            } else {
                ans += "[.]";
            }
        }
        return ans;
    }
}
