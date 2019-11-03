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
		//第一次k个原始入优先队列没法放进总循环
		PriorityQueue<Integer> myPQueue = new  PriorityQueue(10,new MyComparator());
		for (int i = 0; i < k; i++) {
			myPQueue.add(nums[i]);
		}
		result[0] = myPQueue.peek();
		
		for (int i = k; i < nums.length; i++) {
			
			myPQueue.remove(nums[i-k]);
			myPQueue.add(nums[i]);
			result[i-k+1] = myPQueue.peek();
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
