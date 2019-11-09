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
		String s2 = "vcxzz";
		
		System.out.println(isAnagram(s1, s2));
		 
	

	}
  
  	public static boolean isAnagram(String s, String t) {
		char[] s1 = s.toCharArray();
		char[] s2 = t.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		return Arrays.equals(s1, s2);
  }
  
  }
