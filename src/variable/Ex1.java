package variable;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 기본 데이터 타입 (기본형, Primitive Type)
		 * - 메모리에 효율적인 사용을 위해 사이즈별로 나누어 놓음
		 * - 자바에서 기본적으로 사용하는 데이터 타입 8가지
		 * 
		 * 			1Byte	2Byte	4Byte	8Byte
		 * 			=8bit
		 * -----------------------------------------
		 * 1. 정수형:	byte	short	int		long
		 * 2. 실수형:					float	double
		 * 3. 문자형:			char(정수형)
		 * 4. 논리형:	boolean
		 * -----------------------------------------
		 * 
		 * 정수형 데이터타입 변수에 저장 가능한 정수 범위: -2^(n-1) ~ 2^(n-1)-1
		 * byte 타입: -2^7 ~ 2^7-1 = -128 ~ 127 까지 표현 가능
		 * short타입: -2^15 ~ 2^15-1 = -32768 ~ 32767
		 * ...
		 * long타입 : -922경 ~ 922경 까지 표현가능
		 * -----------------------------------------
		 * 실수는 2개만 있음
		 * float 타입(4Byte): 약 +- 10^38까지 표현가능 (long 타입 보다 큰 정수도 표현 가능)
		 * double타입(8Byte): 약 +- 10^308 까지 표현가능
		 * 
		 * */
		
		byte b = 127;
		System.out.println(b);
		
//		b = 128; // 오류가 발생! byte타입은 -128 ~ 127 까지 이기 때문!
		
		short s = 128;
		System.out.println(s);
		
//		s = 32768; // short타입 변수에는 -32768 ~ 32767 까지의 정수만 저장 가능
		
		int i = 32768;
		System.out.println(i);
		
//		i = 2147483648; // 정수 리터럴에 접미사가 없을 경우 int로 취급됨!
						// 최대 표현 가능한 숫자가 2147483647 까지
						// 따라서, 그 이상의 숫자를 표현하려면
						// 접미사 L을 붙여서 long타입을 사용해야한다.
		long l = 2147483648L;
		System.out.println(l);
		
		l = 100L;
//		i = 100L;
		// 접미사 L이 붙으면 int타입으로 저장가능한 숫자라 하더라도 저장불가!
		
		float f = 3.14F;
		// float타입은 접미사 f 또는 F를 붙여줘야함!
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
		
		char c = 'A' + 1;
//		c = 'AB'; // 오류! char타입은 "무조건" 1개의 문자만 사용가능!
//		c = '';	  // 오류! char타입은 "무조건" 1개의 문자만 사용가능!
		System.out.println(c);
		
		boolean bool = true;
		System.out.println(bool); // 다른 언어에서는 1을 true로 판단하는 경우가 있음
		bool = false;
		System.out.println(bool); // 다른 언어에서는 0을 false로 판단하는 경우가 있음
		
		
		
		
		
		
	}

}
