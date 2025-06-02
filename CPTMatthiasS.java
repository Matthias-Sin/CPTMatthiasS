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
		String strName; 
		BufferedImage imglogo = con.loadImage("MClogo.png"); 
		//load game textfile
		TextInputFile MCU = new TextInputFile("MCU.txt"); 
		//Math Questions = MQ
		TextInputFile MQ = new TextInputFile("Math.txt"); 
		TextInputFile Countries = new TextInputFile("Countries.txt"); 
		//The secret game
		TextInputFile secret = new TextInputFile("ItalianBrainrot.txt"); 
		//set main menu background color
		
		//Ask name
		con.println("Please enter your name"); 
		strName = con.readLine(); 
		
		while(true){ 
			
			con.drawImage(imglogo, 120, 120); 
			//con.setDrawColor(new Color(80, 0, 40)); 
			//con.fillRect(0,0,1280,720); 
			}


			
		

		
		
			
	}
}
