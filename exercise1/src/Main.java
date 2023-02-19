import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Hello! My name is AssistantBot.
                                
                I was created in 2020.
                Please, remind me your name.""");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("""
                                
                Let me guess your age.
                Say me remainders of dividing your age by 3, 5 and 7.
                """);
        int rem3 = sc.nextInt();
        int rem5 = sc.nextInt();
        int rem7 = sc.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming! \n" + "\n" +
                "Now I will prove to you that I can count to any number you want.");
        int count = sc.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println(i + "!");
        }

        System.out.println("""
                                
                Let's test your programming knowledge.\s
                Why do we use methods?\s
                  1. To repeat a statement multiple times.\s
                  2. To decompose a program into several small subroutines.\s
                  3. To determine the execution time of a program.\s
                  4. To interrupt the execution of a program.\s
                """);
        int answer = sc.nextInt();
        if (answer == 2)
            System.out.println("Congratulations, have a nice day!");
        else
            System.out.println("WOW man that's GOOD Big Mistake! xD");
    }
}