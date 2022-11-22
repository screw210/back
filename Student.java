package exercise;
//학생 : 학번, 이름, 전공, 전번
//this 관련 예제
public class Student {	
	private int number;
	private String name;	//인스턴스 멤버변수
	private String major;
	private String telNum;
	
	public Student(int number) {
		super();
		this.number = number;
	}
	
	public Student(int number, String name) {
		//super();		//super와 this()와 같이 못쓴다.
		this(number);	//매개변수가 number 하나인 애 불러와
		this.name = name;
	}
	
	public Student(int number, String name, String major) {
		//super();
		this(number, name);
		this.major = major;
	}
	
	public Student(int number, String name, String major, String telNum) {
		//super();
		//this.number = number;
		//this.name = name;
		//this.major = major;
		this(number, name, major);
		this.telNum = telNum;
	}
	
	
}
