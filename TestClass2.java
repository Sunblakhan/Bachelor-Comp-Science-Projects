/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass2;

/**
 *
 * @author Administrator
 */
public class TestClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Node obj = new Node();
       obj.push(3);
       obj.push(4);
       obj.push(7);
       obj.push(9);
       obj.push(11);
       obj.pop();
       obj.print();
       obj.reverse_print();
        obj.prime();
    }
    
}

class Node{
    int data;
    Node next, previous;
    Node top=null,bottom=null;
    
 
    //TO add number in Stack
   public void push(int data){
       Node new_Node = new Node();
       new_Node.data = data;
       if (top==null) {
           top = bottom = new_Node;
           top.next = null;  
           top.previous = null;
       }
       else{
          new_Node.next = top;
          top.previous = new_Node;
          top = new_Node;
   
       }
       
   }
   //TO print and delet the top in Stack
   public void pop(){
       if (top==null) {
           System.out.println("Stack is empty");
       }
       else{
       System.out.println(top.data);
       top = top.next;
       }
   }
   
   //TO print from top to bottom in stack
   public void print(){
   Node temp = top;
   
   while (temp.next!=null) {   
        System.out.println(temp.data);
        temp = temp.next;
           }
        System.out.println(temp.data);
   }
   
    //TO print from bottom to top in stack
   public void reverse_print(){
   Node temp = bottom;
   
   while (temp.previous!=null) {   
        System.out.println(temp.data);
        temp = temp.previous;
           }
        System.out.println(temp.data);
   }
   
    //TO count numbers from the linked list using prime condition
   public boolean isPrime(int count){
   if(count<=1){
   return false;
   }
   else if(count<=3){
   return true;
   }
   else if(count%2==0 || count%3==0){
   return false;
   }
   else{
       return true;
   }
   }
   
    //TO implement prime number method in linked list
   public void prime(){
    Node temp1 = top;
    int count = 0;
       while (temp1!=null) {           
           if (isPrime(temp1.data)) {
               System.out.println(temp1.data);
               count++;
           }
          temp1 = temp1.next;
       }
   }
   }

