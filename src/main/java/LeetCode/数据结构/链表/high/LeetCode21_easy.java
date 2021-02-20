package LeetCode.数据结构.链表.high;

import com.google.gson.Gson;

/**
 * Created by wxg on 2021/1/11.
 */
public class LeetCode21_easy {

    public static void main(String[] args) {
        LeetCode21_easy leetCode21 = new LeetCode21_easy();
        ListNode l1 = leetCode21.construct();
        ListNode l2 = leetCode21.construct2();
        System.out.println(new Gson().toJson(leetCode21.recMeregTwoLists(l1, l2)));

    }

    public ListNode recMeregTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val > l2.val) {
            l2.next = recMeregTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = recMeregTwoLists(l2, l1.next);
            return l1;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(-1);
        ListNode pre = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                pre.next = l2;
                pre = l2;
                l2 = l2.next;
            } else {
                pre.next = l1;
                pre = l1;
                l1 = l1.next;
            }
        }
        if (l1 == null) {
            pre.next = l2;
        } else {
            pre.next = l1;
        }
        return head.next;
    }


    public ListNode construct() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);
        return listNode;
    }

    public ListNode construct2() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(4);
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
