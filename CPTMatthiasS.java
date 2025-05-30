import arc.*; 
import java.awt.Color;
import java.awt.image.BufferedImage; 
import java.awt.Font; 

public class CPTMatthiasS{ 
	public static void main(String[] args){ 
		Console con = new Console(1280,720);
		
		int intX; 
		int intY; 
		
		
		
		while(true){ 
			//set main menu background color
			con.setDrawColor(new Color(80, 0, 40)); 
			con.fillRect(0,0,1280,720); 
			
			BufferedImage logo = con.loadImage("Mc.jpg"); 
			con.drawImage(logo, 0, 0); 
			
		}

		
		
			
	}
}
