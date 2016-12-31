package edu.cuny.lehman.cmp326;

import edu.cuny.lehman.cmp326.MyException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PS8 {

    private static int[] myArray = {5, 4, 3, 2, 1};
    static final int NUMBER_OF_ATTEMPTS = 7;

    /**
     * @param gets an int
     * @return an element from myArray throws one of three possible expections,
     * depending on value of index
     */
    private static int getElement(int index) {
        // possible exceptions here
        return myArray[index];
    }

    /**
     * calls getElement() in try block catches several possible classes of
     * exceptions
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputInt;
        for (int j = 6, i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
            try {
                System.out.println("Please enter a number:");
                inputInt = input.nextInt();
                if (inputInt > -15 && inputInt < 0) {
                    throw new MyException();
                } else if (inputInt <= -15) {
                    throw new MyException("Index waaaay too low.");
                }
                System.out.println(getElement(inputInt));
            } //catch blocks go here.
            catch (InputMismatchException e) //caught if anything but an integer is input.
            {
                System.out.println("That was not a number.");
                String notNum = input.next();	//Stores a string that was entered so that the exception 
            } //can let the input stream continue taking info from the user.
            catch (MyException e) //caught if an integer below zero is input.	
            {
                System.out.println(e.getMessage());
            } catch (Exception e) //caught if any errors is missed or an integer higher then (arrays.length - 1) is entered.
            {
                System.out.println("Index out of bounds.");
            }
            System.out.println("You have " + j-- + " more attempts.");
        }
    }
}
