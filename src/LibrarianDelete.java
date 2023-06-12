import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianDelete extends JFrame {
    static LibrarianDelete frame;
    private JPanel contentPane;
    private JTextField textField;

    public LibrarianDelete() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblAdminLoginForm = new JLabel("Delete Librarian");
        lblAdminLoginForm.setForeground(Color.DARK_GRAY);
        lblAdminLoginForm.setFont(new Font("TimeRoman", Font.ITALIC, 20));

        JLabel lblEnterId = new JLabel("Enter Id:");

        textField = new JTextField();
        textField.setColumns(10);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBackground(Color.DARK_GRAY);
        btnDelete.setForeground(Color.white);
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sid = textField.getText();
                if (sid == null || sid.trim().equals("")) {
                    JOptionPane.showMessageDialog(LibrarianDelete.this, "Id can't be blank");
                } else {
                    int id = Integer.parseInt(sid);
                    int i = Librarian.delete(id);
                    if (i > 0) {
                        JOptionPane.showMessageDialog(LibrarianDelete.this, "Record deleted successfully!");
                    } else {
                        JOptionPane.showMessageDialog(LibrarianDelete.this, "Unable to delete given id!");
                    }
                }
            }
        });
        btnDelete.setFont(new Font("TimeRoman", Font.PLAIN, 13));

        JButton btnNewButton = new JButton("Back");
        btnNewButton.setBackground(Color.DARK_GRAY);
        btnNewButton.setForeground(Color.white);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminSuccess.main(new String[]{});
                frame.dispose();
            }
        });
        btnNewButton.setFont(new Font("TimeRoman", Font.PLAIN, 13));
        
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap(126, Short.MAX_VALUE)
                    .addComponent(lblAdminLoginForm)
                    .addGap(120))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGap(19)
                    .addComponent(lblEnterId)
                    .addGap(18)
                    .addComponent(textField, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(158, Short.MAX_VALUE))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap(155, Short.MAX_VALUE)
                    .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                    .addGap(170))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap(366, Short.MAX_VALUE)
                    .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, -1, GroupLayout.PREFERRED_SIZE)
                    .addGap(59))
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblAdminLoginForm)
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblEnterId)
                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                    .addComponent(btnNewButton)
                    .addContainerGap())
        );
        contentPane.setLayout(gl_contentPane);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new LibrarianDelete();
                    frame.setVisible(true);
                    frame.getContentPane().setBackground(new Color(153, 153, 153));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
