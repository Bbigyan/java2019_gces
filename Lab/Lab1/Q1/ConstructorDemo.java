class ConstructorDemo{
	public static void main(String[] args) {
		Number number = new Number();
		number.num1 = 5;
		number.num2 = 6;
		Number number2 = new Number(number);
		Number number3 = new Number(1,2);
		System.out.println(number.num1+" "+number.num2);
		System.out.println(number2.num1+" "+number2.num2);
		System.out.println(number3.num1+" "+number3.num2);
	}
}