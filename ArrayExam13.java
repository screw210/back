package ex2;
public class ArrayExam13 {

	public static void main(String[] args) {
		int num[][] = new int[4][4];
		int k = 1;
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < i + 1; j++) {
				num[i][j] = k++;
				System.out.print(num[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
