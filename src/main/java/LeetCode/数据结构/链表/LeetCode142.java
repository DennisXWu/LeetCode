package LeetCode.数据结构.链表;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxg on 2021/1/24.
 */
public class LeetCode142 {

    public static void main(String[] args) {
        LeetCode142 leetCode142 = new LeetCode142();
        leetCode142.detectCycle2(leetCode142.construct());
    }

    public ListNode detectCycle(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head)) {
                return head;
            } else {
                set.add(head);
                head = head.next;
            }
        }
        return null;
    }


    //弗洛伊德算法
    public ListNode detectCycle2(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        while (true) {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                break;
            }
        }

        fast = head;
        while (true) {
            if (fast == slow) {
                return fast;
            }
            fast = fast.next;
            slow = slow.next;
        }
    }

    public ListNode construct() {
        ListNode listNode = new ListNode(-1);
        listNode.next = new ListNode(-7);
        listNode.next.next = new ListNode(7);
        listNode.next.next.next = new ListNode(-4);
        listNode.next.next.next.next = new ListNode(19);
        listNode.next.next.next.next.next = new ListNode(-5);
        listNode.next.next.next.next.next.next = listNode.next.next.next.next.next;
//        listNode.next.next.next.next.
// next.next = new ListNode(6);
        return listNode;
    }


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
}
