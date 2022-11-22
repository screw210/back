package sort;

public class SelectionTest2 {

	public static void main(String[] args) {
		int[] a = {5, 3, 8, 6, 4};
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
