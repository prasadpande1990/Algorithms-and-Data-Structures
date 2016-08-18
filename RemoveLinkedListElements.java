/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode temp;
        if(head==null)
            return head;
        while(head!=null && head.val==val){
            head = head.next;
        }
        temp = head;
        while(head!=null && head.next!=null){
            if(head.next.val == val){
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return temp;
    }
}