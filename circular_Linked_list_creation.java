/*
   *createlist function creates a circular linked list with given number of nodes
   * printlist function prints the content of the created list
 */
import java.util.Scanner;
public class circular_Linked_list_creation {
    Scanner sc=new Scanner(System.in);
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
        System.out.println("Enter the number of node in the list: ");
        int number_of_nodes=sc.nextInt();
        node head=null;
        circular_Linked_list_creation object=new circular_Linked_list_creation();
        head=object.createlist(head,number_of_nodes);
        object.printlist(head);
    }
    node createlist(node head,int n)
    {
        node current=head;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the data: ");
            int data=sc.nextInt();
            if(head==null)
            {
                head=new node(data);
                head.next=head;
                current=head;
                continue;
            }
            current.next=new node(data);
            current=current.next;
            current.next=head;
        }
        return head;
    }
    void printlist(node head)
    {
        node current=head;
        while(current.next!=head)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println(current.data);
    }
}
