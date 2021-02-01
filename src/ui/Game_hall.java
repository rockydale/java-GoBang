package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Hall_table extends JPanel{
	Hall_table(){
//		/JButton desk1,desk2,table;
		
		setLayout(null);
		setBackground(Color.GRAY);
		JButton desk1,desk2,table;
		desk1 = new JButton("十");
		desk2 = new JButton("十");
		table = new JButton("桌子");
		add(desk1);
		add(desk2);
		add(table);
		desk1.setBounds(5, 40, 60, 60);
		desk2.setBounds(180, 40, 60, 60);
		table.setBounds(80,30,85, 85);
	}
	
}

class Hall_tables extends Hall_table{
	Hall_tables(){
		
	}
}

class Hall extends JFrame{
	//Hall_table table1,table2,table3,table4,table5,table6,table7,table8,table9;
	Hall_table[] tabler = new Hall_table[9];
	JTabbedPane user , cheats;
	public void display() {
		
		 JButton backs = new JButton("返回");
		    add(backs);
		    backs.setBounds(1105,700,75,55);
		    
		setTitle("Game Hall");
		setSize(1225,850);
		setLocation(300,50);
		setLayout(null);
		
		user = new JTabbedPane();
		cheats = new JTabbedPane();
		JPanel panel3 = new JPanel();
	    panel3.setLayout(null);
	    JPanel panel4 = new JPanel();
	    panel4.setLayout(null);
	    user.add(panel3,"user");
	    cheats.add(panel4,"聊天室");
	    user.setBounds(25, 20, 250, 250);
	    cheats.setBounds(23, 300, 250, 450);
		
	    this.add(user);
	    this.add(cheats);
	    
	    JTabbedPane Game_hall = new JTabbedPane();
	    JPanel halls = new JPanel();
	    halls.setLayout(null);
	    Game_hall.add(halls,"游戏室");
	    for(int i =0 ;i<9;i++) {
	    	
	    	tabler[i] = new Hall_table();
	    	add(tabler[i]);
	    	
	    	if(i<3)
	    		tabler[i].setBounds(320,70+230*i,250,150);
	    	else if(i>=3&&i<=5)
	    		tabler[i].setBounds(630,70+230*(i-3),250,150);
	    	else if(i>5)
	    		tabler[i].setBounds(940, 70+230*(i-6), 250, 150);
	    	
	    }
	    
	    setVisible(true);
	    
	    backs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new load_frame().display();
				setVisible(false);
			}
	    	
	    });
	}
}

public class Game_hall {
	
	public static void main(String[] args) {
		new Hall().display();
	}
}
