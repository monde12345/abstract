package 금액에꼼마넣기예제;

import java.text.DecimalFormat;

/*
 * 유틸리티 클래스란 여러 클래스에서 유용하게 "공유"해서 /import에서 
 * 사용할 수 있는 클래스를 의미한다.
 * public DecimalFormat(String pattern) 생성자 적용 /static메소드는 클래스 이름으로 접근할 수 있다.외부에서 가져오는 것은 퍼블릭이다. 클래스이름으로 바로 접근하려면 스태틱 해줘야한다.
 */

public class Utils {
	
	//넘겨받은 금액에 천 단위마다 꼼마(,)를 넣는 메소드 구현
	/*
	 * 메소드 구현 방법
	 * 접근지정자 static.(유, 무) 변환타입 메소드이름(자료형 매개변수1, ..., 자료형 매개변수n) { //메소드 만드는 규칙이다.//메소드 첫 자는 소문자이다.//메소드는 동작이다.//스트링 타입을 반환 하는 것//보이드가 있으면 리턴을 넣지 않아도 된다.
	 * 		실행할 문장
	 * 		. . .
	 * }
	 */
	public static String toNumberFormat(long totalAmount) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(totalAmount);
	}
	
}
