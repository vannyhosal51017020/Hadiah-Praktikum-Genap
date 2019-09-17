/**
 * @(#)konversiwaktu.java
 *
 *
 * @author 
 * @version 1.00 2019/9/17
 */

import java.util.Scanner;
public class konversiwaktu {
     public static void main(String[] args){
     	int jam ;
     	int menit;
     	int detik;
        int totdek;
     Scanner input = new Scanner(System.in);
     
    System.out.print("Jam: ");
        jam = input.nextInt();
	System.out.print("Menit: "); 
		menit = input.nextInt();

	totdek = (jam*3600)+(menit*60);
	
	System.out.print("Total Detik: "+ totdek);
		System.out.println("detik");
     	

    }
    
    
}