package cinemaM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movielist_ui extends JFrame {

	public flims[] flims;
	public theater[] theater;
	private JPanel contentPane;
	

	/**
	 * Create the frame.
	 */
	public movielist_ui(flims[] flims,theater[] theater) {
		this.flims = flims;
		this.theater = theater;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton film0 = new JButton("ดูรอบ");
		film0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showtime_ui s_ui = new showtime_ui(flims[0],theater[0]);
				s_ui.setVisible(true);
			}
		});
		film0.setBounds(123, 203, 97, 25);
		contentPane.add(film0);
		
		JButton flim1 = new JButton("ดูรอบ");
		flim1.setBounds(279, 203, 97, 25);
		contentPane.add(flim1);
		
	}
}