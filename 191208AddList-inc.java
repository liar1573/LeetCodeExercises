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
//		ListNode l1 = new ListNode(2);
//		l1.next = new ListNode(4);
//		l1.next.next = new ListNode(3);
//		
//		ListNode l2 = new ListNode(5);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(4);
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(5);
		
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
        
        int over = 0;//每位的加法需要一个进位暂存
        ListNode tempListNode = result;
        
        while ((null != l1)||(null != l2)||(over == 1)) {
        	int temp,val1,val2 = 0;
        	if(null == l1)
        		val1 = 0;
        	else 
        		val1 = l1.val;
        	if(null == l2)
        		val2 = 0;
        	else 
        		val2 = l2.val;
        	
        	temp = val1+val2+over;
        	over = temp / 10;
        	//这里高位在链表尾时，需要从链表尾插入
        	tempListNode.next = new ListNode(temp%10);
        	tempListNode = tempListNode.next;
        	
        	//这里出现高位为空但是需要进位的情况，需要判断能否迭代指针
//        	l1 = l1.next;l2 = l2.next;
        	if(null != l1)
        		l1 = l1.next;
        	if(null != l2)
        		l2 = l2.next;
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
