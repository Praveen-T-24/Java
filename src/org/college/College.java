package org.college;


public class College {
	private void collegeName()
	{
		System.out.println("SASTRA UNIVERSITY");
	}
	private void collegeId()
	{
		System.out.println("123");
	}
	private void collegeRank()
	{
		System.out.println("B");
	}
 public static void main(String[] args)
 {
	 College c=new College();
	 c.collegeName();
	 c.collegeId();
	 c.collegeRank();
	 Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		Hostel h=new Hostel();
		h.hostelName();
		Dept d=new Dept();
		d.deptName();
	
}
}
