
import java.util.LinkedList;
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
		
		ListNode l1,l2,temp;
		//(2 -> 4 -> 3) + (5 -> 6 -> 4)
		l1 = new ListNode(3);l1.next = null;
//		l1.next = l1;l1 = new ListNode(4);
		temp = l1;l1 = new ListNode(4);l1.next = temp;
//		l1.next = l1;l1 = new ListNode(2);
		temp = l1;l1 = new ListNode(2);l1.next = temp;
		printList(l1);
		
		l2 = new ListNode(4);l2.next = null;
		temp = l2;l2 = new ListNode(6);l2.next = temp;
		temp = l2;l2 = new ListNode(5);l2.next = temp;
		printList(l2);
		
		
		
//		print = twoSum(nums, target);
		
//		System.out.print(print[0] +"       " +print[1]);
		
	}
	
 public static ListNode Solution(ListNode l1, ListNode l2) {
	 //想到有可能需要判断l1或者l2其中一者为空的情况？空到底是等于0还是连0都不算？？
	 //一者为空时之间输出另一者即可（两者均为空也没关系）
	 if(null == l1)
		 return l2;
	 if(null == l2)
		 return l1;
	 //经过这个判断已经可以确认两者长度都至少为1了
	 //在计算的过程中临时构造一个新的链表用于存储结果
        ListNode result = null; 
        int increaseBit = 0;//用于暂存进位的变量
        
        //原始节点和新建节点还是不能直接写代码，需要封装一个方法，不然太麻烦了
        
        //判断l1和l2哪个长度更大，放进length中记录
        //其实好像也不需要记录具体长度，对应的判断条件及接下来的路径不同即可

        	
        
        return result;
    }
	
	 private static void printList(ListNode list) {
		while (null != list) {
			System.out.print(list.val);
			
			list = list.next;
			if (null != list) {
				System.out.print("  -->  ");
			}
		}
		System.out.println();
		
	}
 	
 	
//	 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//	 Output: 7 -> 0 -> 8
//	 Explanation: 342 + 465 = 807.
 	

}

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    
}
