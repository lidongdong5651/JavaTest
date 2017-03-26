package com.lidong;

public class Test {
	public static void main(String[] args) {
		int[] array = {1,2,4,7,5,9,2}; 
		for(int a = 0;a < array.length;a++){
			for(int i = 0;i<array.length - 1;i++){
				if(array[i] > array[i+1]){
					int b = array[i];
					array[i] = array[i+1];
					array[i+1] = b;
				}
			}
		}	
		parray(array);
	}
	public static void parray(int[] arr){
		for(int x = 0;x < arr.length;x++){
			System.out.print(arr[x]+"\t");
		}
		System.out.println();
	}
}
//if((i+1)>array.length){
//	break;
//}
