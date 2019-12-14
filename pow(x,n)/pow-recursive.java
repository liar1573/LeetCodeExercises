

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
		double x = 2.0;
		int n = -2147483647;
		int oversmall = -2147483648;
		
		//System.out.println("int oversmall = -2147483648");
		//System.out.println("int oversmall < 0:  " + (oversmall < 0));
		//System.out.println("int -oversmall > 0:  " + (-oversmall > 0));
		System.out.print(myPow(x, n-1));
		
	}
	
	
	//自己的解法，需要把int n改成long n，否则对越界负数取负的时候可能会发生意外
	  public static double myPow(double x, long n) {
		  if (1 == x || -1 == x) {//对x等于±1的特殊情况可以快速返回
			  if (n % 2 == 0) {
				  return x*x;
			}else {
				return x;
			} 
		}
		  
		  if (1 == n) {
			return x;
		}
		  if (0 == n) {
			return 1;
		}
		  if (n < 0) {
			return (1.0 / myPow(x, -n)); 
		}
//		  if (0 == n%2) {//最原始的自己的解法
//			return (myPow(x, n/2)*myPow(x, n/2));
//		}else {
//			return (myPow(x, n/2)*myPow(x, n/2)*x);
//		}
		//参考视频的解法试一试
		  if (0 == n%2) {
				return (myPow(x*x, n/2));
			}else {
				return (myPow(x*x, n/2)*x);
			}
	  }
	  
	  //别人的解法，没有直接取负数所以没有异常
	  public double myPow(double x, int n) {
        
        if(n == 0)
            return 1;
        
        double temp = myPow(x,n/2);
        
        if((n%2 == 0)){
            return temp*temp;
        }
        else{
            if(n > 0)
                return x*temp*temp;
            else
                return (temp*temp)/x;
        }        
    }


}

