

public class LinkedListCycle {
    
}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        whiel(hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle) {
                return true;
            }
        }
        return false;

    }
}
