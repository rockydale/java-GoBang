package chess_board;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//import ui.NullLayout;


class Chess_board extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Graphics g;
	public int[][] isReal=new int [19][19];
	Boolean chess_piece;		// 0 黑 1 白
	
	Chess_board(){
		setSize(600,600);
		setLayout(null);
		setBackground(Color.orange);
		for(int a =0 ;a<18;a++) {
			for(int b = 0;b<=18;b++){
				
				isReal[a][b] = 0;
				
				}
		}
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

	public int i,j;
	public void init() {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		for(i = 0;i<18;i++) {
			for(j = 0; j<18; j++)
			{
			
				if(isReal[i][j] != 0) {
					if(chess_piece) {
						//判断棋子颜色 0黑 1白
						g.setColor(Color.white);
					}
					else {
						g.setColor(Color.black);
					}
					int dx = 34+30*i;
					int dy = 36+30*j;
					g.fillOval(dx, dy, 22, 22);
				}
		}
	}
}
}
public class NullLayout extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void display() {
	
	setSize(1225,850);
	setLocation(300,50);
	setLayout(null);
	setVisible(true);
	setTitle("GoBang");
	Chess_board chessboard = new Chess_board(); 
	
	//给棋盘添加点击事件
	chessboard.addMouseListener(new MouseListener(){
		
		public void mousePressed(MouseEvent e) {
			//鼠标被按下 时发生
			
		}
		public void mouseClicked(MouseEvent e) {
			int point_x = e.getX();
			int point_y = e.getY();
			System.out.println(point_x+" "+point_y);
			if((point_x>35)&&(point_x<572||point_y<550)&&(point_y>35)) {			//设置范围
			int x = (((e.getX()-34))/30);
			int y = (((e.getY()-36))/30);
			System.out.println(x+","+y);
			//因为数组下标从0开始所以这里进行-1操作
			if(x<0||y<0) {
						//超出范围
				x = y = 0;
				chessboard.isReal[x][y] = 0;
				//不进行操作
			}
			else
				if(x>18||y>18) {
					x = y = 0;
					chessboard.isReal[x][y] = 0;
				}
			chessboard.isReal[x][y] = 1;
			chessboard.init();
			}
			
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
	add(chessboard);
	chessboard.setBounds(308, 120, 600, 600);
	}
}
	
/*
public class chess_board_test {
	public static void main(String[] args) {
		new NullLayout().display();
	}
}

*/