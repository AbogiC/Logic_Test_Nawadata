package soal2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PenyelesaianSoal2 {
//	void m()throws IOException{  
//	    throw new IOException("device error");//checked exception  
//	  }  
	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
        BufferedReader bi = new BufferedReader(
            new InputStreamReader(System.in));
 
        double total = 0;
        System.out.println("Input the number of families: ");
        int n = input.nextInt();
        int num[] = new int[n];
        String[] strNums;
 
        System.out.println("Input the number of members in the family (separated by a space): ");
        strNums = bi.readLine().split(" ");
 
        for (int i = 0; i < strNums.length; i++) {
            num[i] = Integer.parseInt(strNums[i]);
        }
 
        for (int i = 0; i < strNums.length; i++) {
        	total = total + num[i];
        }
        total = total/4;
		if(total > Math.floor(total)) {
			int x = (int) Math.ceil(total);
			System.out.println("Minimum bus required is: " + x);
		} else {
			int x = (int) total;
			System.out.println("Minimum bus required is: " + x);
		}
		input.close();
    }
}
