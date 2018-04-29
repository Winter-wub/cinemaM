package cinemaM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class showtime_ui extends JFrame {

	private JPanel contentPane;
	private JTextField name_txt;
	private JTextField dir_txt;

	public flims flim;
	public theater th;

	/**
	 * Create the frame.
	 */
	public showtime_ui(flims flim,theater theater) {
		this.flim = flim;
		this.th =theater;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 614, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		
		JList showtime_list = new JList(theater.showtime);
		showtime_list.setBounds(12, 286, 290, 173);
		contentPane.add(showtime_list);
		
		JLabel lblNewLabel = new JLabel("\u0E0A\u0E37\u0E48\u0E2D\u0E20\u0E32\u0E1E\u0E22\u0E19\u0E15\u0E4C");
		lblNewLabel.setBounds(12, 13, 73, 16);
		contentPane.add(lblNewLabel);
		
		name_txt = new JTextField();
		name_txt.setEditable(false);
		name_txt.setBounds(152, 10, 238, 22);
		name_txt.setText(flim.Name);
		contentPane.add(name_txt);
		name_txt.setColumns(10);
		
		JLabel label = new JLabel("\u0E0A\u0E37\u0E48\u0E2D\u0E1C\u0E39\u0E49\u0E01\u0E33\u0E01\u0E31\u0E1A");
		label.setBounds(12, 42, 73, 16);
		contentPane.add(label);
		
		dir_txt = new JTextField();
		dir_txt.setEditable(false);
		dir_txt.setColumns(10);
		dir_txt.setBounds(152, 45, 238, 22);
		dir_txt.setText(flim.Director);
		contentPane.add(dir_txt);
		
		JLabel lblNewLabel_1 = new JLabel("\u0E42\u0E23\u0E07");
		lblNewLabel_1.setBounds(538, 98, 30, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel theater_label = new JLabel(Integer.toString(theater.tid));
		theater_label.setFont(new Font("Tahoma", Font.BOLD, 29));
		theater_label.setBounds(527, 10, 41, 89);
		contentPane.add(theater_label);
		
		JButton btn_Booking = new JButton("Booking");
		btn_Booking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				select_seat ss = new select_seat(theater,showtime_list.getSelectedIndex());
				ss.setVisible(true);
				
			}
		});
		btn_Booking.setBounds(487, 434, 97, 25);
		contentPane.add(btn_Booking);
		
		
	}

	
}
