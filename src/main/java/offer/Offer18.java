package offer;

/**
 * Created by wxg on 2020/10/16.
 */

import com.google.gson.Gson;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * 注意：此题对比原题有改动
 *
 * 示例 1:
 *
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 */
public class Offer18 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(5);
        listNode1.next.next = new ListNode(1);
        listNode1.next.next.next = new ListNode(9);
        System.out.println(new Gson().toJson(deleteNode(listNode1, 5)));
    }

    public static ListNode deleteNode(ListNode head, int val) {

        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode pre = root;
        ListNode cur = head;

        if (head == null) {
            return head;
        }
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                return root.next;
            }
            pre = pre.next;
            cur = cur.next;
        }
        return root.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
