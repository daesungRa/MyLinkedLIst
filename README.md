# MyLinkedLIst
> my linked list

## Summary

많이 사용되는 LinkedList 를 직접 작성해 보았다
사용언어는 JAVA 이다

## 기본개념

- 리스트는 인덱스에 따라 순차적으로 데이터가 저장되는 자료구조이다
- 링크드리스트는 배열리스트에 비해 자료의 삽입과 삭제에 유리하나 (앞뒤 참조 주소값만 변경하면 됨), 검색에는 불리하다 (링크를 타고들어가야 함)
- 그 이유는, 저장공간이 순차적인 주소의 나열이 아닌 원격 노드의 주소참조에 의해 연결되어 있기 때문이다

![arraylist&linkedlist](https://github.com/daesungRa/MyLinkedList/blob/master/imgs/LinkedList01.PNG)
![linkedlist](https://github.com/daesungRa/MyLinkedList/blob/master/imgs/LinkedList02.PNG)

출처: [생활코딩](https://opentutorials.org/module/1335/8821)

## 구현방법

- 환형 연결리스트를 만들기로 함 (TAIL 노드는 HEAD 노드를 가리킴)
- 이전 노드 주소와 다음 노드 주소, data 를 저장하는 Node.java 클래스를 만들어 활용
- add, remove, allNode, indexOf 메서드를 만들었음
- 최초 HEAD 노드가 생성되고, 하나 추가될 때마다 TAIL 노드로 지정됨
- TAIL 노드는 HEAD 노드를 가리킴
- 삭제시 말단 노드가 삭제되고 그 이전 노드가 TAIL 이 됨
