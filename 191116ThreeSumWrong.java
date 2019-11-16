import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.AbstractSet;



/**

 * @Title: Test.java

 * @Description: 用于在LeetCode做练习

 * @author liar

 * @date 

 */





public class Test {



	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String s1 = "zxcv";
		String s2 = "vcx";
		
		int[] nums = {-1,0,1,2,-1,-4};
		
		showResult(threeSum(nums));
		
		//sorted: {-4,-1,-1,0,1,2}

		 
	

	}
	
	public int[] twoSum(int[] nums, int target) {
        Hashtable myHashtable = new Hashtable<Integer, Integer>();
        int[] results = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
			if(null == myHashtable.get(target - nums[i]))
				myHashtable.put(nums[i],i);
			else{
				results[0] = (int) myHashtable.get(target - nums[i]);
				results[1] = i;
			}
				
		}

      	
      return results;
  }
	
	
	 public static List<List<Integer>> threeSum(int[] nums) {
		 if(nums.length < 3)//这种非法判断还是加上好了，显得严谨一些
			 return null;//不知道这里返回null是否合适。。还是需要返回{null}更好？
		 
		 
		 //ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		 ArrayList<List<Integer>> result = new ArrayList();
		 //用于查找的HashSet
		
//		 for (int i : nums) {
//			mySet.add(i);
//		}//这里讲道理当nums中有重复数组的时候会插入失败的，不过对整体影响不大不多做处理
		 
//		 HashSet<HashSet<Integer>> tempSet = new HashSet<HashSet<Integer>>();
		 //这里里面嵌套的ArrayList换成HashSet试试
		 HashSet<ArrayList<Integer>> tempSet = new HashSet<ArrayList<Integer>>();
		 HashSet<Integer> mySet = new HashSet<Integer>();
		 
		 //对nums排序避免后期出现重复三元组处理非常麻烦
		 Arrays.sort(nums);
		 
		 for (int i : nums) {
			mySet.add(i);
		}//这里讲道理当nums中有重复数组的时候会插入失败的，不过对整体影响不大不多做处理
		 
		 for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				int temp = -nums[i] - nums[j];
				
//				 HashSet<Integer> mySet = new HashSet<Integer>();
				 //这里的Set参考答案给的是放在for最外面的，但是总感觉应该是for里面。。。
				if(()&&(mySet.contains(temp))){
					ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
					tempArrayList.add(nums[i]);
					tempArrayList.add(nums[j]);
					tempArrayList.add(temp);
					tempSet.add(tempArrayList);
					//为了避免重复用掉一次的数字从
				}
//				}else {
//					mySet.add(temp);
//				}
				
			}
//				mySet.add(nums[i]);
				//感觉这里对mySet的处理很奇怪啊，不应该是在循环前先把数字放进去吗？
		}
		 
		 result.addAll(tempSet); 
		 return result;

		 
	 }
	 
	
	 
	 public static void showResult(List<List<Integer>> showList){
		 for (List<Integer> list : showList) {
			System.out.println();
			for (Integer integer : list) {
				System.out.print(integer + "  ");
			}
			
		}
		 
	 }

}


	
