import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class AnimalInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * Main method
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalInfo frame = new AnimalInfo();
					frame.setVisible(true);
					//center the frame in the middle of the screen.
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * The method responsible for setting the elements to be displayed in the frame, and their behavior.
	 */
	public AnimalInfo() {
/**
* Instantiates an animal object for each animal selection
*/
		final Animal lion = new lion();
		final Animal tiger = new tiger();
		final Animal bear = new bear();
/**
 * Sets parameters for the JFrame
 */
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Adam\\Eclipse\\Web_General_WS\\AnimalInfo\\resources\\lion_app_icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final TextArea txtInfoDisplay = new TextArea();
		txtInfoDisplay.setEditable(false);
		txtInfoDisplay.setBounds(20, 66, 265, 160);
		contentPane.add(txtInfoDisplay);
		
		JButton btnLion = new JButton("Lion");
		btnLion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//sets the text in the text area to the value returned by the overridden lion.dispalyInfo() method.
				txtInfoDisplay.setText(lion.displayInfo());
			}
		});
		btnLion.setBounds(10, 11, 89, 39);
		contentPane.add(btnLion);
		
		JButton btnTiger = new JButton("Tiger");
		btnTiger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//sets the text in the text area to the value returned by the overridden lion.dispalyInfo() method.
				txtInfoDisplay.setText(tiger.displayInfo());
			}
		});
		btnTiger.setBounds(109, 11, 89, 39);
		contentPane.add(btnTiger);
		
		JButton btnBear = new JButton("Bear");
		btnBear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//sets the text in the text area to the value returned by the overridden lion.dispalyInfo() method.
				txtInfoDisplay.setText(bear.displayInfo());
			}
		});
		btnBear.setBounds(208, 11, 89, 39);
		contentPane.add(btnBear);
		
		
	}
}
