/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.awt.BorderLayout;

/**
 *
 * @author ucs
 */
public class JavaApplication17 {

   
    public static void main(String[] args) {
        queue q = new queue(5);
        q.EnQueue(45);
        q.EnQueue(55);
        q.EnQueue(66);
        q.isEmpty();
        q.isFull();
        q.DeQueue();
        q.Peek();
        q.print();
        q.Reverse_print();
    }
    
}

class queue{
    int []queue;
    int count = 0;
    int size;
    int front=0;
    int rear=-1;
    
    queue(int size){
    this.size = size;
    queue = new int[size];
}
void EnQueue(int data){
    if(size==count){
    System.out.println("Queue is full");  
}
else{
    queue[++rear] = data;
        System.out.println(rear);
    count++;
}
}

void DeQueue(){
    if(count==0 || rear==-1){
    System.out.println("Queue is empty");
}
else{
      System.out.println(queue[front]);
      front++;
      count--;
        
}
    
}

void isEmpty(){
if(count==0 || rear==-1){
    System.out.println("Queue is empty");
}
else{
    System.out.println("Queue is not empty");
}
}

void Peek(){
 System.out.println(queue[front]);
}

void isFull(){
     if(size==count){
    System.out.println("Queue is full");  
}
     else{
     System.out.println("Queue is not full");  
     }
}

void print(){
     int printCount=0;
        int temp = front;
        System.out.println("Queue List");
        while(printCount!=count){
            System.out.print(" "+queue[temp]);
            temp = (temp+1)%size;
            printCount++;
}
}

void Reverse_print(){
    System.out.println("Reverse List");
    for (int i = rear; i >= front; i--) {
        System.out.println(queue[i]);
    }
}

}
