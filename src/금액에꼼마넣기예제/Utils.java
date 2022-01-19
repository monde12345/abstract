package �ݾ׿��ĸ��ֱ⿹��;

import java.text.DecimalFormat;

/*
 * ��ƿ��Ƽ Ŭ������ ���� Ŭ�������� �����ϰ� "����"�ؼ� /import���� 
 * ����� �� �ִ� Ŭ������ �ǹ��Ѵ�.
 * public DecimalFormat(String pattern) ������ ���� /static�޼ҵ�� Ŭ���� �̸����� ������ �� �ִ�.�ܺο��� �������� ���� �ۺ��̴�. Ŭ�����̸����� �ٷ� �����Ϸ��� ����ƽ ������Ѵ�.
 */

public class Utils {
	
	//�Ѱܹ��� �ݾ׿� õ �������� �ĸ�(,)�� �ִ� �޼ҵ� ����
	/*
	 * �޼ҵ� ���� ���
	 * ���������� static.(��, ��) ��ȯŸ�� �޼ҵ��̸�(�ڷ��� �Ű�����1, ..., �ڷ��� �Ű�����n) { //�޼ҵ� ����� ��Ģ�̴�.//�޼ҵ� ù �ڴ� �ҹ����̴�.//�޼ҵ�� �����̴�.//��Ʈ�� Ÿ���� ��ȯ �ϴ� ��//���̵尡 ������ ������ ���� �ʾƵ� �ȴ�.
	 * 		������ ����
	 * 		. . .
	 * }
	 */
	public static String toNumberFormat(long totalAmount) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(totalAmount);
	}
	
}
