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
        List<ListNode> node = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            node.add(temp);
            temp = temp.next;
        }
        int indexToRemove = node.size()-n;
        if(indexToRemove == 0){
            head = head.next;
        }else{
            node.get(indexToRemove - 1).next = node.get(indexToRemove).next;
        }
        return head;


    }
}
