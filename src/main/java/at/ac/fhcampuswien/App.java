package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        String output = "0123456789012345678901" + System.lineSeparator();
        output += "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`" + System.lineSeparator();

        System.out.print(output);
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char charLiteral = 'Z';
        int integerLiteralHex = 0xface;
        int integerLiteralN = 012;
        long longLiteralxxL = 80L;
        float floatLiteralMeEf = 44e-1f;
        float floatLiteralMf = 5.5f;
        double doubleLiteralMeE = 8.88e1;
        double doubleLiteralMd = 99.9;

        int sum = charLiteral + (int) integerLiteralHex + integerLiteralN + (int) longLiteralxxL +
                (int) floatLiteralMf + (int) floatLiteralMeEf + (int) doubleLiteralMd + (int) doubleLiteralMeE;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        /*
        int summandA = new java.util.Scanner(System.in).nextInt();
        int summandB = new java.util.Scanner(System.in).nextInt();
        */
        //Obiges besteht aus unerklärlichen Gründen den Test nicht!

        Scanner scan = new Scanner(System.in);


        int summandA = scan.nextInt();
        int summandB = scan.nextInt();

        int sum = summandA + summandB;

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);


        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scan.nextInt();
        System.out.print("y: ");
        int y = scan.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        /*
        System.out.print("n1: ");
        int n1 = new java.util.Scanner(System.in).nextInt();
        System.out.print("n2: ");
        int n2 = new java.util.Scanner(System.in).nextInt();
        */
        //Obiges besteht aus unerklärlichen Gründen den Test nicht!

        Scanner scan = new Scanner(System.in);


        System.out.print("n1: ");
        int n1 = scan.nextInt();
        System.out.print("n2: ");
        int n2 = scan.nextInt();


        if (n1 > n2)
            System.out.println("n1 > n2");
        else if (n1 < n2)
            System.out.println("n2 > n1");
        else
            System.out.println("n1 == n2");
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        int annualRevenue = new java.util.Scanner(System.in).nextInt();


        if ((0 <= annualRevenue) && (annualRevenue < 20000))
            System.out.println("Poor Sales Revenue");
        else if ((20000 <= annualRevenue) && (annualRevenue < 50000))
            System.out.println("Average Sales Revenue");
        else if ((50000 <= annualRevenue) && (annualRevenue < 80000))
            System.out.println("Good Sales Revenue");
        else if ((50000 <= annualRevenue) && (annualRevenue < 80000))
            System.out.println("Excellent Sales Revenue");
        else
            System.out.println("Invalid Revenue");
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        double provision;


        System.out.print("Enter CommissionClass: ");
        int selector = new java.util.Scanner(System.in).nextInt();


        switch (selector){
            case 1:
                provision = 0.01;
                break;
            case 2:
                provision = 0.02;
                break;
            case 3:
                provision = 0.03;
                break;
            case 4:
                provision = 0.04;
                break;
            default:
                provision = 0;
        }

        System.out.println("Your Commission Rate was set to " +  provision);
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        System.out.print("Year: ");
        int inputYear = new java.util.Scanner(System.in).nextInt();

        if ((inputYear % 4) == 0){
            if((inputYear % 100) == 0){
                if((inputYear % 400) == 0)
                    System.out.println("Leapyear");
                else
                    System.out.println("Not a Leapyear");
            }
        }
        else
            System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        StringBuffer outputString = new StringBuffer();
        System.out.print("Number: ");
        String inputString = new java.util.Scanner(System.in).nextLine();

        for (int i = 0; i < inputString.length(); i++) {
            outputString.insert(i, inputString.charAt(inputString.length() - (i + 1)));
        }

        System.out.println(outputString);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}