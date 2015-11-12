import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class Picture extends JPanel {
	Image oo;
	
	public Picture() {
		
		
		
		oo = loadImage("BACKGROUND.jpg");
		
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		setVisible(true);
	}
	
	public void paintComponent(Graphics g){
		
		g.drawImage(oo, 1, 1, this);
		
		
	}
	
	
	public BufferedImage loadImage(String sciezka) {
		URL url=null;
		try {
		url = getClass().getClassLoader().getResource(sciezka);
		return ImageIO.read(url);
		} catch (Exception e) {
		System.out.println("error 0001"+ sciezka);
		System.exit(0);
		return null;
		}
		}
	
}
