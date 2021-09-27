package p14lambda.p03lecture;

public class Ex04Return {

	public static void main(String[] args) {
		
		MyInterface4 o1 = new MyInterface4() {
			public int method() {
				return 1;
			}
		};
		System.out.println(o1.method());
		
		MyInterface4 o2 =() ->{return 2;};
		System.out.println(o2.method());
		
		//하나남은 상태가 return이면 return도 생략 가능함.
		MyInterface4 o3 = () -> 3;
		System.out.println(o3.method());
	}
}

interface MyInterface4{
	int method();
}