import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Calc extends JFrame{
	JTextField num1,num2,result;
	JButton add,sub;
	int width = 80,height = 20;
	Calc(){
		num1 = new JTextField();
		num2 = new JTextField();
		result = new JTextField();

		num1.setBounds(10,20,width,height);
		num2.setBounds(100,20,width,height);
		result.setBounds(10,50,width,height);

		add = new JButton("Add");
		sub = new JButton("Sub");

		add.setBounds(10,80,width,height);
		sub.setBounds(100,80,width,height);

		add(num1);
		add(num2);
		add(result);

		add(add);
		add(sub);

		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				result.setText(""+(Integer.parseInt(num1.getText())+Integer.parseInt(num2.getText())));
			}
		});

		sub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				result.setText(""+(Integer.parseInt(num1.getText())-Integer.parseInt(num2.getText())));
			}
		});

		setSize(200,150);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		new Calc();
	}
}