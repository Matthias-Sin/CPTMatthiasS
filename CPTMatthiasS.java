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
		char chrStart; 
		String strMCU; 
		String strAnswer; 
		String strRespond;
		
		chrStart = con.getChar();

		//load game textfile
		TextInputFile MCU = new TextInputFile("MCU.txt"); 
		//Math Questions = MQ
		TextInputFile MQ = new TextInputFile("Math.txt"); 
		TextInputFile Countries = new TextInputFile("Countries.txt"); 
		//The secret game
		TextInputFile secret = new TextInputFile("ItalianBrainrot.txt"); 
		//con.setDrawColor(new Color(80, 0, 40)); 
		//con.fillRect(0,0,1280,720); 
		//BufferedImage imglogo = con.loadImage("MClogo.png"); 
		//con.drawImage(imglogo, 320, 100); 
		while(true){
			con.drawString("Play(P)",580,280); 
			con.drawString("Leaderboard(L)",580,320); 
			con.drawString("Add Quiz(A)",580,360);
			con.drawString("Quiz(Q)",580,400); 
			while(chrStart != 'p'|| chrStart != 'l'){
				if(chrStart == 'p'){ 
					System.out.println("Work");
			}
		}
	}
		//MCU game
		//String StrQuestion;
		//String StrA;
		//String StrB;
		//String StrC;
		//String StrD;
		//String Stranswer;
		//while(MCU.eof() == false){ 
			//StrQuestion = MCU.readLine(); 
			//StrA = MCU.readLine(); 
			//StrB = MCU.readLine(); 
			//StrC = MCU.readLine();
			//StrD = MCU.readLine(); 
			//Stranswer = MCU.readLine(); 
			//}
		//strMCU = CPTmethod.MCUG(strAnswer, strRespond);
		


		
		
			
	}
}
