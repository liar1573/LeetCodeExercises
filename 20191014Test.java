import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Stack;



/**

 * @Title: Test.java

 * @Description: 用于在LeetCode做练习

 * @author liar

 * @date 下午3:37:50

 */





public class Test {



	/**

	 * @Title: main

	 * @Description: TODO

	 * @para: @param args

	 * @return: void

	 * @throws: 

	 * @author liar

	 * @date 2019年7月10日下午3:37:50

	 */

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		MyQueue myQueue = new MyQueue();
		myQueue.push(1);myQueue.push(2);myQueue.push(3);
		System.out.println(myQueue.pop());
		myQueue.push(4);
		System.out.println(myQueue.pop());
		


	}


}


class MyQueue{
	Stack<Integer> inputStack;
	Stack<Integer> outputStack;
	
	public MyQueue(){
		this.inputStack = new Stack<Integer>();
		this.outputStack = new Stack<Integer>();
		//Stack类的API介绍的时候没有提到容量，可以考虑为动态扩充容量的吧。。。
	}
	
	
    /** Push element x to the back of queue. */
    public void push(int x) {
        this.inputStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if (!this.outputStack.isEmpty()) {
    		return this.outputStack.pop();
		} else {
			while(!this.inputStack.isEmpty()){
				this.outputStack.push(this.inputStack.pop());
			}
	        return this.outputStack.pop();
		}
    }
    
    /** Get the front element. */
    public int peek() {
     	if (!this.outputStack.isEmpty()) {
    		return this.outputStack.peek();
		} else {
			while(!this.inputStack.isEmpty()){
				this.outputStack.push(this.inputStack.pop());
			}     
	        return this.outputStack.peek();
		}
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	//具体怎么样算空呢？暂时假顶input和output均为空时，myqueue为空
        return (this.inputStack.isEmpty() && this.outputStack.isEmpty());
    }
	
}

