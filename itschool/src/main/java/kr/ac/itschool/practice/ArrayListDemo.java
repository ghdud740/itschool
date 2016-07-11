package kr.ac.itschool.practice;

import java.util.ArrayList;

public class ArrayListDemo {
/*	ArrayList<String> arrayListMeth(String[] arr){
		ArrayList<String> list = new ArrayList();
		for(int i=0; i<arr.length; i++){
			list.add(arr[i]);
		}
		return list;*/
	
	/*	ArrayList<String> subjectMeth(String subject){
			String arr[] = subject.split("[|]");
			ArrayList<String>list = new ArrayList();
			for(int i=0; i<arr.length; i++){
				list.add(arr[i]);
			}
			return list;
		}*/
	ArrayList<Integer> arrMeth(int start,int end){
		ArrayList<Integer>list = new ArrayList();
		for(int i=start; i<end; i++){
			int na = i % 2;
			if( na == 0 ){
				list.add(i);
			}
		}
		return list;
	}
}