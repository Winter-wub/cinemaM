package cinemaM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.Window.Type;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class showtime_ui extends JFrame {

	
	private JPanel contentPane;
	private JTextField nameTxt;
	private JTextField director_txt;
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public showtime(flims flim,theater theater) {
		setTitle("\u0E23\u0E2D\u0E1A");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setBounds(100, 100, 607, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String[] showtime = new String[3];
		
		for(int i = 0 ;i <3 ;i++) {
				showtime[i] = theater.showtime[i]+"     เหลือที่ว่างอยู่       "+theater.get_Avalible_seat();
			
		}
		
		JList list = new JList(showtime);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(12, 228, 565, 190);

		
		
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("\u0E0A\u0E37\u0E48\u0E2D");
		lblNewLabel.setBounds(12, 13, 21, 16);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u0E1C\u0E39\u0E49\u0E01\u0E33\u0E01\u0E31\u0E1A");
		label.setBounds(12, 42, 48, 16);
		contentPane.add(label);
		
		nameTxt = new JTextField();
		nameTxt.setEditable(false);
		nameTxt.setBounds(55, 10, 183, 22);
		contentPane.add(nameTxt);
		nameTxt.setColumns(10);
		nameTxt.setText(flim.Name);
		director_txt = new JTextField();
		director_txt.setEditable(false);
		director_txt.setColumns(10);
		director_txt.setBounds(55, 39, 183, 22);
		director_txt.setText(flim.Director);
		contentPane.add(director_txt);
		
		JLabel label_1 = new JLabel("\u0E42\u0E23\u0E07");
		label_1.setBounds(457, 30, 28, 16);
		contentPane.add(label_1);
		
		JLabel theater_id_label = new JLabel(Integer.toString(theater.tid));
		theater_id_label.setFont(new Font("Tahoma", Font.BOLD, 32));
		theater_id_label.setBounds(512, 7, 48, 70);
		contentPane.add(theater_id_label);
		
		JButton btn_selectshow = new JButton("เลือกที่นั่ง");
		btn_selectshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				select_seat ss = new select_seat(theater,list.getSelectedIndex());
				ss.setVisible(true);
				
			}
		});
		btn_selectshow.setBounds(480, 193, 97, 25);
		contentPane.add(btn_selectshow);
		
		JLabel lblNewLabel_1 = new JLabel("เลือกรอบรับชม");
		lblNewLabel_1.setBounds(12, 199, 109, 16);
		contentPane.add(lblNewLabel_1);
		
	}
}
