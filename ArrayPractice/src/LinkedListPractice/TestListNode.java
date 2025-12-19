package LinkedListPractice;

public class TestListNode {
    public static void main(String[] args) {
        ListNode l1=new ListNode();
        l1.insertAtBeing(34);
        l1.insertAtBeing(23);
        l1.insertAtBeing(93);
        l1.insertAtBeing(783);
        l1.printAllElement();

        ListNode l2=new ListNode();
        l2.insertAtBeing(23);
        l2.insertAtBeing(253);
        l2.insertAtBeing(263);
        l2.insertAtBeing(283);
    }
    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode=new ListNode();
        int rem=0,data=0;

        while(l1.next!=null||l2.next!=null){
            if(l1.next!=null){
                if(l2.next!=null){
                    data=l1.val+l2.val+rem;
                    rem=data/10;
                    data=data%10;
                    ListNode node=new ListNode(data);
                    newNode=new ListNode(node.val, node.next);

                    l2.next=l2.next;
                }
                else{
                    data=l1.val+rem;
                    rem=data/10;
                    data=data%10;
                    ListNode node=new ListNode(data);
                    newNode=new ListNode(node.val, node.next);
                }
                l1.next=l1.next;
            }
            else{
                data=l1.val+l2.val+rem;
                rem=data/10;
                data=data%10;
                ListNode node=new ListNode(data);
                newNode=new ListNode(node.val, node.next);

                l1.next=l1.next;
            }
        }
        return newNode;
    }*/
}
