package org.dsa.array;

public class CountOccurance {
    public int occurance(int[] arr,int x){
        int n=arr.length,found=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                found++;
            }
        }
        return found;
    }
}
