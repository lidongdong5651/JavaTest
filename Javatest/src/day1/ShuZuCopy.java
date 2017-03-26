package day1;
import com.lidong.ArrayMPPX;
//import java.util.Scanner;
public class ShuZuCopy {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};//源数组
		int a = 5;//从源数组a位置开始拷贝
		int x = 6;//拷贝的元素长度
		int[] dest = new int[10];//目标数组
		int a1 = 2 ;//从目标数组a1位置开始粘贴
		copy(arr,a,x,dest,a1);
		ArrayMPPX.parray(arr);
		ArrayMPPX.parray(dest);
	}
	public static int[] copy(int[] arr,int a,int x,int[] dest,int a1 ){
		for(int i = a;i < a+x;i++){
			dest[a1] = arr[i];
			a1++;
		}
		return dest;
	}
}
