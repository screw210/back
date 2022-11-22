package inheritance;
//상속 = > 코드 재활용
class Student{
	private int number;
	private String name;
	public Student(int number, String name) {
		this.number = number;	//외부의 name을 인스턴스 객체의 name으로 바꾼다.
		this.name = name;
	}
	public void study() {}
	public void eat() {
		
	}
}
/*class Grade1 extends Student{
	String colorOfTraining = "green";
	public Grade1() {}
	public void javaProject() {}
}*/


public class studentTest {
	public static void main(String[] args) {
		Student s1 = new Student(1219, "이진선");
	}

}