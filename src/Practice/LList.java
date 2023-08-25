package Practice;
import org.w3c.dom.Node;

import java.util.LinkedList;
public class LList {
    Node head;
    private int size;
    LList(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add last

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode= head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }


    // Print list
    public void printList(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //Delete first
    public void DeleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete last

    public void DeleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = secondLast.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    //Get size

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LList list = new LList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.DeleteFirst();
        list.printList();

        list.DeleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("This");

    }



}
