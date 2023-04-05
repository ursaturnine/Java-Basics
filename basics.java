class Main {
    public static void main(String[] args) {
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 2147483647; // -2147483648 to 2147483648
        long aLargeNumber = 922337203685477587L; // -922337203685477587 to 922337203685477587L

        // decimal types
        double aDouble = 1.79769313; // 4.9E-324 to .17976931348623157E308; double-position 64-bit floating point numbers with a verrry long range
        float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38; single-position 32-bit floating point numbers w a smaller range

        // by default, any decimal is treated as a double; have to append, 'F', to tell compiler a number is a float;

        // booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        // characters
        char copyrightSymbol = '\u00A9';

        System.out.println("This is a copyright symbol: " + copyrightSymbol);


        // arithmetic operators
        int number1 = 12;
        int number2 = 6;

        // addition
        System.out.println(number1 + number2); // 18

        // subtraction 
        System.out.println(number1 - number2); // 6

        // multiplication
        System.out.println(number1 * number2); // 72

        // division
        System.out.println(number1 / number2); // 2

        // remainder (modulo/modulus)
        System.out.println(number1 % number2); // 0




        // relational operatiors

        // is equal to
        System.out.println(number1 == number2);

        // is not equal to
        System.out.println(number1 != number2);

        // is greater than
        System.out.println(number1 > number2);

        // is less than
        System.out.println(number1 < number2);
        
        // is greater than or equal to 
        System.out.println(number1 >= number2);

        // is less than or equal to
        System.out.println(number1 <= number2);




        // logical operators
        int age = 25;
        boolean isStudent = false;
        boolean isLibraryMember = true;

        // age >= 18
        // age <= 40

        // &&
        // if left equation of logical operator AND righ side of logical
        // operator is true, the output will be, true; else false
        System.out.println(age >= 18 && age <= 40);

        // ||
        // left OR right side of logical operator is true returns true; else false
        System.out.println(isStudent || isLibraryMember);

        // ! - the 'not' operator reverses the boolean value
        // reverse the operator of an entire && or || operation 
        System.out.println(!isStudent);



    }

}