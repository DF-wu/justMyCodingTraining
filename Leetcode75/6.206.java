package Leetcode75;


//206. Reverse Linked List
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
import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ArrayList<ListNode> result = new ArrayList<>();
        result = toArray(head, result);
        for(int i=result.size()-1; i>0; i--){
            result.get(i).next = result.get(i-1);
            result.get(i-1).next = null;
        }   

        return result.get(result.size()-1);
        
        
    }
    
    public ArrayList<ListNode> toArray(ListNode head, ArrayList<ListNode> resultlist){
        if(head == null){
            return resultlist;
        }else {
            resultlist.add(head);
            return toArray(head.next, resultlist);   
        }
    }
    
    
}