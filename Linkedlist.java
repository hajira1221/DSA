class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}


class LinkedList
{
    Node head = null;
    //adding at last
    void addLast(int data)
    {
        Node node = new Node(data);
        Node current = head;
        if(head == null)
        {
           head = node;
        }
        else{
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = node;
    }
    
}
//adding at first
     void addFirst(int data)
        {
            Node node = new Node(data);
            node.next = head;
            head = node;
            
        }
//printing the ll
    public void show(Node head)
    {
        Node temp = head;

        while(temp.next!=null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
//deleting last
  public void delLast()

  {
      if(head == null)
      {
          return;
      }
      if(head.next == null)
      {
          head = null;
          return;
      }
      Node temp = head;
      while(temp.next.next != null)
      {
          temp = temp.next;
      }
      temp.next = null;
  }
  
  //delete first
  public void delFirst()
  {
      if(head == null)
      {
          return;
      }
       if(head.next == null)
      {
          head = null;
          return;
      }
      
      head = head.next;
      
  }
    
    
}

public class Main
{
public static void main(String[] args) 
{
    LinkedList ll = new LinkedList();
    ll.addLast(6);
    ll.addLast(7);
    ll.addLast(1);
    ll.addLast(0);
    ll.addFirst(10);
    ll.addLast(9);
    ll.show(ll.head);
    ll.delLast();
    ll.show(ll.head);
    ll.delFirst();
    ll.show(ll.head);
}
}
