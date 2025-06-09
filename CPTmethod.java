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
	public static String[][] LoadGame(String strQuizFile, int intcount){ 
		String strQuiz[][];
		strQuiz = new String[intcount][5];
		TextInputFile Quizfile = new TextInputFile(strQuizFile);
		int intRow;
		int intRand;
		for(intRow = 0; intRow < intcount; intRow++){
			strQuiz[intRow][0] = Quizfile.readLine();
			strQuiz[intRow][1] = Quizfile.readLine();
			strQuiz[intRow][2] = Quizfile.readLine();
			strQuiz[intRow][3] = Quizfile.readLine();
			intRand = (int)(Math.random()*100+1);
			strQuiz[intRow][4] = intRand + "";
			System.out.println(intRand);
		}
		Quizfile.close();
		return strQuiz;	
	}
}
