package 자바로빅데이터처리예제;

import java.util.regex.Matcher;//정규표현식(Regular expressions)은 줄여서 Regex라고 합니다. Regex는 문자열에 어떤 패턴의 문자들이 있는지 찾는데 도움을 줍니다.
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		String str ="빅데이터의 다음 단계는 예측분석이다. 이제 예측분석의 키워드를 이해하는 기업만 살아남는다.";
		
		Pattern p = Pattern.compile("예측분석");//컴파일이 스타틱이기 때문에 예측분석에 패턴을 준 것
		Matcher m = p.matcher(str);//매치가 있는지 확인하는 것
		
		int count= 0; //지역변수이기 대문에 초기화 한다.
		String word = null;
		
		/*
		 * find() 메소드는 패턴이 일치하는 경우 true를 return하고, 일치하지 않으면 false를 리턴해주는 메소드
		 * group() 메소드는 매칭된 부분을 반환(return)해주는 메소드이다.
		 */
		while(m.find()) {//if는 조건이 사실, 거짓이기 때문에 쓸 수 있다. 블리언도 쓸 수 있다.
			word = m.group(); //word라는 객체참조변수가 가리키는 문자열은 "예측분석"이다.
			count++;
			
		}
		System.out.println("분석결과: " + "패턴일치");
		System.out.println(word + " " + count + "개");
	}
	

}
