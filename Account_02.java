package exercise;

public class Account_02 {

		private String accountNumber;
		private int balance;
		static double interest = 0.07;
		public Account_02(String accountNumber, int balance) {
			super();
			this.accountNumber = accountNumber;
			this.balance = balance;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountNumber() {
			return accountNumber;
		
		}
		@Override
		public String toString() {
			return "계좌상세 [계좌번호 =" + accountNumber + ", 잔액 =" + balance + "]";
		}
		//정기예탁 메서드(fixedDeposit)를 작성하고,
		//기간(년)과 금액을 입력하면 이자를 더한 원금을 계산하라.
		//연간 이율 2%
		public void fixedDeposit(int period, int amount) {
			this.balance += (period * Account_02.interest * amount) + amount;
			
		}
}
