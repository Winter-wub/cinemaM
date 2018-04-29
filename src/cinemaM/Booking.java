package cinemaM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Booking extends JFrame {

	private int seat;
	private JPanel contentPane;
	private JTextField seat_txt;
	private JTextField total_price;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Booking(int seat) {
		this.seat = seat;
		int total = this.seat * 140 ; 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		seat_txt = new JTextField();
		seat_txt.setBounds(93, 27, 116, 22);
		seat_txt.setText(Integer.toString(this.seat));
		contentPane.add(seat_txt);
		seat_txt.setColumns(10);
		
		total_price = new JTextField();
		total_price.setColumns(10);
		total_price.setBounds(93, 62, 116, 22);
		total_price.setText(Integer.toString(total));
		contentPane.add(total_price);
		
		JLabel label = new JLabel("New label");
		label.setBounds(12, 30, 56, 16);
		contentPane.add(label);
		
		label_1 = new JLabel("New label");
		label_1.setBounds(12, 65, 56, 16);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(429, 344, 97, 25);
		contentPane.add(btnNewButton);
		
		
		
	}
}
