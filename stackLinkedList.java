/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author ucs
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        node n = new node();
        n.isempty();
        n.push(2);
        n.push(4);
        n.push(5);
        n.print();
        n.pop();
        n.peek();
    }
    
}

class node{
int data;
node next;
node top = null;
public void push(int data)
    {
        node new_node =new node();
        new_node.data=data;
        new_node.next=top;
        top=new_node;
    }



public void print()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            node temp=new node();
            temp=top;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

void isempty(){
    if(top==null){
        System.out.println("Stack is empty");
    }
    else{
        System.out.println("Stack is not empty");}
}

void peek(){
    System.out.println(top.data);
}

void pop(){
    if(top==null){
        System.out.println("Stack is empty");
    }
    else{
        System.out.println(top.data);
        top = top.next;
    }

    
}

}
