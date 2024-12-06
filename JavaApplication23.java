
package javaapplication23;


public class JavaApplication23 {
    
    public int[] sortarray(int arr[]){ // {4,2,5,3,6,7,1}
        int len = arr.length;
        for (int i = 0; i < len; i++) { // Round 1
            int flag = 0;
            for (int j = 0; j < len-1-i; j++) {
                if (arr[j]>arr[j+1]) { // 4 > 2 -> 5 > 3 -> 7 > 1
                    int temp = arr[j+1]; // temp = 2 -> temp = 3 -> temp = 1
                    arr[j+1] = arr[j]; // arr[j+1] = 4 -> arr[j+1] = 5 -> arr[j+1] = 7
                    arr[j] = temp; // arr[j] = 2 -> arr[j] = 3 -> arr[j] = 1
                    flag=1;
                }
               
            }
             if (flag==0) {
                    break;
                }
        }
    return arr;
    }
    
      public int[] insersationarray(int arr[]){ // {4,2,5,3,6,7,1}
        int len = arr.length;
        int temp;
        for (int i = 1; i < len; i++) {
            temp = arr[i]; // temp = 2 -> 3 
            int j = i; // j = 1 -> 3
            while (j>0 && arr[j-1]> temp) { // 1>0 && 4 > 2 -> 3>0 && 5 > 3             
                arr[j] = arr[j-1]; // arr[1] = 4 -> arr[3] = 5 
                j = j-1; // j = 0 -> 2
            }
            arr[j] = temp; // arr[0] = 2 -> arr[2] = 3 
            
            }
            
    return arr;
    }
      
         public int[] selectionarray(int arr[]){ // {4,2,5,3,6,7,1} -> {2,4,5,3,6,7,1} -> {2,4,3,5,6,7,1}
        int len = arr.length;
        int min=0, temp  = 0;
        for (int i = 0; i < len; i++) {
            min = i ; // min = 0 -> 1 -> 2 
            for (int j = i+1; j < len; j++) {
                
                if (arr[j]<arr[min]) { // 2 < 4 -> 5 < 4(false)-> 3 < 5 
                    min = j; // min = 1 -> 3
                }
               
            }
             temp = arr[i]; // temp = 4 -> 5
             arr[i] = arr[min]; // arr[0] = 2 -> arr[2] = 3 
             arr[min] = temp; // arr[1] = 4 -> arr[3] = 5 
        }
    return arr;
    }
         
         public void search_value(int value, int arr[]){
             for (int i = 0; i < arr.length; i++) {
                 if (value==arr[i]) { // 3 = arr[3] = 3
                     System.out.println("Value match at index["+i+"] = "+arr[i]);
                 }
             }
         }

    
    public void print(int arr[]){
        int len = arr.length;
        System.out.println("Array after sorting");
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        JavaApplication23 a = new JavaApplication23();
        int arr[] = {4,2,5,3,6,7,1};
        a.sortarray(arr);
        a.print(arr);

//        a.insersationarray(arr);
//        a.print(arr);
        
//        a.selectionarray(arr);
//        a.print(arr);

          a.search_value(7, arr);
    }
    
}
