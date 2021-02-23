import java.util.Scanner;

public class TempCalc{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char c;
        do{
           System.out.println("Enter the temperature in degree celsius:");
           int a = sc.nextInt();

           float b = ((a*9)/5)+32;
           System.out.println("Temperature(Celsius):"+(float)a+"\t\t"+"Temperature(Fahrenheit):"+b);

           System.out.println("Do you wish to continue(y/n)?");
           c = sc.next().charAt(0);
        }while(c == 'y'|| c == 'Y');

    }
}