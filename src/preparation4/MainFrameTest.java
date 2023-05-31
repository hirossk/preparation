package preparation4;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrameTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JFrame frame = new JFrame("sample");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300,300);    
	    JButton button = new JButton("button");
	    button.addActionListener(e->button.setText("押された"));
	    frame.add(button);
	    frame.setVisible(true);  
	}

}
