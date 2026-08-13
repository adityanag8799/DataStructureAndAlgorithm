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
    public boolean isPalindrome(ListNode head) 
    {
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null)
    {
    slow=slow.next;
    fast=fast.next.next;
    }
    ListNode prev=null;
    while(slow!=null)
    {
        ListNode next=slow.next;
        slow.next=prev;
        prev=slow;
        slow=next;
    }
    ListNode start=head;
    ListNode ptr=prev;
    while(ptr!=null)
    {
    if(start.val!=ptr.val) return false;
    start=start.next;
    ptr=ptr.next;
    }
    return true;
    }
}

/*
1. Keep two pointers at both ends.
2. Maintain leftMax and rightMax.
3. Process the side with the smaller height.
4. Update max if current bar is taller.
5. Otherwise, trap water = max - current height.
6. Move that pointer inward.
7. Continue until i >= j.
*/