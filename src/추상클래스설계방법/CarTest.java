package �߻�Ŭ����������;

//���� Ŭ����
public class CarTest {
	public static void main(String[] args) {
		System.out.println("<<< ���� ���� �ڵ��� >>>");
		
		//��ü ����
		Car myCar = new AICar();
		myCar.run();
	
		System.out.println();
		
		System.out.println("<<< ����� �����ϴ� �Ϲ� �ڵ��� >>>");
		Car hisCar= new ManualCar();
		hisCar.run();
	}

}
