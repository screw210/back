package ex2;

public class ArrayExam11 {

	public static void main(String[] args) {
		
		int c[][] = new int[4][4];
		
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				
				c[i][j] = 1;
				System.out.print(c[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
