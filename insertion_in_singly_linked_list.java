import java.util.Scanner;
public class insertion_in_singly_linked_list {
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
        insertion_in_singly_linked_list object=new insertion_in_singly_linked_list();
        head=object.createlist(head,number_of_nodes);
        //printing the original list
        object.printlist(head);


        head=object.insert_at_head(head,90);
        //printing the list after adding a new node containing 90 at the head
        object.printlist(head);


        head=object.insert_in_between(head,35,20);
        //printing the list after adding a new node containing 35 after node containing value 50
        object.printlist(head);


        head=object.insert_at_end(head,100);
        //printing the list after adding a new node containing 100 at the end
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
    node insert_at_head(node head,int data)//this function inserts the new node at the beginning of the list
    {
        if(head==null)
        {
            System.out.println("The list does not exist: ");
            return head;
        }
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
        return head;
    }
    node insert_at_end(node head,int data)//this function inserts a new node at the end of the list
    {
        node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=new node(data);
        return head;

    }
    node insert_in_between(node head,int data,int item)//item stores the data of the node after which newnode node has to be inserted
    {
        if(head==null)
        {
            System.out.println("The list is not being created: ");
            return head;
        }
        node current=head;
        while(current!=null)
        {
            if(current.data==item)
            {
                node newnode=new node(data);
                newnode.next=current.next;
                current.next=newnode;
                return head;
            }
            current=current.next;
        }
        System.out.println("the data connot be inserted: ");
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
}
