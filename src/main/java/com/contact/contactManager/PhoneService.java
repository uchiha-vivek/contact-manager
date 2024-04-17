package com.contact.contactManager;

 

public interface PhoneService {

    public class Node{
     public Node next;
     public int value;
    
     public Node(){}
 
     public Node(int value){
         this.value=value;
     }
     public Node(int value,Node next){
         this.value=value;
         this.next=next;
     }
 
 
 
    }
 
     
 // ## Defining the methods for contact number ## //
 
 // insert first
 public void insertFirst(int val);
 // insert last
 public void insertLast(int val);
 
 // insert at any particular index
 public void insert(int val, int index);
 
 
 public Node find(int value);
 
 public Node get(int index);
 
 
 public int deleteFirst();
 
 public int deleteLast();
 
 
 public int delete(int index);
 
 
 }
 