package test1;

import java.util.Random;

public class projectTest {

	public static void main(String[] args) {
		Random r = new Random();
		int myCard[] = new int[19];
		int a[] = new int[4];
		/*
		 * for(int i=0;i <= myCard.length;i++) { myCard[i] = ran.nextInt(79)+1; for(int
		 * j=0;j<i;j++) { if(myCard[i]==myCard[j]) { i--; } }
		 * System.out.println(myCard[i]); }
		 */
		for(int i=0;i<4;i++)
        {
            a[i] = r.nextInt(10)+1; 
            for(int j=0;j<i;j++) 
            {
                if(a[i]==a[j])
                {
                    i--;
                }
            }
    		System.out.println(a[i]);

        }
	}

}
