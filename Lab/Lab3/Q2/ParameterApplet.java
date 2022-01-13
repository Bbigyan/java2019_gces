import java.applet.Applet;
import java.awt.Graphics;
class ParameterApplet extends Applet{
	String param;
	public void init(){
		param = getParameter("param");
	}

	public void paint(Graphics graphics){
		graphics.drawString(param,100,20);
	}
}