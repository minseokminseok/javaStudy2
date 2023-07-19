//package ex15usefulclass;
//
//
////public static void main(String[] args) { 
////	
////	/*
////	parseInt() : 숫자형식의 문자열을 정수(숫자)로 변경한다. 
////	parseDouble() : 실수로 변경한다. 
////	 */
////	String strNumber = "1000";
////	//정수+문자열 => 101000
////	System.out.println("10+strNumber="+ (10+strNumber));
////	//정수+정수 => 1010
////	System.out.println("10+strNumber를 숫자로 변경:"+
////			(10 + Integer.parseInt(strNumber)));
////	//위와 동일하게 문자열을 정수로 변경해준다. 
////	System.out.println("10+strNumber를 숫자로 변경:"+
////			(10 + Integer.valueOf(strNumber))); 
////  
////	/*
////	문자열을 숫자로 변경할때는 반드시 숫자형식만 기술해야한다. 
////	"원"은 숫자가 아니므로 예외가 발생한다.
////	 */
////	String money = "120원";
//////	System.out.println("120원:"+ Integer.parseInt(money)); //예외발생 
////	 
////	/*
////	실수형태의 문자열을 숫자로 변경할때는 parseInt()를 사용할 수 
////	없다. 앞과 동일한 예외가 발생한다. 
////	 */
////	String floatString = "3.14";		 
//////	System.out.println(Integer.parseInt(floatString)); //예외발생 
////	System.out.println("실수형(float)형으로 변경:"+Float.parseFloat(floatString));
////	System.out.println("실수형(Double)형으로 변경:"+Double.parseDouble(floatString));
////
////
////	/*
////	Character 클래스의 주요메서드
////	
////	codePointAt() : 문자열에서 특정 index에 해당하는 한문자의 
////		아스키코드를 반환한다. 
////	 */
////	System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
////	System.out.println(Character.codePointAt("ABCD", 3));
////
////	/*
////	isDigit() : 인자로 전달된 문자가 숫자인지 판단한다. 숫자일때
////		true를 반환한다. 
////	 */
////	System.out.println("isDigit()를 통한 숫자판단");
////	System.out.println(Character.isDigit('A')?"숫자임":"숫자아님");
////	System.out.println(Character.isDigit(50)?"숫자임":"숫자아님");
////	System.out.println(Character.isDigit('7')?"숫자임":"숫자아님");
////
////	/*
////	isLetter() : 문자인지 여부를 판단하는 메서드로 특수기호나 숫자형
////		일때는 false를 반환한다. 
////	 */
////	System.out.println("isLetter()메소드를 통한 문자판단");
////	System.out.println(Character.isLetter('가'));	 
////	System.out.println(Character.isLetter('A'));	 
////	System.out.println(Character.isLetter('#'));	 
////	System.out.println(Character.isLetter('9'));	 
////
////	/*
////	isWhitespace() : 공백문자인지 판단하는 메서드. 공백문자일때
////		true를 반환한다. 
////	 */
////	System.out.println("isWhitespace() 메소드로 공백문자 판단");
////	System.out.println(Character.isWhitespace('A'));
////	System.out.println(Character.isWhitespace(' ')); 
////
////	/*
////	isLowerCase() : 소문자인지 판단.
////	isUpperCase() : 대문자인지 판단. 단 영문이 아닌경우 false를 
////		반환한다.
////	 */
////	System.out.println("알파벳 대소문자 판단");
////	System.out.println(Character.isLowerCase('A'));
////	System.out.println(Character.isUpperCase('z'));
////	System.out.println(Character.isLowerCase('a')); 
////	System.out.println(Character.isUpperCase('Z')); 
////	System.out.println(Character.isLowerCase('가')); 
////}
////
////
////	/*
////	시나리오] 주어진 문자열안에 몇개의 공백문자(스페이스)가 있는지
////	판단하는 프로그램을 작성하시오.
////		참고) toCharArray() : 문자열을 char형 배열로 반환해주는
////			String클래스에 정의된 메소드. 
////	*/
////
//////
////
////
//
//public class E02SoBigNumberClass {
//
//public static void main(String[] args) {
//
//	System.out.println("Long형의 최대값:"+ Long.MAX_VALUE);
//	System.out.println("Long형의 최소값:"+ Long.MIN_VALUE);
//	
//	/*
//	BigInteger 클래스
//		: int형이나 long형으로 표현할수 없는 범위의 큰수를 
//		연산할때 사용한다. 인자로 전달할때 반드시 문자열형태로
//		기술해야한다.
//	 */
//	long lngNum = 100000000000000000000;//코드작성불가		
//	BigInteger bigValue1 = new BigInteger("100000000000000000000");
//	BigInteger bigValue2 = new BigInteger("-99999999999999999999");
////	
////	//사칙연산은 아래 메소드를 통해 수행한다.
//	BigInteger addResult = bigValue1.add(bigValue2);
//	BigInteger subResult = bigValue1.subtract(bigValue2);
//	BigInteger mulResult = bigValue1.multiply(bigValue2);
//	BigInteger divResult = bigValue1.divide(bigValue2);
//	BigInteger remResult = bigValue1.remainder(bigValue2);
//
//	System.out.println("큰수의 덧셈결과:"+ addResult);
//	System.out.println("큰수의 뺄셈결과:"+ subResult);
//	System.out.println("큰수의 곱셈결과:"+ mulResult);
//	System.out.println("큰수의 나눗셈결과:"+ divResult);
//	System.out.println("큰수의 나머지결과:"+ remResult);
//
//	/**********************************************/
//	
//	/*
//	BigDecimal 클래스
//		: 실수의 오차없는 표현이나 연산을 위해 사용하는 클래스
//	 */
//	double dbl1 = 1.6;
//	double dbl2 = 0.1;
//
//	System.out.println("두 실수의 덧셈결과(오차있음):"+ (dbl1+dbl2));
//	System.out.println("두 실수의 곱셈결과(오차있음):"+ (dbl1*dbl2));
//	
//	//BigDecimal bigDec1 = new BigDecimal("1.6");
//	//BigDecimal bigDec2 = new BigDecimal("0.1");
//	
// 
//	System.out.println("두 실수의 덧셈결과:"+ bigDec1.add(bigDec2));
//	System.out.println("두 실수의 뻴셈결과:"+ bigDec1.subtract(bigDec2));
//	System.out.println("두 실수의 곱셈결과:"+ bigDec1.multiply(bigDec2));
//	System.out.println("두 실수의 나눗셈결과:"+ bigDec1.divide(bigDec2));
//	System.out.println("두 실수의 나머지결과:"+ bigDec1.remainder(bigDec2));
//}
//}

