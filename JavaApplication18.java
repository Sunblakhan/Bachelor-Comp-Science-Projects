
package javaapplication18;


public class JavaApplication18 {

  
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);     
        
        
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);       
        
        q.print1();
        System.out.println(q.dequeue()); 
        System.out.println(q.Dequeue());
        
    }
    
}

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
    
    public void push(int data)
    {
    if(top==size-1)
    {
        System.out.println("Stack is full");
    }
    else
    {
    top++;
    stack[top]=data;
    }
    }
    public int pop()
    {
        int data;
    if(top==-1)
    {
        System.out.println("Stack is Empty");
        return 0;
    }
    else
    {
        data=stack[top];
        top--;
    }
    return data;
    }
    
    public void print()
    {
    for(int loop=top; loop>=0;loop--)
    {
        System.out.println(stack[loop]);
    }
    }
    
    public boolean isEmpty()
    {
    return top==-1;
    }
    public boolean isFull()
    {
        return top==size-1;
    }
}

class queue{
Stack s1= new Stack(10);
Stack s2= new Stack(10);

void enqueue(int data){ // O(n)
    
if(s1.isEmpty() && s2.isEmpty()){
    System.out.println("Both Stack are empty");
}
else{
    
    while (!s1.isEmpty()) {        
      s2.push(s1.pop()); // index = 0 -> 1, index = 1 -> 2, index = 2 -> 3 from stack 1 to stack 2
    }
    s1.push(data);
    while (!s2.isEmpty()) {        
      s1.push(s2.pop()); // index = 0 -> 3, index = 1 -> 2, index = 2 -> 1 from stack 2 to stack 1
    }

}
}

public int dequeue() //O(1)
    {
    int data;
    
    data = s1.pop(); // index = 0 -> 1
        return data;
   
    
    }
    

void print1(){
if(!s1.isEmpty())
    {  s1.print();
        System.out.println("");
    }
    if(!s2.isEmpty())
    {
    s2.print();
        System.out.println("");
    }
}

void Enqueue(int data) //O(1)
    {
    if(s1.isFull()) 
    {
        System.out.println("Full");
    }
    else
    {
    s1.push(data); // index = 0 -> 1, index = 1 -> 2, index = 2 -> 3
    
    }
    }
    
     int Dequeue() //O(n)
    {
      int data=0;
    if(s1.isEmpty() && s2.isEmpty())
    {
        System.out.println("Empty");
    }
    else
    {
    if(s2.isEmpty())
    {
    while(!s1.isEmpty()) 
    {
    s2.push(s1.pop()); //index = 0 -> 3, index = 1 -> 2, index = 2 -> 1 from stack 1 to stack 2
    }
    }
    data=s2.pop(); // 1 pop
    }
    return data;
    }

}
