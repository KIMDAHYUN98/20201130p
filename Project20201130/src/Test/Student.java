package Test;

public class Student {
	private String name;
	private int eScore;
	private int mScore;
	
	public Student() {
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void seteScore(int eScore) {
		this.eScore = eScore;
	}

	public void setmScore(int mScore) {
		this.mScore = mScore;
	}
	

	public String getName() {
		return name;
	}

	public int geteScore() {
		return eScore;
	}

	public int getmScore() {
		return mScore;
	}

	public Student(String name, int eScore, int mScore) {
		super();
		this.name = name;
		this.eScore = eScore;
		this.mScore = mScore;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", 영어점수 : " + eScore + ", 수학점수 : " + mScore);

	}

}
