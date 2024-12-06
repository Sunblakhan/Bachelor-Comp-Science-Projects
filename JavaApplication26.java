/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author ucs
 */
    

public class JavaApplication26 {
     Node root;
      public Node addNode(Node node, int value){
       if(node==null){
         node = new Node(value);
         return node;
       } 
       else if(value<node.data)  
       {
           node.left = addNode(node.left,value); // save value to left node
       }
       else if(value>node.data){
            node.right  = addNode(node.right,value); // save value to right node
       }
       return node;
   }
      
       public void Insertnode(int data){
        root = addNode(root,data);
   }
      //First go to left, root and then right
        public void inorder(Node root){
   if(root!=null){
       inorder(root.left);
       System.out.println(root.data);
       inorder(root.right);
   }
   }
        
             //First go to root, left and then right
   public void preorder(Node root){
   if(root!=null){
       System.out.println(root.data);
       preorder(root.left);
       preorder(root.right);
   }
   }
    // First go to left, right and then root
   public void postorder(Node root){
   if(root!=null){
       postorder(root.left);
       postorder(root.right);
       System.out.println(root.data);
       
   }
   }
   
   //it will return the value of root
   public Node getroot(){
   return root;
   }
        //search value in BST
        Node search(Node root, int data)  { 
        if (root==null || root.data==data) 
            return root; 
        if (root.data > data) 
            return search(root.left, data); 
            return search(root.right, data); 
    } 

        //check if root is null or not
     public boolean Search_Val(int value){
       root = search(root, value); 
        if (root!= null)
            return true;
        else
            return false;
        
        }
     //array sorting 
     public int[] Sorting(int[] arry){
         int len = arry.length;
      int[] output = new int[len + 1];
      int max = arry[0];
    for (int i = 1; i < len; i++) {
      if (arry[i] > max)
        max = arry[i];
    }
    int[] count = new int[max + 1];

    for (int i = 0; i < max; ++i) {
      count[i] = 0;
    }

    for (int i = 0; i < len; i++) {
      count[arry[i]]++;
    }

    for (int i = 1; i <= max; i++) {
      count[i] += count[i - 1];
    }

    for (int i = len - 1; i >= 0; i--) {
      output[count[arry[i]] - 1] = arry[i];
      count[arry[i]]--;
    }

    for (int i = 0; i < len; i++) {
      arry[i] = output[i];
    }

            
    return arry;
     }
     
     public void print(int arr[]){
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]); 
         }
     }
     
     
  
    public static void main(String[] args) {
        int[] arry = {5,4,3,2,1};
        
        //task 1
         JavaApplication26 a = new JavaApplication26();
        a.Insertnode(34);
        a.Insertnode(65);
        a.Insertnode(87);
        a.Insertnode(84);
        a.inorder(a.getroot());
        System.out.println("Value found: "+a.Search_Val(65));
        
        //task 2
        a.Sorting(arry);
        a.print(arry);
    }
    
}


