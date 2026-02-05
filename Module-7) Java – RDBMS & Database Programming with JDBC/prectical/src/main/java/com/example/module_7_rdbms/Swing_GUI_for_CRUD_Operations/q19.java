package com.example.module_7_rdbms.Swing_GUI_for_CRUD_Operations;

//On button clicks, the program should interact with the database and perform the
//appropriate operation (insert, update, display records, or delete records).
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class q19 extends JFrame implements ActionListener {
	JTextField id, fname, lname, email;
	JButton insert, update, select, delete;
	Connection con;

	public q19() throws Exception {

		setLayout(new GridLayout(6, 2));

		id = new JTextField();
		fname = new JTextField();
		lname = new JTextField();
		email = new JTextField();

		add(new JLabel("ID"));
		add(id);
		add(new JLabel("First Name"));
		add(fname);
		add(new JLabel("Last Name"));
		add(lname);
		add(new JLabel("Email"));
		add(email);

		insert = new JButton("Insert");
		update = new JButton("Update");
		select = new JButton("Select");
		delete = new JButton("Delete");

		add(insert);
		add(update);
		add(select);
		add(delete);

		insert.addActionListener(this);
		update.addActionListener(this);
		select.addActionListener(this);
		delete.addActionListener(this);

		// DB connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

		try {
			PreparedStatement ps;

			if (e.getSource() == insert) {
				ps = con.prepareStatement("INSERT INTO users VALUES (?,?,?,?)");
				ps.setInt(1, Integer.parseInt(id.getText()));
				ps.setString(2, fname.getText());
				ps.setString(3, lname.getText());
				ps.setString(4, email.getText());
				ps.executeUpdate();
			}

			if (e.getSource() == update) {
				ps = con.prepareStatement("UPDATE users SET fname=?, lname=?, email=? WHERE id=?");
				ps.setString(1, fname.getText());
				ps.setString(2, lname.getText());
				ps.setString(3, email.getText());
				ps.setInt(4, Integer.parseInt(id.getText()));
				ps.executeUpdate();
			}

			if (e.getSource() == delete) {
				ps = con.prepareStatement("DELETE FROM users WHERE id=?");
				ps.setInt(1, Integer.parseInt(id.getText()));
				ps.executeUpdate();
			}

			if (e.getSource() == select) {
				ps = con.prepareStatement("SELECT * FROM users WHERE id=?");
				ps.setInt(1, Integer.parseInt(id.getText()));
				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
					fname.setText(rs.getString(2));
					lname.setText(rs.getString(3));
					email.setText(rs.getString(4));
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new q19();
	}
}
