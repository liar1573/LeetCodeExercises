参考代码点评及分析：
1）用中序遍历树，将所有节点存入数组，（判重）然后再检查数组中的元素是否按照升序排列：
（根据BST的性质中序遍历节点是按照中序排列的）
这也是之前自己用到的方法，可以做但是时空效率都很低

2）同样用递归，不过这里需要一个全局指针遍历保存前一个节点的指针，每次只需判断当前节点大于前序节点即可，不需要把整棵树的节点值都记录下来
//见鬼了本地测试都可以LeetCode上面死活通过不了

3）同样是递归，不过给递归函数中传入参数min和max，记录遍历过程中的最大值最小值情况，如果当前值小于最小值或者大于最大值马上返回假
原理是遍历BST，保证左子树中的最大值一定小于根节点，同时根节点一定要小于右子树的最小值
//这里还用到了一个小技巧，min和max设置为Integer类型，这样可以在初始化时赋值为空，避免了比较的问题

妈耶，这个用添加了min和max参数的方法效率贼高（合理利用递归方法效率还是很高的）


Python示例：


# 1）用中序遍历树，将所有节点存入数组，（判重）然后再检查数组中的元素是否按照升序排列：
def isValidBST(self, root):
    inorder = self.inorder(root)
    return inorder == list(sorted(set(inorder)))
# 这里的set(inorder)是用来判重的
# 老师提到这里写起来很简单，但是同时涉及到了排序、构造Set、Set和List的结构转换，其实时间和空间效率是很低的

def inorder(self, root):
    if root is None:
        return []
    return self.inorder(root.left) + [root.val] + self.inorder(root.right)
# 这里还是得益于python异常简洁的语法，如果换成Java可能要费很大劲才能完成中序节点构建数组（之前是使用ArrayList完成的）
# 这里使用return [] + 的语法连接列表在Java中根本无法想象


#2）同样用递归，不过这里需要一个全局指针遍历保存前一个节点的指针，每次只需判断当前节点大于前序节点即可，不需要把整棵树的节点值都记录下来
#见鬼了本地测试都可以LeetCode上面死活通过不了

def isValidBST(self, root):
    self.prev = None #python 实现把prev的赋值放在这里了，而且没有当参数传入helper，java实现中估计要修改一下
    return self.helper(root)

# 这里返回值类型应该对应于java中的boolean
def helper(self, root):
    if root is None:
        return True
    if not self.helper(root.left): # 递归调用如果左子树不满足的话返回假
        return False
    if self.prev and self.prev.val >= root.val: # 这里的prev在下面赋值，赋值顺序会不会有问题？？
        return False # 这个逻辑在Java中肯定是没办法这样写的
    self.prev = root # 后续通过尝试，prev需要设置一个全局变量来进行赋值才行
    # 讲解中提到，根据中序遍历prev的赋值一定要放在这里
    return self.helper(root.right)
# 递归一口气写了这么多出口还真的挺难理解的


#3）同样是递归，不过给递归函数中传入参数min和max，记录遍历过程中的最大值最小值情况，如果当前值小于最小值或者大于最大值马上返回假
#原理是遍历BST，保证左子树中的最大值一定小于根节点，同时根节点一定要小于右子树的最小值


Java解法：

1）

    public boolean isValidBST(TreeNode root) {
	
    if(null == root){
		return true;//按照定义空节点也符合BST要求
	}else if((null == root.left)&&(null == root.right)){
		return true;
	}
    
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();
    midTraverse(myArrayList, root);
    
//    Integer[] result; 
//    result = (Integer[]) myArrayList.toArray();
    //之前这样的类型转换有问题。。。
    
    int[] result = new int[myArrayList.size()];
    for (int i = 0; i < result.length; i++) {
		result[i] = myArrayList.get(i);
	}
    
    
    int[] sortArray = result.clone();
    Arrays.sort(sortArray);
    
    if (Arrays.equals(result, sortArray)) {
		return true;
	} else {
		return false;
	}


//说起来这个方法不是静态的，这样直接调用会不会报错？？
//方法中的调用好像不需要考虑这些问题，类似递归函数这种
//能否改题目中已给的方法声明呢？
    }

    public void midTraverse(ArrayList<Integer> myArrayList,TreeNode root){
    	if (null == root) {
			return;
		}
    	
    	if (null != root.left) {
    		midTraverse(myArrayList,root.left);
		}
    	
    	myArrayList.add(root.val);
    	
    	if (null != root.right) {
    		midTraverse(myArrayList,root.right);
		}
    	
    }


2）
	 public boolean isValidBST(TreeNode root) {
			 return helper(root);
		}

public boolean helper(TreeNode root) {
			if (null == root) {
				return true;
			}
			
			if(!helper(root.left))
				return false;
			
			if ((null != prev)&&(prev.val >= root.val)) {
				return false;
			}
			
			prev = root;
			//这里大致推导了一下，好像用参数传入prev的话后面赋值也会出现问题，比如[1,1]的例子就会出错
			//难道一定要把prev设置成全局变量？？
			
			return helper(root.right);
		}
    
    
    3）
    	 public boolean isValidBST(TreeNode root) {
	        return helper(root,null,null);
		}
    
     public boolean helper(TreeNode root,Integer min,Integer max) {
		 //这里min,max初始值如何赋值？？当root非空的时候都先赋值为root.val??
		 //好像不行，这样第一次就会被判等然后返回false了
		 //仿照python把min和max用对象Integer表示？
		if(null == root)
			return true;
		if(null != min && root.val <= min)
			return false;
		if(null != max && root.val >= max)
			return false;
		
		return helper(root.left, min, root.val) && helper(root.right, root.val, max);
	}



