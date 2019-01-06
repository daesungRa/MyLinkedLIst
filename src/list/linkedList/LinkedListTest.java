// Test LL
package list.linkedList;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		// 내가 만든 단순 링크드리스트
		BasicLinkedList link1 = new BasicLinkedList();
		link1.display();
		
		
		
		// import 한 스탠다드 링크드리스트
		LinkedList<Integer> link2 = new LinkedList<Integer>();
		System.out.println("\n\n\n------------------------\n");
		System.out.println("empty LL: " + link2);
		
		// 리스트 초기화
		link2.add(new Integer(2));
		link2.add(new Integer(3));
		link2.add(new Integer(4));
		link2.add(new Integer(5));
		link2.add(new Integer(6));
		System.out.println("\ninit LL: " + link2);
		
		// 첫번째와 마지막 추가
		link2.addFirst(new Integer(1));
		link2.addLast(new Integer(7));
		System.out.println("\nadd first and last: " + link2);
		
		// 리스트 사이즈 출력
		System.out.println("\nsize of list: " + link2.size());
		
		// 6번째 노드 삭제
		link2.remove(5);
		System.out.println("\nremove 6th node: " + link2);
		
		// 첫번째와 마지막 삭제
		link2.removeFirst();
		link2.removeLast();
		System.out.println("\nremove first and last: " + link2);

		// 리스트 사이즈 출력
		System.out.println("\nsize of list: " + link2.size());
		
		// 2번째 값을 얻고, set value
		Integer val = link2.get(1);
		link2.set(1, val + new Integer(996));
		System.out.println("\nget and set 2th value: " + link2);
		
		// 모든 요소를 배열로 얻어와 순서대로 출력
		System.out.println("");
		Object[] valArr = link2.toArray();
		for (int i = 0; i < valArr.length; i++) {
			System.out.println(valArr[i]);
		}
		
	}

}
