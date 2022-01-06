import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class CalcSwingAssociationOutside{
	int left=10,top=40;
	final int width = 100,height = 40;
	JFrame frame;
	JTextField input_number1,input_number2,input_result;
	JButton add,sub,mul,div;
	public CalcSwingAssociationOutside(){
		frame = new JFrame("Calculator");

		JLabel number1 = (JLabel)createComponent(new JLabel("number1: "),false);
		input_number1 = (JTextField)createComponent(new JTextField(),true);

		JLabel number2 = (JLabel)createComponent(new JLabel("number2: "),false);
		input_number2 = (JTextField)createComponent(new JTextField(),true);

		JLabel result = (JLabel)createComponent(new JLabel("result: "),false);
		input_result = (JTextField)createComponent(new JTextField(),true);

		add = (JButton)createComponent(new JButton("ADD"),false);
		sub = (JButton)createComponent(new JButton("SUB"),false);
		mul = (JButton)createComponent(new JButton("MUL"),false);
		div = (JButton)createComponent(new JButton("DIV"),false);

		add.addActionListener(new ActionHandler(this));
		sub.addActionListener(new ActionHandler(this));
		mul.addActionListener(new ActionHandler(this));
		div.addActionListener(new ActionHandler(this));

		frame.setSize(560,270);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	private JComponent createComponent(JComponent c,boolean bool){
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
		new CalcSwingAssociationOutside();
	}
}
class ActionHandler implements ActionListener{
	CalcSwingAssociationOutside obj;
	public ActionHandler(CalcSwingAssociationOutside obj){
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