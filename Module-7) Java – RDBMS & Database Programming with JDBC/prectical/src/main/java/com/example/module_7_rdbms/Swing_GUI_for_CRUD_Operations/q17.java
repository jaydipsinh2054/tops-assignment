package com.example.module_7_rdbms.Swing_GUI_for_CRUD_Operations;

//Create a simple Swing GUI with input fields for id, fname, lname, and email
import javax.swing.*;
import java.awt.*;

public class q17 {
	public static void main(String[] args) {

		JFrame frame = new JFrame("User Form");

		frame.setLayout(new GridLayout(5, 2, 5, 5));

		frame.add(new JLabel("ID:"));
		frame.add(new JTextField());

		frame.add(new JLabel("First Name:"));
		frame.add(new JTextField());

		frame.add(new JLabel("Last Name:"));
		frame.add(new JTextField());

		frame.add(new JLabel("Email:"));
		frame.add(new JTextField());

		frame.add(new JButton("Submit"));
		frame.add(new JButton("Clear"));

		frame.setSize(350, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
