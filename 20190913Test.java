
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @Title: Test.java
 * @Description: 用于在LeetCode做练习
 * @author liar
 * @date 下午3:37:50
 */


public class Test {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @para: @param args
	 * @return: void
	 * @throws: 
	 * @author liar
	 * @date 2019年7月10日下午3:37:50
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//第一个长度为6，无环的例子
//		ListNode myListNode = new ListNode(1);
//		myListNode.next = new ListNode(2);
//		myListNode.next.next = new ListNode(3);
//		myListNode.next.next.next = new ListNode(4);
//		myListNode.next.next.next.next = new ListNode(5);
//		myListNode.next.next.next.next.next = new ListNode(6);

		//第二个长度为4，有环的例子
		ListNode myListNode = new ListNode(1);
		myListNode.next = new ListNode(2);
		myListNode.next.next = new ListNode(3);
		myListNode.next.next.next = new ListNode(4);
		myListNode.next.next.next.next =myListNode.next;
		Test myTest = new Test();
		
		System.out.println("myListNode has a circle " + myTest.hasCycle(myListNode));
		
		
		
//		printLinkedList(myListNode);
//		System.out.println("myListNode = " + myListNode.val);
////		myListNode = swapPairs(myListNode);
//		System.out.println();
//		
//		System.out.println("myListNode = " + myListNode.val);
//		printLinkedList(myListNode); 	
	}
	
//	   public static boolean hasCycle(ListNode head) {//第一次使用HashMap的方法
//		   HashMap<ListNode,Integer> myHashMap = new HashMap<ListNode, Integer>();
//		   int index = 0;
//		   while (null != head) {
//			   if(myHashMap.containsKey(head))
//				   return true;
//			   myHashMap.put(head, index);
//			   head = head.next;
//		   }
//		   
//	        return false;
//	    }
	   
	   
	   public  boolean hasCycle(ListNode head) {//第二次换HashSet试试
		   HashSet<ListNode> myHashSet = new HashSet<ListNode>();
		   while (null != head) {
			   if(myHashSet.contains(head))
				   return true;
			   myHashSet.add(head);
			   head = head.next;
		   }
		   
	        return false;
	    }
	   
	   //快慢指针追赶的方法，一般很难想到
	   
//	    public boolean hasCycle(ListNode head) {
//	        ListNode s = head;
//	        ListNode f = head;
//	        while (s != null && f != null && f.next != null)  {
//	            s = s.next;
//	            f = f.next.next;
//	            if (s == f) {
//	                return true;
//	            } 
//	        }
//	        
//	        return false;
//	    }
	   
	   
	
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
