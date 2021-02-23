package LeetCode.数据结构.链表.high;

/**
 * Created by wxg on 2021/2/23.
 */

/**
 * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 */
public class mianshi0203_easy {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
