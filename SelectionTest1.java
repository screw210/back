package sort;

import java.util.Random;

public class SelectionTest1 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] a = new int[5];
		
		for(int i = 0; i<a.length; i++) {
			a[i] = r.nextInt(11) + 1;
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();
		
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}

	}

}
