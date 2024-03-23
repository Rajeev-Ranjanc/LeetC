//https://leetcode.com/problems/middle-of-the-linked-list/?envType=daily-question&envId=2024-03-07

public class MidList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        //using slow and fast pointer
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

        //using array
//        int n = Length(ListNode head);

    }
}
