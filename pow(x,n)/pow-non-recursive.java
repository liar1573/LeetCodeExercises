
/**
 * @Title: Leet.java
 * @Description: TODO
 * @author liar
 * @date ����10:22:10
 */

/**
 * @Title: Leet
 * @Description: TODO
 * @author liar
 * @date ����10:22:10
 */
public class Leet {

	
	/**
	 * @Title: main
	 * @Description: TODO
	 * @para: @param args
	 * @return: void
	 * @throws: 
	 * @author liar
	 * @date 2019��11��8������10:22:11
	 */
	public static void main(String[] args) {
		double x = 2.0;
		int n = -2147483647;
		int oversmall = -2147483648;
		
//		System.out.println("int oversmall = -2147483648");
//		System.out.println("int oversmall < 0:  " + (oversmall < 0));
//		System.out.println("int -oversmall > 0:  " + (-oversmall > 0));
		System.out.print(myPow(x, n-1));
		
	}
	
	//����λ����ķǵݹ��㷨����Ȼ����Խ�縺�������⣬��Ҫ��int n �ĳ� long n
	  public static double myPow(double x, long n) {
		        if(n < 0){
		            x = 1 / x;
		            n = -n;
		        }
		        
		        double pow = 1;
		        while(n > 0){
		            if(1 == (n & 1))
		                pow *= x;
		            x *= x;
		            n = n >> 1;
		        }
		        return pow;
		    }




}


