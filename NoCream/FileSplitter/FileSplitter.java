package com.Baker.filesplitter;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FileSplitter extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFC;
    private File fTS;
    private JTextField textSplitSize;
    private long cSize;
    private String fileName;
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    FileSplitter frame = new FileSplitter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FileSplitter() {
		setTitle("File Splitter");
		final JFileChooser fc = new JFileChooser();
		
		 
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFC = new JTextField();
		 
		textFC.setBounds(122, 42, 302, 20);
		contentPane.add(textFC);
		textFC.setColumns(10);
		
		JButton btnFileChooser = new JButton("Choose File");
		btnFileChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int returnVal = fc.showOpenDialog(FileSplitter.this);

		        if (returnVal == JFileChooser.OPEN_DIALOG) {
		            File file = fc.getSelectedFile();
		            textFC.setText(file.getName());
		            fileName = file.getPath();
		            setFTS(file);
		            }
				
			}
		});
		btnFileChooser.setBounds(10, 11, 114, 20);
		contentPane.add(btnFileChooser);
		
		
		
		JLabel lblFileChosen = new JLabel("File Chosen:");
		lblFileChosen.setBounds(10, 42, 114, 14);
		contentPane.add(lblFileChosen);
		
		final JRadioButton rdbtnMb14 = new JRadioButton("1.4 MB");
		rdbtnMb14.setSelected(true);
		rdbtnMb14.setBounds(258, 10, 79, 23);
		contentPane.add(rdbtnMb14);
		rdbtnMb14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(rdbtnMb14.isSelected()){
					cSize = (long)(1.4*1024*1024);
					textSplitSize.setText("1.4 MB");
				}
				
			}
		});
		
		final JRadioButton rdbtnMb5 = new JRadioButton("5 MB");
		rdbtnMb5.setBounds(339, 10, 63, 23);
		rdbtnMb5.setSelected(false);
		contentPane.add(rdbtnMb5);
		rdbtnMb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(rdbtnMb5.isSelected()){
					cSize = (long)(1.4*1024*1024);
					textSplitSize.setText("5    MB");
				}
				
			}
		});
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnMb14);
		group.add(rdbtnMb5);
		
		JLabel lblSplitFileSize = new JLabel("Split File Size:");
		lblSplitFileSize.setBounds(163, 14, 79, 14);
		contentPane.add(lblSplitFileSize);
		
		JLabel lblSizeToSplit = new JLabel("Size to Split: ");
		lblSizeToSplit.setBounds(10, 74, 114, 14);
		contentPane.add(lblSizeToSplit);
		
		textSplitSize = new JTextField();
		textSplitSize.setBounds(122, 73, 86, 20);
		contentPane.add(textSplitSize);
		textSplitSize.setColumns(10);
		
		JButton btnSplit = new JButton("Split");
		btnSplit.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent arg0) {
				final SplitFile sf = new SplitFile();
				if (fileName != null){
				try {
					sf.split(fileName, cSize, fTS);
					JOptionPane.showMessageDialog(contentPane,
						    "Your file has been split successfully!", "Completion",
						    JOptionPane.PLAIN_MESSAGE);
					textFC.setText(null);
					
				} catch (IOException e) {
					e.printStackTrace();
				}}else{
					textFC.setText("Select a file first ");
				}
			}
		});
		btnSplit.setBounds(291, 227, 133, 23);
		contentPane.add(btnSplit);}
	
	void setFTS(File f){
		this.fTS = f;
	}
	
	
}
