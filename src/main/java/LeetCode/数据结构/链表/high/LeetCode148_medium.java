package LeetCode.数据结构.链表.high;

/**
 * Created by wxg on 2021/2/23.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 */
public class LeetCode148_medium {

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        node.next = new ListNode(3);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(-1);
        new LeetCode148_medium().sortList(node);
    }

    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Integer[] arrays = list.toArray(new Integer[list.size()]);
        quickSort(arrays, 0, list.size() - 1);

        ListNode newHead = new ListNode();
        ListNode cur = newHead;
        for (int i = 0; i < arrays.length; i++) {
            int num = arrays[i];
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return newHead.next;
    }

    public void quickSort(Integer[] arrays, int left, int right) {
        if (left >= right) return;
        int base = arrays[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && arrays[j] >= base) {
                j--;
            }

            while (i < j && arrays[i] <= base) {
                i++;
            }

            if (i != j) {
                int tmp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = tmp;
            }
        }
        arrays[left] = arrays[i];
        arrays[i] = base;
        quickSort(arrays, left, i - 1);
        quickSort(arrays, i + 1, right);
    }
}
