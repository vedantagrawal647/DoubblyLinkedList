class Node1
{
    int data;
    Node1 next;


    Node1(int data)
    {

        this.data=data;
    }
}

class DoubllyLinkedList1 {
    Node1 head;
    //Node1 head1;

    public void createLinkedList(Node1 newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node1 temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    /*
    public void newLinkedList(Node1 newnode)
    {
        int c=2;
        for(int i=2;i<newnode.data;i++)
        {
            if(newnode.data%i!=0)
            {
                c=c+1;
            }
            else
            {
                return;
            }
        }

        if(c==newnode.data)
        {
            if(head1==null)
            {
                head1=newnode;
            }
            else
            {
                Node1 temp=head1;
                while(temp!=null)
                {
                    temp=temp.next;
                }
                temp.next=newnode;
            }

        }
    }

     */

    public void oldlistdisplay()
    {
        if (head == null)
        {
            System.out.println("LinkedList is empty");
        }
        else
        {
            Node1 temp = head;
            while (temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    /*public void newlistdisplay()
    {
            if(head==null)
            {
                System.out.println("LinkedList is empty");
            }
            else
            {
                Node1 temp=head;
                while(temp!=null)
                {
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }

    }

     */
}

public class Test1 {
    public static void main(String[] args) {
        DoubllyLinkedList1 obj1 = new DoubllyLinkedList1();
        obj1.createLinkedList(new Node1(10));
        obj1.createLinkedList(new Node1(20));
        obj1.createLinkedList(new Node1(30));
        obj1.oldlistdisplay();
        System.out.println("-----------");
    }
}
