package LeetCode.数据结构.链表.high;

/**
 * Created by wxg on 2021/2/24.
 */

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class LeetCode19_meidum {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        new LeetCode19_meidum().removeNthFromEnd(node, 1);
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = head;
        int i = 0;

        while (fast != null && i < n) {
            fast = fast.next;
            i++;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }


        slow.next = slow.next.next;
        return dummy.next;
    }


}
