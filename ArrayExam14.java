package ex2;
//배열의 열을 바꾸는 방법
//중요도 200%
public class ArrayExam14 {

	public static void main(String[] args) {
		int num[][] = new int[4][];	//생성할 때 열을 비워둔다.
		
		for(int i = 0; i < num.length; i++) {
			num[i] = new int[i+1];	//각 행에 대해 열을 생성
		}
		
		int k = 1;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				num[i][j] = k++;
				System.out.print(num[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}