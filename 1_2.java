// Given a singly-linked list, write a method to delete its last node and return the head.
// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    
    ListNode current = head;
    
    if (current == null || current.next == null) return null;
    
    while(current.next.next != null) {
        current = current.next;
    }
    
    current.next = null;
    
    return head;
}