/**Test.java
 * 
 * TODO用于做LeetCode训练题
 * @author liar
 * 2019年9月10日 下午6:03:04
 * @version 1.0
 */

public class Test {

	/**
	 * @Description: TODO
	 * @para: @param args
	 * @return: void
	 * @throws: @param args
	 * @author: liar
	 * @date: 2019年9月10日 下午6:03:04
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode myListNode = new ListNode(1);
		myListNode.next = new ListNode(2);
		myListNode.next.next = new ListNode(3);
		myListNode.next.next.next = new ListNode(4);
		
		printLinkedList(myListNode);
		swapPairs(myListNode);
		printLinkedList(myListNode);
		

	}
	
	
	public static ListNode swapPairs(ListNode head) {
		if ((null == head) || (null == head.next)) {
			return head;
		}
		
		

		ListNode pre,last,p1,p2;

		pre = head;
		p1 = pre;p2 = pre.next;
		last = p2.next;
		do{
		p1.next = last;
		pre = p2; p2.next = p1;
		}while((last != null) && (last.next != null));
		
		return head;
    }
	
	static void printLinkedList(ListNode head){
		while ((null != head)) {
			System.out.print(head.val + "==>");
			head = head.next;
		}
	}

}


class ListNode {

    int val;

    ListNode next;

    ListNode(int x) { val = x; }

    

}
