/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: AxQy
 * Program Name:  name of public class
 *
 * Description: brief description of program
 *
 * Input: data to be input
 *
 * Output: results to be output
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayExercise1Q2 {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        //String[] tokens;                        // string array for gathering input
        
        String tabSpace = "      ";	// six spaces
        String nl = System.lineSeparator();
        // new line character for file writing
    	
        int Strin;
        
        
    // ***** create objects *******
    
        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
        
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name:		your name here");
        System.out.println("Class:		CS20S");
        System.out.println("Assignment:	Ax Qy");
        System.out.println("*******************************************");

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name:		your name here" + nl;
        bannerOut += "Class:		CS20S" + nl;
        bannerOut += "Assignment:	Ax Qy" + nl;
        bannerOut += "*******************************************" + nl + nl;
        
        fout.print(bannerOut);
    	
    // ************************ get input **********************

    
        prompt = "Enter the numbers of number you want me \n";	
        prompt += "to put in original order and reverse\n";
        prompt += "order.\n\n";

        strin = JOptionPane.showInputDialog(bannerOut + prompt);
        String[] tokens = strin.split(delim);
        Strin = Integer.parseInt(strin);
        int[] list = new int[Strin];
        
        
        // ************************ processing ***************************
        for(int i = 0;  i <= Strin; i++){
            System.out.print(i);
        }

    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.println("end of proecessing");
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
}  // end class
