/***********************************************************************************
 * Name: Shane Louis A. Barita          Course: BSIT
 *       Lenel John N. Baring
 *       Hannah Angelica Galve
 * 
 * CIS 2103 - Object Oriented Programming
 * 
 * File: Login.java
 * Description: Login section for Password Manager Program
**************************************************************************************/

package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class Login extends JFrame {

    private JPanel contentPane;
    private JPasswordField passwordField;
    private JLabel lblNewLabel_1;
    private JTextField textField;
    private JButton btnNewButton_1;

    public void Login(){
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        JLabel lblNewLabel = new JLabel("Enter Password: ");
        lblNewLabel.setBounds(58, 119, 114, 23);
        contentPane.add(lblNewLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(209, 119, 200, 23);
        contentPane.add(passwordField);

        JButton btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                setVisible(false);
                //PasswordManagerUI pman = new PasswordManagerUI();
                //pman.rinit();
            }
        });
        btnNewButton.setBounds(288, 175, 114, 25);
        contentPane.add(btnNewButton);

        lblNewLabel_1 = new JLabel("Username");
        lblNewLabel_1.setBounds(58, 92, 114, 15);
        contentPane.add(lblNewLabel_1);
        textField = new JTextField();
        textField.setBounds(209, 88, 200, 23);
        contentPane.add(textField);
        textField.setColumns(10);

        btnNewButton_1 = new JButton("Register");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){

            }
        });
        btnNewButton_1.setBounds(58, 175, 114, 25);
        contentPane.add(btnNewButton_1);

        setVisible(true);
    }
    
}
