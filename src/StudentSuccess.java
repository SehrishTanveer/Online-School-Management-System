import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentSuccess extends JFrame {
	static StudentSuccess frame;
	private JPanel contentPane;
        
	public StudentSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblStudentSection = new JLabel("    Student Section                   ");
		lblStudentSection.setFont(new Font("TimeRoman", Font.ITALIC, 22));
		
		
		JButton btnViewBooks = new JButton("View Books");
                btnViewBooks.setBackground(Color.DARK_GRAY);
                btnViewBooks.setForeground(Color.white);
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewBooks.main(new String[]{});
			}
		});
		btnViewBooks.setFont(new Font("TimeRoman", Font.PLAIN, 13));
	
		JButton btnViewTeacher = new JButton("View Teachers");
                btnViewTeacher.setBackground(Color.DARK_GRAY);
                btnViewTeacher.setForeground(Color.white);
		btnViewTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewTeacher.main(new String[]{});
			}
		});
		btnViewTeacher.setFont(new Font("TimeRoman", Font.PLAIN, 13));
                
		JButton btnLogout = new JButton("Logout");
                btnLogout.setBackground(Color.DARK_GRAY);
                btnLogout.setForeground(Color.white);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SMS.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("TimeRoman", Font.PLAIN, 13));
                
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(81, Short.MAX_VALUE)
					.addComponent(lblStudentSection)
					.addGap(54))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(132)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewTeacher, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(101, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStudentSection)
					.addGap(18)
					.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnViewTeacher,GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
        public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StudentSuccess();
					frame.setVisible(true);
                                      frame.getContentPane().setBackground(new Color(153,153,153));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
