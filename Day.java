/*
 * Write a program to accept a date in the string format dd/mm/yyyy and
 * accept the name of the day on 1st of January of the corresponding 
 * year. Find the day for the given date. 
 * Example:
 * INPUT Date: 5/7/2001 Day on 1st January : MONDAY
 * OUTPUT	Day on 5/7/2001 : THURSDAY
 * Test run the program on the following inputs:
 *  INPUT DATE         DAY ON 1ST JANUARY     OUTPUT DAY FOR INPUT DATE
 *  4/9/1998             THURSDAY                     FRIDAY
 *  31/8/1999            FRIDAY                       TUESDAY
 *  6/12/2000            SATURDAY                     WEDNESDAY
 * The program should include the part for validating the inputs namely 
 * the date and the day on 1st January of that year.
 */
import java.util.Scanner;
public class Day {
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println("Input Date");
        String input = in.nextLine();
        int numDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int 
