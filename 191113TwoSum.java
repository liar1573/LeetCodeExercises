import java.util.Hashtable;
class Solution {
    public int[] twoSum(int[] nums, int target) {
          Hashtable myHashtable = new Hashtable<Integer, Integer>();
        for(int i = 0;i < nums.length;i++)
        	myHashtable.put(nums[i], i);
        
        int[] results = new int[2];
        
        for(int i = 0;i <nums.length;i++){
        	int temp = target - nums[i];
//        	int index = 0;
        	
        	//想起来题目条件假设过解一定存在且唯一，所以这里有些讨论没必要了
        	if((null != myHashtable.get(temp)) && (i != (int)myHashtable.get(temp))){
        		results[0] = i;
        		results[1] = (int) myHashtable.get(temp);
        		return results;
        	}
        }
        	
        return results;
    }
}
