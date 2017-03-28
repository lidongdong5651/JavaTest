package buke;

public class D5shangJiLianXi{
	public static void main(String[] args) {
		D5shangJiLianXi oushuhe = new D5shangJiLianXi();
		System.out.println(oushuhe.qiuhe());
	}
	int qiuhe(){
		int sum = 0, num = 2;
		while(num < 100){
			sum = sum + num;
			num = num + 2;
		}
		return sum;
	}

}
