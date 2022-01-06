import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class CalcAWTAssociationAnonymous {
	int left=10,top=40;
	final int width = 100,height = 40;
	Frame frame;
	TextField input_number1,input_number2,input_result;
	Button add,sub,mul,div;
	public CalcAWTAssociationAnonymous(){
		frame = new Frame("Calculator");

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

		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				performAction(e);
			}
		});
		sub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				performAction(e);
			}
		});
		mul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				performAction(e);
			}
		});
		div.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				performAction(e);
			}
		});

		frame.setSize(560,270);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	private void performAction(ActionEvent e){
		try{
			int num1 = Integer.parseInt(input_number1.getText());
			int num2 = Integer.parseInt(input_number2.getText());
			if(e.getSource() == add){
				input_result.setText(""+(num1+num2));
			}else if(e.getSource() == sub){
				input_result.setText(""+(num1-num2));
			}else if(e.getSource() == mul){
				input_result.setText(""+(num1*num2));
			}else if(e.getSource() == div){
				try{
					input_result.setText(""+(num1/(double)num2));
				}catch(ArithmeticException exception){
					input_result.setText("N/A");
				}
			}
		}catch(NumberFormatException nfe){
			input_result.setText("Invalid Input");
		}
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
		new CalcAWTAssociationAnonymous();
	}
}