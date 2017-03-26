package day1;

public class ArraySouSuo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};//源数组
		int a = xianXingSS(arr,16);
		System.out.println(a); 
		System.out.println(erFenSS(arr,19));
	}
	public static int xianXingSS(int[] arr,int a){
		for(int i = 0;i < arr.length;i++){
			if(a == arr[i]){
				return i;
			}
		}
		return -1;
	}
	public static int erFenSS(int[] arr,int a){
		int x = 0;
		int y = arr.length-1;
		int z = (x + y)/2;
		for(int i = 0;i < arr.length;i++){
			z = (x + y)/2;
			if(arr[z] == a){
				return z;
			}else if(arr[z] > a){
				y = z - 1;
			}else{
				x = z + 1;
			}
		}
		return -1;
	}
}
