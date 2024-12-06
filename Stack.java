/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author SP20-BSSE-0027
 */
public class JavaApplication2 {

    
    public static void main(String[] args) {
        stack s = new stack(4);
        s.push(23);
        s.push(24);
        s.push(54);
        s.push(5);
        System.out.println("Stack is empty: "+s.isempty());
        System.out.println("PRINT NUMBERS");
        s.print();
        System.out.println("Delete and Show Number");
        System.out.println(s.pop());
        System.out.println("Get the First element from the stack");
        s.peek();
     
        
    }
    
}

class stack{
int []data1;
int size = -1;
int indexmax;

stack(int indexmax){
    this.indexmax = indexmax;
    data1 = new int[indexmax];
}

//Add number on the top of stack
void push(int data){
if(indexmax<size){
    System.out.println("Stack is full");  
}
else{
    ++size;
    data1[size] = data;
    

}
}

//Show numbers that we added using push
void print(){
    for (int i = size; i >= 0; i--) {
        System.out.println(data1[i]);
    }
}

//Delete the first number on the top and show the number that was deleted
int pop(){
    int data;
    if(size==-1){
        System.out.println("Stack is empty");
        return 0;
    }
    else{
        data = data1[size];
        size--;
        return data;
    }

    
}

//Check if the stack is empty or not
boolean isempty(){
    return size<0;
}

//Get the first element from the stack
void peek(){
    System.out.println(data1[size]);
}

}