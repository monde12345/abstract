package 추상클래스설계방법;
//일반클래스, 자식클래스
public class AICar extends Car {//구현화 시킬 것
	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자율 주행 자동차가 스스로 방향을 전환됩니다.");
	}
		


	@Override
	public void stop() {
		System.out.println("스스로 멈춘다.");
	}	
		
	

}
