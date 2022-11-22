package exercise;

import java.util.Scanner;

class Account{
	private int myMoney;
	private int getMoney;
	private String number;
	
	public void getnumber() {}
	public void getNumber(String number, int getMoney) {
		System.out.println("계좌번호 : " + number);
		myMoney += getMoney;
		System.out.println("잔액 : " + myMoney);
		System.out.println("=====================");
	}
	public void getDeposit() {}
	public void getDeposit(int getMoney){		//입금
		System.out.println("입금 할 금액 : " + getMoney);
		this.myMoney += getMoney;
		this.setMoney();
		System.out.println("=====================");
	}
	
	public void setMoney() {					//잔액
		System.out.println("잔액 : " + myMoney);
	}
	
	public void getWithdraw() {}				
	public void getWithdraw(int getMoney) { 	//출금
		System.out.println("출금 할 금액 : " + getMoney);
		
		if(myMoney + -getMoney > 0) {
			this.myMoney -= getMoney;
			this.setMoney();
			System.out.println("=====================");
		} else {
			System.out.println("통장의 잔액보다 출금하는 금액이 더 많습니다.");
			this.setMoney();
			System.out.println("=====================");

		}
	}
	
}
public class AccountTest {

	public static void main(String[] args) {
		
		Account member1 = new Account();
		member1 = new Account();
		member1.getNumber("12345", 10000);
		member1.getDeposit(20000);
		member1.getWithdraw(50000);
		member1.getWithdraw(15000);
		
	}

}
/*1.은행계좌번호와 잔액으로 계좌 객체를 생성
 *2.입금하는 deposit()메서드를 갖는다.
 *3.출금을 하는 withdraw()메서드를 갖는다. 잔액이 부족하면 출금x, 적당한 메시지를 띄움.
 *4.계좌의 현재 상태를 출력
 */