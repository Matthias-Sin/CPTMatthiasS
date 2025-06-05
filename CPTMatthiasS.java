import arc.*; 
import java.awt.Color;
import java.awt.image.BufferedImage; 
import java.awt.Font; 


public class CPTMatthiasS{ 
	public static void main(String[] args){ 
		Console con = new Console("The MC game",1280,720);
		int intX = 580; 
		char chrStart; 
		int intP = 0;
		char chrselect; 
		con.println(""); 
		String strName; 
		while(true){
			con.drawString("Play(P)",intX,280); 
			con.drawString("Leaderboard(L)",intX,320); 
			con.drawString("Add Quiz(A)",intX,360);
			con.drawString("Quiz(Q)",intX,400); 
			System.out.println("Work");
			chrStart = con.getChar(); 
			while(chrStart != 'p'|| chrStart != 'l'){
				if(chrStart == 'p'){
					con.setDrawColor(Color.BLACK);
					con.fillRect(intX, 280, 200, 200); 
					con.setDrawColor(Color.WHITE); 
					con.clear();
					con.println("What is your user name"); 
					strName = con.readLine(); 
					con.clear();
					con.println("What game you want to play"); 
					con.println("MCU(1)");
					con.println("Math(2)");
					con.println("Countries(3)"); 
					con.println("Quit(Q)"); 
					chrselect = con.getChar();
					while(chrselect != '1'|| chrselect != '2' || chrselect !='3'||chrselect !='q'){
						if(chrselect == '1'){ 
							con.clear();
							con.println("Welcome to MCU game"); 
							return; 
						}
					break; 
					
				}
				return; 
				}
				break;
			}
		}
	}
}

		
