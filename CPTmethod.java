import arc.*; 

public class CPTmethod{ 
	public static void main(String[] args){ 
		Console con = new Console(); 
		
	}
	public static int CountQ(String strQuizFile){
		TextInputFile Quizfile = new TextInputFile(strQuizFile); 
		int intcount = 0;
		String strdata;
		while(Quizfile.eof() == false){
			strdata = Quizfile.readLine();
			intcount = intcount + 1;
		}
		Quizfile.close();
		intcount = intcount / 6;
		return intcount;
	}
	public static String[][] LoadQuiz(String strQuizFile, int intcount){ 
		String strQuiz[][];
		strQuiz = new String[intcount][7];
		TextInputFile Quizfile = new TextInputFile(strQuizFile);
		int intRow;
		int intRand;
		for(intRow = 0; intRow < intcount; intRow++){
			strQuiz[intRow][0] = Quizfile.readLine();
			strQuiz[intRow][1] = Quizfile.readLine();
			strQuiz[intRow][2] = Quizfile.readLine();
			strQuiz[intRow][3] = Quizfile.readLine();
			strQuiz[intRow][4] = Quizfile.readLine();
			strQuiz[intRow][5] = Quizfile.readLine();
			intRand = (int)(Math.random()*100+1);
			strQuiz[intRow][6] = intRand + "";
			System.out.println(intRand);
		}
		Quizfile.close();
		return strQuiz;	
	}
	public static String[][] BubbleShort(String strQuiz[][], int intcount){
		String strTemp;
		for(int intpass = 0; intpass < intcount - 1; intpass++){
			for(int introw = 0; introw < intcount - 1 - intpass; introw++){
				if(Integer.parseInt(strQuiz[introw][6]) > Integer.parseInt(strQuiz[introw+1][6])){
					for(int intcolumn = 0; intcolumn < 7; intcolumn++){
						strTemp = strQuiz[introw][intcolumn];
						strQuiz[introw][intcolumn] = strQuiz[introw+1][intcolumn];
						strQuiz[introw+1][intcolumn] = strTemp;
					}
				}
			}
		}
		return strQuiz;
	}
	public static int CountL(){
		TextInputFile LeaderBoard = new TextInputFile("LeaderBoard.txt"); 
		int intcount = 0;
		String strdata;
		while(LeaderBoard.eof() == false){
			strdata = LeaderBoard.readLine();
			intcount = intcount + 1;
		}
		LeaderBoard.close();
		intcount = intcount / 4;
		return intcount;
	}
	public static String[][] LoadLeaderBoard(int intcount){ 
		String strLeader[][];
		strLeader = new String[intcount][7];
		TextInputFile LeaderBoard = new TextInputFile("LeaderBoard.txt");
		int intRow;
		int intRand;
		for(intRow = 0; intRow < intcount; intRow++){
			strLeader[intRow][0] = LeaderBoard.readLine();
			strLeader[intRow][1] = LeaderBoard.readLine();
			strLeader[intRow][2] = LeaderBoard.readLine();
			strLeader[intRow][3] = LeaderBoard.readLine();
			intRand = (int)(Math.random()*100+1);
			strLeader[intRow][4] = intRand + "";
			System.out.println(intRand);
		}
		LeaderBoard.close();
		return strLeader;	
	}
	public static String[][] LeaderBoardShort(String strLeader[][], int intcount){
		String strTemp;
		for(int intpass = 0; intpass < intcount - 1; intpass++){
			for(int introw = 0; introw < intcount - 1 - intpass; introw++){
				if(Integer.parseInt(strLeader[introw][4]) > Integer.parseInt(strLeader[introw+1][4])){
					for(int intcolumn = 0; intcolumn < 5; intcolumn++){
						strTemp = strLeader[introw][intcolumn];
						strLeader[introw][intcolumn] = strLeader[introw+1][intcolumn];
						strLeader[introw+1][intcolumn] = strTemp;
					}
				}
			}
		}
		return strLeader;
	}
	
}
