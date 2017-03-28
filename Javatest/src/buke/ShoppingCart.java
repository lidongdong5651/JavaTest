package buke;

import java.util.Scanner;

public class ShoppingCart {
	double shoppingCart(D5shangJiLianXi3shangPin[] arr){
		Scanner input = new Scanner(System.in);
		String a = "y";
		double totalAmount = 0.0;
		double sum = 0.0;
		while("y".equals(a)){
			System.out.print("请输入商品编号:");
			int gds = input.nextInt();
			System.out.print("请输入购买数量:");
			int Quantity = input.nextInt();
			for(D5shangJiLianXi3shangPin x:arr){
				if(gds == x.goodsNo){
					System.out.println(x.name + x.price + "\t数量" + Quantity + "\t合计" + x.jsjg(Quantity, x.price));
					totalAmount = x.jsjg(Quantity, x.price);
				}
			}
			System.out.print("是否继续（y/n）:");
			a = input.next();
			sum += totalAmount;
		}
		return sum;
	}
}
