package LeetCode.数据结构.链表.high;

import com.google.gson.Gson;

/**
 * Created by wxg on 2021/1/16.
 */
public class LeetCode2_medium {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(9);
        listNode1.next = new ListNode(9);
        listNode1.next.next = new ListNode(9);
        listNode1.next.next.next = new ListNode(9);
        listNode1.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next.next = new ListNode(9);

        ListNode listNode2 = new ListNode(9);
        listNode2.next = new ListNode(9);
        listNode2.next.next = new ListNode(9);
        listNode2.next.next.next = new ListNode(9);
        System.out.println(new Gson().toJson(new LeetCode2_medium().addTwoNumbers(listNode1, listNode2)));

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode cur = result;
        int flag = 0;

        while (l1 != null || l2 != null) {
            int sum;
            if (l1 == null) {
                sum = l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                sum = l1.val;
                l1 = l1.next;
            } else {
                sum = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }

            cur.next = new ListNode((sum + flag) % 10);
            cur = cur.next;


            if (sum + flag >= 10) {
                flag = 1;
            } else {
                flag = 0;
            }
        }

        if (flag == 1) {
            cur.next = new ListNode(flag);
        }
        return result.next;
    }


    public static class ListNode {
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
