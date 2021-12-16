class Number{
	int num1,num2;
	Number(){
		System.out.println("Default Constructor");
	}
	Number(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	Number(Number n){
		num1 = n.num1;
		num2 = n.num2;
	}
}