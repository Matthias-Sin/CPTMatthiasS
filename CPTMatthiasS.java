import arc.*; 
import java.awt.Color;
import java.awt.image.BufferedImage; 
import java.awt.Font; 

public class CPTMatthiasS{ 
	public static void main(String[] args){ 
		Console con = new Console("The MC game",1280,720);
		TextInputFile MCU = new TextInputFile("MCU.txt"); 
		TextInputFile MATH = new TextInputFile("Math.txt");
		TextInputFile Countries = new TextInputFile("Countires.txt");
		TextInputFile Suprise = new TextInputFile("ItalinBrainrot.txt"); 
		TextInputFile Master = new TextInputFile("Master.txt");
		int intX = 580; 
		char chrStart; 
		int intP = 0;
		char chrselect; 
		int intcount; 
		con.println(""); 
		String strName; 
		String strAnswer; 
		String strQuizFile;
		String strQuiz[][]; 
		while(true){
			con.drawString("Play(P)",intX,280); 
			con.drawString("Leaderboard(L)",intX,320); 
			con.drawString("Add Quiz(A)",intX,360);
			con.drawString("Quiz(Q)",intX,400); 
			con.repaint(); 
			System.out.println("Work");
			chrStart = con.getChar(); 
			while(chrStart != 'p'|| chrStart != 'l'|| chrStart != 'q'){
				if(chrStart == 'p'){
					con.setDrawColor(Color.BLACK);
					con.fillRect(intX, 280, 200, 200); 
					con.setDrawColor(Color.WHITE); 
					con.clear();
					con.println("What is your user name"); 
					strName = con.readLine(); 
					con.clear();
					con.println("Welcome "+strName);
					con.println("What game do you want to play"); 
					con.println("MCU.txt");
					con.println("Math.txt");
					con.println("Countries.txt"); 
					con.println("Quit"); 
					strQuizFile = con.readLine(); 
					con.clear(); 
					con.println("Welcome to "+strQuizFile); 
					intcount = CPTmethod.CountQ(strQuizFile); 
					strQuiz = CPTmethod.LoadQuiz(strQuizFile, intcount);
					
					
					
					
							
				}else if(chrStart =='q'){ 
					

					
				
				}


					
					
					}
				}
			}
		}
	


		
