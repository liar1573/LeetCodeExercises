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
		int[] arr = {4,5,8,2};

		PriorityQueue<Integer> myPQueue = new  PriorityQueue(10,
                new MyComparator());
		
		myPQueue.add(1);myPQueue.add(4);myPQueue.add(6);myPQueue.add(3);
		
		for(int i =0;i < 4;i++)
			System.out.println(myPQueue.poll());


	}


}


	


class MyComparator<Integer> implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if ((int)o1 < (int)o2) {
			//The operator < is undefined for the argument type(s) Integer, Integer
			return 1;
		}else if ((int)o1 == (int)o2) {
			return 0;
		}else {
			return -1;
		}

	}
	
}
