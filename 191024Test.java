import java.util.ArrayDeque;
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
		int[] arr = {4,5,8,2};
		KthLargest kthLargest = new KthLargest(k, arr);
		System.out.println(kthLargest.add(3));
		System.out.println(kthLargest.add(5));
		System.out.println(kthLargest.add(10));
		System.out.println(kthLargest.add(9));
		System.out.println(kthLargest.add(4));
		
		
//		kthLargest.add(3);   // returns 4
//		kthLargest.add(5);   // returns 5
//		kthLargest.add(10);  // returns 5
//		kthLargest.add(9);   // returns 8
//		kthLargest.add(4);   // returns 8


	}


}

class KthLargest{
	final PriorityQueue<Integer> queue;
	final int k;
	
	public KthLargest(int k,int[] a){
		this.k = k;
		queue = new PriorityQueue<Integer>(k);
		for (int i : a) {
			add(i);
		}
	}
	
	public int add(int n){
		if(queue.size() < k)
			queue.offer(n);
		else if (queue.peek() < n) {
			queue.poll();
			queue.offer(n);
		}
		return queue.peek();
	}
	
}

