import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserGraphic {

	private JFrame frame;
	private JLabel lblTitleLabel;
	private JTextField inputTextField;
	private JButton btnGetMessage;
	private JLabel lblOutputMessage;
	private MyProgram mp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGraphic window = new UserGraphic();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserGraphic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		mp = new MyProgram();
		
		lblTitleLabel = new JLabel("First Program");
		lblTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleLabel.setBounds(142, 26, 159, 31);
		frame.getContentPane().add(lblTitleLabel);
		
		inputTextField = new JTextField();
		inputTextField.setBounds(157, 83, 130, 26);
		frame.getContentPane().add(inputTextField);
		inputTextField.setColumns(10);
		
		btnGetMessage = new JButton("Click Me");
		btnGetMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mp.setVar(getMessage());
				setMessage(mp.getVar());
			}
		});
		btnGetMessage.setToolTipText("Something fun");
		btnGetMessage.setBounds(167, 132, 117, 29);
		frame.getContentPane().add(btnGetMessage);
		
		lblOutputMessage = new JLabel("");
		lblOutputMessage.setBounds(156, 212, 145, 31);
		frame.getContentPane().add(lblOutputMessage);
	}
	
	public String getMessage() {
		return inputTextField.getText();
	}
	
	public void setMessage(String s) {
		lblOutputMessage.setText(s);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
