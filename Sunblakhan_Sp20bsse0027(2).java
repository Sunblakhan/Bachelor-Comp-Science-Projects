/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author ucs
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //task 2 implementation
//        Stack c = new Stack(10);
//        int stack [] = {1,2,3,4,5,6};
//        c.insert_multipleVal(stack);
//        c.print();
        
        //task 1 implementation
        queue q = new queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(2);
//        q.enqueue(4);
//        q.enqueue(5);
        q.count_DuplicateVal();

        // task 3 implementation
//        queue_linkedlist a = new queue_linkedlist();
//        a.enqueue(1);
//        a.enqueue(2);
//        a.enqueue(3);
//        a.print();
//        a.dequeue();
//        a.peek();
//        a.isEmpty();
    }
    
}

//task 2
class Stack {
    int top;
    int size;
    int [] stack=new int[size];
    
    Stack(int s)
    {
    top=-1;
    size=s;
    stack=new int[size];
    }
    
    
   public void insert_multipleVal(int[] values){
       if(top==-1)
    {
        System.out.println("Stack is full");
    }
    else
    {
        for (int i = 0; i < values.length; i++) {
            stack[i]=values[i];
            top++;
        }
    }
}
    
    
   
   
    
    public void print()
    {
    for(int i=top; i>=0;i--)
    {
        System.out.println(stack[i]);
    }
    }
    
}

//task 1
class queue{
    int front=0,rear=-1, count=0, size;
    int []queue = new int[size];
    

    queue(int size){
    this.size = size;
    queue = new int[size];
    }
    
    public void enqueue(int data){
    if(size==count){
        System.out.println("Queue is Empty");
    }
    else{
        queue[++rear] = data;
        count++;
    }
    }
    public void count_DuplicateVal(){
        int dupvalue=0;
        int dupcount = 0;
        for (int i = 0; i < queue.length; i++) {
            for (int j = 1; j < queue.length; j++) {
                if(queue[i]==queue[j]){
                      dupvalue = queue[i];
                      dupcount++;
                      break;
            }   
            }     
        }
        System.out.println(dupvalue);
        System.out.println(dupcount);
    }

}


class queue_linkedlist{
int data, size = 0;
queue_linkedlist next;
queue_linkedlist front, rear;

public void enqueue(int data)
    {
        queue_linkedlist node =new queue_linkedlist();
        node.data = data;
        if(front==null){
        front=rear=node;
        }
        else{ 
        queue_linkedlist n =new queue_linkedlist();
        n = rear;
        while (n.next!=null) {        
            n = n.next;
        }
        n.next = node;
        rear = node;
        
        
        }
    }

public void dequeue(){
if(front==null){
        System.out.println("Queue is empty");
    }
    else{
        System.out.println(front.data);
        front = front.next;
    }

}

public void peek(){
    System.out.println(front.data);
}

public void isEmpty(){
if(front==null){
    System.out.println("Queue is Empty");
}
}

public void print(){
queue_linkedlist temp=new queue_linkedlist();
            temp=front;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
}


}