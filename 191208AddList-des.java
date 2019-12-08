import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;

import javax.print.attribute.standard.Sides;

/**
 * @Title: Leet.java
 * @Description: TODO
 * @author liar
 * @date 下午10:22:10
 */

/**
 * @Title: Leet
 * @Description: TODO
 * @author liar
 * @date 下午10:22:10
 */
public class Leet {

	
	/**
	 * @Title: main
	 * @Description: TODO
	 * @para: @param args
	 * @return: void
	 * @throws: 
	 * @author liar
	 * @date 2019年11月8日下午10:22:11
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode result = addTwoNumbers(l1, l2);
		showList(result);
		showList(l1);
		showList(l2);
	}
	
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (null == l1) {
			return l2;
		}else if (null == l2) {
			return l1;
		}
		
		
        ListNode result = new ListNode(0);
        
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while (null != l1) {
			s1.push(l1.val);
			l1 = l1.next;
		}
        
        while (null != l2) {
			s2.push(l2.val);
			l2 = l2.next;
		}
        
        int over = 0;//每位的加法需要一个进位暂存
        ListNode tempListNode = null;
        while (!s1.isEmpty() || !s2.isEmpty()) {//一开始逻辑设反了，应该是非空循环来着
			int temp = 0;
			temp = s1.pop() + s2.pop() + over;//第一次加法进位忘了加上了，可能会少一位数字
			over = temp / 10;
			tempListNode = new ListNode(temp%10);
			tempListNode.next = result.next;
			result.next = tempListNode;
			//一开始链表的读取顺序是从高位到低位，然而经过栈之后的读取顺序已经变成了从低位到高位
			
		}
        
        result = result.next;//这里需要考虑链表定义的时候有没有一个空的头指针再决定是否进行这一步
        //如果有空的头指针的设定则不需要进行这一步
        return result;
    }


	public static void showList(ListNode l){
		while (l != null) {
			System.out.print(l.val + "-->");
			l = l.next;
		}
		System.out.println();
	}


}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
