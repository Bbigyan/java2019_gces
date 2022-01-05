import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Component;
class CalcAWTAssociation {
	int left=10,top=40;
	final int width = 100,height = 40;
	Frame frame;
	public CalcAWTAssociation(){
		frame = new Frame("Calculator");

		Label number1 = (Label)createComponent(new Label("number1: "),false);
		TextField input_number1 = (TextField)createComponent(new TextField(),true);

		Label number2 = (Label)createComponent(new Label("number2: "),false);
		TextField input_number2 = (TextField)createComponent(new TextField(),true);

		Label result = (Label)createComponent(new Label("result: "),false);
		TextField input_result = (TextField)createComponent(new TextField(),true);

		Button add = (Button)createComponent(new Button("ADD"),false);
		Button sub = (Button)createComponent(new Button("SUB"),false);
		Button mul = (Button)createComponent(new Button("MUL"),false);
		Button div = (Button)createComponent(new Button("DIV"),false);

		frame.setSize(560,270);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	private Component createComponent(Component c,boolean bool){
		c.setBounds(left,top,width,height);
		left = left+width+10;
		if(bool){
			left = 10;
			top = top+height+10;
		}
		frame.add(c);
		return c;
	}
	public static void main(String[] args){
		new CalcAWTAssociation();
	}
}