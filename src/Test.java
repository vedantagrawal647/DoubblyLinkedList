class Node
{
    int data;
    Node next;
    Node previous;

    Node(int data)
    {

        this.data=data;
    }
}

class DoubllyLinkedList {
    Node head;

    public void insertatbeggning(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            head.previous=newnode;
            newnode.next=head;
            head=newnode;
        }
    }

    public void insertatLast(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.previous=temp;
        }
    }

    public void deletefrombegnning()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
        }
        else
        {
            head=head.next;
            head.previous=null;
        }
    }

    public void deletefromlast()
    {
        if(head==null)
        {
            System.out.println("Linkeadlist is empty");
        }
        else
        {
            if(head.next==null)
            {
                head=null;
            }
            else
            {
                Node temp=head;
                while(temp.next.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=null;
            }
        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public void reversedisplay()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.previous;
            }
        }
    }


}

public class Test {
    public static void main(String[] args) {
        DoubllyLinkedList obj1=new DoubllyLinkedList();
        obj1.insertatbeggning(new Node(10));
        obj1.insertatbeggning(new Node(20));
        obj1.display();
        System.out.println("-----------");

        obj1.insertatbeggning(new Node(30));
        obj1.display();
        System.out.println("-----------");

        obj1.insertatLast(new Node(40));
        obj1.display();
        System.out.println("------------");

        obj1.deletefrombegnning();
        obj1.display();
        System.out.println("------------");

        obj1.deletefromlast();
        obj1.display();
        System.out.println("------------");

        obj1.reversedisplay();
        System.out.println("------------");
    }
}
