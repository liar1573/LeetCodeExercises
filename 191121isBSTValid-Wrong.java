/**Test.java
 * 
 * TODO用于做LeetCode训练题
 * @author liar
 * 2019年9月10日 下午6:03:04
 * @version 1.0
 */

public class Test {

	/**
	 * @Description: TODO
	 * @para: @param args
	 * @return: void
	 * @throws: @param args
	 * @author: liar
	 * @date: 2019年9月10日 下午6:03:04
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	}
	
	

	
	
    public boolean isValidBST(TreeNode root) {
	
    if(null == root){
		return true;//按照定义空节点也符合BST要求
	}else if((null == root.left)&&(null == root.right)){
		return true;
	}else if ((null == root.left)&&(null != root.right)) {
		if (root.right.val > root.val) {
			return isValidBST(root.right);//这里居然没有报错的?可能类似于递归调用函数的感觉吧。。		
		}else 
			return false;
	}else if ((null != root.left)&&(null == root.right)) {
		if (root.left.val < root.val) {
			return isValidBST(root.left);		
		}else
			return false;
	}else {//排除了上面一堆之后，只剩一种左右子树都存在的情况了
		if((root.left.val < root.val)&&(root.right.val > root.val))
			return (isValidBST(root.left)&&isValidBST(root.right));
		else {
			return false;
		}
	}



//说起来这个方法不是静态的，这样直接调用会不会报错？？
//方法中的调用好像不需要考虑这些问题，类似递归函数这种
//能否改题目中已给的方法声明呢？
    }


}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
