package com.lidong;

public class Test {
	public static void main(String[] args) {
		int[] array = {1,2,4,7,5,9,2};
		mppx(array);
		parray(array);
	}
	public static void parray(int[] arr){
		for(int x = 0;x < arr.length;x++){
			System.out.print(arr[x]+"\t");
		}
		System.out.println();
	}
	public static int[] mppx(int[] arr){
		for(int a = 0;a < arr.length;a++){
			for(int i = 0;i<arr.length - 1;i++){
				if(arr[i] > arr[i+1]){
					int b = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = b;
				}
			}
		}	
		return arr;
	}
	
}
//if((i+1)>array.length){
//	break;
//}
