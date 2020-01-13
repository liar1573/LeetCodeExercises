    public int climbStairs(int n) {
        if (1 == n) {
			return 1;
		}
        int[] arr = new int[n+1];
        
        arr[0] = 1; arr[1] = 1;
        for (int i = 2; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
        
		//补充另外一个小技巧，本题中如果只需要求fn则其实只需要三个变量记录最大值即可
		//空间复杂度可以从O(n)降为O1
		//a=1;b=1;c=1;
		 //for (int i = 2; i <= n; i++) {
		//	c = a + b;
		//	b = a;
		//	a = c;
		//}
		
    	return arr[n];
    }
