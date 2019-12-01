
import java.util.Scanner;


public class Check_Pallindrome 
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public static Check_Pallindrome  insert(Check_Pallindrome li,int data)
    {
        Node temp=new Node(data);
        temp.next=null;
        if(head==null)
        {
            head=temp;
        }
        else
        {
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=temp;
        }
        return li;
    }
    public static Check_Pallindrome add_beg(Check_Pallindrome li,int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            temp.next=head;
            head=temp;
        }
        return li;
    }
    public static void check_pallidrom(Check_Pallindrome li1,Check_Pallindrome li2)
    {
        Node temp1=li1.head;
        Node temp2=li2.head;
        while(temp1!=null)
        {
            if(temp1.data == temp2.data)
            {
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else
            {
                break;
            }
        }
        if(temp1 == null)
            System.out.println("Linked list is a pallidrome");
        else
            System.out.println("Linked list is not pallidrome");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Check_Pallindrome li1=new Check_Pallindrome ();
        Check_Pallindrome li2=new Check_Pallindrome ();
        System.out.println("Enter the size");
        int n=sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            li1.insert(li1,num);
            li2.add_beg(li2,num);
        }
        check_pallidrom(li1,li2);

        
    }
}
