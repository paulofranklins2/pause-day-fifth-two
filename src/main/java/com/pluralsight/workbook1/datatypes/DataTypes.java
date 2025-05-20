package com.pluralsight.workbook1.datatypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("1. Create and print an int, double, and char");
        int myInt = 10;
        double myDouble = 3.14;
        char myChar = 'C';
        System.out.println("Int: " + myInt + ", Double: " + myDouble + ", Char: " + myChar + "\n");

        System.out.println("2. Add two ints");
        int a = 5, b = 7;
        System.out.println("Sum: " + (a + b) + "\n");

        System.out.println("3. Divide int by int");
        int x = 10, y = 3;
        System.out.println("Int / Int: " + (x / y) + "\n");

        System.out.println("4. Divide int by double");
        System.out.println("Int / Double: " + (x / 3.0) + "\n");

        System.out.println("5. Age in 10 years");
        int age = 30;
        System.out.println("In 10 years I will be: " + (age + 10) + "\n");

        System.out.println("6. byte + int");
        byte b1 = 100;
        int result = b1 + 28;
        System.out.println("Byte + 28 = " + result + "\n");

        System.out.println("7. Cast double to int");
        double val = 5.7;
        int casted = (int) val;
        System.out.println("Double: " + val + ", Casted to int: " + casted + "\n");

        System.out.println("8. Multiply float and int → store in double");
        float f = 3.5f;
        int i = 4;
        double mult = f * i;
        System.out.println("Float * Int = " + mult + "\n");

        System.out.println("9. char + 1");
        char ch = 'A';
        ch += 1;
        System.out.println("Char + 1 = " + ch + "\n"); // Result: 'B'

        System.out.println("10. Division and modulo");
        int divA = 9, divB = 2;
        System.out.println("a / b = " + (divA / divB)); // 4
        System.out.println("a % b = " + (divA % divB) + "\n"); // 1

        System.out.println("11. BMI");
        double weight = 70.0;
        double height = 1.70;
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);

        double weightLbs = 154;
        double heightInches = 67;

        double bmiUSA = (weightLbs * 703) / (heightInches * heightInches);
        System.out.println("BMI (US Units) = " + bmiUSA + "\n");

        System.out.println("12. Average of 3 doubles");
        double d1 = 3.5, d2 = 4.8, d3 = 2.9;
        double avg = (d1 + d2 + d3) / 3;
        System.out.println("Average = " + avg + "\n");

        System.out.println("13. Compound assignment");
        int comp = 10;
        comp += 5;
        System.out.println("+= 5: " + comp);
        comp *= 2;
        System.out.println("*= 2: " + comp);
        comp -= 4;
        System.out.println("-= 4: " + comp);
        comp /= 2;
        System.out.println("/= 2: " + comp + "\n");

        System.out.println("14. short overflow fix");
        short s = 30000;
        int bigMult = s * 2;
        System.out.println("Short * 2 (fixed): " + bigMult + "\n");

        System.out.println("15. Total cost with casting");
        double price = 10.99;
        int quantity = 5;
        int totalCost = (int) (price * quantity);
        System.out.println("Total cost (int): " + totalCost + "\n");

        System.out.println("16. Casting int to byte");
        int tooBig = 130;
        byte weirdByte = (byte) tooBig;
        System.out.println("Cast int 130 to byte: " + weirdByte + "\n");

        System.out.println("17. char subtraction");
        char letter = 'z';
        letter -= 2;
        System.out.println("z - 2 = " + letter + "\n");

        System.out.println("18. long math");
        long big = 2000000000L;
        big += 1000000000L;
        System.out.println("Long result = " + big + "\n");

        System.out.println("19. Area of circle");
        double radius = 4.5;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle = " + area + "\n");

        System.out.println("20. Mixing types");
        byte mByte = 10;
        short mShort = 3000;
        int mInt = 50000;
        long mLong = 100000000L;
        float mFloat = 3.14f;
        double mDouble = 2.718;
        char mChar = 'D';

        double mix1 = mByte + mDouble;
        int mix2 = mChar + mShort;
        long mix3 = mInt * mByte;
        float mix4 = mFloat + mByte;

        System.out.println("Byte + Double = " + mix1);
        System.out.println("Char + Short = " + mix2);
        System.out.println("Int * Byte = " + mix3);
        System.out.println("Float + Byte = " + mix4 + "\n");

        System.out.println("MINI CHALLENGE");
        int totalMinutes = 350;
        int fullHours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        System.out.println("Total minutes: " + totalMinutes);
        System.out.println("That is " + fullHours + " hour(s) and " + remainingMinutes + " minute(s)." + "\n");

        double costPerHour = 2.75;
        double totalCost2 = fullHours * costPerHour;
        System.out.println("Total cost for full hours: " + totalCost2 + " euros");

    }
}
