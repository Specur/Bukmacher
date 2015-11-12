import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.Timer;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ScrollPanell extends JPanel {
	
	JScrollPane scrpane;
	JButton team,team2;
	JLabel results,time,date;
	
	
	public ScrollPanell(){
		Stage.MatchNumber = 0 ;
		Calendar cal = Calendar.getInstance();

		int d= cal.get(Calendar.DAY_OF_MONTH);
		int m=cal.get(Calendar.MONTH);
		int r=cal.get(Calendar.YEAR);
		m++;
		String datee = "http://www.livescore.com/soccer/"+String.valueOf(r)+"-"+String.valueOf(m)+"-"+String.valueOf(d)+"/" ;
		
		String wyr ;
		
		setLayout(null);
		
		PrintWriter zapis = null;
		try {
			zapis = new PrintWriter("PAGE.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      
		try {
			URL url = new URL(datee);
			        URLConnection urlConn = url.openConnection();
			        BufferedReader in = new BufferedReader(
			                                new InputStreamReader(
			                                urlConn.getInputStream()));
		  String inputLine;
			while ((inputLine = in.readLine()) != null) 
				zapis.println(inputLine);
		      zapis.close();
			in.close();

		} catch (Exception e) {
		  System.out.println(e.getMessage());
		}
		 
		 File plik1=new File("PAGE.txt");
	     Scanner odczyt = null;
		try {
			odczyt = new Scanner(plik1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		FileWriter filee = null;
		try {
			 filee = new FileWriter("RESULTS.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter out = new BufferedWriter(filee);
		
		int pom = 0;
		
		
	     while (odczyt.hasNextLine()) {
	     StringTokenizer wyraz_z_tokenem=new StringTokenizer(odczyt.nextLine(),">\"<");
	while (wyraz_z_tokenem.hasMoreElements()){
		
		wyr = wyraz_z_tokenem.nextToken();
		

		if("min".equals(wyr)){
			wyr = wyraz_z_tokenem.nextToken();

		try {
			out.write(wyr+"\n");
			Stage.MatchNumber ++ ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
				
		
		if( "ply tright name".equals(wyr) || "ply name".equals(wyr)){
			wyr = wyraz_z_tokenem.nextToken();
			
			try {
				
				out.write(wyr+"\n");	
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}	
		
		if("return false;".equals(wyr) || "sco".equals(wyr) ){
			wyr = wyraz_z_tokenem.nextToken() ;
					
			try{
				
				out.write(wyr+"\n");
				
			
				
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
}
	}	
	
	}
	       
	     
	     try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	     odczyt.close(); 
		try {
			filee.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
	}
	
	
	
	public static void zmien(String data){
		
		Stage.MatchNumber = 0 ;
		//Calendar cal = Calendar.getInstance();

		//int d= cal.get(Calendar.DAY_OF_MONTH);
		//int m=cal.get(Calendar.MONTH);
		//int r=cal.get(Calendar.YEAR);
		//m++;
		//String datee = "http://www.livescore.com/soccer/"+String.valueOf(r)+"-"+String.valueOf(m)+"-"+String.valueOf(d)+"/" ;
		
		String wyr ;
		
		//setLayout(null);
		
		PrintWriter zapis = null;
		try {
			zapis = new PrintWriter("PAGE.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      
		try {
			URL url = new URL(data);
			        URLConnection urlConn = url.openConnection();
			        BufferedReader in = new BufferedReader(
			                                new InputStreamReader(
			                                urlConn.getInputStream()));
		  String inputLine;
			while ((inputLine = in.readLine()) != null) 
				zapis.println(inputLine);
		      zapis.close();
			in.close();

		} catch (Exception e) {
		  System.out.println(e.getMessage());
		}
		 
		 File plik1=new File("PAGE.txt");
	     Scanner odczyt = null;
		try {
			odczyt = new Scanner(plik1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		FileWriter filee = null;
		try {
			 filee = new FileWriter("RESULTS.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter out = new BufferedWriter(filee);
		
		int pom = 0;
		
		
	     while (odczyt.hasNextLine()) {
	     StringTokenizer wyraz_z_tokenem=new StringTokenizer(odczyt.nextLine(),">\"<");
	while (wyraz_z_tokenem.hasMoreElements()){
		
		wyr = wyraz_z_tokenem.nextToken();
		

		if("min".equals(wyr)){
			wyr = wyraz_z_tokenem.nextToken();

		try {
			out.write(wyr+"\n");
			Stage.MatchNumber ++ ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
				
		
		if( "ply tright name".equals(wyr) || "ply name".equals(wyr)){
			wyr = wyraz_z_tokenem.nextToken();
			
			try {
				
				out.write(wyr+"\n");	
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}	
		
		if("return false;".equals(wyr) || "sco".equals(wyr) ){
			wyr = wyraz_z_tokenem.nextToken() ;
					
			try{
				
				out.write(wyr+"\n");
				
			
				
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
}
	}	
	
	}
	       
	     
	     try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	     odczyt.close(); 
		try {
			filee.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
}
}