import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TeacherForm extends JFrame {
    static TeacherForm frame;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    public TeacherForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblAddTeacher = new JLabel("Add Teacher");
        lblAddTeacher.setForeground(Color.DARK_GRAY);
        lblAddTeacher.setFont(new Font("TimeRoman", Font.ITALIC, 22));

        JLabel lblName = new JLabel("Name:");

        JLabel lblEmail = new JLabel("Email:");

        JLabel lblCity = new JLabel("City:");

        JLabel lblQualification = new JLabel("Qualification");

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

        JButton btnNewButton = new JButton("Add Teacher");
        btnNewButton.setBackground(Color.DARK_GRAY);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String email = textField_1.getText();
                String city = textField_2.getText();
                String qualification = textField_3.getText();
                String contact = textField_4.getText();

                int i = Teacher.save(name, email, city, qualification, contact);
                if (i > 0) {
                    JOptionPane.showMessageDialog(TeacherForm.this, "Teacher added successfully!");
                    AdminSuccess.main(new String[]{});
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(TeacherForm.this, "Sorry, unable to save!");
                }
            }
        });

        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.DARK_GRAY);
        btnBack.setForeground(Color.WHITE);
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminSuccess.main(new String[]{});
                frame.dispose();
            }
        });
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGap(20)
                    .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblName)
                        .addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblQualification, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        .addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE))
                    .addGap(58)
                    .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, 177, Short.MAX_VALUE))
                    .addContainerGap(107, Short.MAX_VALUE))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap(151, Short.MAX_VALUE)
                    .addComponent(lblAddTeacher)
                    .addGap(144))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap(160, Short.MAX_VALUE)
                    .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                    .addGap(133))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap(200, Short.MAX_VALUE)
                    .addComponent(btnBack)
                    .addGap(169))
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addComponent(lblAddTeacher)
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCity)
                        .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblQualification)
                        .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblContactNo)
                        .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                    .addComponent(btnBack)
                    .addGap(19))
        );
        contentPane.setLayout(gl_contentPane);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new TeacherForm();
                    frame.setVisible(true);
                    frame. getContentPane().setBackground(new Color(153, 153, 153));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
