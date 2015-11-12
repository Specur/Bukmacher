import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

public class ButtonDayMatch extends JComponent {
	Calendar cal = Calendar.getInstance();

	int d= cal.get(Calendar.DAY_OF_MONTH);
	int m=cal.get(Calendar.MONTH)+1;
	int r=cal.get(Calendar.YEAR);
	static JButton before_Yesterday , yesterday , today , tomorrow , after_Tomorrow;
	String datee ;
	JPanel oo ;
	JComponent tab ;
	
	ActionListener al = new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
			
		if(e.getSource() == before_Yesterday){
			
			//Head.tab.removeAll();
		//	Head.oo.removeAll();
			datee = "http://www.livescore.com/soccer/"+String.valueOf(r)+"-"+String.valueOf(m)+"-"+String.valueOf(d-2)+"/" ;
		
			
		}
		if(e.getSource() == yesterday){
			
			datee = "http://www.livescore.com/soccer/"+String.valueOf(r)+"-"+String.valueOf(m)+"-"+String.valueOf(d-1)+"/" ;
		
		
		}
		if(e.getSource() == today){
			Head.tab.removeAll();
			Head.oo.removeAll();
			
			datee = "http://www.livescore.com/soccer/"+String.valueOf(r)+"-"+String.valueOf(m)+"-"+String.valueOf(d)+"/" ;
		
			
		}
		if(e.getSource() == tomorrow){
			Head.tab.removeAll();
			Head.oo.removeAll();
			
			
			datee = "http://www.livescore.com/soccer/"+String.valueOf(r)+"-"+String.valueOf(m)+"-"+String.valueOf(d+1)+"/" ;
		
			
		}
		if(e.getSource() == after_Tomorrow){
			Head.tab.removeAll();
			Head.oo.removeAll();
			
			
			
			datee = "http://www.livescore.com/soccer/"+String.valueOf(r)+"-"+String.valueOf(m)+"-"+String.valueOf(d+2)+"/" ;
		
		}
		
			}
	};
	
	public ButtonDayMatch(){
		setLayout(null);
		
		
		
		
		
		
		 
		
		String wyr ;
		
		before_Yesterday = new JButton();
		before_Yesterday.setBounds(100, 10, 100, 30);
		before_Yesterday.addActionListener(al);
		add(before_Yesterday);
		
		
		
		yesterday = new JButton();
		yesterday.setBounds(210, 10, 100, 30);
		yesterday.addActionListener(al);
		add(yesterday);
		
		
		
		today = new JButton();
		today.setBounds(320, 10, 100, 30);
		today.addActionListener(al);
		add(today);
		
		
		
		tomorrow = new JButton();
		tomorrow.setBounds(430, 10, 100, 30);
		tomorrow.addActionListener(al);
		add(tomorrow);
		
		
		
		after_Tomorrow = new JButton();
		after_Tomorrow.setBounds(540, 10, 100, 30);
		after_Tomorrow.addActionListener(al);
		add(after_Tomorrow);
		
		
		
		setBounds(1,1,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
	}

}
