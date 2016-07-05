/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
		ListNode result=head;
		ListNode second=null;
		if(head!=null){
			second=head.next;
		}else{
		    return head;
		}
		ListNode tag=second;
		while(head!=null&&second!=null){
			ListNode tmp=head.next;
			head.next=second.next;
			if(head.next!=null){
				head=head.next;
			}
			if(tmp.next!=null){
				second.next=tmp.next.next;		
			}else{
				second.next=null;
			}
			second=second.next;			
		}
		head.next=tag;
		return   result;  
    }
}