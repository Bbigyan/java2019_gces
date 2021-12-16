class CommandLineArgs{
	public static void main(String[] args){
		if(args.length ==2){
			int num1,num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);

			System.out.println("Sum: "+(num1+num2));
			System.out.println("Difference: "+(num1-num2));
		}else{
			System.out.println("Enter two numbers");
		}
	}
}