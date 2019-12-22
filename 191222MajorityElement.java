import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
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
		int[] input = {3,2,3};
		
	}
	
	
	   public static int majorityElement(int[] nums) {
		   //方法2：使用HashMap统计元素出现次数，运行效果一般
//		   int tempMajor=0,tempCount = 0;
//		   
//		   HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
//		   
//		   for (int value : nums) {
//			if (null != myMap.get(value)) {
//				if (myMap.get(value) > (nums.length/2)) {
//					return value;
//				} else {
//					myMap.put(value,myMap.get(value)+1);
//					if (myMap.get(value) > tempCount) {
//						tempCount = myMap.get(value);
//						tempMajor = value;
//					}
//				}
//				
//			} else {
//				myMap.put(value,1);
//				//之前这里没有放更新temp值的逻辑，但是经过测试发现对于单元素数组的特殊情况会报错，所以还是需要补上
//				if (myMap.get(value) > tempCount) {
//					tempCount = myMap.get(value);
//					tempMajor = value;
//				}
//			}
//		   }
//		   
//		   //这里由于长度的限制必须要在循环完之后再判断一下，否则返回结果会有问题
//		   //比如对于{3,2,3}的情况
//		   
//		   //用HashMap计数的算法要考虑很多特殊情况，判断逻辑麻烦了很多，而且效率显示也不太好。。
//		   return tempMajor; 
		   
//		   方法1-使用排序去中位数
	       int[] temp = nums.clone();
	       Arrays.sort(temp); 
		   return temp[(temp.length)/2];
	    }
	
}
