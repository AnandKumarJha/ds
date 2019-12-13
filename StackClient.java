class StackClient{
public static void main(String args[]){
System.out.println("StackTesting");
Stack stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);

System.out.println(stack.pop()+" "+stack.pop()+" "+ stack.pop() +" "+ stack.pop() +" "+stack.peak()+ " "+stack.isEmpty());
}
}


