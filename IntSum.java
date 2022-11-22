package exercise;
//합을 구하는 계산기
//정수 값 2개(+), 3개(+, -), 4개(+, -, *) 입력 시 계산하는 계산기
public class IntSum {
	private int n1, n2, n3, n4;
	private int result;
	public IntSum(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		result =  n1 + n2;
	}
	public IntSum(int n1, int n2, int n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		result = n1 + n2 - n3;
	}
	public IntSum(int n1, int n2, int n3, int n4) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		result = n1 + n2 - n3 * n4;
	}
	@Override
	public String toString() {
		return "IntSum [result=" + result + "]";
	}
	
	
	

}
