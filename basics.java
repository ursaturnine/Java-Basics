import java.util.Scanner;
import java.util.Arrays;

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
        // can also save this to a variable for later use since it doesn't mutate the string
        System.out.println(skyBlue.replace("blue", "red"));


        // check if a string contains a subsequence - returns true
        System.out.println(skyBlue.contains("sky"));




        

        //User Input - accepting different types of input from the user
        // need a scanner object first - using new keyword
        // System.in - getting input from the console
        // import Scanner object - import java.util.Scanner - at top of file

        Scanner scanner = new Scanner(System.in);

        // use print method instead of println - now newline character after end of line
        System.out.print("What is your name? ");
        // nextLine() - takes string as input from user; have to save this input somewhere
        // scanner.nextLine();

        String scannerName = scanner.nextLine();


        // printf method - let's you use format specifiers in print method
        System.out.printf("Hello %s! How old are you? ", scannerName);

        // nextLine() - can ask for different types
        int scannerAge = scanner.nextInt();

        // remove 'enter' space from scanner
        scanner.nextLine();

        System.out.printf("%d is an excellent age to start programming! What language do you want to learn? ", scannerAge);
        String scannerLanguage = scanner.nextLine();

        System.out.printf("%s is a great langauge to learn!", scannerLanguage);
        scanner.nextLine();

        // close scanner to prevent memory leaks
        scanner.close();








        // instantiating arrays

        // array of chars
        // add square brackets after variable name
        // use new keyword
        // add square brackets with length of array within brackets
        char vowels[] = new char[5];


        // insert a new character in chars array
        // array variable followed by square brackets
        // include the index where char is to be added within square brackets
        // assign a value
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // this will print, 'i', to the console
        System.out.println(vowels[2]);

        // how to print out entire array?
        // have to convert to string before printing
        System.out.println(Arrays.toString(vowels));

        //define an array in one line
        char vowles[] = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(Arrays.toString(vowles));

        // get length of an array
        System.out.println(vowles.length);

        // sorting a range of positions - range is non-inclusive
        int startingIndex = 1;
        int endingIndex = 4;
        // Arrays.sort(vowles, startingIndex, endingIndex);

        // binary search on array

        char key = 'o';
        // returns the index of given key
        int foundItemIndex = Arrays.binarySearch(vowles, key);
        System.out.println(foundItemIndex);

        // can also perform binary search in a range..
        int foundItemInRangeIndex = Arrays.binarySearch(vowles, startingIndex,endingIndex,key);
        System.out.println(foundItemInRangeIndex);



        // sort an array - mutates array
        Arrays.sort(vowles);
        System.out.println(Arrays.toString(vowles));



        // method to insert a certain value into an array
        char nameConsonants[] = new char[5];
        Arrays.fill(nameConsonants, 't');


        // fill array in a range
        int startIndx = 1;
        int endIndx = 4;
        Arrays.fill(nameConsonants, startIndx, endIndx, '<');


        // copy an array - variables pointing to two separate but equal values
        char copyNameCs[] = Arrays.copyOf(nameConsonants, 5);
        System.out.println(Arrays.toString(copyNameCs));

        // copy a range of an array
        int sIndx = 0;
        int eIndx = 4;
        char copyNameCsRange[] = Arrays.copyOfRange(copyNameCs, sIndx, eIndx);
        System.out.println(Arrays.toString(copyNameCsRange));


        // check equality of og array w/ copied array (reference type; don't use "==", use "equals" method)
        System.out.println(Arrays.equals(nameConsonants, copyNameCs));

        // like comparing primitive types to reference types, comparing arrays, (two reference types), is different;
        // equals() will return false between OG array and copied arrray 





        // Loops - repeating instructions

        // for loop
        // int aNumber = 1 <=== initialization
        // number <= 1- <=== condition
        // number++ <=== update; runs after loop body
        for (int aNumber = 1; number <= 10; number++) {
            System.out.println(aNumber);
        }

        // loop over array 
        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f'};

        for (int indx = 0; indx < letters.length; indx++) {
            System.out.println(letters[indx]);
        }


        // nested for loop
        // variables in outer loop are accessible in inner loop
        // can't access variables in inner loop from outer loop
        for (int ltr = 1; ltr < letters.length; ltr++){
            for (int mult = 1; mult < 10; mult++){
                System.out.printf("%d X %d = %d \n", number, mult, mult * ltr);
            }
        }



        // for loop over a collection
        for (char ltr : letters) {
            System.out.println(ltr);
        }












    }

}