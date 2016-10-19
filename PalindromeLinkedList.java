/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        if(head == null || head.next==null)
            return true;
            
        for(ListNode trav = head;trav!=null;trav=trav.next){
            length++;
        }
        ListNode fastPtr = head;
        for(int i=0;i<(length/2);i++){
            fastPtr = fastPtr.next;
        }
        if(length%2!=0)
            fastPtr = fastPtr.next;
            
        ListNode midHead = reverse(fastPtr);
        ListNode startHead = head;
        
        while(midHead!=null){
            if(startHead.val!=midHead.val)
                return false;
            startHead = startHead.next;
            midHead = midHead.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prevPtr = null;
        ListNode currPtr = head;
        ListNode nextPtr = head;
        while(nextPtr!=null){
            nextPtr = currPtr.next;
            currPtr.next = prevPtr;
            prevPtr = currPtr;
            currPtr = nextPtr;
        }
        return prevPtr;
    }
}