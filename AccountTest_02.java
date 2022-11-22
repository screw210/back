package exercise;
//class 매우 중요
public class AccountTest_02 {

	public static void main(String[] args) {
		Account_02 a = new Account_02("111-1212", 10000);
		a.fixedDeposit(1,  1000);
		System.out.println(a.toString());
		Account_02 b = new Account_02("111-1213", 30000);
		b.fixedDeposit(2,  1000);
		System.out.println(b.toString());
	}

}
