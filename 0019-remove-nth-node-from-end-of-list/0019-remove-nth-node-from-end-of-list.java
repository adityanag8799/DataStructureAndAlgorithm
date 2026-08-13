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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
    int size=0;
    ListNode ptr=head;
    while(ptr!=null)
    {
    ptr=ptr.next;
    size++;
    }
    if (size == n) return head.next;
    int steps=size-n-1;
    ListNode prev=head;
    while(steps>0)
    {
    prev=prev.next;
    steps--;
    }
    prev.next=prev.next.next;
    return head;
    }
   
}