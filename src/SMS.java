/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sehrish tanveer
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;

public class SMS extends JFrame {
    static SMS frame;
    private JPanel contentPane;
    private JLayeredPane layeredPane;

    public SMS() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        setLocationRelativeTo(null);

        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, getWidth(), getHeight());
        contentPane.add(layeredPane);

        // Load the image and create a scaled version to fit the frame
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Sehrish tanveer\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\GROUP#9 -BSE203123-BSE203144-BSE203163\\src\\images\\school1.png");
        Image image = imageIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);

        // Create a JLabel to display the image
        JLabel backgroundLabel = new JLabel(new ImageIcon(image));
        backgroundLabel.setForeground(Color.white);
        backgroundLabel.setBounds(0, 0, getWidth(), getHeight());
        layeredPane.add(backgroundLabel, Integer.valueOf(0));

        JLabel lblLibraryManagement = new JLabel("SCHOOL MANAGEMENT SYSTEM");
        lblLibraryManagement.setFont(new Font("SANS_SERIF", Font.BOLD |Font.ITALIC, 20));
        lblLibraryManagement.setForeground(Color.WHITE);
        lblLibraryManagement.setBounds(0, getHeight() / 2 - 150, getWidth(), 100);
        lblLibraryManagement.setHorizontalAlignment(JLabel.CENTER);
        layeredPane.add(lblLibraryManagement, Integer.valueOf(1));

        JButton btnAdminLogin = new JButton("Admin Portal");
        btnAdminLogin.setBackground(Color.DARK_GRAY);
        btnAdminLogin.setForeground(Color.white);
        btnAdminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminLogin.main(new String[]{});
                frame.dispose();
            }
        });
        btnAdminLogin.setFont(new Font("TimesRoman", Font.PLAIN, 15));
        btnAdminLogin.setBounds(140, 90, 135, 52);
        layeredPane.add(btnAdminLogin, Integer.valueOf(1));

        JButton btnLibrarianLogin = new JButton("Student Portal");
        btnLibrarianLogin.setBackground(Color.DARK_GRAY);
        btnLibrarianLogin.setForeground(Color.white);
        btnLibrarianLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                StudentLogin.main(new String[]{});
            }
        });
        btnLibrarianLogin.setFont(new Font("TimesRoman", Font.PLAIN, 15));
        btnLibrarianLogin.setBounds(140, 160, 135, 53);
        layeredPane.add(btnLibrarianLogin, Integer.valueOf(1));

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPane.setLayout(gl_contentPane);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new SMS();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}




