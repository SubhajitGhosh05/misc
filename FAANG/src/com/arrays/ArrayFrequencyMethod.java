package com.arrays;

public class ArrayFrequencyMethod
{
	public static void main(String[] args) {
int [] arr={1,2,3,1};
int [] visitedArr=new int[arr.length];
int [] FinArr=Frequency(arr,visitedArr);
for(int i=0;i<FinArr.length;i++){
    if(FinArr[i]!=-1){
        System.out.println("Frequency of "+arr[i]+" is:"+FinArr[i]);
    }
}
	}
	
	public static int[] Frequency(int [] arr, int [] visitedArr){
	int visited=-1;
	for(int i=0;i<arr.length;i++){
	   int count=1; 
	   for(int j=i+1;j<arr.length;j++){
	       if(arr[i]==arr[j]){
	           count++;
	           visitedArr[j]=visited;
	       }
	   }
	   if(visitedArr[i]!=visited){
	       visitedArr[i]=count;
	   }
	   

	}
		   return visitedArr;
	}
}
