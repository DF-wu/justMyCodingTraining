package Leetcode75;


//876. Middle of the Linked List
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
class Solution7 {
    public ListNode middleNode(ListNode head) {
        int midpos = listLength(head, 0)/2;
        int steps = 0;
        
        ListNode curr = head;
        for(int i=0; i < midpos ; i++){
            curr = curr.next;
        }
        return curr;
    }
    
    public int listLength(ListNode head, int length){
        if(head == null){
            return length;
        }else return listLength(head.next, ++length);
            
    }
}