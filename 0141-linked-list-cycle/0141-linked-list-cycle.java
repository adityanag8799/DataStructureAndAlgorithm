/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null) 
    {
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast) return true;
    }
    return false;    
    }
}

/*
1. Initialize slow and fast pointers at head.
imp : use && not || 
2. Move slow by 1 step.
3. Move fast by 2 steps.
4. If slow == fast, a cycle exists.
5. If fast reaches null, no cycle exists.
*/