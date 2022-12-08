------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:



public class Main{
 
    public static void main(String[] args) { 
        int number = 1000;  // Number to check
        int sum = 0;
        while (number > 0 || sum > 9) 
        { 
            if (number == 0) 
            { 
                number = sum; 
                sum = 0; 
            } 
            sum += number % 10; 
            number /= 10; 
        } 
 
        // If sum = 1, it is magic number 
        if(sum == 1) {
            System.out.println("It is a magic number");
        }else {
            System.out.println("It is not a magic number");
        }
    }
}