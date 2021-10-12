package com.company;
import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null , "Starting Armanator CLI , Please click okay to start the application." , "Armanator" , JOptionPane.INFORMATION_MESSAGE);
        String username = JOptionPane.showInputDialog("Please enter your name.");
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================================================================================================");
        System.out.println("                                           Armanator-CLI");
        System.out.println("=====================================================================================================================");
        System.out.println("                   Developer : Chayan Mitra               Contact:vectorchayanmitra@gmail.com");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Welcome , " + username + ".");
        System.out.println("This is Armanator , a simple tool created to calculate ArmStrong Numbers.");
        System.out.println("=====================================================================================================================");
        System.out.println("Options");
        System.out.println("1 : Use predefined range.");
        System.out.println("2 : Use custom range.");
        System.out.println();
        System.out.println("Usage");
        System.out.println("Use the option number as command to execute specific tools.");
        System.out.println("Type 6 to exit the program.");
        while (true)
        {
            System.out.print("Armanator > ");
            int userInput = input.nextInt();
            if (userInput == 1)
            {
                System.out.println();
                System.out.println("Predefined range : ");
                System.out.println("3) 1 to 500");
                System.out.println("4) 1 to 1000");
            }
            if (userInput == 3)
            {
                int num , rev_split , sum = 0;
                System.out.println("Armstrong number from 1 to 500 : ");
                for(int i = 1 ; i <=500 ; i++)
                {
                    num = i;
                    while(num > 0)
                    {
                        rev_split = num % 10;
                        sum = sum + (rev_split * rev_split * rev_split);
                        num = num / 10;
                    }
                    if (sum == i)
                    {
                        System.out.print(i + " | ");
                        System.out.println();
                    }
                    sum = 0;
                }
            }
            if (userInput == 4)
            {
                int num , rev_split , sum = 0;
                System.out.println("Armstrong number from 1 to 1000 : ");
                for(int i = 1 ; i <=1000 ; i++)
                {
                    num = i;
                    while(num > 0)
                    {
                        rev_split = num % 10;
                        sum = sum + (rev_split * rev_split * rev_split);
                        num = num / 10;
                    }
                    if (sum == i)
                    {
                        System.out.print(i + " | ");
                        System.out.println();
                    }
                    sum = 0;
                }
            }
            if (userInput == 2)
            {
                System.out.print("What is the starting number : ");
                int num_custom_input = input.nextInt();
                System.out.print("What is the ending number : ");
                int num_custom_second_input = input.nextInt();
                int num , rev_split , sum = 0;
                System.out.println("Armstrong number from " + num_custom_input + " to " + num_custom_second_input + " :");
                for(int i = num_custom_input ; i <=num_custom_second_input ; i++)
                {
                    num = i;
                    while(num > 0)
                    {
                        rev_split = num % 10;
                        sum = sum + (rev_split * rev_split * rev_split);
                        num = num / 10;
                    }
                    if (sum == i)
                    {
                        System.out.print(i + " . ");
                        System.out.println();
                    }
                    sum = 0;
                }
            }
            if (userInput == 6)
            {
                Object[] ratingValues = { "1 Start 😞", "2 Start 😶", "3 Start 🙂" , "4 Start 😉" , "5 Start 😊"};
                Object selectedRating = JOptionPane.showInputDialog(null, "Please rate our application", "Input", JOptionPane.INFORMATION_MESSAGE, null, ratingValues, ratingValues[4]);
                if (selectedRating == ratingValues[0])
                {
                    JOptionPane.showMessageDialog(null , "Thank you for your rating , we will try to imporve our application" , "Rating" , JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null , "Thank you for your feedback it means a lot to us." , "Rating" , JOptionPane.INFORMATION_MESSAGE);
                }
                System.exit(0);
            }
        }
    }
}
