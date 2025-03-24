class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        if(head==null) return null;
        if(head.next==null || k==0) return head;
        int n = 1;
        while(temp.next!=null){
            temp = temp.next;
            n++;
        }
        System.out.print(n);
        k = k%n; 
        temp.next = head; //circular;
        ListNode nexttemp = temp;
        for(int i=0;i<n-k;i++)
        {
            temp = temp.next;
            if(temp.next!=null)
            {
                nexttemp = temp.next;
            }
        }
        temp.next = null;
        head=nexttemp;
        return head;

    }
}