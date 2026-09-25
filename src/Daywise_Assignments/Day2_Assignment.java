package Daywise_Assignments;

public class Day2_Assignment {
    public static void main(String[] args){

        // Program 1 Basic Variables
        String name = "Ravi";
        int age = 28;
        double salary = 45000.50;
        boolean active = true;
        System.out.println(name);  // Ravi
        System.out.println(age);  // 28
        System.out.println(salary);  // 45000.50
        System.out.println(active);  // true

        // Problem 2 Simple Bill Calculation
        double price = 1200;
        int qty = 3;
        double total = price * qty;  // 1200 * 3 = 3600.0
        double discount = total * 0.10;  // 3600 * 0.10 = 360.0
        double payable = total - discount;  // 3600.0 - 360.0 = 3240.0
        System.out.println("Total = " + total);  // Total = 3600.0
        System.out.println("Discount = " + discount); // Discount = 360.0
        System.out.println("Payable = " + payable); // Payable = 3240.0


        //Problem 3 Even or Odd
        int number = 17;
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        // Output --> Odd

        //Problem 4 Login Eligibility
        String role = "Admin";
        boolean accountActive = true;
        String result = (role.equals("Admin") && accountActive)
            ? "Login Allowed" : "Login Blocked";
        System.out.println(result);
        //Output --> Login Allowed

        //Problem 5 ATM Withdraw Validation
        double balance = 25000;
        double withdraw = 8000;
        boolean kycOk = true;
        boolean valid = kycOk
                && withdraw > 0
                && withdraw <= balance;
        System.out.println(valid ? "Withdraw" : "Reject");
        //Output --> Withdraw

        //Problem 6 Flight Fare Rule
        double baseFare = 6000;
        boolean international = true;
        double tax = international ? baseFare * 0.18 : baseFare * 0.05;  // 6000 * 0.18 = 1080.0
        double finalFare = baseFare + tax; // 6000 + 1080 = 7080
        System.out.println("Final Fare = " + finalFare);  // Final Fare = 7080.0

        //Problem 7 Cart Quantity Check
        int stock = 12;
        int requested = 15;
        boolean canOrder = requested > 0 && requested <= stock;  // False
        System.out.println(canOrder ? "Order Accepted" : "Insufficient Stock");  // Insufficient Stock

        //Problem 8 Swap Two Numbers
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b= " + b); // a = 20 ,b = 10

        //Problem 9 Largest of Three Numbers
        int a2 = 25, b2 = 40, c = 32;
        int largest = a2; // largest = 25
        if (b2 > largest) largest = b2;  // (40 > 25); True ; largest = 40
        if (c > largest) largest = c; // (32 > 40) ; False ; largest = 40
        System.out.println("Largest = " + largest); // Largest = 40

        //Problem 10 OTP Rule
        int actualOtp = 4589;
        int enteredOtp = 4589;
        boolean blocked = false;
        boolean validd = !blocked && enteredOtp == actualOtp;  // True
        System.out.println(validd ? "OTP Valid" : "OTP Invalid"); // OTP Valid

        //Problem 11 Loan Eligibility Mini Rule
        double salary1 = 65000;
        int age1 = 32;
        int creditScore = 760;
        boolean eligible = salary >= 40000  // 65000 > 40000 --> True
                && age >= 21 && age <= 58   // 32 > 21 && 32<50 --> True
                && creditScore >= 700;      // 760 > 700  --> True
        System.out.println(eligible ? "Eligible" : "Not Eligible");  // Eligible




    }
}
