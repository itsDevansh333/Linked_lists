import java.util.Scanner;
public class circular_linked_list_insertion {
    Scanner sc=new Scanner(System.in);
    public static class node
    {
        int data;
        circular_Linked_list_creation.node next;
        node(int val)
        {
            data=val;
            next=null;
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of node in the list: ");
        int number_of_nodes=sc.nextInt();
        circular_Linked_list_creation.node head=null;
        circular_Linked_list_creation object=new circular_Linked_list_creation();
        head=object.createlist(head,number_of_nodes);
        object.printlist(head);

        head=object.insert_at_head(head,120);
        object.printlist(head);

        head=object.insert_at_end(head,100);
        object.printlist(head);

        head=object.insert_in_between(head,80,30);
        object.printlist(head);
    }
    circular_Linked_list_creation.node createlist(circular_Linked_list_creation.node head, int n)
    {
        circular_Linked_list_creation.node current=head;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the data: ");
            int data=sc.nextInt();
            if(head==null)
            {
                head=new circular_Linked_list_creation.node(data);
                head.next=head;
                current=head;
                continue;
            }
            current.next=new circular_Linked_list_creation.node(data);
            current=current.next;
            current.next=head;
        }
        return head;
    }
    void printlist(circular_Linked_list_creation.node head)
    {
        circular_Linked_list_creation.node current=head;
        while(current.next!=head)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println(current.data);
    }
    circular_Linked_list_creation.node insert_at_head(circular_Linked_list_creation.node head, int data)
    {
        circular_Linked_list_creation.node newnode=new circular_Linked_list_creation.node(data);
        newnode.next=head;
        circular_Linked_list_creation.node current=head;
        while(current.next!=head)
        {
            current=current.next;
        }
        current.next=newnode;
        head=newnode;
        return head;
    }
    circular_Linked_list_creation.node insert_at_end(circular_Linked_list_creation.node head, int data)
    {
        circular_Linked_list_creation.node newnode=new circular_Linked_list_creation.node(data);
        circular_Linked_list_creation.node current=head;
        while(current.next!=head)
        {
            current=current.next;
        }
        current.next=newnode;
        newnode.next=head;
        return head;
    }
    circular_Linked_list_creation.node insert_in_between(circular_Linked_list_creation.node head, int data, int item)//item stores the data of the node after which newnode node has to be inserted
    {
        if(head==null)
        {
            System.out.println("The list is not being created: ");
            return head;
        }
        circular_Linked_list_creation.node current=head;
        while(current.next!=head)
        {
            if(current.data==item)
            {
                circular_Linked_list_creation.node newnode=new circular_Linked_list_creation.node(data);
                newnode.next=current.next;
                current.next=newnode;
                return head;
            }
            current=current.next;
        }
        System.out.println("the data connot be inserted: ");
        return head;
    }
}
