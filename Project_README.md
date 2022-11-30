package project;
//돌아감
import java.util.Random;
import java.util.Scanner;

public class Cardran{
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	private int myCard[] = new int[7];
	private int comCard[] = new int[7];
	
	public Cardran() {}									//랜덤카드 뽑기
	public void Cardran() {
		System.out.println("내 카드");
		for(int i = 0; i < myCard.length; i++) {
			myCard[i] = random.nextInt(9) + 1;
			System.out.print("[" + myCard[i] + "]\t");
		}
		System.out.println("\n\n상대방 카드");
		for(int i = 0; i < comCard.length; i++) {
			comCard[i] = random.nextInt(9) + 1;
			System.out.print("[" + myCard[i] + "]\t");
		}
	}
	public void Start() {								///순서뽑기
		System.out.println();
		System.out.println("\n\n\n순서뽑기를 시작하시겠습니까?");
		int start[] = new int[2];
		for(int i=0;i < start.length;i++)
        {
            start[i] = random.nextInt(9)+1; 
            for(int j=0;j<i;j++) 
            {
                if(start[i] == start[j])
                {
                    i--;
                }
            }
        }
		String qusetion = sc.next();
		System.out.print("\n나 : " + start[0] + "\t");
		System.out.print("상대방 : " + start[1] + "\t");
		if(start[0] > start[1]) {
			System.out.println("순서 : 먼저");
		}
		else {
			System.out.println("순서 : 나중");
		}
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public Random getRandom() {
		return random;
	}
	public void setRandom(Random random) {
		this.random = random;
	}
	public int[] getMyCard() {
		return myCard;
	}
	public void setMyCard(int[] myCard) {
		this.myCard = myCard;
	}
	public int[] getComCard() {
		return comCard;
	}
	public void setComCard(int[] comCard) {
		this.comCard = comCard;
	}
}
