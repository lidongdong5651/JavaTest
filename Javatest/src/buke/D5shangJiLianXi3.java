package buke;
import java.util.Scanner;
public class D5shangJiLianXi3 {
	public static void main(String[] args) {
		D5shangJiLianXi3shangPin s1 = new D5shangJiLianXi3shangPin(1,"T 恤",245.0);
		D5shangJiLianXi3shangPin s2 = new D5shangJiLianXi3shangPin(2,"网球鞋",570.0);
		D5shangJiLianXi3shangPin s3 = new D5shangJiLianXi3shangPin(3,"网球拍",320.0);
		D5shangJiLianXi3shangPin[] arr = new D5shangJiLianXi3shangPin[] {s1,s2,s3};
		System.out.println("请选择购买的商品编号:\n"+ s1.goodsNo+"."+s1.name+"\t"+ s2.goodsNo+"."+s2.name+"\t"+ s3.goodsNo+"."+s3.name);
		System.out.println("*********************************************************************************************************");
		Scanner input = new Scanner(System.in);
		ShoppingCart gwc = new ShoppingCart();
		double Payable = gwc.shoppingCart(arr);
		double discount = 0.8;
		double payment = 0;
		System.out.println("请付款");
		payment = input.nextDouble();
		System.out.println("折扣:" + discount);
		System.out.println("应付金额:" + Payable*discount);
		System.out.println("实付金额:" + payment);
		if(Payable*discount <= payment){
			System.out.println("找钱:"+(payment - Payable*discount));
		}else{
			System.out.println("您所付金额不足");
		}
	}
	void dy(D5shangJiLianXi3shangPin[] arr,int a){
		for(D5shangJiLianXi3shangPin s : arr){
			if(a == s.goodsNo){
				System.out.println(s.name + "\t" + s.price);
			}
		}
	}
}
