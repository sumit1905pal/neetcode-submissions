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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N = 0;
        ListNode temp = head;
        ListNode temp1 = head;
        while(temp != null){
            N++;
            temp = temp.next;
        }
        int indexToRemove = N - n;
        if(indexToRemove == 0){
            return head.next;
        }
        int c = 0;

        while(c < indexToRemove-1 ){
            temp1 = temp1.next;
            c++;
        }
        temp1.next = temp1.next.next; 

        return head;

    }
}
