package LinkedListPractice;

public class ListNode {
    Node head=null;
    public void insertAtBeing(int var){
        Node newNode=new Node(var);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void printAllElement(){

        if (head==null){
            System.out.println("No any Element");
            return;
        }

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
