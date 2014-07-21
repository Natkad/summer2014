import java.util.*;

public class task3{
static int i=2, j=2;
	public static void main(String args[]){
		char m[][] =  { 
		{ '0', '0', '0', '0', '0' },
       		{ '0', '0', '0', '0', '0' },
		{ '0', '0', '0', '0', '0' },
		{ '0', '0', '0', '0', '0' },
       		{ '0', '0', '0', '0', '0' } 
		};
		
		char a=m[i][j];
		m[i][j]='x';
		System.out.println("Use wasd");
		System.out.println("Close = q");
		
                
			for(;;) { 
				System.out.println(m[0][0]+ " " +m[0][1]+" "+m[0][2]+" "+m[0][3]+" "+m[0][4]); 
				System.out.println(m[1][0]+ " " +m[1][1]+" "+m[1][2]+" "+m[1][3]+" "+m[1][4]); 
				System.out.println(m[2][0]+ " " +m[2][1]+" "+m[2][2]+" "+m[2][3]+" "+m[2][4]); 
				System.out.println(m[3][0]+ " " +m[3][1]+" "+m[3][2]+" "+m[3][3]+" "+m[3][4]); 
				System.out.println(m[4][0]+ " " +m[4][1]+" "+m[4][2]+" "+m[4][3]+" "+m[4][4]); 
			
				Scanner choice = new Scanner(System.in);
				String input = choice.nextLine();
				
				
				if (input.equals("q")) 
				{System.out.println("Close");
				break; }

				if (input.equals("w")){
				//k=i;
				//l=j;
				m[i][j]='0';
				m[i-1][j]='x';
				i=i--;
				//a=m[i][j];
				//m[i][j]='x';
					}
				

				if (input.equals("a")){
				m[i][j]='0';
				m[i][j-1]='x';
				j=j--;
				//a=m[i][j];
				
					}
				

				/*else if (input.equals("s")){
				m[i][j]='0';
				j=j++;
				a=m[i][j];
				m[i][j]='x';	
					}*/

				/*else if (input.equals("d")){
				m[i][j]='0';
				i=i++;
				a=m[i][j];
				m[i][j]='x';
					}*/

				else
				System.out.println("Uncorrect simbol");
				
			
			}
	}
}