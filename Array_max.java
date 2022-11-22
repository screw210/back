package ex2;
import java.util.Scanner;
/*10명의 값을 배열로 받고 가장 큰 값 구하기 예외처리가 나도 돌아가게 코드를 짜라*/
public class Array_max {
/*1.입력 반복 for함수 사용
 *2.만약, 이전 것 보다 지금 돌아가는 배열이 더 크다면 그것을 체크한다.
 *3.체크한 배열을 출력
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[10];
		int max = 0; //함수 정의
		score[0] = 0;
		System.out.println("10명의 값을 입력하세요.(enter로 나눔)");
		
		for(int i = 0; i < score.length; i++) { //값을 입력받는 것을 for문으로 돌린다.
			System.out.print(i+ 1 + "명: ");
			score[i] = scan.nextInt();
			
			while(score[i] > 100 || score[i] < 0){ //socre 값이 1~100사이가 아닐 시, 경고 문구와 함께 다시 입력하라고 동작.
				System.out.println("\n\t0부터 100 사이의 값을 입력하지 않았습니다.\n");
				System.out.print(i + 1 + "명: ");
				score[i] = scan.nextInt();				
			} //while
			
			if(i == 0) {						//계속해서 max에 score 값이 들어가도록 돌아가는 오류가 발생. 때문에 처음 한번만 max에 score 값이 들어가게 만들었다.
				max = score[0]; //마이너스를 생각
			}
			
			if(max < score[i]) { //score[i]의 값이 max값 보다 크다면 max에 값을 넣는다.
				max = score[i];
			}//if
			
		}//for
		System.out.println("가장 큰 값: " + max); //최종적으로 가장 큰 값을 출력		
	}
}
//숙제 완료^^