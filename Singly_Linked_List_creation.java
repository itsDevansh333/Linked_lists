/*here
    *'current' referes to the address reference of the currently accessed node of the list
    *'head' refers to the head node of the list
    * function 'createlist' is used to create the linked list
    * function 'printlist' is used to traverse through the list
 */
import java.util.Scanner;
public class Singly_Linked_List_creation {
    Scanner scan=new Scanner(System.in);
    public class node
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
        Singly_Linked_List_creation object=new Singly_Linked_List_creation();
        head=object.createlist(head,number_of_nodes);
        object.printlist(head);
    }
    node createlist(node head,int n)
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
        //return head;
    }
}