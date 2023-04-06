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
        // int age = 25;
        boolean isStudent = false;
        boolean isLibraryMember = true;

        // age >= 18
        // age <= 40

        // &&
        // if left equation of logical operator AND righ side of logical
        // operator is true, the output will be, true; else false
        // System.out.println(age >= 18 && age <= 40);

        // ||
        // left OR right side of logical operator is true returns true; else false
        System.out.println(isStudent || isLibraryMember);

        // ! - the 'not' operator reverses the boolean value
        // reverse the operator of an entire && or || operation 
        System.out.println(!isStudent);




        // ternary operators
        int score = 0;
        int turns = 10;
        
        // adds 2
        score += 2;

        // adds 1
        score++;

        // decrease by 1
        turns--;

        // ternary operators and the compiler
        int number = 55;
        System.out.println(number++);
        System.out.println(number);

        // when compiler reads code, it goes from left to right
        // so, it readsy "System.out.println(number...)", when the compiler sees 'number',
        // it immediately prints out the value store in number which is 55

        // compiler will increase the value FIRST then print out the newly incremented number
        System.out.println(++number);




        // declaring strings - a sequence of characters

        // declaring a new string - literal
        String myName = "Tyrah";

        System.out.println(myName);

        // declaring a string - new keyword
        // new key word creates new objects from classes

        // String twin = new String ("Aliyah");

        // the jvm, java virtual machine uses a portion of the computer's
        // memory to store strings
        // creating a string in a virtual string, java first checks if the string 
        // already exists in the memory or not, else java uses value with new variable
        // w/ new keyword, java creates a new variable with value whether the string exists or not


        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        // literal format; returns true; new variable assigned to same value
        System.out.println(literalString1 == literalString2);
        // new keyword; returns false; new variable assigned to same value
        System.out.println(objectString1 == objectString2);

        // prefer to use literal; compiler can optimize code better






        // string concatenation

        System.out.println("Hello world! I'm Aliyah and I'm from Puyallup, WA and I'm 27 years old");

        String name = "Aliyah";
        String city = "Puyallup";
        int age = 27;
        String company = "Sonic";
        double gpa = 3.8;

        System.out.println("Hello world! I am " + name + ". I am from " + city + " and I am " + age + " years old.");


        // string formatting
        // format specifiers - %s == string; %d == number; %f == float; %b == boolean

        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I work for %s.", name, city, age, company);

        System.out.println(formattedString);

        String myGPA = String.format("My GPA is %f", gpa);

        System.out.println(myGPA);




        // string methods

        String anotherName = "Peyton";
        String anotherName2 = "Peyton";
        String aString = new String("hi");
        String aString2 = new String("hi");
        String skyBlue = "The sky is blue";

        // check length of string
        System.out.println(anotherName.length());

        // check if the string is empty; boolean 
        System.out.println(anotherName.isEmpty());

        // string to uppercase
        System.out.println(anotherName.toUpperCase());
        // toUpperCase() doesn't mutate the string
        System.out.println(anotherName);

        // string to lowercase
        System.out.println(anotherName.toLowerCase());


        // check equality of strings; returns true
        System.out.println(anotherName.equals(anotherName2));

        // ignore case method - returns true
        System.out.println(aString.equalsIgnoreCase(aString2));

        // using new keyword; returns false using logical operator
        System.out.println(aString == aString2);

        // using new keyword; returns true using equals() string method
        System.out.println(aString.equals(aString2));


        // replace part of a string - doesn't mutate the string
        System.out.println(skyBlue.replace("blue", "red"));



    }

}