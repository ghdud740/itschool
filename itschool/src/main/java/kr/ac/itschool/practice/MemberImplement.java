package kr.ac.itschool.practice;

public class MemberImplement implements MemberInterface{

	@Override
	public void insert() {
		
		
	}

	@Override
	public int update() {
		
		return 0;
	}

	@Override
	public String select() {
		String sql = " select * from student where name is not null";
		return sql;
	}

	@Override
	public int delete() {
		
		return 0;
	}

}
