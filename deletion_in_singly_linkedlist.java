import java.util.Scanner;
public class deletion_in_singly_linkedlist {
    Scanner scan=new Scanner(System.in);
    public static class node
    {
        int data;
        node next;
        node(int val)
        {
            data=val;
            next=null;
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of node to create the linked list: ");
        int number_of_nodes=sc.nextInt();
        node head=null;
        deletion_in_singly_linkedlist object=new deletion_in_singly_linkedlist();
        head=object.createlist(head,number_of_nodes);
        //printing the original list
        object.printlist(head);

        head=object.deletion_at_head(head);
        //printing the list after deleting the data in the head node
        object.printlist(head);


        head=object.deletion_of_specific_node(head,30);
        //printing the list after adding a new node containing 35 after node containing value 50
        object.printlist(head);


        head=object.deletion_at_end(head);
        //printing the list after adding a new node containing 90 at the head
        object.printlist(head);
    }
    node createlist(node head, int n)
    {
        int data;
        if(head==null)
        {
            System.out.print("Enter the data: ");
            data=scan.nextInt();
            head=new node(data);
            node current=head;
            n--;
            while(n>0)
            {
                System.out.print("Enter the data: ");
                data=scan.nextInt();
                current.next=new node(data);
                current=current.next;
                n--;
            }
            return head;
        }
        System.out.println("the list is already created: ");
        return head;
    }
    void printlist(node head)
    {
        if(head!=null)
        {
            node current=head;
            System.out.println("The data in the list is: ");
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
        else
        {
            System.out.println("The list is empty: ");
        }
        System.out.println();
    }
    node deletion_at_head(node head)
    {
        if(head==null)
        {
            System.out.println("The list is not being created: ");
            return head;
        }
        head=head.next;
        return head;
    }
    node deletion_at_end(node head)
    {
        if(head==null)
        {
            System.out.println("The list is not being created: ");
            return head;
        }
        node current=head;
        while(current.next.next!=null)
        {
            current=current.next;
        }
        current.next=null;
        return head;
    }
    node deletion_of_specific_node(node head,int item)
    {
        if(head==null)
        {
            System.out.println("The list is not created: ");
            return head;
        }
        node current=head;
        node previous=head;
        while(current!=null)
        {
            if(current.data==item)
            {
                previous.next=current.next;
                return head;
            }
            previous=current;
            current=current.next;
        }
        System.out.println("The node in not in the list: ");
        return head;

    }
}
