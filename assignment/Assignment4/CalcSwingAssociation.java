import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;
class CalcSwingAssociation {
	int left=10,top=10;
	final int width = 100,height = 40;
	JFrame frame;
	public CalcSwingAssociation(){
		frame = new JFrame("Calculator");

		JLabel number1 = (JLabel)createComponent(new JLabel("number1: "),false);
		JTextField input_number1 = (JTextField)createComponent(new JTextField(),true);

		JLabel number2 = (JLabel)createComponent(new JLabel("number2: "),false);
		JTextField input_number2 = (JTextField)createComponent(new JTextField(),true);

		JLabel result = (JLabel)createComponent(new JLabel("result: "),false);
		JTextField input_result = (JTextField)createComponent(new JTextField(),true);

		JButton add = (JButton)createComponent(new JButton("ADD"),false);
		JButton sub = (JButton)createComponent(new JButton("SUB"),false);
		JButton mul = (JButton)createComponent(new JButton("MUL"),false);
		JButton div = (JButton)createComponent(new JButton("DIV"),false);

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
		new CalcSwingAssociation();
	}
}