
import java.util.LinkedList;
import java.util.Stack;

/**
 * @Title: Test.java
 * @Description: 用于在LeetCode做练习
 * @author liar
 * @date  2019/08/22 10:06
 */


/*
Reverse a singly linked list.
Example:
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:
A linked list can be reversed either iteratively or recursively. Could you implement both?
附加项：提出分别使用迭代和递归的方式实现链表反转

自己写的第一种非递归方法的结果时间和空间复杂度都不错
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
		
		ListNode l1,l2,temp;
		//(2 -> 4 -> 3) + (5 -> 6 -> 4)
		l1 = new ListNode(3);l1.next = null;

	

	

 	
 	
	}
	
	  public ListNode reverseList(ListNode head) {
	      ListNode result = null; 
		  ListNode temp1,temp2,previous;
		  
		  if (null == head) {
			return head;
		}
		  
		  //在假设假设长度很长的情况下写一下初步代码
		  temp1 = head;
		  temp2 = temp1.next;
		  
		  if (null == temp2) {
			return head;//当链表长度为1时，也可直接返回
		}
		  
		  previous = temp1;
		  temp1.next = null;
		  
		  //下方为当时的迭代思考过程，后面发现可以合并到do循环中间去
//		  temp1 = temp2;
//		  temp2 = temp1.next;
//		  temp1.next = previous;
//		  previous = temp1;
//		  
//		  temp1 = temp2;
//		  temp2 = temp1.next;
//		  temp1.next = previous;
//		  previous = temp1;
		  
		  do {//从上方的多次迭代得到这样的一个do循环（至少要执行一次），应该没问题
			  temp1 = temp2;
			  temp2 = temp1.next;
			  temp1.next = previous;
			  previous = temp1;
			  
		//} while (null != temp2.next);//这个判断条件没有考虑到长度为2的情况，当长度为2时第一次迭代temp2 == null，如果再使用temp2.next会报空指针
		} while ((null != temp2) && (null != temp2.next));
		  
		  //上面的判断条件换了对应的下面的结果返回也要微调一下
		  //其实也可以把长度为2的情况单独写出来，不过稍微显得有点麻烦了
		  
		  if(null == temp2){
			result = temp1;  
		  }else{
			temp2.next = temp1;
			result = temp2; 
		  }
		  //改完之后正常了
		  //temp2.next = temp1;
	      //result = temp2;
	      
	      return result;
	      //其实也可以不使用新的变量result，直接把参数head指向新的头节点之后再返回
	      //而且后面再想了一下临时指针变量应该可以缩小到2个，t1、t2可以合并为1个
	      
	      //第一次试运行Run Code结果正常，但是submit之后报错了，链表长度为2，可能是对于特殊情况的讨论还不周到
		  
		  
	      
	  }
 	

}

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    
}
