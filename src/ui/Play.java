package ui;

import java.awt.*;
import java.awt.event.*;
import mdlaf.*;
import mdlaf.animation.*;
import mdlaf.utils.MaterialColors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Event;

class Chess_board extends JPanel{
	Chess_board(){
		setSize(600,600);
		setLayout(null);
		setBackground(Color.orange);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 45;i<=555;i+=30)
			g.drawLine(45, i, 555, i);
		for(int j = 45;j<=555;j+=30)
			g.drawLine(j, 45, j, 555);
		
		g.fillOval(132, 132, 6, 6);
		g.fillOval(462, 132, 6, 6);
		g.fillOval(312, 312, 6, 6);
		g.fillOval(132, 492, 6, 6);
		g.fillOval(492, 492, 6, 6);
		}

		public void setBackgroundColorBlue() {
		    setBackground(Color.blue);
		}
		public void setBackgroundColorPink() {
		    setBackground(Color.pink);
		}

}


//把窗口设置为空布局 在里面添加 按钮和 面板
class NullLayout extends JFrame{
	public static final Color MainColor = new Color (241, 204, 185);
	public static final Color tea = new Color(185,208,157);
	JButton button1,button2,button3,button4,times,message;
	JMenuBar menubar;
	JMenu game_more,themes;
	JMenuItem game_rule,game_info,game_contact,theme_pink,theme_blue;
	JTabbedPane player1,player2;
	JTabbedPane cheat;
	JLabel icon,imessgae;
	//JTabbedPane tabbedPane;		//选项卡
	public void display(){
		try {
			UIManager.setLookAndFeel(new MaterialLookAndFeel());
		}
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setTitle("GoBang");
		setSize(1225,850);
		setLocation(300,50);
		setLayout(null);
		//setBackground(bgColor);
		this.getContentPane().setBackground(tea);
		//<!-- tab栏部分-->
		
		menubar = new JMenuBar();
		
		game_more = new JMenu("more..");		//新建 更多 菜单
		game_rule = new JMenuItem("game rule");
		game_info = new JMenuItem("game info");
		game_contact = new JMenuItem("contact us");
		
		themes = new JMenu("Theme");
		theme_pink = new JMenuItem("Pink");
		theme_blue = new JMenuItem("blue");

		//<!---->
		game_more.add(game_rule);
		game_more.add(game_info);
		game_more.add(game_contact);
		setJMenuBar(menubar);
		
		themes.add(theme_pink);
		themes.add(theme_blue);
		menubar.add(themes);
		menubar.add(game_more);
		
		//<!--界面部分 使用JFrame的部件 有的是用面板做的-->
        
        button1 = new JButton("draw");
        button2 = new JButton("goodgame");
        button3 = new JButton("withdraw");
        button4 = new JButton("exit");
		Chess_board chessboard = new Chess_board(); 
		
		//给棋盘添加点击事件
		chessboard.addMouseListener(new MouseListener(){
			
			public void mousePressed(MouseEvent e) {
				//鼠标被按下 时发生
				
			}
			public void mouseClicked(MouseEvent e) {
				//鼠标点击后 发生
				int point_x=e.getX();
				int point_y=e.getY();
				System.out.println("用户按下的坐标是"+point_x+","+point_y);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
       // cheat = new JButton("chat");
        times = new JButton("count down");
        message = new JButton("tips");
        
		//选项卡部分
       player1 = new JTabbedPane();
       player2 = new JTabbedPane();
       //
       icon = new JLabel("dhdfhstyrtrtyr", SwingConstants.CENTER);
       icon.setBounds(50,50,100,100);
       JPanel panel1 = new JPanel();
       panel1.setLayout(null);
       JPanel panel2 = new JPanel();
       panel2.setLayout(null);
       player1.add("A",panel1);
       player2.add("B",panel2);
       player1.setBounds(8, 60, 260, 210);
       player2.setBounds(8,300,260,210);
      
       cheat = new JTabbedPane();
       JPanel panel3 = new JPanel();
       panel3.setLayout(null);
       cheat.add("cheat",panel3);
       cheat.setBounds(948, 110, 260, 620);
       this.add(player1);	
       this.add(player2);
       
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(chessboard);
        add(cheat);
        add(times);
        add(message);
      //  add
        
        //<!--将部件添加到窗口 使用setBounds函数-->
       // player1.setBounds(8, 60, 260, 210);
        //player2.setBounds(8,300,260,210);
        button1.setBounds(17,550,100,80);
        button2.setBounds(159,550,100,80);
        button3.setBounds(17,650,100,80);
        button4.setBounds(159, 650, 100, 80);
        chessboard.setBounds(308, 120, 600, 600);
        times.setBounds(948,65,260,35);
      //  cheat.setBounds(948, 110, 260, 620);
        message.setBounds(438,50, 340, 60);
        MaterialUIMovement.add(button1, MainColor);
        MaterialUIMovement.add(button2, MainColor);
        MaterialUIMovement.add(button3, MainColor);
        MaterialUIMovement.add(button4, MainColor);
        //pack();
        setVisible(true);
        theme_pink.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent actionEvent) {
        		chessboard.setBackgroundColorPink();
        	}
        });
        theme_blue.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent actionEvent) {
        		chessboard.setBackgroundColorBlue();
        	}
        });
	}
	
	
}

public class Play {
	public static void main(String[] args) {
		new NullLayout().display();
	}
}
