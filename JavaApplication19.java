/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Stack;

/**
 *
 * @author ucs
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication19 a = new JavaApplication19();
        String s1 = "(a+b)*(a-b)/(c-d)*b";
        System.out.println("From Infix["+s1+"] to Postfix: "+a.infixToPostfix(s1));
        String s2 = "231*+9-";
        System.out.println("Solve the following postfix expression["+s2+"] :"+ a.Postfix_stack(s2));
        
        
    }
    
    // Method to solve postfix expression
   public int Postfix_stack(String str){
    Stack<Integer> stack = new Stack<>();
    char ch[]=str.toCharArray(); 
 
    
    for(char loop:ch) // will read all the values in String
    { 
        if(loop>='0'&& loop<='9') // if values are digit between 0 to 9
        { 
            stack.push((int)(loop-'0'));// add values in stack like index 0 (2), index 1 (3), index 2 (1)  
        } 
        else //if the element is not number but operand 
        { 
            int y=stack.pop();// pop value (1) - (2nd time) pop 3 - (3rd time) pop 5
            int x=stack.pop();// pop value (3) - (2nd time) pop 2 - (3rd time) pop 9
        switch (loop){ //check the operand
            case '+': 
                stack.push(x+y);  //since the operand is + push (3+2=5) second time
                break; 
            case '-': 
                stack.push(x-y); // //since the operand is + push (5-9=-4) second time
                break; 
            case '*':
                stack.push(x*y); // since the operand is * push (3*1=3) first time 
                break; 
            case '/': 
                stack.push(x/y); 
                break; 
                    }
        } 
    } 
    return stack.pop(); // reeturn -4 as a final answer
    
    
    }
   
   // Method to check the operands in infix equation
   int Prec(char ch)
    {
        
        switch (ch) 
        {
        case '+':
        case '-':
            return 1; // if the operand is + or - return 1
      
        case '*':
        case '/':
            return 2; // if the operand is * or / return 2
      
        case '^':
            return 3; // if the operand is ^ return 3
        }
        return -1;
    }
   
   
   //
   String infixToPostfix(String str)
    {
        
        String result = new String(""); // it will save final result
         
        Stack<Character> s = new Stack<>();
         
        for (int i = 0; i<str.length(); i++) // read the element one by one 
        {
            char c = str.charAt(i); 
             
            // if the element is number add it to result (final answer)
            if(Character.isLetterOrDigit(c)){
                result += c;
            }
            else if (c == '('){ // if it is open parranthesis push it to character
                s.push(c);
            }
            else if (c == ')') // if it is close parranthesis push it to character
            {
                while (!s.isEmpty() && s.peek() != '('){ 
                    result += s.pop();
                    
                }
                s.pop(); // pop the value
            }
            else 
            {
                while (!s.isEmpty() && Prec(s.peek())>= Prec(c)){ //take two elements and operand
                    result += s.pop(); // add it to result
             }
                s.push(c); 
            }
      
        }
      
        // pop all the operators from the stack
        while (!s.isEmpty()){
            if(s.peek() == '('){
                return "Invalid Expression";
            }
            result += s.pop();
         }
        return result;
    }
   
  
}
