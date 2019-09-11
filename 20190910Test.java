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

		//突然发现好像head没有更新过，一直是指向第一次传进来的头节点，这样有点问题。。
		//在length >= 2的情况下，p1和p2是肯定要交换一次的，先手动把head设置为p2好了
		head = p2;
			
		do{

		p1.next = last;

		pre = p2; p2.next = p1;
		
		//指针移动到下一组节点进行调换
		//if((last != null) && (last.next != null))
		if((last == null) || (last.next == null))
			break;//这里判断了之后while的判断应该可以去掉了
		//这里if的逻辑应该是while逻辑的取反，一开始想错了
		
		pre = last; p1 = last; p2 = p1.next;last = p2.next;
		
		
		//组内节点的调换，组间节点的连接好像还是有些问题，后面再思考一下
		

//		}while((last != null) && (last.next != null));
		}while(true);
		//第一遍调试进行了一次do就跳出了？应该是两次啊？？
		
//第一遍调试，1234被换成了134？？2哪去了？？
		

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
