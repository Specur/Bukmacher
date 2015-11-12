import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.print.attribute.DateTimeSyntax;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Table extends JComponent {
	public static Object[][] table;
	private String[] tableName = {"godzina" , "gospodarze" , "wynik" , "goœcie"};
	public static JTable mainTable ;
	public static JScrollPane scrollPane ;
	public Table(){
		
		setLayout(null);
	table = new Object[Stage.MatchNumber][];	
	//table[1][1] = (Object)"rrr";
	 
	for(int i=0; i<Stage.MatchNumber; i++) table[i] = new Object[4];
	
		
		mainTable = new JTable(table , tableName);
		
		mainTable.setBounds(1, 1, Stage.HEIGHT, Stage.WIDTH);
		
		scrollPane = new JScrollPane(mainTable);
		mainTable.setFillsViewportHeight(true);
		scrollPane.setBounds(100,50,540,600);
		
		
		
		
		
		
		File plik1=new File("RESULTS.txt");
	     Scanner odczyt = null;
		try {
			odczyt = new Scanner(plik1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String wyr ;
		int i = 0, j = 0;

		System.out.println(Stage.MatchNumber);
		 while (odczyt.hasNextLine()) {
		     StringTokenizer wyraz_z_tokenem=new StringTokenizer(odczyt.nextLine(),"}");
		     
		     while(wyraz_z_tokenem.hasMoreElements()){
		    	 wyr = wyraz_z_tokenem.nextToken();
		    	 if(wyr.length() >= 2){
		    	 table[j][i] =(Object) wyr;
		    	 i++;
		    	 
		    	 if(i == 4){
		    		 
		    		 i = 0;
		    		 j++ ;
		    	 }
		    	 }
		    	 
		    	 
		    	 
		     }
		     
		 }
		 
		 
		 
		
		
		
		
		
		//scrollPane
		
		
		
		
		add(scrollPane);
		setBounds(1,1,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
		
		//add(mainTable);
		
		
	}
	
}
