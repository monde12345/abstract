package �߻�Ŭ����������;

//abstract�� ������ �߻��̴�. //�θ� Ŭ����, ��üŬ����
public abstract class Car {
	//�߻� �޼ҵ� ���� /�߻�޼ҵ�� �߰�ȣ�� ����. //������ �޼ҵ�
	public abstract void drive();
	public abstract void stop();
	
	//�Ϲ� �޼ҵ� ����
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");//������ �ϴ� ���� �Ϲ� �޼ҵ��̴�.
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	//[�߿�] ���̳��� ������ ���ø� �޼ҵ�  ���̳� �޼ҵ�� ������ �����߿� "�ϳ�"�̴�.
	//run() ���ø� �޼ҵ�� Car�� ��� �޷��� �ϴ����� �����ؾ� �Ѵ�.
	//        => �� '�������'��'�ó�����'�� ������ �޼ҵ��̴�.
	final public void run() { //�÷���, �����̸� ���� ���� ���´�.
		startCar();
		drive();
		stop();
		turnOff();
		
	}
	
}
