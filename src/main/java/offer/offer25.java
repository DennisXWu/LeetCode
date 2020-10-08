package offer;

/**
 * Created by wxg on 2020/10/8.
 */

import com.google.gson.Gson;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 示例1：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Offer25 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode listNode = recuMergeTwoLists(l1, l2);
        System.out.println(new Gson().toJson(listNode));
    }

    //递归
    public static ListNode recuMergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode head = null;
        if (l1.val > l2.val) {
            head = new ListNode(l2.val);
            head.next = recuMergeTwoLists(l2.next, l1);
        } else {
            head = new ListNode(l1.val);
            head.next = recuMergeTwoLists(l1.next, l2);
        }

        return head;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newOne = new ListNode(-1);
        ListNode cur = newOne;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 != null ? l1 : l2;
        return newOne.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


