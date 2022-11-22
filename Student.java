package test1;

//static 전역변수 관련

public class Student {
	private String name;
	private int number;
	static int count = 0;
	public Student() {}
	public Student(String name, int number) {
		this.name = name;
		this.number = number;
		Student.count++;		//static 변수는 무조건 메인 클래스를 지난다.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + "]";
	}
}
