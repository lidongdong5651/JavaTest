package day1;
public class StudentDome {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student.name = "张三";
		s1.isFee = true;
		Student s2 = new Student();
		s2.name = "王益";
		s2.isFee = false;
		Student s3 = new Student();		s3.name = "李四";
		s3.isFee = false;
		Student s4 = new Student();
		s4.name = "赵丽";
		s4.isFee = true;
		Student s5 = new Student("zhangsan",true);
		Student s6 = new Student("wangyi",false);
		Student s7 = new Student("lisi",false);
		Student s8 = new Student("zhaoli",true);
		Student[] arr = new Student[] {s1,s2,s3,s4,s5,s6,s7,s8};
		for(Student x:arr){
			System.out.println(x);
		}
		for(Student x:arr){
			if(!x.isFee){
				System.out.println(x.name+","+x.isFee);
				x.fees();
			}
			//System.out.println(x.name+","+x.isFee);
		}		
		for(Student x:arr){
			System.out.println(x.name+","+x.isFee);
		}
	}
}
