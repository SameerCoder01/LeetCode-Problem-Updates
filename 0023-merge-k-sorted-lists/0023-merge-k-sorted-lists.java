/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode merge(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    ListNode head = null;
    ListNode tf = null;

    ListNode temp1 = list1;
    ListNode temp2 = list2;

    while (temp1 != null && temp2 != null) {
        int data1 = temp1.val;
        int data2 = temp2.val;

        if (data1 < data2) {
            ListNode temp = new ListNode(data1);

            if (head == null) {
                head = temp;
                tf = head;
            } else {
                tf.next = temp;
                tf = temp;
            }
            temp1 = temp1.next;
        } else {
            ListNode temp = new ListNode(data2);

            if (head == null) {
                head = temp;
                tf = head;
            } else {
                tf.next = temp;
                tf = temp;
            }
            temp2 = temp2.next;
        }
    }

    while (temp1 != null) {
        ListNode temp = new ListNode(temp1.val);
        tf.next = temp;
        tf = temp;
        temp1 = temp1.next;
    }

    while (temp2 != null) {
        ListNode temp = new ListNode(temp2.val);
        tf.next = temp;
        tf = temp;
        temp2 = temp2.next;
    }

    return head;
}
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ListNode head = null;

        for(int i=0; i<n; i++){
            head = merge(head,lists[i]);
        }

        return head;
    }
}