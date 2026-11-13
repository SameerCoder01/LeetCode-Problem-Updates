/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        int sizeA = 0;
        int sizeB = 0;

        while(tempA != null){
            sizeA += 1;
            tempA = tempA.next;
        }

        while(tempB != null){
            sizeB += 1;
            tempB = tempB.next;
        }

        int diff = Math.abs(sizeA-sizeB);

        ListNode tA = headA;
        ListNode tB = headB;

        if(sizeA == sizeB){
            // do nothing
        }else{
            if(sizeA > sizeB){
                for(int i=1; i <= diff; i++){
                    tA = tA.next;
                }
            }else{
                for(int i=1; i<=diff; i++){
                    tB = tB.next;
                }
            }
        }

        ListNode ans = null;

        while(tA != null && tB != null){
            if(tA == tB){
                ans = tA;
                break;
            }
            tA = tA.next;
            tB = tB.next;
        }

        return ans;
    }
}