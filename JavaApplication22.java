
package javaapplication22;


public class JavaApplication22 {

   Node root;

    //it will create node
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
   
   //add the value through this method to Node
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
   
   public void printinorder(){
   inorder(root);
   }
    public void printpreorder(){
   preorder(root);
   }
     public void printpostorder(){
   postorder(root);
   }
   
   
  
    public static void main(String[] args) {
        JavaApplication22 a = new JavaApplication22();
        a.Insertnode(2);
        a.Insertnode(1);
        a.Insertnode(7);
        a.Insertnode(8);
        a.Insertnode(6);
        a.Insertnode(9);
        System.out.println("Inorder Printing");
        a.inorder(a.getroot());
//        a.printinorder();
        System.out.println("Preorder Printing");
//        a.printpreorder();
        a.preorder(a.getroot());
        System.out.println("Postorder Printing");
        a.postorder(a.getroot());
//        a.printpostorder();

        
    }
    
}
