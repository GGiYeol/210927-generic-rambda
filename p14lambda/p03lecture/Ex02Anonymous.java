package p14lambda.p03lecture;

public class Ex02Anonymous {

	public static void main(String[] args) {
	
		MyInterface2 o1 = new MyInterface2() {
			@Override
			public void method1() {
				System.out.println("실행코드 1");
			}
		};
		
		//lambda : 메소드 몸통만 뺴고 다 날라감
		//추상메소드가 하나인 인터페이스를 구현한 클래스 객체를 말함
		MyInterface2 o2 = () -> {
			System.out.println("실행코드2");
		};
		o1.method1();
		o2.method1();
		
	}
}

interface MyInterface2{
	public void method1(); //추상 메소드가 단 하나 있을때?
}