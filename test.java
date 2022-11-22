package test1;
//자동차가 운행한다.
public class test {
	//정적특성
	String name;
	int speed = 0;
	
	//동적특성
	public void stop(){
		speed = 0;
	}
	public void speedUP() {
		speed += 10;
	}
	public void speedDown() {
		if(speed >= 0) {
			speed -= 10;
		}
		else if(speed < 10 && speed >= 0){
			speed = 0;			

		}
	}
}
