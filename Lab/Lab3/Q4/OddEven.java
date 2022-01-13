import java.awt.TextField;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class OddEven extends Frame{
	OddEven(){
		TextField num,result;
		Button getResult;

		num = new TextField();
		result = new TextField();

		getResult = new Button("Check Odd Even");

		num.setBounds(20,40,80,40);
		result.setBounds(110,40,80,40);

		getResult.setBounds(20,100,120,40);

		getResult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					if(Integer.parseInt(num.getText()) % 2 == 0){
						result.setText("Even");
					}else{
						result.setText("Odd");
					}
				}catch(Exception exception){
					result.setText(exception.getMessage());
				}
			}
		});

		add(num);
		add(result);
		add(getResult);
		setLayout(null);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args){
		new OddEven();
	}
}