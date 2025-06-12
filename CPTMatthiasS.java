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
		char chrfunstuff;
		int intcount; 
		int intcount2;
		int intAnswered;
		int intAvg;
		con.println(""); 
		String strName; 
		String strAnswer; 
		String strQuizFile;
		String strQuiz[][];
		String strQuestion; 
		String strChoiceA;
		String strChoiceB;
		String strChoiceC;
		String strChoiceD;
		String strOptions; 
		String strQuestionsCount;
		String strAnswered;
		String strAvg;
		String strLeader[][];
		boolean blnMoreanswer;
		boolean blnGame;
		blnMoreanswer = true;
		while(true){
			con.setDrawColor(Color.BLACK);
			con.fillRect(0,0, 1280, 720); 
			con.setDrawColor(Color.WHITE); 
			con.clear();
			con.drawString("Play(P)",intX,280); 
			con.drawString("Leaderboard(L)",intX,320); 
			con.drawString("Add Quiz(A)",intX,360);
			con.drawString("Quiz(Q)",intX,400); 
			con.repaint(); 
			System.out.println("Work");
			chrStart = con.getChar(); 
			//Main game
			if(chrStart == 'p'){
				con.setDrawColor(Color.BLACK);
				con.fillRect(intX, 280, 200, 200); 
				con.setDrawColor(Color.WHITE); 
				con.clear();
				con.println("What is your user name"); 
				strName = con.readLine(); 
				con.clear();
				con.println("Welcome "+strName);
				con.println("What game do you want to play\n");  
				TextInputFile master = new TextInputFile("Master.txt"); 
				while(master.eof() == false){
					strOptions = master.readLine(); 
					con.println(strOptions);
				}
				master.close();
				strQuizFile = con.readLine(); 
				con.clear(); 
				con.println("Welcome to "+strQuizFile); 
				intcount = CPTmethod.CountQ(strQuizFile); 
				strQuiz = CPTmethod.LoadQuiz(strQuizFile, intcount);
				strQuiz = CPTmethod.BubbleShort(strQuiz, intcount);
				
				//Changing stuffs
				blnGame = true;
				intAnswered = 0;
				intAvg = 0;
				for (intcount2 = 0; intcount2 < strQuiz.length; intcount2++){
					con.setDrawColor(Color.BLACK);
					con.fillRect(0,0,1289,720);
					con.clear();
					con.setDrawColor(Color.WHITE);
					// Display quiz name and username
					con.drawString(strQuizFile, 550, 0);
					con.drawString(strName, 0, 0);
					// Display score and accuracy
					strQuestionsCount = (intcount2) + "";
					strAnswered = intAnswered + "";
					if (intcount2 > 0) {
						intAvg = (int) ((intAnswered * 100.0) / intcount2);
					} else {
						intAvg = 0;
					}
					strAvg = intAvg + "";
					con.drawString(strAnswered, 1100, 0);
					con.drawString("/", 1125, 0);
					con.drawString(strQuestionsCount, 1150, 0);
					con.drawString(strAvg, 1200, 0);
					con.drawString("%", 1250, 0);
					// Ask question
					con.println("\n\n");
					con.println(strQuiz[intcount2][0]);
					con.println(strQuiz[intcount2][1]);
					con.println(strQuiz[intcount2][2]);
					con.println(strQuiz[intcount2][3]);
					con.println(strQuiz[intcount2][4]);
					strAnswer = con.readLine();
					// Check answer
					if(strAnswer.trim().equalsIgnoreCase(strQuiz[intcount2][5])) {
						con.setDrawColor(Color.GREEN);
						con.drawString("Correct!", 600, 300);
						intAnswered++;
					}else{
						con.setDrawColor(Color.RED);
						con.drawString("Incorrect!", 600, 300);
					}
					con.repaint();
					// small pause before next question
					con.sleep(500);
					}
					TextOutputFile LeaderBoard = new TextOutputFile("LeaderBoard.txt",true); 
					LeaderBoard.println(strQuizFile);
					LeaderBoard.println(strName); 
					LeaderBoard.println(intAnswered); 
					LeaderBoard.println(intAvg); 
					LeaderBoard.close(); 
					con.getChar(); 
					
				
			//Add quiz
			}else if(chrStart == 'a'){ 
				con.setDrawColor(Color.BLACK);
				con.fillRect(intX, 280, 200, 200); 
				con.setDrawColor(Color.WHITE); 
				con.clear();
				con.println("What is the name of the game file, please add .txt at the end"); 
				strQuizFile = con.readLine(); 
				TextOutputFile newQuiz = new TextOutputFile(strQuizFile,true); 
				TextOutputFile master = new TextOutputFile("Master.txt",true);
				master.println(strQuizFile);
				master.close(); 
				while(blnMoreanswer == true){ 
					con.clear();
					con.println("Add question");
					strQuestion = con.readLine(); 
					con.clear();
					con.println("Add choice A"); 
					strChoiceA = con.readLine(); 
					newQuiz.println(strChoiceA); 
					con.clear();
					con.println("Add choice B"); 
					strChoiceB = con.readLine(); 
					newQuiz.println(strChoiceB); 
					con.clear();
					con.println("Add choice C"); 
					strChoiceC = con.readLine(); 
					newQuiz.println(strChoiceC); 
					con.clear();
					con.println("Add choice D"); 
					strChoiceD = con.readLine(); 
					newQuiz.println(strChoiceD); 
					con.clear(); 
					con.println("Add answer");
					strAnswer = con.readLine(); 
					newQuiz.println(strAnswer);
					con.clear();
					con.println("Any key to continue"); 
					con.println("leave(L)"); 
					chrStart = con.getChar(); 
					if(chrStart == 'l'){
						blnMoreanswer = false; 
						newQuiz.close(); 

					}else{
						con.clear();
						
					}
				}
				
			//Quit
			}else if(chrStart == 'q'){ 
				con.setDrawColor(Color.BLACK);
				con.fillRect(intX, 280, 200, 200); 
				con.setDrawColor(Color.WHITE); 
				con.clear();
				con.println("You sure you want to quit?"); 
				con.println("Yes(Y)");
				con.println("No(any key)"); 
				chrfunstuff = con.getChar();
				if(chrfunstuff == 'y'){ 
					con.println("ok bye bye");
					con.sleep(1000); 
					con.closeWindow(); 
				}else{
					blnMoreanswer = false; 
				}
			}else if(chrStart =='l'){ 
				intcount = CPTmethod.CountL(); 
				strLeader = CPTmethod.LoadLeaderBoard(intcount); 
				strLeader = CPTmethod.LeaderBoardShort(strLeader, intcount);
				for(intcount2 = 0; intcount2 < strLeader.length; intcount2++){
					con.setDrawColor(Color.BLACK);
					con.fillRect(0,0,1280,720);
					con.clear();
					con.setDrawColor(Color.WHITE);
					con.println("Game: "+strLeader[intcount2][0]);
					con.println("Player: "+strLeader[intcount2][1]);
					con.println("Total mark: "+strLeader[intcount2][2]);
					con.println("Mark in %: "+strLeader[intcount2][3]);
					con.println("\n");
				}
				con.getChar(); 
			//secret fun stuff	
			}else if(chrStart == 's'){
				con.setDrawColor(Color.BLACK);
				con.fillRect(intX, 280, 200, 200); 
				con.setDrawColor(Color.WHITE); 
				con.clear();
				con.println("welcome");
				con.sleep(2000);
				con.clear();
				con.println("You want me to tell a joke?"); 
				con.sleep(2000); 
				con.clear();
				con.println("The Multiple choice game is designed for 35mins, if you working plan calls for double time or extra time, you may have it. ");
				con.sleep(5000);
				con.println("you will get it if you know it"); 
			}


				
				
		}
	}
}
