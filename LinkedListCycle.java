public class Solution {
    public boolean hasCycle(ListNode head) {
        // Start a slow and a fast pointer
        ListNode slowptr=head;
        ListNode fastptr=head;

        while(slowptr!=null && fastptr!=null && fastptr.next!=null)
        {
            // ADVANCE SLOWPTR BY 1 AND FAST BY 2
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        if(slowptr==fastptr)
        {
            // If slowptr and the fastptr meets means there's a loop
            return true;
        }
}
return false;     
}
}
