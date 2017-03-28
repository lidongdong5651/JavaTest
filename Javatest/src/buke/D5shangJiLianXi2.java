package buke;
import java.util.Scanner;
public class D5shangJiLianXi2 {
	public static void main(String[] args) {
		int goodsNo;
		double price1 = 245.0 ;
		String name1 = "T 恤";
		double price2 = 570.0 ;
		String name2 = "网球鞋";
		double price3 = 320.0 ;
		String name3 = "网球拍";
		boolean a = true;
		String select;
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统》购物结算");
		System.out.println("******************************************\n");
		System.out.println("请选择购买的商品编号:");
		System.out.println("1. T 恤\t2.网球鞋\t3.网球拍");
		System.out.println("******************************************\n");
		while(a){
			System.out.print("请输入商品编号:");
			goodsNo = input.nextInt();
			switch (goodsNo) {
				case 1:
					System.out.println(name1+"\t￥"+price1);
					break;
				case 2:
					System.out.println(name2+"\t￥"+price2);			
					break;
				case 3:
					System.out.println(name3+"\t￥"+price3);
					break;
				default:
					System.out.println("不存在该编号的商品");
					break;
			}
			System.out.print("是否继续（y/n）");
			select = "00";
			while(!(select.equals("y"))&&!(select.equals("n"))){
				select = input.next();
				if(select.equals("y")){
					a = true;
				}else if(select.equals("n")){
					a = false;
					System.out.println("程序结束！");
				}else{
					select = "dsadsa";
					System.out.println("您输入有误,请重新输入");
				}
			}
		}
	}
}
