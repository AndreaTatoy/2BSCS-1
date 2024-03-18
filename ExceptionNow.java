import java.util.*;

public class ExceptionNow{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        while (true){

        try{
        int num1 = 0;
        int num2 = 0;
        double result = 0;

        System.out.print("\nEnter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        if (num2 == 0){
            throw new DivisionZeroException("Dividing to zero is not allowed.");
        }

        result = (double) num1/num2;
        System.out.println("\n" + num1 + "/" + num2 + " is equal to " + result + ".");
        System.exit(0);    
    }
        

        // integer division = tran

        catch (InputMismatchException e){
            System.out.println("\nOnly integers will be accepted as input.");
        }

        catch (DivisionZeroException e){
            System.out.println("\nZero as denominator is not allowed.");
        }

        /*
        finally {
            System.out.println("Good bye! Rawrawrawrawr <3");
            input.close();
            System.exit(0);
        }
         */
    }
}
}