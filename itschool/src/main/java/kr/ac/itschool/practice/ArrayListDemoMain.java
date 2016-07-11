package kr.ac.itschool.practice;

import java.util.ArrayList;

public class ArrayListDemoMain {

	public static void main(String[] args) {
		/*ArrayListDemo obj = new ArrayListDemo();
		String[] arr = {"java","jsp","android","oracle","mssql"};
		ArrayList<String> list = obj.arrayListMeth(arr);
		for (String list1 : list){
			System.out.println(list1);
		}
		ArrayListDemo obj = new ArrayListDemo();
		String subject = "oracle|mssql|java|jsp|android|html";
		ArrayList<String> result= obj.subjectMeth(subject);
		for(String result1 : result){
			System.out.println(result1);
		}*/
		int start = 1;
		int end = 100;
		ArrayListDemo obj = new ArrayListDemo();
		ArrayList<Integer> result = obj.arrMeth(start, end);
		for(int result1 : result){
			System.out.println(result1);
		}
	}

}
