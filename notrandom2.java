package Test;

import java.util.Random;

public class notrandom2 {

	public static void main(String[] args) {
		int a[] = new int[5];
		Random r = new Random();
		for(int i=0;i<=4;i++)
        {
            a[i] = r.nextInt(10)+1; 
            for(int j=0;j<i;j++) 
            {
                if(a[i]==a[j])
                {
                    i--;
                }
            }
        }
		
	}

}
