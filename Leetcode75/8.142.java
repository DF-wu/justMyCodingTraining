package Leetcode75;


// 142. Linked List Cycle II
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

import java.util.*;
public class Solution8 {
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> dict = new ArrayList();
        
        ListNode curr = head;
        while(curr != null){
            // add into dict
            dict.add(curr);
            
            // gocha
            if(checkIfCycled(curr.next, dict) != null){
                return curr.next;
            }

            // prepare for next node
            curr = curr.next;
        }
        return null;
        
    }
    
    public ListNode checkIfCycled(ListNode head, ArrayList<ListNode> dict){
        for(ListNode node : dict){
//             gocha
            if(node == head){
                return head;
            }
        }
        return null;
        
        
    }
    
    
    
    
}