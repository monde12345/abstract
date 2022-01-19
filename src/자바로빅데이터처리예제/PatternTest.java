package �ڹٷκ�����ó������;

import java.util.regex.Matcher;//����ǥ����(Regular expressions)�� �ٿ��� Regex��� �մϴ�. Regex�� ���ڿ��� � ������ ���ڵ��� �ִ��� ã�µ� ������ �ݴϴ�.
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		String str ="�������� ���� �ܰ�� �����м��̴�. ���� �����м��� Ű���带 �����ϴ� ����� ��Ƴ��´�.";
		
		Pattern p = Pattern.compile("�����м�");//�������� ��Ÿƽ�̱� ������ �����м��� ������ �� ��
		Matcher m = p.matcher(str);//��ġ�� �ִ��� Ȯ���ϴ� ��
		
		int count= 0; //���������̱� �빮�� �ʱ�ȭ �Ѵ�.
		String word = null;
		
		/*
		 * find() �޼ҵ�� ������ ��ġ�ϴ� ��� true�� return�ϰ�, ��ġ���� ������ false�� �������ִ� �޼ҵ�
		 * group() �޼ҵ�� ��Ī�� �κ��� ��ȯ(return)���ִ� �޼ҵ��̴�.
		 */
		while(m.find()) {//if�� ������ ���, �����̱� ������ �� �� �ִ�. ���� �� �� �ִ�.
			word = m.group(); //word��� ��ü���������� ����Ű�� ���ڿ��� "�����м�"�̴�.
			count++;
			
		}
		System.out.println("�м����: " + "������ġ");
		System.out.println(word + " " + count + "��");
	}
	

}
