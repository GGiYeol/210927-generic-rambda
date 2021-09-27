package p13.generic.p03lecture.p03wildcard;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		//와일드카드는 보통 파라미터나 리턴 타입에 작성됨
		ArrayList<? extends Number> list1 = new ArrayList<Integer>();
		list1 = new ArrayList<Double>();
		list1 = new ArrayList<Long>();
		
		//number보다 상위타입이거나 관계가 없는 타입은 안됨
//		list1 = new ArrayList<Object>();
//		list1 = new ArrayList<String>();
		
		ArrayList<? super Number> list2 = new ArrayList<Number>();
		list2 = new ArrayList<Object>();
		
		//super를 썼기때문에 하위타입은 불가능
//		list2 = new ArrayList<Integer>();
//		list2 = new ArrayList<Double>();
		
		//제한없음
		ArrayList<?> list3 = new ArrayList<Integer>();
		list3 = new ArrayList<Number>();
		list3 = new ArrayList<String>();
		list3 = new ArrayList<Object>();
	}
}
