package Daywise_Assignments;

public class Day1_Assignment {
    public static void main(String[] args){

        //1.Find the Output
        int a=10, b=3;
        System.out.println(a/b); // 10/3 --> 3
        System.out.println(a%b); // 10%3 --> 1

        //2.Find x, y and z:
        int x=5;
        int y=x++;  // y = 5 ; x = 5 +1 = 6
        int z=++x;  // x = 6 +1 =7 ; z = 7
        System.out.println(y); // 5
        System.out.println(z); // 7

        //3.What is d?
        double d = 10 / 4;  // 10/4 = 2.0
        double e = 10.0 / 4;//  10 % 4 = 2.5
        System.out.println(d);  // 2.0
        System.out.println(e); // 2.5

        //4.Fix:
        //float price = 99.99;  have to put f at the last so compiler recognize vale as float
        float price = 99.99f;

        //5.Predict:
        int a1=10;
        System.out.println(a1++ + ++a1); // 22

        //6.Write a program using ?: to print PASS/FAIL.
        int f = 90 ;
        double g = 90.01;
        System.out.println(f > g ? "Pass" : "Fail");  // Fail
        System.out.println(f < g ? "Pass" : "Fail");  // Pass
        System.out.println(f == g ? "Pass" : "Fail");  // Fail
        System.out.println(f != g ? "Pass" : "Fail");  // Pass

        //7.Build a salary calculator:
        int basic = 50000;
        int bonus = 5000;
        int taxper = 10 ;
        //  print gross, tax and net salary.
        float gross = basic + bonus;  // 50000 + 5000 = 55000
        float tax = (gross*taxper)/100;   // (55000 * 10)/100 = 5500
        float netsal = gross - tax ;   // 55000 - 5500 = 49500
        System.out.println("Gross Salary = " + gross);  // 55000
        System.out.println("Total tax to pay = " + tax);  // 5500
        System.out.println("Net Salary = " + netsal);  //  49500

        //8. Mini Project - Student Result

                int marks = 78;
                boolean attendanceOK = true;
                String result = (marks >= 40 && attendanceOK)
                        ? "PASS" : "FAIL";
                System.out.println("Marks: " + marks);  // Marks: 78
                System.out.println("Result: " + result);  // Result: PASS


    }

}
