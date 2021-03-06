// **********************************************************************
// Programmer:	Nikolas Zbaraszewski
// Class:		CS30S
//
// Exercise:    1
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

public class ArrayLesson6/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
            
            final int LENGTH = 20;
	
	// ***** declaration of variables *****
        
            
            int in = 0;
            
            int[] array = new int[LENGTH];
            
	// ***** create objects *****
	
            
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Nikolas Zbaraszewski");
		System.out.println("Class:       CS30S");
		System.out.println("Exercise:    1");
		System.out.println("**********************************");
		
	// ***** get input *****

	// ***** processing *****
        
        System.out.println("Printing first 20 numbers of the fibonacci sequence");
        
        array[0] = 0;
        array[1] = 1;
        
        System.out.println(array[0]);
        System.out.println(array[1]);
        
        //printing numbers 1-20 of fibonacci sequence
        for (int i = 2; i<LENGTH; i++) {
            
            array[i] = array[i-1] + array[i-2];
            System.out.println(array[i]);
        }
        
        //printing first 5 numbers of fibonacci sequence
        System.out.println("Printing first five numbers of the fibonacci sequence");
        for (int i = 0; i<5; i++) {
            System.out.print(array[i]+"  ");
            
            if (i == 2){
                System.out.println();
            }
        }
        
        System.out.println();
        
        //printing last 5 numbers of fibonacci sequence (#15-20)
        System.out.println("Printing numbers 15-20 of the fibonacci sequence");
        for (int i = 0; i<5; i++) {
            System.out.print(array[(LENGTH-5)+i] +"  ");
            
            if (i == 2){
                System.out.println();
            }
        }
        
        System.out.println();
	
		
	// ***** output *****
	
            
               
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class
