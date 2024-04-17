package com.contact.contactManager;

public class Name {

  private class Node{
    private String value;
    private Node next;

    // public Node(String value, Node next) {
    //     this.value = value;
    //     this.next = next;
    // }
    // public Node(){}
    
    public Node(String value){
        this.value=value;
    }
}

private Node head;
 

private Node tail;
private int size;

public Name(){
    this.size=0;
}


// ## insert names from first ##
public void insertFirst(String value){
    Node node = new Node(value);
    node.next=head;
    head=node;

    if(tail==null){
        tail=head;
    }
    size++;
}

// ## insert names from last ##

public void insertLast(String value){
    if(tail==null){
        insertFirst(value);
        return;
    }

     Node node = new Node(value);
     tail.next=node;
     tail=node;
     size++;


}

// ## Delete name from first of the contact List ## 

 public String deleteFirst(){
    String val = head.value;
    head = head.next;
    if(head==null){
        tail=null;
    }
    size--;
    return val;
 }


// ## get value ##


public boolean get(String value){
    Node node =head;
    while(node != null){
        if(node.value == value){
            System.out.println("true");
            return true;
        }
        node=node.next;
    }
    System.out.println("false");
    return false;
}


// ## get method ##

public Node get(int index){
    Node node =  head;
    for(int i=0; i< index; i++){
        node=node.next;
    }
    
    return node;
 }
// ## Delete name from the last of the contact List ##

 


public String deleteLast(){
    if(size<=1){
        deleteFirst();
    }

// ## hunt for second last name ##
  
Node secondLast =get(size-2);
String val = tail.value;
tail= secondLast;
tail.next=null;
size--;
return val;



}

// ## general method for deleting the element ##

public String delete(int index){
    if(index==0){
        return deleteFirst();
    }
    if(index==size-1){
        return deleteLast();
    }

    Node previous = get(index-1);
    String val = previous.next.value;
    previous.next=previous.next.next;
    size--;
    return val;
}


// ## display method for name ##

public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.value + "-->");
        temp=temp.next;
    }
    System.out.println("END");
}



}
