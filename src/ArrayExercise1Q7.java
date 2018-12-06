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

public class ArrayExercise1Q7 {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String tabSpace = "      ";	// six spaces
        String nl = System.lineSeparator();
        // new line character for file writing
    	
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
/* input will now come from an external file so there
        will not normally be a need for a prompt
    
        prompt = "Enter your prompt text here. \n";	
        prompt += "you may need to add additional lines\n";
        prompt += "or delete some of these prompt lines.\n\n";

        strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
*/
        // read a line of data from the external text file

    // ************************ processing ***************************
        


    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.println("end of proecessing");
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
}  // end class
