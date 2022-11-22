package sort;

import java.util.Scanner;
///////////메서드
public class Array_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student[] = new int[10];
		for(int i = 0; i < student.length; i++) {
			System.out.print(i+1 + "명:");							//10명의 값을 입력받는다.
			student[i] = sc.nextInt();
			
			while(student[i] > 100 || student[i] < 0) {				//잘못된 값을 입력했을때 다시입력하게 바꾼다.
				System.out.println("0~100 사이의 값만 입력해야합니다.");
				System.out.print(i+1 + "명:");
				student[i] = sc.nextInt();
			}
		}
		System.out.print("입력된 값: ");
		for(int i = 0; i < student.length; i++) {					//입력된 값을 다시한번 알려준다.
			System.out.print(student[i]+"\t");
		}
		System.out.println();
		doSort(student);
		System.out.print("정렬한 값: ");
		for(int i = 0; i < student.length; i++) {					//결과 출력
			System.out.print(student[i]+"\t");
		}
	}
	public static int[] doSort(int student[]) {
		for(int i = 0; i < student.length - 1; i++) {				//정렬
			for(int j = i + 1; j < student.length; j++) {
				if(student[i] > student[j]) {
					int temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
		return student;
	}

}
