import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class CalcAWTInheritanceOutside extends Frame{
	int left=10,top=40;
	final int width = 100,height = 40;
	TextField input_number1,input_number2,input_result;
	Button add,sub,mul,div;
	public CalcAWTInheritanceOutside(){
		setTitle("Calculator");

		Label number1 = (Label)createComponent(new Label("number1: "),false);
		input_number1 = (TextField)createComponent(new TextField(),true);

		Label number2 = (Label)createComponent(new Label("number2: "),false);
		input_number2 = (TextField)createComponent(new TextField(),true);

		Label result = (Label)createComponent(new Label("result: "),false);
		input_result = (TextField)createComponent(new TextField(),true);

		add = (Button)createComponent(new Button("ADD"),false);
		sub = (Button)createComponent(new Button("SUB"),false);
		mul = (Button)createComponent(new Button("MUL"),false);
		div = (Button)createComponent(new Button("DIV"),false);

		add.addActionListener(new EventHandler(this));
		sub.addActionListener(new EventHandler(this));
		mul.addActionListener(new EventHandler(this));
		div.addActionListener(new EventHandler(this));

		setSize(560,270);
		setLayout(null);
		setVisible(true);
	}
	private Component createComponent(Component c,boolean bool){
		c.setBounds(left,top,width,height);
		left = left+width+10;
		if(bool){
			left = 10;
			top = top+height+10;
		}
		add(c);
		return c;
	}
	public static void main(String[] args){
		new CalcAWTInheritanceOutside();
	}
}

class EventHandler implements ActionListener{
	CalcAWTInheritanceOutside obj;
	public EventHandler(CalcAWTInheritanceOutside obj){
		this.obj = obj;
	}
	public void actionPerformed(ActionEvent e){
		try{
			int num1 = Integer.parseInt(obj.input_number1.getText());
			int num2 = Integer.parseInt(obj.input_number2.getText());
			if(e.getSource() == obj.add){
				obj.input_result.setText(""+(num1+num2));
			}else if(e.getSource() == obj.sub){
				obj.input_result.setText(""+(num1-num2));
			}else if(e.getSource() == obj.mul){
				obj.input_result.setText(""+(num1*num2));
			}else if(e.getSource() == obj.div){
				try{
					obj.input_result.setText(""+(num1/(double)num2));
				}catch(ArithmeticException exception){
					obj.input_result.setText("N/A");
				}
			}
		}catch(NumberFormatException nfe){
			obj.input_result.setText("Invalid Input");
		}
	}
}