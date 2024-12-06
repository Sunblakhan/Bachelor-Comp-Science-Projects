/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunbla_sp20.bsse.pkg0027.lab_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ucs
 */
public class Sunbla_sp20Bsse0027Lab_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //calling of task 1
//       UtilityActions u = new UtilityActions();
//       u.inputmarks();
//       u.Max();
//       u.Min();
//       u.average();
       
       //calling of task 2
//       PlayWithMatrix p = new PlayWithMatrix();
//       p.inputnum();
//       p.addition();
//       p.subtraction();
//       p.multiplication();
       
       //calling of task 3
       ProcessText s = new ProcessText();
       s.FindandReplace("Sumbla", 'm', 'n');
       int []data = {42,63,46,82,22,54};
       s.SearchandReplace(data, 82, 56);
       
       
       
       //calling of task 4
//       Auditorium a = new Auditorium();
//       a.swap();

        //calling of task 5
//        PSL P = new PSL();
//        P.Selection();
       
       
    }
    
}

// Task 1
class UtilityActions{
    int marks[] = new int[5];
    int max=0,min = 100, sum = 0;
    Scanner sc= new Scanner(System.in);
    
    void inputmarks(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the marks of student "+(i+1)+": ");
            marks[i] = sc.nextInt();
        }
        
    }
    void Max(){
        for (int i = 0; i < 5; i++) {
            if(marks[i]>max){
            max = marks[i];
            }           
        }
        for (int i = 0; i < 5; i++) {
            if (marks[i]==max) {
             System.out.println("Maximum marks of student "+(i+1)+": "+max);

            }
        }
    }
    void Min(){ 
        for (int i = 0; i < 5; i++) {
            if(marks[i]<min){
            min = marks[i];
            }
            
        }
        for (int i = 0; i < 5; i++) {
            if (marks[i]==min) {
             System.out.println("Minimum marks of student "+(i+1)+": "+min);

            }
        }
       
    }
    void average(){
        for (int i = 0; i < 5; i++) {
            sum = marks[i]+sum;
        }
        System.out.println("Average marks: "+sum/marks.length);
    }
}

//Task 2
class PlayWithMatrix{
    int arr[][] = new int[2][2];
    int add=0,sub=0, mul = 1;
    Scanner sc= new Scanner(System.in);
    
     void inputnum(){
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                 System.out.println("Enter the num "+(j+1)+": ");
                arr[i][j] = sc.nextInt();
            }
           
        }
        
    }
 void addition(){
     for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                 add = add + arr[i][j];
            }
           
        }
     System.out.println("Addition of two numbers: "+add);
 }
 void subtraction(){
     for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                 sub =  - sub - arr[i][j] ;
            }
           
        }
     System.out.println("Subtraction of two numbers: "+sub);
 }
 void multiplication(){
      for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                 mul =  mul * arr[i][j] ;
            }
           
        }
     System.out.println("Multiplication of two numbers: "+mul);
 }
}

//Task 3
class ProcessText{

     
   
    void FindandReplace (String text, char f, char r){
        System.out.println("Before: "+text);
        System.out.println("After replacing characters from "+ f +" to " +r+": "+text.replace(f, r));
    }
    
    void SearchandReplace(int []data,int a, int b){
        
        System.out.println("\nArray: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        
        System.out.println("After replacing characters from "+ a +" to " +b+": ");
        for (int i = 0; i < data.length; i++) {
            if (data[i]==a) {
                data[i]= b;
            }
            System.out.println(data[i]);
        }
    }

}


//Task 4
class Auditorium{
ArrayList<String> a = new ArrayList<>(Arrays.asList("Men","Women","Men","Women"));
ArrayList<String> b = new ArrayList<>(Arrays.asList("Men","Men","Men","Women","Women"));
ArrayList<String> temp = new ArrayList<>();

void swap(){
    
    a.addAll(b);
    temp.addAll(a);

    a.removeIf(a->a.equals("Women"));
    System.out.println("Block A"+a);
    
    temp.removeIf(temp->temp.equals("Men"));
    System.out.println("Block B"+temp);
    
}
}

class PSL{
    ArrayList<String> KK = new ArrayList<>();
    
    void Selection(){
        KK.add("Babar Azam");
        KK.add("Imad Wasim");
        KK.add("Alex Hales");
        KK.add("Amir Yamin");
        KK.add("Chadwick Walton");
        KK.add("Joe Clarke");
        KK.add("Zeeshan Malik");
        KK.add("Danish Aziz");
        KK.add("Qasim Akram");
        KK.add("Qasim Akram");
        
        System.out.println("---Team Players List----\n"+KK);
        
        System.out.println("KK list contains Babar Azam: "+KK.contains("Babar Azam"));
        
        System.out.println("KK Total Players: "+KK.size());
        
        KK.add(2,"Muhammad Amir");
        
        System.out.println("After Adding Amir to the team on the 3rd position: "+KK);
        
        KK.remove("Imad Wasim");
        
        System.out.println("After removing Imad from the team: "+KK);
        
        System.out.println("Check if the team doesn't have any players: "+KK.isEmpty());
       
        
        
    
    }

}

