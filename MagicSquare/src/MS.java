import java.util.Scanner;

public class MS {  
	// Method for generating the odd-sized magic squares  
	public void makeSquare(int s)  
	{  
	int magicSqr[][] = new int[s][s];  
	  
	// Initialize position for 1  
	int r = s / 2;  
	int c = s - 1;  
	  
	// One by one put all values in magic square  
	for (int no = 1; no <= s * s;)   
	{  
	if (r == -1 && c == s) // 3rd rule  
	{  
	c = s - 2;  
	r = 0;  
	}  
	else   
	{  
	// 1st rule helper if the next number  
	// is going out of the range  
	if (c == s)  
	{  
	c = 0;  
	}  
	  
	// 1st rule helper if the next number is  
	// going out of the range  
	if (r < 0)  
	{  
	r = s - 1;  
	}  
	}  
	  
	// the 2nd rule  
	if (magicSqr[r][c] != 0)   
	{  
	c = c - 2;  
	r = r + 1;  
	continue;  
	}  
	else  
	{  
	// setting the number  
	magicSqr[r][c] = no;  
	no = no + 1;  
	}  
	  
	// the first condition  
	c = c + 1;  
	r = r - 1;  
	}  
	  
	// printing the magic square  
	System.out.println("The Magic Square for " + s + ": \n");  
	for (r = 0; r < s; r++)   
	{  
	for (c = 0; c < s; c++)  
	{  
	System.out.print(magicSqr[r][c] + " ");  
	}  
	System.out.println();  
	}  
	System.out.println();
	System.out.println("Sum of each column or row or diagonal : " + s * (s * s + 1) / 2 );  
	}  
	  
	// main method  
	public static void main(String[] argvs)  
	{  
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter odd number of rows/columns: ");
	int n = scanner.nextInt();
	scanner.close();
	  
	// creating an object of the class MagicSquare  
	MS obj = new MS();  
	  
	// invoking the method makeSquare  
	obj.makeSquare(n);  
	  
	}  
	}  