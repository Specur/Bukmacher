import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class Head extends JFrame{
	JButton przyciski ;
	JScrollPane scrpanel;
	public static JPanel oo ;
	public static JComponent tab ;
	public Head(){
		
		setLayout(null);
		
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	 JPanel l = new ScrollPanell();
		 
		 
		 
		
		 setTitle("BUKMACHER_PRO_VER_1.0");
		 
		 JComponent b = new ButtonDayMatch();
		 add(b);
		 
		
		 oo = new ScrollPanell();
		 
		 tab = new Table();
		 add(tab);
		 
		 
		 
		 
		 JPanel bb = new Picture();
		 add(bb);
	//	 JScrollPane p = new JScrollPane(l,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
		
		 
		
//		p.add(oo);
		
//		add(p);
		
		setBounds(1,1,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
	}
	
	
	public static void main(String []args){
		
		 
	 
		
		
	

		
		new Head();
		
	}

}
