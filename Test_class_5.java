/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_class_5;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 *
 * @author ucs
 */
public class Test_class_5 {

    boolean T;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Propositions p1 = new Propositions();
//        p1.Conjunction_proposition();
//        p1.Conjunction_truth_table();
//        p1.Conjuntion(1, 2);
//        
//        Propositions p2 = new Propositions();
//        p2.Disjunction_proposition();
//        p2.Disjunction_truth_table();
//        p2.Disjunction(3, 4);
//        
//        Propositions p3 = new Propositions();
//        p3.ExclusiveOR_proposition();
//        p3.ExclusiveOR_truth_table();
//        p3.ExclusiveOR(2, 4);
//        
//         Propositions p4 = new Propositions();
//        p4.conditional_proposition();
//        p4.conditional_truth_table();
//        p4.conditional(1,4);
//        
//         Propositions p5 = new Propositions();
//        p5.biconditional_proposition();
//        p5.biconditional_truth_table();
//        p5.biconditional(2,3);

//          twoBitString s = new twoBitString();
//          s.OR(11101, 11110);
//          s.XOR(11101, 11110);
//          s.And(11101, 11110);
//        
        function f = new function();
        f.one_to_one();
        f.onto();
    }
    
}


//Question no 1
class Propositions{

    String p = "Sunbla is the student of Discrete structure";
    String q = "Sunbla get an A in DS";
    String not_p = "Sunbla is not the student of Discrete structure";
    String not_q = "Sunbla doesn't get an A in DS";
    int num1, num2;
    
    //Conjunction 
    
    void Conjunction_proposition(){
        System.out.println("Consider number for every proposition..");
        System.out.println("1. (True)"+p);
        System.out.println("2. (True)"+q);
        System.out.println("3. (False)"+not_p);
        System.out.println("4. (False)"+not_q);
    }
    
    void Conjunction_truth_table(){
        //Truth Table
        System.out.println("Conjuntion Truth Table");
        System.out.println(" p \t q \t p AND q");
        System.out.println(" 1 \t 1 \t   1" );
        System.out.println(" 1 \t 0 \t   0" );        
        System.out.println(" 0 \t 1 \t   0" ); 
        System.out.println(" 0 \t 0 \t   0" );

    }
    
void Conjuntion(int num1, int num2){
    
    this.num1 = num1;
    this.num2 = num2;
    if(num1==1 && num2==2){
        System.out.println("True");
        System.out.println(p+" And "+q);
     }   
    else if(num1==1 && num2==3){
        System.out.println("False");
        System.out.println(p+" And "+not_p);
    }
    else if(num1==1 && num2==4){
        System.out.println("False");
        System.out.println(p+" And "+not_q);
    }
    else if(num1==2 && num2==3){
        System.out.println("False");
        System.out.println(q+" And "+not_p);
    }
    else if(num1==2 && num2==4){
        System.out.println("False");
        System.out.println(q+" And "+not_q);
    }
    else if(num1==3 && num2==4){
        System.out.println("False");
        System.out.println(not_p+" And "+not_q);
    }

}  





// Disjunction

    
    void Disjunction_proposition(){
        System.out.println("Consider number for every proposition..");
        System.out.println("1. (True)"+p);
        System.out.println("2. (True)"+q);
        System.out.println("3. (False)"+not_p);
        System.out.println("4. (False)"+not_q);
    }
    
    void Disjunction_truth_table(){
        //Truth Table
        System.out.println("Disjunction Truth Table");
        System.out.println(" p \t q \t p OR q");
        System.out.println(" 1 \t 1 \t   1" );
        System.out.println(" 1 \t 0 \t   1" );        
        System.out.println(" 0 \t 1 \t   1" ); 
        System.out.println(" 0 \t 0 \t   0" );

    }
    
void Disjunction(int num1, int num2){
    
    this.num1 = num1;
    this.num2 = num2;
    if(num1==1 && num2==2){
        System.out.println("True");
        System.out.println(p+" OR "+q);
    }
    else if(num1==1 && num2==3){
        System.out.println("True");
        System.out.println(p+" OR "+not_p);
    }
    else if(num1==1 && num2==4){
        System.out.println("True");
         System.out.println(p+" OR "+not_q);
    }
    else if(num1==2 && num2==3){
        System.out.println("True");
        System.out.println(q+" OR "+not_p);
    }
    else if(num1==2 && num2==4){
        System.out.println("True");
        System.out.println(q+" OR "+not_q);
    }
    else if(num1==3 && num2==4){
        System.out.println("True");
        System.out.println(not_p+" OR "+not_q);
    }
    else if(num1==3 && num2==3){
          System.out.println("False");
        System.out.println(not_p+" OR "+not_p);
    }
      else if(num1==3 && num2==4){
          System.out.println("False");
        System.out.println(not_p+" OR "+not_q);
    }
      else if(num1==4 && num2==4){
          System.out.println("False");
        System.out.println(not_q+" OR "+not_q);
    }

}   


//Disjunction Exclusive OR
    void ExclusiveOR_proposition(){
        System.out.println("Consider number for every proposition..");
        System.out.println("1. (True)"+p);
        System.out.println("2. (True)"+q);
        System.out.println("3. (False)"+not_p);
        System.out.println("4. (False)"+not_q);
    }
    
