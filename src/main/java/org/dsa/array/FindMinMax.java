package org.dsa.array;

public class FindMinMax {
     public int[] minmax(int arr[]){
         int min=arr[0],max=arr[0];
         for (int i = 1; i <arr.length; i++) {
             if(arr[i]<min){
                 min=arr[i];
             }
             if(arr[i]>max){
                 max=arr[i];
             }
         }
         int[] res={min,max};
         return res;
    }
}
