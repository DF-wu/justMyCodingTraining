package Leetcode75;


//21. Merge Two Sorted Lists
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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultListNodes = new ListNode();
        mergeSolver(list1, list2, resultListNodes);
        return resultListNodes.next;
       
    }
    
    

    
    
    
    
    public ListNode mergeSolver(ListNode list1, ListNode list2, ListNode result){
        //         end condition
        if(list1 == null && list2 == null){
            return result;
        // if list1 reach the end 
        }else if(list1== null){
            result.next = list2;
            return mergeSolver(list1, list2.next, result.next);
        }else if(list2== null){
            result.next = list1;
            return mergeSolver(list1.next, list2, result.next);
//             compare value and give max
        }else if(list1.val <= list2.val){
            result.next = list1;
            return mergeSolver(list1.next, list2, result.next);         
        }else {
            result.next = list2;
            return mergeSolver(list1, list2.next, result.next);    
        }
        
            
            
    }
            
        
    
    
//     return max 
    public ListNode compareNodes(ListNode a, ListNode b){
        if(a.val >= b.val){
            return a;
        }else return b;
    }
    
//     public ListNode findEndNode(listNode node){
//         if(node.next == null){
//             return node;
//         }else return listLength(node.next);
//     }
    
//     find length
    public int listLength(ListNode node, int length){
        if(node.next == null){
            return length;
        }else return listLength(node.next, length);
    }
    
}