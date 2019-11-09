public static void main(String[] args) {

		// TODO Auto-generated method stub
		String s1 = "zxcv";
		String s2 = "vcxzz";
		
		System.out.println(isAnagram(s1, s2));
		 
	
  	public static boolean isAnagram(String s, String t) {
		 HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
		 HashMap<Character, Integer> myMap2 = new HashMap<Character, Integer>();
		
		 for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if(myMap.containsKey(temp)){//如果字母出现过就+1
				myMap.put(temp, myMap.get(temp)+1);
			}else {//否则初始化为1
				myMap.put(temp, 1);
			}
		 }
		 
		 for (int i = 0; i < t.length(); i++) {
				char temp = t.charAt(i);
				if(myMap2.containsKey(temp)){//如果字母出现过就+1
					myMap2.put(temp, myMap2.get(temp)+1);
				}else {//否则初始化为1
					myMap2.put(temp, 1);
				}
		}
		 
//		 Iterator<Entry<Character, java.lang.Integer>> showIterator = myMap.entrySet().iterator();
//		 while (showIterator.hasNext()) {
//			Map.Entry<java.lang.Character, java.lang.Integer> entry = (Map.Entry<java.lang.Character, java.lang.Integer>) showIterator
//					.next();
//			System.out.println(entry);	
//		}
//		 System.out.println(((Entry<Character, java.lang.Integer>) myMap.entrySet()).getKey());
		 
		 return myMap.equals(myMap2);
//		 return myMap.entrySet().equals(myMap2.entrySet());
	 }
  

	}
