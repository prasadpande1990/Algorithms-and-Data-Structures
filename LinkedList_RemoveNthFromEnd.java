/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LinkedList_RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)
            return head;
        if(head.next==null && n==1){
            return null;
        }
        ListNode fastPtr = head;
        while(n>0){
            fastPtr = fastPtr.next;
            n--;
        }
        if(fastPtr==null)
            return head.next;
        ListNode slowPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr = fastPtr.next;
        }
        slowPtr.next = slowPtr.next.next;
        return head;
    }
}