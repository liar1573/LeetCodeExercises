import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;



/**

 * @Title: Test.java

 * @Description: 用于在LeetCode做练习

 * @author liar

 * @date 

 */





public class Test {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int k = 3;
		int[] arr = {1,3,-1,-3,5,3,6,7};
		
		
		int[] show = maxSlidingWindow(arr, 3);
		
		for (int i : show) {
			System.out.println(i);
		}
	

	}
	
	public static int[] maxSlidingWindow(int[] nums,int k) {
		if(nums.length == 0 || k == 0){
			int[] empty= {};
			return empty;
		}	
		
		int[] result = new int[nums.length - k + 1];
		
		
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		LinkedList<Integer> resultList = new LinkedList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if ((i >= k)&&(myLinkedList.peek() <= i-k)) {//这里list一开始为空的时候不知道是否会报null
				//讲道理由于and逻辑短路的特性应该是不会执行到后半段的
				myLinkedList.poll();
			}
			//while ((!myLinkedList.isEmpty())&&(nums[myLinkedList.peek()] <= nums[i])) {
			//这里判断也用peek似乎不行，python代码取得是最后一个数字
			while ((!myLinkedList.isEmpty())&&(nums[myLinkedList.getLast()] <= nums[i])) {
				myLinkedList.pollLast();
			}
			myLinkedList.add(i);
			if(i >= k -1)//如果把前k个情况单独拿出去讨论就可以省掉这个判断
				resultList.add(nums[myLinkedList.peek()]);		
		}
		
		
		for (int i = 0; i < result.length; i++) {
			result[i] = resultList.poll();
			
		}
		
		return result;
	}


}


	


class MyComparator<Integer> implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		int i1 = ((java.lang.Integer) o1).intValue();
		int i2 = ((java.lang.Integer) o2).intValue();
		if (i1 < i2) {
			//The operator < is undefined for the argument type(s) Integer, Integer
			return 1;
		}else if (i1 == i2) {
			return 0;
		}else {
			return -1;
		}

	}
	
}
