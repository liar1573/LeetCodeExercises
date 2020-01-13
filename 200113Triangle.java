import java.util.ArrayList;
import java.util.List;

public class CountPaths {

	public static void main(String[] args) {
		List<List<Integer>> testList = new ArrayList();
		ArrayList<Integer> list1 = new ArrayList<Integer>();//.add(new Integer(2););
		list1.add(new Integer(2));
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(new Integer(3));list2.add(new Integer(4));
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(new Integer(6));list3.add(new Integer(5));list3.add(new Integer(7));
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(new Integer(4));list4.add(new Integer(1));list4.add(new Integer(8));list4.add(new Integer(3));
		testList.add(list1);
		testList.add(list2);
		testList.add(list3);
		testList.add(list4);
    //一开始写List<List>测试用例得时候还真费了不少功夫。。。
		
		System.out.println(minimumTotal(testList));
		
	}
	
    public static int minimumTotal(List<List<Integer>> triangle) {
    	if (null == triangle) {
			return 0;
		}
    	
    	int size = triangle.size();
    	if (1 == size) {
			return triangle.get(0).get(0);
		}
    	
    	
    	int[] pre = new int[size];
    	int[] after = new int[size];
    	pre[0] = triangle.get(0).get(0);
    	
    	for (int i = 1; i < size; i++) {
			after[0] = pre[0] + triangle.get(i).get(0);//对角线值的初始化
			for (int j = 1; j < i; j++) {
				if (pre[j] > pre[j-1]) {
					after[j] = pre[j-1] + triangle.get(i).get(j);
				} else {
					after[j] = pre[j] + triangle.get(i).get(j);
				}
			}
			after[i] = pre[i-1] + triangle.get(i).get(i);//对角线值得初始化
			
			//然后需要把after得值给pre备份一份再来
			for (int j = 0; j < size; j++) {
				pre[j] = after[j];
			}
		}
    	
    	//最后只需要从after中找最小即可
    	int min = after[0];
    	for (int i = 1; i < size; i++) {
			if(after[i] < min)
				min = after[i];
		}
    	//leetcode上提交得时候举了个反例发现了隐藏得逻辑漏洞，如果输入只为{[-10]}
    	//当size=1时不会触发pre到after得传递，则会得到after得默认初始值0很可能出错
    	//加一个长度为1时得特殊判断好了
  
        //上方为使用O(N)空间得算法
        //下方为使用O(N^2)空间得算法
  
//    	int[][] temparr = new int[size][size];
//    	temparr[0][0] = triangle.get(0).get(0);
//    	for (int i = 1; i < size; i++) {
//			temparr[i][0] = temparr[i-1][0] + triangle.get(i).get(0);
//			temparr[i][i] = temparr[i-1][i-1] + triangle.get(i).get(i);
//		}
//    	
//    	for(int i = 2;i < size;i++){
//    		for (int j = 1; j < i; j++) {
//				if(temparr[i-1][j] > temparr[i-1][j-1]){
//					temparr[i][j] = temparr[i-1][j-1] + triangle.get(i).get(j);
//				}else {
//					temparr[i][j] = temparr[i-1][j] + triangle.get(i).get(j);
//				}
//			}
//    	}
//    	
//    	int min = temparr[size-1][0];
//    	for (int i = 1; i < size; i++) {
//			if(temparr[size-1][i] < min)
//				min = temparr[size-1][i];
//		}
    	
        return min;
    }
	

}
