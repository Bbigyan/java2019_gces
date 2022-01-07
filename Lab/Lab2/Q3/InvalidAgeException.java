class InvalidAgeException extends ArithmeticException{
	private String message;
	public InvalidAgeException(String message){
		super(message);
		this.message = message;
	}
	public String getMessage(){
		return "InvalidAgeException["+message+"]";
	}
}