package test1;

public class StudentTest {

	public static void main(String[] args) {
		Student a = new Student("jinseon", 1214); 	//count = 1
		Student b = new Student("gres", 1212);		//count = 2
		Student c = new Student("suha", 1313);		//count = 3
		System.out.println(Student.count);
	}

}
