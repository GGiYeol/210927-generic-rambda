package p13.generic.p03lecture.p03wildcard;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		Number n1 = new Integer(3);
		
		ArrayList<Number> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list1 = list2; // 이게 된다면.....
		list1.add(Double(3.14)); //이것도 되여야함.
		
		//결론 ArrayList<Number>는 ArrayList<Integer>의 상위 타입이 아니다.
		
	}
}
