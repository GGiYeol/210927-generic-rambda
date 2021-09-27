package p14lambda.p03lecture;

public class Ex01Anonymous {

	public static void main(String[] args) {
		
		MyInterface1 o1;
		o1 = new MyClass1(); //객체 생성
		
		//interface구현과 객체생성을 한번에
		MyInterface1 o2 = new MyInterface1() {
			public void method1() {

			}
			public void method2() {
				// TODO Auto-generated method stub

			}
		};
	}
}

interface MyInterface1 {
	public void method1();
	public void method2();
	
	
}
class MyClass1 implements MyInterface1	{
	
	public void method1() {

	}
	public void method2() {

	}
}