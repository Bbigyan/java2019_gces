class Stack{
	int top,array[],maxSize;
	Stack(int size){
		top = 0;
		array = new int[size];
		maxSize = size;
	}

	void push(int data){
		if(top == maxSize){
			System.out.println("Stack is full");
		}else{
			array[top] = data;
			top++;
		}
	}

	Integer top(){
		if(top == 0){
			return array[top-1];
		}else{
			return null;
		}
	}

	void pop(){
		if(top == 0){
		    System.out.println("Stack is empty");
		}else{
		    top--;
		}
	}
	void display(){
		for(int i=top-1;i>=0;i--){
			System.out.println(array[i]);
		}
	}
}