    void ExclusiveOR_truth_table(){
        //Truth Table
        System.out.println("Exclusive OR Truth Table");
        System.out.println(" p \t q \t p XOR q");
        System.out.println(" 1 \t 1 \t   0" );
        System.out.println(" 1 \t 0 \t   1" );        
        System.out.println(" 0 \t 1 \t   1" ); 
        System.out.println(" 0 \t 0 \t   0" );

    }
    
void ExclusiveOR(int num1, int num2){
    
    this.num1 = num1;
    this.num2 = num2;
    if(num1==1 && num2==2){
        System.out.println("False");
        System.out.println(p+" XOR "+q);
    }
    else if(num1==1 && num2==3){
        System.out.println("True");
        System.out.println(p+" XOR "+not_p);
    }
    else if(num1==1 && num2==4){
        System.out.println("True");
         System.out.println(p+" XOR "+not_q);
    }
    else if(num1==2 && num2==3){
        System.out.println("True");
        System.out.println(q+" XOR "+not_p);
    }
    else if(num1==2 && num2==4){
        System.out.println("True");
        System.out.println(q+" XOR "+not_q);
    }
    else if(num1==3 && num2==4){
        System.out.println("False");
        System.out.println(not_p+" XOR "+not_q);
    }
    else if(num1==3 && num2==3){
          System.out.println("False");
        System.out.println(not_p+" XOR "+not_p);
    }
      else if(num1==3 && num2==4){
          System.out.println("False");
        System.out.println(not_p+" XOR "+not_q);
    }
      else if(num1==4 && num2==4){
          System.out.println("False");
        System.out.println(not_q+" XOR "+not_q);
    }

}   

// Conditional Statement
        void conditional_proposition(){
        System.out.println("Consider number for every proposition..");
        System.out.println("1. (True)"+p);
        System.out.println("2. (True)"+q);
        System.out.println("3. (False)"+not_p);
        System.out.println("4. (False)"+not_q);
    }
    
    void conditional_truth_table(){
        //Truth Table
        System.out.println("Conditional Truth Table");
        System.out.println(" p \t q \t p -> q");
        System.out.println(" 1 \t 1 \t   1" );
        System.out.println(" 1 \t 0 \t   0" );        
        System.out.println(" 0 \t 1 \t   1" ); 
        System.out.println(" 0 \t 0 \t   1" );

    }
    
void conditional(int num1, int num2){
    
    this.num1 = num1;
    this.num2 = num2;
    if(num1==1 && num2==2){
        System.out.println("True");
        System.out.println("If "+p+" then "+q);
    }
    else if(num1==1 && num2==3){
        System.out.println("False");
        System.out.println("If "+p+" then "+not_p);
    }
    else if(num1==1 && num2==4){
        System.out.println("False");
         System.out.println("If "+p+" then "+not_q);
    }
    else if(num1==2 && num2==3){
        System.out.println("False");
        System.out.println("If "+q+" then "+not_p);
    }
    else if(num1==2 && num2==4){
        System.out.println("False");
        System.out.println("If "+q+" then "+not_q);
    }
    else if(num1==3 && num2==4){
        System.out.println("True");
        System.out.println("If "+not_p+" then "+not_q);
    }
    else if(num1==3 && num2==3){
          System.out.println("True");
        System.out.println("If "+not_p+" then "+not_p);
    }
      else if(num1==3 && num2==4){
          System.out.println("True");
        System.out.println("If "+not_p+" then "+not_q);
    }
      else if(num1==4 && num2==4){
          System.out.println("True");
        System.out.println("If "+not_q+" then "+not_q);
    }

}   


// Conditional Statement
        void biconditional_proposition(){
        System.out.println("Consider number for every proposition..");
        System.out.println("1. (True)"+p);
        System.out.println("2. (True)"+q);
        System.out.println("3. (False)"+not_p);
        System.out.println("4. (False)"+not_q);
    }
    
