package Interview;

import java.util.LinkedList;
import java.util.List;

public class RemoveKFromList {


	
	public static void main(String[] args) {
		ListNode list = new ListNode(5);
		list.value = 1;
		int k = 3;
		removeKFromList(list, k);
	}
	
	static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
		
		ListNode list = new ListNode(0);
		ListNode temp = list;
		
		while (l != null) {
			if (l.value != k) {
				temp.next = l;
				temp = temp.next;
			}
			l = l.next;
		}
		temp.next = null;
		return list.next;
	}

}


class ListNode<T> {
	ListNode(T x) {
		value = x;
	}
	T value;
	ListNode<T> next;
}


