package exercise;

//멤버변수만 갖게하자
class Box{
	private int width;
	private int height;
	private int depth;
	
	public Box() {}
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.width = depth;
	}
	
	public int getVolum() {
		return this.depth * this.height * this.width;	//자신의 클래스 안에 있는 멤버변수를 사용한다.
	}
	
}

public class boxTest {

	public static void main(String[] args) {
		Box b1 = new Box(5, 4, 3);		//this : 인스턴스 객체 자신의
		/*b1.depth = 5;
		b1.height = 4;
		b1.width = 3;*/
		
		//System.out.println("부피 : " + b1.depth * b1.height * b1.width);	캡슐화x,  코드가 드러남.
		System.out.println("부피 : " + b1.getVolum());
	}

}
/*개발자 관례
 * 메서드 
 * -1 생성자 메서드
 * -2 ~구하라(return type O)
 * ex)부피를 구하라, 학생 학번을 구하라, 평균을 구하라 .... -> getVolume(), getStudentNumber(), getArerage()
 * 
 * -3 ~값을 변경하라(return type X)
 * ex)회원가입이 20%를 할인하라, 1학년 -> 2학년 = 학변을 변경하라 setPrice(), setNewStudentNumber()
 * 
 * public이나 private 같이 접근제어자가 붙지 않았다면 패키지 안에서만 사용이 가능하다.(다른 패키지에서는 불가능, 같은 패키지, 다른 class는 사용가능)
 * public : 누구나
 * private : 동일 클래스, 동일 패키지
 *  X : 동일클, 
 */