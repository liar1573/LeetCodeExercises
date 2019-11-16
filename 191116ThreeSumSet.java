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
import java.util.Set;
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
		
		//int[] nums = {-1,0,1,2,-1,-4};
		int[] nums = {0,0,0,0};
		
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
	        List<List<Integer>> out = new ArrayList();
	        
	        if(nums.length < 3) {
	            return out;    
	        }

			// Sort an array. It will hepl us to get the same triplets in the future
	        Arrays.sort(nums);

			// store intergers here to fast access
	        Set<Integer> cache = new HashSet();
			
			// store resut here to check duplicates
	        Set<List<Integer>> cacheTriplets = new HashSet();
	        
	        for(int i = 0; i < nums.length; i++) {
	            for(int j = i + 1; j < nums.length; j++) {
	                
	                int v1 = nums[i];
	                int v2 = nums[j];
	                int sum = v1 + v2;
	                
					// if there is a number that we can add and get summ equal zero
	                if(cache.contains(-sum)) {
					
						// create result triplet
	                    List<Integer> triplet = new ArrayList();
	                    triplet.add(v1);
	                    triplet.add(v2);
	                    triplet.add(-sum);  
	                    
//						// check duplicates
//	                    if(!cacheTriplets.contains(triplet)) {
//	                        out.add(triplet);
//	                        cacheTriplets.add(triplet);
//	                    }//这里的查重是没意义的，因为HashSet本身就不允许重复数据加入
	                    cacheTriplets.add(triplet);
	                 
	                    
	                }
	            }
	            cache.add(nums[i]);
	        }
	        
	        out.addAll(cacheTriplets);
	        return out;
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


	
