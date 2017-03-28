package buke;

public class D5shangJiLianXi3shangPin{
	int goodsNo;
	String name;
	double price;
	public D5shangJiLianXi3shangPin(int goodsNoa,String namea,double pricea){
		goodsNo = goodsNoa;
		name = namea;
		price = pricea; 
	}
	double jsjg(int amount,double price){
		double total = 0.0;
		total = amount*price;
		return total;
	}
}
