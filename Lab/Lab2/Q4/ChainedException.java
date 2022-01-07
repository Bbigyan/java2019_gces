class ChainedException{
	public static void main(String[] args){
		int num1 = 200;
		int num2 = 0;
		try{
			divide(num1,num2);
		}catch(TestException e){
			System.out.println(e.getMessage());
		}
	}
	private static void divide(int num1, int num2) throws TestException{
		try{
			System.out.println(num1/num2);
		}catch(ArithmeticException e){
			throw new TestException("Make sure num2 is not 0");
		}
	}
}