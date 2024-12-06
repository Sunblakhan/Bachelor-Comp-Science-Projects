/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author ucs
 */
public class JavaApplication27 {

    public static void main(String[] args) {
//        int []arr ={24,54,34,76,82,31,21,11};
//        JavaApplication27 j = new JavaApplication27();
//        int []result =j.mergesort(arr);
//        j.print(result);
//        

//        miss I tried to implement quick sort by two method. I take temp as a middle of array 
//        but it was not showing fully sorted array then I take temp as a right of array(last index) 
//        but again it is not showing fully sorted array. Mam, could you please show how to implement it correctly in the next class?
//        JavaApplication27 j = new JavaApplication27();
//        int []arr1 = {5,3,46,7,8,53,98,43,1};
//        int len = arr1.length;
//            j.repeat(arr1,0, len-1);
//            j.print(arr1);
        
    }
    
    public int[] mergesort(int []arr){
        if (arr.length<=1) {
            return arr;
        }
        else{
        int mid = arr.length/2;
        int []left = new int[mid];
        int []right;
            if (arr.length%2==0) {
                right = new int[mid];
            }
            else{
                right = new int[mid+1];
            }
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int j = 0; j < mid; j++) {
                right[j] = arr[mid+j];
            }
            int []result = new int[arr.length];
            left = mergesort(left);
            right = mergesort(right);
            result = merge(left,right);
            return result;
        }
    }
    
    public int[] merge(int[] left, int[]right){
    int []result = new int[left.length+right.length];
    int leftp,rightp,resultp;
    leftp=rightp=resultp=0;
        while (leftp<left.length || rightp<right.length) {            
            if (leftp<left.length && rightp<right.length) {
                if (left[leftp]<right[rightp]) {
                    result[resultp++] =left[leftp++];
                }
                else{
                    result[resultp++] =right[rightp++];
                }
            }
            else if(leftp<left.length ){
                result[resultp++] =left[leftp++];
            }
            else if(rightp<right.length){
                result[resultp++] =right[rightp++];
            }
            }
        return result;
        }
    
    public void print(int []arr){
    
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
}
    
    public int quicksort(int []arr, int left, int right){
    
   // pivot
    int temp = arr[right];
     
    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (left - 1);
 
    for(int j = left; j <= right - 1; j++)
    {
         
        if (arr[j] < temp)
        {
            i++;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
    temp = arr[left+1];
    arr[left+1] = arr[right];
    arr[right] = temp;
    return left+1;
   
               
    }
    
    public void repeat(int []arr, int left, int right){
        if (left < right)
    {
        int pi = quicksort(arr, left, right);
        quicksort(arr, left, pi - 1);
        quicksort(arr, pi + 1, right);
    }

        
    }
    
}
