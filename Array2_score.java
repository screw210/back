package ex2;
import java.util.Scanner;
public class Array2_score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[5][3];
		int max = 0;
		String team= "오류가 있는 것 같아";
		for(int i = 0; i < score.length; i++) {
			System.out.print(i+1 + "조\n");
			for(int j = 0; j < score[i].length; j++) {				//무엇을 입력해야하는 지 띄우는 코드
				if(j == 0) {
					System.out.print("완성도 :");
				}
				else if(j == 1) {
					System.out.print("창의성 :");
				}
				else if(j == 2) {
					System.out.print("이해도 :");
				}
				score[i][j] = sc.nextInt();
				while(score[i][j] < 0 || score[i][j] > 20) {		//0~20을 초과했을 때 다시 입력하라 띄우는 코드
					System.out.println("0~20 사이를 벗어났습니다.");
					if(j == 0) {									//if문을 사용하여 j(열)일 때 0이면 완성도, 1이면 창의성 2이면 이해도가 뜬다.
						System.out.print("완성도 :");
						score[i][j] = sc.nextInt();
					}
					else if(j == 1) {
						System.out.print("창의성 :");
						score[i][j] = sc.nextInt();
					}
					else if(j == 2) {
						System.out.print("이해도 :");
						score[i][j] = sc.nextInt();
					}
				}//while
				int sum = score[i][0] + score[i][1] + score[i][2];
				
				if(sum > max) {
					switch(i){										//몇 조가 최고팀인지 구별하는 코드
						case 0 : team = "1조";	break;
						case 1 : team = "2조";	break;
						case 2 : team = "3조";	break;
						case 3 : team = "4조";	break;
						case 4 : team = "5조";	break;
					}//switch
					max = sum;
				}//if
			}//for j
		}//for i
		System.out.println("최고팀 :" + team + " " + "점수 :" + max);
	}//main
}//class