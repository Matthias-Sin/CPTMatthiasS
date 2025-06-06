import arc.*; 

public class CPTmethod{ 
	public static void main(String[] args){ 
		Console con = new Console(); 
		
	}
	
	public static String MCUG(String strRespond, String strAnswer){ 
		//String strQnA[9][5];
		TextInputFile MCU = new TextInputFile("MCU.txt"); 
		String strQnA[][];
		strQnA = new String[9][5];
		int intQ = 0;
		while(MCU.eof() == false){ 
			strQnA[intQ][0] = MCU.readLine(); 
			strQnA[intQ][1] = MCU.readLine();
			strQnA[intQ][2] = MCU.readLine();
			strQnA[intQ][3] = MCU.readLine();
			strQnA[intQ][4] = MCU.readLine();
			strQnA[intQ][5] = MCU.readLine();
			intQ = intQ+1; 
		}
		return strQnA[][]; 
	}
}
		
			
			
			
		
			
			
			
		
		
		

