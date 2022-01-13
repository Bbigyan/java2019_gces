import java.applet.Applet;
import java.awt.Graphics;
class AppletLifecycle extends Applet{
	public void init(){
		System.out.println("Applet Initialized");
	}

	public void start(){
		System.out.println("Applet Started");
	}

	public void paint(Graphics graphics){
		graphics.drawString("Painted",10,50);
	}

	public void stop(){
		System.out.println("Applet Stopped");
	}
	
	public void destroy(){
		System.out.println("Destroyed");
	}	
}