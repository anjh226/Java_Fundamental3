package java_20190604;

// 인터페이스 상속은 다중상속이 가능함. 
public interface InterA extends InterB, InterC { 
		// 인터페이스의 변수 public static final 이 생략 되어 있음.
		/*public static final*/ double PI = 3.14;
		
		// 인터페이스에서 메서드 접근 한정자를 붙이지 않으면 public이 생략되어 있음. --> sub 에서 오버라이딩 할 때 public 한정자 붙여야 함. 생략된 것일 뿐 default 가 아님 주의!!
		// abstract 도 생략 가능.
		/*public*/ /*abstract*/ void mA();
		
		

}
