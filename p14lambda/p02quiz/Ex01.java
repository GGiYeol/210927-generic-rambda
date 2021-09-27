package p14lambda.p02quiz;


public class Ex01 {

	public static void main(String[] args) {
		
		
		//코드 작성
		MyInterface1 o1 = () -> {
			for(int i = 1; i<6;i++) {
				System.out.println(i);
			}
		};
		
		o1.method();//statement가 끝나기때문에 ;를 잘 찍어줘야한다.
		//실행결과
		//1~5까지 출력되게
	}
}

interface MyInterface1{
	public void method();
}
