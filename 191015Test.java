class MyStack {
    
private Queue<Integer> qA = new LinkedList<Integer>();
private Queue<Integer> qB = new LinkedList<Integer>();
// Push element x onto stack.
public void push(int x) {
    if(qB.isEmpty())
    qA.add(x);
    else
    qB.add(x);
}

// Removes the element on top of the stack.
public int pop() {
    int tmp=0;
    if(qB.isEmpty()){
        while(!qA.isEmpty()){
           tmp=qA.poll();
           if(qA.isEmpty()) break;
           qB.add(tmp);
        }
    }else{
        while(!qB.isEmpty()){
           tmp=qB.poll();
           if(qB.isEmpty()) break;
           qA.add(tmp);
        }
    }
    
    return tmp;
}

// Get the top element.
public int top() {
    int tmp=0;
    if(qB.isEmpty()){
        while(!qA.isEmpty()){
           tmp=qA.poll();
           qB.add(tmp);
        }
    }else{
        while(!qB.isEmpty()){
           tmp=qB.poll();
           qA.add(tmp);
        }
    }
    return tmp;
    
}

// Return whether the stack is empty.
public boolean empty() {
    return qA.isEmpty()&&qB.isEmpty();
}

}

