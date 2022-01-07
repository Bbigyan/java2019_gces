package np.com.college;
public class College{
	private String name;
	private String location;

	public College(String name, String location){
		this.name = name;
		this.location = location;
	}
	public void show(){
		System.out.println("Name=> "+name+" Location=> "+location);
	}
}