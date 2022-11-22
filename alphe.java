package ex2;
import java.util.Scanner;
//알파벳(대문자)를 배열을 사용하여 출력.
public class alphe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[26];
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)(65+i);
			System.out.print(ch[i] + " ");
		}
	}

}
