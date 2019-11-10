import java.util.Arrays;


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
		
		System.out.println(isAnagram(s1, s2));
		 
	

	}
	
	public static <E> boolean isAnagram(String s, String t) {
		int[] s1 = new int[26];
		int[] s2 = new int[26];
		//这里默认初始化数据应该都是0的就不用我再另外操作了
		
		 for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			s1[temp - 'a'] += 1;
		 }
		 
		 for (int i = 0; i < t.length(); i++) {
				char temp = t.charAt(i);
				s2[temp - 'a'] += 1;
		}
		 
		return Arrays.equals(s1, s2);
		

	 }

}
