

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
		
		//System.out.println("int oversmall = -2147483648");
		//System.out.println("int oversmall < 0:  " + (oversmall < 0));
		//System.out.println("int -oversmall > 0:  " + (-oversmall > 0));
		System.out.print(myPow(x, n-1));
		
	}
	
	
	//�Լ��Ľⷨ����Ҫ��int n�ĳ�long n�������Խ�縺��ȡ����ʱ����ܻᷢ������
	  public static double myPow(double x, long n) {
		  if (1 == x || -1 == x) {//��x���ڡ�1������������Կ��ٷ���
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
//		  if (0 == n%2) {//��ԭʼ���Լ��Ľⷨ
//			return (myPow(x, n/2)*myPow(x, n/2));
//		}else {
//			return (myPow(x, n/2)*myPow(x, n/2)*x);
//		}
		//�ο���Ƶ�Ľⷨ��һ��
		  if (0 == n%2) {
				return (myPow(x*x, n/2));
			}else {
				return (myPow(x*x, n/2)*x);
			}
	  }
	  
	  //���˵Ľⷨ��û��ֱ��ȡ��������û���쳣
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

