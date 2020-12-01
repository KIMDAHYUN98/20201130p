package com.yedam.collection;

public class Student implements Comparable<Student> {

	private int studentNo;
	private String studentName;
	private int score;

	public Student(int studentNo, String studentName) {
	this.studentName = studentName;
	this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return this.studentName.hashCode() + this.studentNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		boolean b1 = this.studentName.equals(student.studentName);
		boolean b2 = this.studentNo == student.studentNo;
		return b1 && b2;
	}

	public Student(int studentNo, String studentName, int score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) { // 음수 : 오름차순, 0 : 같다, 양수 : 내림차순
		// TODO Auto-generated method stub
//		return this.studentNo - o.studentNo; // 오름차순
//		return o.studentNo - this.studentNo; // 내림차순
		return this.score - o.score; // 점수 기준으로 정렬

	}
	
	
}
