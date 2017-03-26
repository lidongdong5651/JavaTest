package day1;
import com.lidong.*;
public class ArrayXZPX {
	public static void main(String[] args) {
		int[] arr = {1,7,6,2,5,6,7,2,1,3,6,7,9,5,2,6,4};
		xzpx(arr);
		Test2 dy = new Test2();
		ArrayMPPX.parray(arr);
		dy.parray(arr);
	}
	static int[] xzpx(int[] arr){
		int y = 0;
		int a = 0;
		int b = 0;
		for(a = 0;a < arr.length;a++){
			for(b = a;b < arr.length;b++){
				if(arr[a] > arr[b]){
					y = arr[a];
					arr[a] = arr[b];
					arr[b] = y;
				}
			}
		}
		return arr;
	}

}
