package exercise;
class Customer{
	private String id;
	private String pw;
	static int numberOfCustomer=0;
	
	public Customer(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		numberOfCustomer++;
	}
	public void printNumberOfCustomer() {
		System.out.println("전체 회원수 : " + Customer.numberOfCustomer); //static 변수를 사용할 때는 class를 적어야한다.
	}
}
public class CustomerTest {

	public static void main(String[] args) {
		Customer a = new Customer("aaa" + "111", null);
		Customer b = new Customer("bbb" + "112", null);
		Customer c = new Customer("ccc" + "113", null);
		Customer d = new Customer("ddd" + "114", null);
		Customer e = new Customer("eee" + "115", null);
		e.printNumberOfCustomer();
		System.out.println(Customer.numberOfCustomer);

	}

}
