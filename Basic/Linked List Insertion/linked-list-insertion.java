//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
    static void printList(Node node) 
    { 
        while (node != null) 
        { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
        System.out.println(); 
    }
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            Node head = null;
            for(int i=0; i<n; i++)
            {
                int value = sc.nextInt();
                int indicator = sc.nextInt();

                Solution ob = new Solution();
                if(indicator == 0)
                    head = ob.insertAtBeginning(head, value);
                else
                    head = ob.insertAtEnd(head, value);
            }
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
          if(head==null)
        {
            head=new Node(x);
        }
        else
        {
            Node item=new Node(x);
            item.next=head;
            head=item;
            
        }
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
         if(head==null)
       {
           head=new Node(x);
       }
       else
       {
           Node curr=head;
           while(curr.next!=null)
           {
               curr=curr.next;
           }
           Node item=new Node(x);
           curr.next=item;
       }
       return head;
    }
}