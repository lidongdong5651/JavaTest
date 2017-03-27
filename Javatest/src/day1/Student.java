package day1;

public class Student {
	static String name;
	boolean isFee = false;
	public void fees(){
		//name = "a";可以
		isFee = true;	
		}
	public Student(String names,boolean isFees){
		name = names;
		isFee = isFees;
	}
	public Student(){}
}
