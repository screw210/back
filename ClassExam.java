package inheritance;

class Student1{
	String name;
	int grade;
	int van;
	int number;
	String telephone;
}

public class ClassExam {

	public static void main(String[] args) {
		Student1 kim = new Student1();
		kim.name = "김현우";
		kim.grade = 2;
		System.out.println("학생의 이름은 " + kim.name + "이고, " + kim.grade + "학년입니다.");
	}

}
