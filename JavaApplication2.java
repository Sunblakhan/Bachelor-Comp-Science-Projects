/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


public class JavaApplication2 {

    
    public static void main(String[] args) {
       Node a = new Node();
       a.addend(45);
       a.addend(98);
       a.addend(97);
       a.addend(96);
       a.addend(87);
      
        System.out.println("Before..");
       a.print();
       a.addmiddle(22, 2);
//       a.deletebeg(45);
//       a.deleteend(87);
       a.deletemiddle(4);
       System.out.println("After..");
       a.print();
       
       
//        a.addbeg(45);
//       a.addbeg(76);
//       a.printbeg();
    }
    
}

class Node{
    int data;
    Node next;
    Node head = null;
    Node tail = null;
    Node previous = null;
    int size=0;
    Node temp1,temp2;
    Node(){
    next = null;
    
    }
    
    void addend(int data){
       Node new_node = new Node();
       new_node.data = data;
       if(head == null){
           head = new_node;
       }
       else{
           Node temp = new Node();
           temp = head;
           while(temp.next!=null){
           temp= temp.next;
           }
           temp.next = new_node;
           size++;
       }
    }
    
    void print(){
        Node temp = new Node();
           temp = head;
           if(head==null){
               System.out.println("List is empty");}
           else{
               while(temp.next!=null){
                   System.out.println(temp.data);
                   temp = temp.next;
           }
               System.out.println(temp.data);
       
           }
    }
    void addbeg(int data){
       Node new_node = new Node();
       new_node.data = data;
       if(head == null){
           head = new_node;
       }
       else{
           new_node.next = head;
       head= new_node;
        }
      
    }
    
           
    void addmiddle(int data,int index){
       Node new_node = new Node();
       new_node.data = data;
       Node temp1 = new Node();
       Node temp2 = new Node();
       temp2 = head;
       if(index==0){
           System.out.println("no list exist!");
       }
       else if(index>size){
           System.out.println("Index not existed");
       }
       else{
           for (int i = 0; i < index; i++) {
               temp1 = temp2;
               temp2 = temp2.next;
               
           }
           new_node.next = temp2;
           temp1.next = new_node;
        }
      
    }

    
    void modify(int old, int new_num){
        Node temp = new Node();
           temp = head;
    if(head==null){
        System.out.println("List is empty, please add the values first");
    }
    else{
    while(temp.next!=null){
                 if(temp.data==old){
                     temp.data=new_num;
            }
                 else{
                 temp = temp.next;
                 }
    }
     if(temp.data==old){
                     temp.data=new_num;
            }
    }
   
       
    }
    
    
    void deletebeg(int data){
       Node new_node = new Node();
       new_node.data = data;
       if(head == null){
           System.out.println("List Empty");
       }
       else{
           head = head.next;
        }
    }
    
    void deleteend(int data){
    Node new_node = new Node();
       new_node.data = data;
       if(head == null){
           System.out.println("List Empty");
       }
       else{
       Node temp1 = null,temp2;
       temp2 = head;
           while (temp2.next!=null) {               
               temp1 = temp2;
               temp2 = temp2.next;
               
               
       }
           temp1.next = null;
           
               
           }
            
    }
    
     void deletemiddle(int index){
      Node temp1 = null, temp2 = head;
       if(head==null){
           System.out.println("no list exist!");
       }
       else{
           for (int i = 0; i < index; i++) {
                    temp1 = temp2;
                    temp2 = temp2.next;
           }
                temp1.next = temp2.next;
                  temp2.next = null;
           
           
        }
      
    }

}
