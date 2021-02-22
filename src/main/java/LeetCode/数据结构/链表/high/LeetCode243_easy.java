package LeetCode.数据结构.链表.high;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 */

/**
 * Created by wxg on 2021/2/21.
 */
public class LeetCode243_easy {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);
        System.out.println(new LeetCode243_easy().isPalindrome1(node));
    }

    public boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverse(slow.next);

        while (slow != null) {
            if (head.val != slow.val) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode cur = head;
        ListNode pre = null;

        while (cur.next != null) {
            pre = cur;
            cur = cur.next;
        }

        if (cur.val != head.val) return false;

        ListNode next = head.next;
        head.next = null;
        pre.next = null;
        return isPalindrome(next);
    }


    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;

        while (cur != null) {
            cur.next = pre;

            pre = cur;
            cur = next;
            next = cur == null ? null : cur.next;
        }
        return pre;
    }
}
