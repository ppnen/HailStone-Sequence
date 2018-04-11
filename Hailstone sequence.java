// Code by Perttu Pasanen
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//We import used methods

public class Main {

/*
This will calculate any Hailstone sequence for n < 1000000
The output is a hmtl file with:
 -starting number
 -steps taken for reaching 1
 -second largest number in the sequence
 */

    public static void main(String[] args) {


        int x = (int )(Math.random() * 1000000 + 1); //random x; 1 <= x < 1000000
        //Input number that will be recalculated

        int y = 0;
        int suurin=0;
        int toinen=0;
        int input=x; //Initial input, stays same
        List<Integer> myAra = new ArrayList<Integer>(); //Used to store sequence


        while (x != 1) {
            //x calculated until x=1

            myAra.add(x);
            //Values of x saved in ArrayList

            if ((x % 2) == 0) {
                x = x / 2;
                //if x is even, x/2
            }
            else {
                x = 3 * x + 1;
                //if x uneven, 3x+1
            }

            y++;
            //counts steps taken

        }
        myAra.add(1);

        for (int i = 0;i <myAra.size();i++){
            //Goes through all values of x,
            //then assigns biggest and second biggest value to suurin and toinen accordingly

            if(myAra.get(i)>suurin){
                toinen=suurin;
                suurin=myAra.get(i);
            }
            else if (myAra.get(i)>toinen) {
                toinen=myAra.get(i);
            }


        }

        /*
        System.out.println("Input: "+input);
        System.out.println("Steps: " + y);
        System.out.println("Suurin: "+suurin);
        System.out.println("Toinen: "+toinen);
        System.out.println(myAra);
        Prints  I used to make sure the code works
        */

        String outt =("Input: "+ input + ", Steps taken to reach 1: "+y+ ", Second largest number: "+Integer.toString(toinen));
        //Output written to file

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("outputfile.html"));
            //We use writer to create file and name it, created in default folder currently in
            out.write(outt); //Here we pass our output
            out.close();
        }
		catch (IOException e) { //Catch exception
			System.out.println("An error occured while trying to write to the file");
        }
    }
}



