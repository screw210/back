package Test;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		double[] b = new double[3];
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		char[] c = new char[3];
		for(int i = 0; i < c.length; i++) { //출력하면 블랭크. \u0000
			System.out.println(c[i]);
		}
		String[] d = new String[3];
		for(int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
