package 추상클래스설계방법;

//abstract가 붙으면 추상이다. //부모 클래스, 실체클래스
public abstract class Car {
	//추상 메소드 선언 /추상메소드는 중괄호가 없다. //인위적 메소드
	public abstract void drive();
	public abstract void stop();
	
	//일반 메소드 선언
	public void startCar() {
		System.out.println("시동을 켭니다.");//동작을 하는 것은 일반 메소드이다.
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	//[중요] 파이널이 붙으면 템플릿 메소드  파이널 메소드는 디자인 패턴중에 "하나"이다.
	//run() 템플릿 메소드는 Car가 어떻게 달려야 하는지를 구현해야 한다.
	//        => 즉 '실행순서'와'시나리오'를 정의한 메소드이다.
	final public void run() { //플랫폼, 프래이머 등이 많이 나온다.
		startCar();
		drive();
		stop();
		turnOff();
		
	}
	
}
