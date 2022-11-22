package Test;

public class myTest {

	public static void main(String[] args) {
		String str[] = new String[5];
		int random[][] = new int[5][];
		str[0] = "나는";
		str[3] = "짱짱쎈";
		str[1] = "조선에";
		str[2] = "사는";
		str[4] = "북극곰이다.";
		
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		
		for(int i = 0; i <random.length; i++) {
			random[i] = new int[i+1];	//행이 i일 때 열이 증가되도록 생성한다.
		}
	}

}
