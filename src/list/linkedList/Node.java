// 기본 노드 구조
package list.linkedList;

public class Node {

	int data;
	Node prev;
	Node next;

	// 이전 노드와 이후 노드 주소 모두 저장
	public Node (int data, Node prev, Node next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
	// 이후 노드 주소만 저장
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
}
