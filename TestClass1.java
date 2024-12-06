/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass1;

/**
 *
 * @author Administrator
 */
public class TestClass1 {
    
    node root;
    public node addNode(node root, int data){
    node temp; 
    if(root==null){
    temp = new node(data);
    root = temp;
    }
    else if(data<root.data){
    root.left = addNode(root.left, data);
    }
    else if(data>root.data){
    root.right = addNode(root.right, data);
    }
    else{
        if (data<root.left.data) {
            root.left = addNode(root.left, data);
        }
        else if(data>root.right.data) {
            root.right = addNode(root.right, data);
        }
    
    }
    return root;
    }
    
    public void insertNode(int data){
        root = addNode(root, data);
    }
    
    public void inorder(node root){
        if (root!=null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    
    }
    
    public void preorder(node root){
        if (root!=null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    
    }
    
    public void postorder(node root){
        if (root!=null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    
    }

    public node getroot(){
    return root;
    }
    
     //TO take the data for deletion
    public void  delete(int data){
    root = deletenode(root, data);
    }
    
     //TO delete node
    public node deletenode(node root, int data){
      
    if(root==null){
    return root;
    }
    else if(data<root.data){
    root.left = deletenode(root.left, data);
    }
    else if(data>root.data){
    root.right = deletenode(root.right, data);
    }
    else{
        if (root.left==null) {
            return root.right;
        }
        else if (root.right==null) {
            return root.left;
        }
        root.data = successor(root);
        root.right = deletenode(root.right, data);
        
       
    
    }
    return root;     
        }
    
    public int successor(node root){
        while (root.left!=null) {            
            root = root.right;
        }
        return root.data;
    }
    
    
     //TO check if binary tree is BST or not
    boolean check(node root){
        if(root.data>root.left.data || root.data<root.right.data) {
            return true;
        }
        else if(root.left.data>root.data){
            return check(root.left);
        }
        else if(root.right.data< root.data){
            return check(root.right);
        }
        return false;
    }
    
    public static void main(String[] args) {
      
       TestClass1 s = new TestClass1();
       s.insertNode(34);
       s.insertNode(64);
       s.insertNode(74);
       s.insertNode(84);
       s.insertNode(94);
//       s.delete(74);
       
//        System.out.println("Inorder: ");
//        s.inorder(s.getroot());
//        
//         System.out.println("Preorder: ");
//        s.preorder(s.getroot());
//        
//         System.out.println("Postorder: ");
//        s.postorder(s.getroot());
        System.out.println(s.check(s.getroot()));
//       
    }
    
}



class node {
   
    int data;
    node left, right;
    
    node(int data){
    this.data = data;
    left = right = null;
    }
    
}