    void biconditional_truth_table(){
        //Truth Table
        System.out.println("Biconditional Truth Table");
        System.out.println(" p \t q \t p <-> q");
        System.out.println(" 1 \t 1 \t   1" );
        System.out.println(" 1 \t 0 \t   0" );        
        System.out.println(" 0 \t 1 \t   0" ); 
        System.out.println(" 0 \t 0 \t   1" );

    }
    
void biconditional(int num1, int num2){
    
    this.num1 = num1;
    this.num2 = num2;
    if(num1==1 && num2==2){
        System.out.println("True");
        System.out.println("If and only if "+p+" then "+q);
    }
    else if(num1==1 && num2==3){
        System.out.println("False");
        System.out.println("If and only if "+p+" then "+not_p);
    }
    else if(num1==1 && num2==4){
        System.out.println("False");
         System.out.println("If and only if "+p+" then "+not_q);
    }
    else if(num1==2 && num2==3){
        System.out.println("False");
        System.out.println("If and only if "+q+" then "+not_p);
    }
    else if(num1==2 && num2==4){
        System.out.println("False");
        System.out.println("If and only if "+q+" then "+not_q);
    }
    else if(num1==3 && num2==4){
        System.out.println("True");
        System.out.println("If and only if "+not_p+" then "+not_q);
    }
    else if(num1==3 && num2==3){
          System.out.println("True");
        System.out.println("If and only if "+not_p+" then "+not_p);
    }
      else if(num1==3 && num2==4){
          System.out.println("True");
        System.out.println("If and only if "+not_p+" then "+not_q);
    }
      else if(num1==4 && num2==4){
          System.out.println("True");
        System.out.println("If and only if "+not_q+" then "+not_q);
    }
     else if(num1==1 && num2==1){
          System.out.println("True");
        System.out.println("If and only if "+p+" then "+p);
    }
     else if(num1==2 && num2==2){
          System.out.println("True");
        System.out.println("If and only if "+q+" then "+q);
    }

}   

}


class twoBitString {
    int num1, num2, sum =0;
    int value1, value2;
    int [] Arr = new int[5];

    void OR(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
        for (int i = 0; i < Arr.length; i++) {
           value1 = num1%10;
           value2 = num2%10;
            
           num1 = num1/10;
           num2 = num2/10;
           
           sum = value1+value2;
           
           if(sum==0){
                Arr[i] = 0;
        }
        else if(sum==1 || sum==2){
                Arr[i] = 1;
                }

    }
       System.out.println("Bitwise OR");
        for (int j = Arr.length-1; j >= 0; j--) {
            System.out.print(Arr[j]);
        }
        System.out.println("\n");
    

}
    
    
     void XOR(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
        for (int i = 0; i < Arr.length; i++) {
           value1 = num1%10;
           value2 = num2%10;
            
           num1 = num1/10;
           num2 = num2/10;
           
           sum = value1+value2;
           
           if(sum==0 || sum==2){
                Arr[i] = 0;
        }
        else if(sum==1){
                Arr[i] = 1;
                }

    }
       System.out.println("Bitwise XOR");
        for (int j = Arr.length-1; j >= 0; j--) {
            System.out.print(Arr[j]);
        }
        System.out.println("\n");
    

}
     
      void And(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
        for (int i = 0; i < Arr.length; i++) {
           value1 = num1%10;
           value2 = num2%10;
            
           num1 = num1/10;
           num2 = num2/10;
           
           sum = value1+value2;
           
           if(sum==0 || sum==1){
                Arr[i] = 0;
        }
        else if(sum==2){
                Arr[i] = 1;
                }

    }
          System.out.println("Bitwise AND");
        for (int j = Arr.length-1; j >= 0; j--) {
            System.out.print(Arr[j]);
        }
        System.out.println("\n");
    

}
}

class function{
    void one_to_one(){
        System.out.println("One-to-one");
        System.out.println("a ----> 1");
        System.out.println("b ----> 2");
        System.out.println("c ----> 3");
        System.out.println("d ----> 4");
        System.out.println("e ----> 5");
        System.out.println("        6");
    }
    
     void onto(){
        System.out.println("Onto");
        System.out.println("a ----> 1\n\n");
        System.out.println("b ----> 2\n\n");
        System.out.println("c ----> 3\n\n");
        System.out.println("d ----> 4");
        System.out.println("      ^");
        System.out.println("     /");
        System.out.println("    /");
        System.out.println("   /");
        System.out.println("  /");
        System.out.println(" /");
        System.out.println("d");
        
     }

}