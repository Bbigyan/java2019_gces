class ExceptionDemo{
	public static void main(String[] args){
		int age = 120;
		ExceptionDemo ed = new ExceptionDemo();
		ed.isEligible(age);
	}
	void isEligible(int age) {
		if(age<1 || age>100){
			try{
				throw new InvalidAgeException("Invalid Age");
			}catch(InvalidAgeException e){
				System.out.println(e.getMessage());
			}
		}else{
			System.out.println("Eligible");
		}
	}
}