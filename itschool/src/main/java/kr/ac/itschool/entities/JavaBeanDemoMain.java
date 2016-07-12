package kr.ac.itschool.entities;

public class JavaBeanDemoMain {

	public static void main(String[] args) {
		JavaBeanDemo obj = new JavaBeanDemo();
		Member date = obj.setName();
		setTotal(date);
	}
	static void setTotal(Member date){	

		System.out.println(date.getName()+date.getAge()+date.getAddr()+date.getPhone());
	}
}
