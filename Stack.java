class Stack {

private static final int MAX_SIZE = 3;
private int data[] = new int[MAX_SIZE];
private int top;
Stack(){
top = -1;
}

public void push(int dataToInsert){
	if(top>=MAX_SIZE-1){
		System.out.println("Stack is overflow!!");
	} else {
		data[++top] = dataToInsert;
	}
}

public int pop(){
	int dataToReturn = 0;
	if(top<0){
		System.out.println("Stack is underflow");
	}else{
		dataToReturn = data[top--];	
	}
return dataToReturn;
}

public int peak(){
	int peak = 0;
	if(top<0) {
		System.out.println("Stack is underflow");
	} else {
		peak = data[top];
	}
	return peak;
}

public boolean isEmpty() {
	if(top==-1){
		return true;
	} else {
		return false;
	}
}
}
