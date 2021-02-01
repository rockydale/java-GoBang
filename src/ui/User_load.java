package ui;

import javax.swing.*;

import chess_board.NullLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class load_frame extends JFrame{
	JTextField user_ip,user_name;
	JLabel ip_,name_,qq_icon;
	JButton choose_icon,login;
	ImageIcon icon = new ImageIcon("./qq_icon/QQ1.jpg");
	
	public void display() {
		setLayout(null);
		user_ip = new JTextField(15);
		user_name = new JTextField(15);
		ip_ = new JLabel("IP：");
		ip_.setFont(new Font("微软雅黑",18,17));
		name_ = new JLabel("用户名：");
		name_.setFont(new Font("微软雅黑",18,17));
		qq_icon = new JLabel(icon);
		choose_icon = new JButton("选择头像");
		choose_icon.setFont(new Font("微软雅黑",16,16));
		login  = new JButton("登录");
		login.setFont(new Font("微软雅黑",16,16));
		
		add(user_ip);
		add(user_name);
		add(qq_icon);
		add(name_);
		add(ip_);
		add(choose_icon);
		add(login);
		
		user_ip.setBounds(340,50,240,50);
		user_name.setBounds(340,150,240,50);
		qq_icon.setBounds(50,50,170,170);
		ip_.setBounds(250,30,70,70);
		name_.setBounds(250,140,70,70);
		choose_icon.setBounds(70,240,150,50);
		login.setBounds(370, 240, 180, 50);
		
		//给登录添加点击事件
		login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new Hall().display();
				setVisible(false);
			}
		});
		
		
		setTitle("用户登录");
		setSize(660,400);
		setLocation(700,350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class User_load {
	public static void main(String[] args) {
		new load_frame().display();
	}
}
