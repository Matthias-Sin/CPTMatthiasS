import arc.*; 
import java.awt.Color;
import java.awt.image.BufferedImage; 
import java.awt.Font; 

public class CPTMatthiasS{ 
	public static void main(String[] args){ 
		Console con = new Console(1280,720);
		
		//Create variables
		int intX; 
		int intY; 
		
		//load game textfile
		TextInputFile MCU = new TextInputFile("MCU.txt"); 
		//Math Questions = MQ
		TextInputFile MQ = new TextInputFile("Math.txt"); 
		TextInputFile Countries = new TextInputFile("Countries.txt"); 
		//The secret game
		TextInputFile secret = new TextInputFile("ItalianBrainrot.txt"); 
		
		while(true){ 
			//set main menu background color
			con.setDrawColor(new Color(80, 0, 40)); 
			con.fillRect(0,0,1280,720); 
			
			BufferedImage logo = con.loadImage(""); 
			con.drawImage(logo, 0, 0); 
			
		}

		
		
			
	}
}
