package Lab1;
import java.util.Scanner;

public class lab1
    {
        public static void main(String[] args)
        {
        	Scanner scanner = new Scanner(System.in);
        	//created a scanner object to process user input
            System.out.println("My Name is Omar");
            System.out.println("My Favorite Color is Navy Blue");
            System.out.println("The current year is 2024");
            
            



            int age = 19;
            double height = 1.85;
            char fav_letter = 'O';
            Boolean like_prog = true;

            //height is stored as a double because it is a decimal

            System.out.println("I am " + age + " years old.");
            System.out.println("My height is " + height+" meters.");
            System.out.println("My favorite letter is " + fav_letter + ".");
            System.out.println("Do I like programming? " + like_prog + ".");
            scanner.nextLine();
            

            System.out.println("Enter the radius of the circle: ");
            int radius = scanner.nextInt();
            //nextInt to store the user input's whole numbers
            double PI = 3.14159;
            double area = PI * radius * radius;
           
            System.out.println("The area of the circle is " + area);
            scanner.nextLine();
            scanner.nextLine();
            

            String name = "Sarah";
            int pop = 1500000;
            double temp = 23.5;
            Boolean is_student = true;

            System.out.println("The persons name is " + name +".");
            System.out.println("The population of the city is " + pop+".");
            System.out.println("The temperature is " + temp + " degrees celsius.");
            System.out.println("Is the person a student? " + is_student);
            
            /*To convert the C# to java you have to change "Console.Writeline" to 
             * "System.out.println" and add a scanner object for user input */
        }
       }
		
