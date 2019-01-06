// 단순 링크드리스트
package list.linkedList;

import java.util.Scanner;

public class BasicLinkedList {

	private static int size = 0;	// 총 노드 개수
	private Node head;
	private Node tail;
	Scanner scn = new Scanner(System.in);

	protected BasicLinkedList() { }

	private void addNode(int data) {
		// 최초 head, tail 초기화(최초 2회 반복시 2개 노드)
		if (this.head == null) {
			this.head = new Node(data, null);
			System.out.println("head 생성!");
			size++;
			return;
		} else if (this.head.next == null) {
			this.tail = new Node(data, this.head, null);
			this.head.next = tail;
			System.out.println("tail 생성!");
			size++;
			return;
		}

		// 말단(tail) 노드 추가
		Node tmp = new Node(data, this.tail, null);
		this.tail.next = tmp;
		this.tail = tmp;
		System.out.println("node 생성!");
		size++;
	}

	private void rmNode() {
		if (this.head != null && this.head.next == null) {
			scn.nextLine();
			System.out.print("\nhead 노드 하나만 남았습니다. 제거하실건가요? (y/n)\n >> ");
			String rm = scn.nextLine();
			if (rm.equals("y")) {
				System.out.println("\n...제거 데이터: " + this.head.data);
				this.head = null;
				this.tail = null;
				System.out.println("최종 노드 제거\n");
				size--;
			} else if (rm.equals("n")) {
				System.out.println("\n...실행 취소됨\n");
			} else {
				System.out.println("\n잘못된 입력입니다\n...실행 취소됨\n");
			}
			return;
		}

		System.out.println("\n...제거 데이터: " + this.tail.data);
		this.tail = this.tail.prev;
		this.tail.next = null;
		System.out.println("말단 노드 제거\n");
		size--;
	}

	private void allNode() {
		int idx = 0;	// 노드 인덱스
		Node tmp = this.head;

		// 노드가 하나도 없을 때
		if (this.head == null) {
			System.out.println("There is no Node..");
		// 노드가 둘 이상일 때
		} else if (this.head.next != null) {
			// head.next 가 존재한다는 것은 다음 노드가 tail 일수도 있고 중간 노드일 수도 있다는 의미
			System.out.println("head node's data: " + tmp.data);
			// 중간 노드라면,
			while (tmp.next != tail) {
				tmp = tmp.next;
				System.out.println(idx + 2 + "st node's data: " + tmp.data);
				idx++;
			}
			tmp = tmp.next;
			System.out.println("tail node's data: " + tmp.data);
		// 노드가 하나일 때
		} else {
			System.out.println("head node's data: " + tmp.data);
		}
	}

	private int[] indexOf(int data) {
		Node tmp = this.head;
		int[] returnIdx = new int[10]; // 반환할 인덱스 배열, 배열의 두 번째 인덱스에 데이터가 존재한다면 중복
		int arrIdx = 0;	// 배열의 인덱스
		int idx = 1; // head, 첫 번째 노드의 인덱스
		
		for (int i = 0; i < returnIdx.length; i++) {	// init 0
			returnIdx[i] = 0;
		}
		
		for (int i = 0; i < size; i++) {
			if (tmp.data == data) {
				returnIdx[arrIdx] = idx;	// 찾는 노드가 존재한다면 해당 노드의 인덱스를 배열에 저장
				arrIdx++;	// 저장되었다면 배열의 인덱스 증가
			}
			idx++;	// 다음 노드의 인덱스
			tmp = tmp.next;
		}
		
		return returnIdx;
	}

	public void display() {

		int menu = 6;
		int data = 0;
		boolean run = true;

		while (run) {

			System.out.println("---------------------------- basicLinkedList --------------------------");
			System.out.println("1. add node 2. remove node 3. all node 4. search data 5. LL size 6. fin");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print(" select menu >> ");
			menu = scn.nextInt();
			switch (menu) {
			case 1:
				System.out.println("\n<add node>");
				System.out.print(" data >> ");
				data = scn.nextInt();

				addNode(data);
				System.out.println("\n...complete!\n");
				break;
			case 2:
				rmNode();
				System.gc();
				break;
			case 3:
				allNode();
				System.out.println("\n...fin!\n");
				break;
			case 4:
				System.out.println("\n<input search data>");
				System.out.print(" data >> ");
				data = scn.nextInt();

				int[] idx = indexOf(data);
				
				if (idx[1] != 0) {
					System.out.println("\n<중복된 노드가 있습니다>");
					for (int i = 0; idx[i] != 0; i++) {
						System.out.println(data + " 가 저장된 노드: " + idx[i] + " 번째");
					}
				} else {
					System.out.println(data + " 가 저장된 노드: " + idx[0] + " 번째");
				}
				System.out.println("\n...complete!\n");
				break;
			case 5:
				System.out.println("size of node: " + BasicLinkedList.size);
				System.out.println("\n...fin!\n");
				break;
			case 6:
				run = false;
			default:
				break;
			}
		}
		System.out.println("\nprogram shutdown..");
	}

}
