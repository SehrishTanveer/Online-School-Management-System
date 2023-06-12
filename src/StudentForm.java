import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class StudentForm extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JPasswordField passwordField;

    public StudentForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblAddStudent = new JLabel("Add Student");
        lblAddStudent.setForeground(Color.DARK_GRAY);
        lblAddStudent.setFont(new Font("TimeRoman", Font.ITALIC, 22));

        JLabel lblName = new JLabel("Name:");

        JLabel lblPassword = new JLabel("Password:");

        JLabel lblEmail = new JLabel("Email:");

        JLabel lblDOB = new JLabel("DOB:");

        JLabel lblAddress = new JLabel("Address:");

        JLabel lblCity = new JLabel("City:");

        JLabel lblContactNo = new JLabel("Contact No:");

        textField = new JTextField();
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setColumns(10);

        passwordField = new JPasswordField();

        JButton btnNewButton = new JButton("Add Student");
        btnNewButton.setBackground(Color.DARK_GRAY);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String password = String.valueOf(passwordField.getPassword());
                String email = textField_1.getText();
                String DOB = textField_2.getText();
                String address = textField_3.getText();
                String city = textField_4.getText();
                String contact = textField_5.getText();

                int i = Student.save(name, password, email, DOB, address, city, contact);
                if (i > 0) {
                    JOptionPane.showMessageDialog(StudentForm.this, "Student added successfully!");
                    AdminSuccess.main(new String[] {});
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(StudentForm.this, "Sorry, unable to save!");
                }
            }
        });

        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.DARK_GRAY);
        btnBack.setForeground(Color.WHITE); // Set the foreground color to white
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminSuccess.main(new String[] {});
                dispose();
            }
        });

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
                .createSequentialGroup().addGap(20)
                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addComponent(lblName).addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 40,
                                GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDOB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAddress, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblContactNo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE))
                .addGap(58)
                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(textField, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(passwordField))
                .addContainerGap(107, Short.MAX_VALUE))
                .addGroup(gl_contentPane.createSequentialGroup().addContainerGap(151, Short.MAX_VALUE)
                        .addComponent(lblAddStudent).addGap(144))
                .addGroup(gl_contentPane.createSequentialGroup().addContainerGap(160, Short.MAX_VALUE)
                        .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                        .addGap(133))
                .addGroup(gl_contentPane.createSequentialGroup().addContainerGap(200, Short.MAX_VALUE)
                        .addComponent(btnBack).addGap(169)));
        gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup().addComponent(lblAddStudent).addGap(18)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                .addGroup(gl_contentPane.createSequentialGroup().addComponent(lblName).addGap(18)
                                        .addComponent(lblPassword))
                                .addGroup(gl_contentPane.createSequentialGroup()
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(ComponentPlacement.UNRELATED)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(18)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblEmail).addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblAddress)
                                .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE))
                        .addGap(18)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblDOB)
                                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE))
                        .addGap(18)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblCity)
                                .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE))
                        .addGap(18)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblContactNo).addComponent(textField_5, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18).addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36,
                                GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE).addComponent(btnBack)
                        .addGap(19)));
        contentPane.setLayout(gl_contentPane);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentForm frame = new StudentForm();
                    frame.setVisible(true);
                    frame. getContentPane().setBackground(new Color(153, 153, 153));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
