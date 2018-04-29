package cinemaM;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class select_seat extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public select_seat(theater theater,int showtime) {
		String selected[] = new String[35];
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 735, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextArea list_selected = new JTextArea();
		list_selected.setEditable(false);
		list_selected.setBounds(12, 475, 233, 99);
		contentPane.add(list_selected);
		
		
		JButton button_35 = new JButton("*");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[0] = "ที่ 35 ถูกเลือก\n";
				list_selected.append(selected[0]);
				button_35.setEnabled(false);
			}
		});
		button_35.setEnabled(theater.isSeat_Avalible(showtime,0));
		button_35.setBounds(415, 312, 41, 31);
		contentPane.add(button_35);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[1] = "ที่ 1 ถูกเลือก\n";
				list_selected.append(selected[1]);
				button_1.setEnabled(false);
			}
		});
		button_1.setEnabled(theater.isSeat_Avalible(showtime,1));
		button_1.setBounds(52, 240, 41, 31);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[2] = "ที่ 2 ถูกเลือก\n";
				list_selected.append(selected[2]);
				button_2.setEnabled(false);
			}
		});
		button_2.setEnabled(theater.isSeat_Avalible(showtime,2));
		button_2.setBounds(92, 240, 41, 31);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("*");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[3] = "ที่ 3 ถูกเลือก\n";
				list_selected.append(selected[3]);
				button_3.setEnabled(false);
			}
		});
		button_3.setEnabled(theater.isSeat_Avalible(showtime,3));
		button_3.setBounds(133, 240, 41, 31);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("*");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[4] = "ที่ 4 ถูกเลือก\n";
				list_selected.append(selected[4]);
				button_4.setEnabled(false);
			}
		});
		button_4.setEnabled(theater.isSeat_Avalible(showtime,4));
		button_4.setBounds(173, 240, 41, 31);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("*");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[5] = "ที่ 5 ถูกเลือก\n";
				list_selected.append(selected[5]);
				button_5.setEnabled(false);
			}
		});
		button_5.setEnabled(theater.isSeat_Avalible(showtime,5));
		button_5.setBounds(214, 240, 41, 31);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("*");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[6] = "ที่ 6 ถูกเลือก\n";
				list_selected.append(selected[6]);
				button_6.setEnabled(false);
			}
		});
		button_6.setEnabled(theater.isSeat_Avalible(showtime,6));
		button_6.setBounds(254, 240, 41, 31);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("*");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[7] = "ที่ 7 ถูกเลือก\n";
				list_selected.append(selected[7]);
				button_7.setEnabled(false);
			}
		});
		button_7.setEnabled(theater.isSeat_Avalible(showtime,7));
		button_7.setBounds(294, 240, 41, 31);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[8] = "ที่ 8 ถูกเลือก\n";
				list_selected.append(selected[8]);
				button_8.setEnabled(false);
			}
		});
		button_8.setEnabled(theater.isSeat_Avalible(showtime,8));
		button_8.setBounds(334, 240, 41, 31);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[9] = "ที่ 9 ถูกเลือก\n";
				list_selected.append(selected[9]);
				button_9.setEnabled(false);
			}
		});
		button_9.setEnabled(theater.isSeat_Avalible(showtime,9));
		button_9.setBounds(375, 240, 41, 31);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[10] = "ที่ 10 ถูกเลือก\n";
				list_selected.append(selected[10]);
				button_10.setEnabled(false);
			}
		});
		button_10.setEnabled(theater.isSeat_Avalible(showtime,10));
		button_10.setBounds(415, 240, 41, 31);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[11] = "ที่ 11 ถูกเลือก\n";
				list_selected.append(selected[11]);
				button_11.setEnabled(false);
			}
		});
		button_11.setEnabled(theater.isSeat_Avalible(showtime,11));
		button_11.setBounds(456, 240, 41, 31);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[12] = "ที่ 12 ถูกเลือก\n";
				list_selected.append(selected[12]);
				button_12.setEnabled(false);
			}
		});
		button_12.setEnabled(theater.isSeat_Avalible(showtime,12));
		button_12.setBounds(496, 240, 41, 31);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[13] = "ที่ 13 ถูกเลือก\n";
				list_selected.append(selected[13]);
				button_13.setEnabled(false);
			}
		});
		button_13.setEnabled(theater.isSeat_Avalible(showtime,13));
		button_13.setBounds(537, 240, 41, 31);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("*");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[14] = "ที่ 14 ถูกเลือก\n";
				list_selected.append(selected[14]);
				button_14.setEnabled(false);
			}
			
		});
		button_14.setEnabled(theater.isSeat_Avalible(showtime,14));
		button_14.setBounds(578, 240, 41, 31);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("*");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[15] = "ที่ 15 ถูกเลือก\n";
				list_selected.append(selected[15]);
				button_15.setEnabled(false);
			}
		});
		button_15.setEnabled(theater.isSeat_Avalible(showtime,15));
		button_15.setBounds(12, 273, 41, 31);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("*");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[16] = "ที่ 16 ถูกเลือก\n";
				list_selected.append(selected[16]);
				button_16.setEnabled(false);
			}
		});
		button_16.setEnabled(theater.isSeat_Avalible(showtime,16));
		button_16.setBounds(52, 273, 41, 31);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("*");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[17] = "ที่ 17 ถูกเลือก\n";
				list_selected.append(selected[17]);
				button_17.setEnabled(false);
			}
		});
		button_17.setEnabled(theater.isSeat_Avalible(showtime,17));
		button_17.setBounds(93, 273, 41, 31);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("*");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[18] = "ที่ 18 ถูกเลือก\n";
				list_selected.append(selected[18]);
				button_18.setEnabled(false);
			}
		});
		button_18.setEnabled(theater.isSeat_Avalible(showtime,18));
		button_18.setBounds(133, 273, 41, 31);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("*");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[19] = "ที่ 19 ถูกเลือก\n";
				list_selected.append(selected[19]);
				button_19.setEnabled(false);
			}
		});
		button_19.setEnabled(theater.isSeat_Avalible(showtime,19));
		button_19.setBounds(174, 273, 41, 31);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("*");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[20] = "ที่ 20 ถูกเลือก\n";
				list_selected.append(selected[20]);
				button_20.setEnabled(false);
			}
		});
		button_20.setEnabled(theater.isSeat_Avalible(showtime,20));
		button_20.setBounds(214, 273, 41, 31);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("*");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[21] = "ที่ 21 ถูกเลือก\n";
				list_selected.append(selected[21]);
				button_21.setEnabled(false);
			}
		});
		button_21.setEnabled(theater.isSeat_Avalible(showtime,21));
		button_21.setBounds(255, 273, 41, 31);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("*");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[22] = "ที่ 22 ถูกเลือก\n";
				list_selected.append(selected[22]);
				button_22.setEnabled(false);
			}
		});
		button_22.setEnabled(theater.isSeat_Avalible(showtime,22));
		button_22.setBounds(295, 273, 41, 31);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("*");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[23] = "ที่ 23 ถูกเลือก\n";
				list_selected.append(selected[23]);
				button_23.setEnabled(false);
			}
		});
		button_23.setEnabled(theater.isSeat_Avalible(showtime,23));
		button_23.setBounds(335, 273, 41, 31);
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("*");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[24] = "ที่ 24 ถูกเลือก\n";
				list_selected.append(selected[24]);
				button_24.setEnabled(false);
			}
		});
		button_24.setEnabled(theater.isSeat_Avalible(showtime,24));
		button_24.setBounds(375, 273, 41, 31);
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("*");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[25] = "ที่ 25 ถูกเลือก\n";
				list_selected.append(selected[25]);
				button_25.setEnabled(false);
			}
			
		});
		button_25.setEnabled(theater.isSeat_Avalible(showtime,25));
		button_25.setBounds(416, 273, 41, 31);
		contentPane.add(button_25);
		
		JButton button_26 = new JButton("*");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[26] = "ที่ 26 ถูกเลือก\n";
				list_selected.append(selected[26]);
				button_26.setEnabled(false);
			}
		});
		button_26.setEnabled(theater.isSeat_Avalible(showtime,26));
		button_26.setBounds(456, 273, 41, 31);
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("*");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[27] = "ที่ 27 ถูกเลือก\n";
				list_selected.append(selected[27]);
				button_27.setEnabled(false);
			}
		});
		button_27.setEnabled(theater.isSeat_Avalible(showtime,27));
		button_27.setBounds(497, 273, 41, 31);
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("*");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[28] = "ที่ 28 ถูกเลือก\n";
				list_selected.append(selected[28]);
				button_28.setEnabled(false);
			}
		});
		button_28.setEnabled(theater.isSeat_Avalible(showtime,28));
		button_28.setBounds(537, 273, 41, 31);
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("*");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[29] = "ที่ 29 ถูกเลือก\n";
				list_selected.append(selected[29]);
				button_29.setEnabled(false);
			}
		});
		button_29.setEnabled(theater.isSeat_Avalible(showtime,29));
		button_29.setBounds(578, 273, 41, 31);
		contentPane.add(button_29);
		
		JButton button_30 = new JButton("*");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[30] = "ที่ 30 ถูกเลือก\n";
				list_selected.append(selected[30]);
				button_30.setEnabled(false);
			}
		});
		button_30.setEnabled(theater.isSeat_Avalible(showtime,30));
		button_30.setBounds(618, 273, 41, 31);
		contentPane.add(button_30);
		
		JButton button_31 = new JButton("*");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[31] = "ที่ 31 ถูกเลือก\n";
				list_selected.append(selected[31]);
				button_31.setEnabled(false);
			}
		});
		button_31.setEnabled(theater.isSeat_Avalible(showtime,31));
		button_31.setBounds(253, 312, 41, 31);
		contentPane.add(button_31);
		
		JButton button_32 = new JButton("*");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[32] = "ที่ 32 ถูกเลือก\n";
				list_selected.append(selected[32]);
				button_32.setEnabled(false);
			}
		});
		button_32.setEnabled(theater.isSeat_Avalible(showtime,32));
		button_32.setBounds(293, 312, 41, 31);
		contentPane.add(button_32);
		
		JButton button_33 = new JButton("*");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[33] = "ที่ 33 ถูกเลือก\n";
				list_selected.append(selected[33]);
				button_33.setEnabled(false);
			}
		});
		button_33.setEnabled(theater.isSeat_Avalible(showtime,33));
		button_33.setBounds(334, 312, 41, 31);
		contentPane.add(button_33);
		
		JButton button_34 = new JButton("*");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected[34] = "ที่ 34 ถูกเลือก\n";
				list_selected.append(selected[34]);
				button_34.setEnabled(false);
			}
		});
		button_34.setEnabled(theater.isSeat_Avalible(showtime,34));
		button_34.setBounds(374, 312, 41, 31);
		contentPane.add(button_34);
		
		
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("\u0E08\u0E2D\u0E20\u0E32\u0E1E");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setBounds(276, 53, 105, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(689, 247, 16, 16);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(689, 280, 16, 16);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(689, 312, 16, 16);
		contentPane.add(lblC);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("\u0E17\u0E35\u0E48\u0E19\u0E31\u0E48\u0E07\u0E17\u0E35\u0E48\u0E40\u0E25\u0E37\u0E2D\u0E01\u0E44\u0E1B");
		lblNewLabel_1.setBounds(12, 446, 81, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnConfrim = new JButton("\u0E22\u0E37\u0E19\u0E22\u0E31\u0E19\u0E01\u0E32\u0E23\u0E40\u0E25\u0E37\u0E2D\u0E01");
		btnConfrim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seat=0;
				for(int i =0;i<35;i++) {
					try {
						if(selected[i] != null) {
						String seat_num = selected[i].substring(4, 6);
						seat_num = seat_num.replaceAll(" ", "");
						System.out.println(seat_num);
						int seat_no = Integer.parseInt(seat_num);
						theater.booking(seat_no, showtime);
						seat++;
					}
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "ข้อผิดพลาด", "ที่ไม่สามารถระบุ " , JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
				Booking bnk = new Booking(seat);
				bnk.setVisible(true);
				
			}
		});
		btnConfrim.setBounds(578, 488, 127, 25);
		contentPane.add(btnConfrim);
		
		JButton btn_Cancel = new JButton("\u0E22\u0E01\u0E40\u0E25\u0E34\u0E01\u0E17\u0E35\u0E48\u0E40\u0E25\u0E37\u0E2D\u0E01");
		btn_Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btn_Cancel.setBackground(new Color(255, 0, 0));
		btn_Cancel.setBounds(118, 429, 127, 25);
		contentPane.add(btn_Cancel);
 
	}
	
	
}
