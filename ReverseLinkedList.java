/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next==null)
            return head;
            
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode temp = currNode;
        while(temp!=null){
            temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        return prevNode;
    }
}