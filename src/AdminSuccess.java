
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class AdminSuccess extends JFrame {
	static AdminSuccess frame;
	private JPanel contentPane;

	public AdminSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setFont(new Font("TimeRoman",  Font.BOLD |Font.ITALIC,  22));
		lblAdminSection.setForeground(Color.DARK_GRAY);
                 lblAdminSection.setHorizontalAlignment(JLabel.CENTER);
                
                JPanel buttonPanel1 = new JPanel(new GridLayout(4,4,4,4)); 

		JButton btnAddLibrarian = new JButton("Add Librarian");
		btnAddLibrarian.setFont(new Font("TimesRoman", Font.PLAIN, 15));
                btnAddLibrarian.setBackground(Color.DARK_GRAY);
                btnAddLibrarian.setForeground(Color.white);
		btnAddLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			LibrarianForm.main(new String[]{});
			frame.dispose();
			}
		});
		
		JButton btnViewLibrarian = new JButton("View Librarian");
		btnViewLibrarian.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnViewLibrarian.setBackground(Color.DARK_GRAY);
		btnViewLibrarian.setForeground(Color.WHITE);
		btnViewLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewLibrarian.main(new String[] {});
			}
		});

		JButton btnDeleteLibrarian = new JButton("Delete Librarian");
		btnDeleteLibrarian.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnDeleteLibrarian.setBackground(Color.DARK_GRAY);
		btnDeleteLibrarian.setForeground(Color.WHITE);
		btnDeleteLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianDelete.main(new String[] {});
				frame.dispose();
			}
		});

		JButton btnAddTeacher = new JButton("Add Teacher");
		btnAddTeacher.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnAddTeacher.setBackground(Color.DARK_GRAY);
		btnAddTeacher.setForeground(Color.WHITE);
		btnAddTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherForm.main(new String[] {});
				frame.dispose();
			}
		});

		JButton btnViewTeacher = new JButton("View Teacher");
		btnViewTeacher.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnViewTeacher.setBackground(Color.DARK_GRAY);
		btnViewTeacher.setForeground(Color.WHITE);
		btnViewTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewTeacher.main(new String[] {});
			}
		});

		JButton btnDeleteTeacher = new JButton("Delete Teacher");
		btnDeleteTeacher.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnDeleteTeacher.setBackground(Color.DARK_GRAY);
		btnDeleteTeacher.setForeground(Color.WHITE);
		btnDeleteTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherDelete.main(new String[] {});
				frame.dispose();
			}
		});

		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnAddStudent.setBackground(Color.DARK_GRAY);
		btnAddStudent.setForeground(Color.WHITE);
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentForm.main(new String[] {});
				frame.dispose();
			}
		});

		JButton btnViewStudent = new JButton("View Student");
		btnViewStudent.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnViewStudent.setBackground(Color.DARK_GRAY);
		btnViewStudent.setForeground(Color.WHITE);
		btnViewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewStudent.main(new String[] {});
			}
		});

		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnDeleteStudent.setBackground(Color.DARK_GRAY);
		btnDeleteStudent.setForeground(Color.WHITE);
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDelete.main(new String[] {});
				frame.dispose();
			}
		});

		JButton btnAddAccountant = new JButton("Add Accountant");
		btnAddAccountant.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnAddAccountant.setBackground(Color.DARK_GRAY);
		btnAddAccountant.setForeground(Color.WHITE);
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantForm.main(new String[] {});
				frame.dispose();
			}
		});

		JButton btnViewAccountant = new JButton("View Accountant");
		btnViewAccountant.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnViewAccountant.setBackground(Color.DARK_GRAY);
		btnViewAccountant.setForeground(Color.WHITE);
		btnViewAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewAccountant.main(new String[] {});
			}
		});

		JButton btnDeleteAccountant = new JButton("Delete Accountant");
		btnDeleteAccountant.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnDeleteAccountant.setBackground(Color.DARK_GRAY);
		btnDeleteAccountant.setForeground(Color.WHITE);
		btnDeleteAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantDelete.main(new String[] {});
				frame.dispose();
			}
		});
             
                buttonPanel1.add(btnAddLibrarian);
                 buttonPanel1.add(btnViewLibrarian);
                  buttonPanel1.add(btnDeleteLibrarian);
                   buttonPanel1.add(btnAddTeacher);
                    buttonPanel1.add(btnViewTeacher);
                     buttonPanel1.add(btnDeleteTeacher);
                      buttonPanel1.add(btnAddStudent);
                       buttonPanel1.add(btnViewStudent);
                        buttonPanel1.add(btnDeleteStudent);
                         buttonPanel1.add(btnAddAccountant);
                          buttonPanel1.add(btnViewAccountant);
                           buttonPanel1.add(btnDeleteAccountant);
                
                            
                
                   JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		btnLogout.setBackground(Color.DARK_GRAY);
		btnLogout.setForeground(Color.WHITE);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SMS.main(new String[] {});
				frame.dispose();
			}
		});
                 JPanel logoutPanel = new JPanel();
                logoutPanel.setPreferredSize(new Dimension(40, 50));
                logoutPanel.setBackground(new Color(153,153,153)); 
                logoutPanel.add(btnLogout);

		
                contentPane.setLayout(new GridLayout(3,1));
                contentPane.add(lblAdminSection);
                contentPane.add(buttonPanel1);
                contentPane.add(logoutPanel);     
                 
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminSuccess();
					frame.setVisible(true);
					frame.getContentPane().setBackground(new Color(153,153,153)); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
