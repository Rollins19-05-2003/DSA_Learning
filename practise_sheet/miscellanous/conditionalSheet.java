package miscellanous;
import java.util.Scanner;

public class conditionalSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ques1: positive or negative
        // System.out.print("Enter the number : ");
        // int a = sc.nextInt();
        // String result = (a>=0)? "Positive" : "Negative";  
        // System.out.println(result); 


        //Ques 2: 
        // double temp = 99;
        // String test = (temp>=100)? "FEVER" : "NORMAL";
        // System.out.println(test);


        //Ques 3:
        // System.out.println("Enter the number you want to know the day : ");
        // int num = sc.nextInt();
        // switch (num) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Thrusday");
        //         break;
        //     case 6:
        //         System.out.println("Friday");
        //         break;
        //     case 7:
        //         System.out.println("Saturday");
        //         break;
        
        //     default:
        //     System.out.println("-----INVALID INPUT-----");
        //         break;
        // }


        //Ques 5 : leap year or not

        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(year%4==0)
        {
            if (year%100==0) {
                if (year%400==0) {
                    System.out.println("It is a leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("It is a leap year");
            }
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
}

