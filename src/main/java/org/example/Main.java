package org.example;


import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        printer.printPages(5);


//        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getDishWasher().doDishwasher();
//        kitchen.setKitchenState(true, true, true);
//        kitchen.doKitchenWork();


//        ComputerCase computerCase = new ComputerCase("2208", "Dell", "240");
//        Monitor monitor = new Monitor("27inch Beast", "acer", 27, "2400x1440");
//        Motherboard motherboard = new Motherboard("BJ200", "Asus", 4, 6, "v2,44");
//
//        PersonalComputer thePC = new PersonalComputer("2208", "Dell", computerCase, monitor, motherboard);
//        thePC.powerUp();

//        if (isLeapYear(2000)){
//            System.out.println("it's true");
//        } else {
//            System.out.println("it's fasle");
//        }

//        System.out.println("17 " + (isPrime(17) ? "" : "NOT ") + "a prime number");

//        primeNumberCounter(10, 50);

//        int counter = 0;
//        int sum = 0;
//        for( int i = 1; i <= 1000; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Number that met the requirements: " + i);
//                sum += i;
//                counter ++;
//                if (counter == 5){
//                    System.out.println("Sum of all numbers: " + sum);
//                    break;
//                }
//            }
//
//        }

//        System.out.println(sumOdd(13, 13));

//        System.out.println(isOdd(100));
//        int counterOdd = 0;
//        int counterEven = 0;
//        int i = 4;
//        while (i < 20) {
//            i++;
//            if(!isEvenNumber(i)){
//                counterOdd++;
//                continue;
//            }
//            System.out.println("Even number: " + i);
//            counterEven++;
//            if(counterEven==5){
//                break;
//            }
//        }
//        System.out.println("odd: " + counterOdd);
//        System.out.println("even: " + counterEven);

//        System.out.println(sumDigit(100));
//        System.out.println(isPalindrome(-1221));
//        System.out.println(hasSharedDigit(12, 23));
//        System.out.println(hasSameLastDigit(23, 32, 42));

//        printFactors(6);

//        System.out.println(getGreatestCommonDivisor(20, 30));
//        System.out.println(isPerfectNumber(28));

//        numberToWords(-2521);

//        System.out.println(reverse(-2521));
//
//        System.out.println(getDigitCount(123450));

//        System.out.println(canPack(4, 18, 19));
//        System.out.println(getLargestPrime(21));
//        printSquareStar(5);

//        inputThenPrintSumAndAverage();

//        System.out.println(getBucketCount(3.4, 1.5));


//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());


//        Employee maria = new Employee("Maria", "1983-10-06", "01-10-2023");
//        System.out.println(maria);
//        System.out.println("Age = " + maria.getAge());
//        System.out.println("Pay = " + maria.collectPay());
//
//
//        SalariedEmployee ewa = new SalariedEmployee("Ewa", "1980-11-30", "2022-10-20", 100.00);
//        System.out.println(ewa);
//
//        System.out.println("Ewa's Paycheck = $" + ewa.collectPay());
//
//        HourlyEmployee mery = new HourlyEmployee("Mery", "1983-10-06", "2022-09-09", 15);
//        System.out.println(mery);
//        System.out.println("Mary's Paycheck = $" + mery.collectPay());
//        System.out.println("Mary's holiday pay = $" + mery.getDoublePay());
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if (width <= 0 || height <=0 || areaPerBucket <=0){
            return -1;
        }

        if (extraBuckets < 0) {
            return -1;
        }

        double areaToPaint = width * height;
        double coveredByExtraBucket = extraBuckets * areaPerBucket;

        double areaThatLeft = areaToPaint - coveredByExtraBucket;

        int bucketToBuy = (int) Math.ceil(areaThatLeft / areaPerBucket);

        return bucketToBuy;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if (width <= 0 || height <=0 || areaPerBucket <=0){
            return -1;
        }

        double areaToPaint = width * height;

        int bucketToBuy = (int) Math.ceil(areaToPaint / areaPerBucket);

        return bucketToBuy;

    }

    public static int getBucketCount(double area, double areaPerBucket){

        if (area  <= 0 || areaPerBucket <=0){
            return -1;
        }


        int bucketToBuy = (int) Math.ceil(area / areaPerBucket);

        return bucketToBuy;

    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int counter = 0;

        while(true){

            String nb = scanner.nextLine();

            try {

                int number = Integer.parseInt(nb);
                counter++;
                sum += number;
                average = (double) sum / counter;


            } catch (Exception e) {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }

        }
    }


        public static void printSquareStar(int number) {

            if (number < 5) {
                System.out.println("Invalid Value");
            } else {
                int rowCount;
                int columnCount;
                int currentRow;
                rowCount = columnCount = number;
                for (int row = 0; row < rowCount; row++) {
                    currentRow = row;
                    for (int column = 0; column < columnCount; column++) {
                        if (row == 0 || column == 0 || row == rowCount - 1 || column == columnCount - 1 || column == row ||
                                column == (rowCount - currentRow - 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }

    public static int getLargestPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;
        }
        return -1;
    }


    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount <0 || goal < 0){
            return false;
        }

        int bigAmount = bigCount * 5;
        int smallAmount = smallCount * 1;
        int sum = bigAmount + smallAmount;
        int leftovers = goal % (sum);


        while (bigCount > 0 && goal >= 5){
            goal = goal - 5;

            bigCount --;
            if(goal == 0){
                return true;
            }
        }

        while (smallCount > 0 && goal >= 1) {
            goal = goal - 1;
            smallCount --;
            if(goal == 0){
                return true;
            }
        }

        return false;

    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }

        int initReverseNumber = reverse(number);
        int reverseNumber = reverse(number);

        int numberOfDigit = getDigitCount(number);
        int numberOfDigitReverse = getDigitCount(reverseNumber);

        while (reverseNumber > 9){
            int lastDigit = reverseNumber % 10;
            reverseNumber = reverseNumber / 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

        if(reverseNumber < 10) {
            switch (reverseNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            while (getDigitCount(number) != getDigitCount(initReverseNumber)){
                initReverseNumber = initReverseNumber * 10;
                System.out.println("Zero");
            }
        }

    }

    public static int reverse(int number){

        int reverseNumber = 0;


        while (Math.abs(number) > 9){
            int lastDigit = number % 10;
            reverseNumber += lastDigit;
            reverseNumber = reverseNumber * 10;
            number = number / 10;
        }

        reverseNumber += number;

        return reverseNumber;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }

        int numberOfDigits = 0;

        while (number > 9) {
            numberOfDigits ++;
            number = number / 10;
        }

        numberOfDigits +=1;

        return numberOfDigits;
    }

    public static boolean isPerfectNumber (int number){
        if(number < 1){
            return false;
        }

        int sum = 0;

        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0){
                sum += i;
            }
        }

        if(sum == number){
            return true;
        }

        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second){

        if(first < 10 || second < 10){
            return -1;
        }

        if(first % second == 0){
            return second;
        }

        if(second % first == 0){
            return first;
        }

        int halfFirst = first / 2;

        int greatestCommonDivisor = 1;
        for( int i = 1; i <= halfFirst; i++){
            if(first % i == 0 && second % i == 0){
                greatestCommonDivisor = i;
            }
        }

        return greatestCommonDivisor;
    }

    public static void printFactors(int number){

        if(number < 1){
            System.out.println("Invalid Value");
        }

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }

    public static boolean isValid(int number){
        if(number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if(!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)){
            return false;
        }

        int firstLastDigit = firstNumber % 10;
        int secondLastDigit = secondNumber % 10;
        int thirdLastDigit = thirdNumber % 10;

        if(firstLastDigit == secondLastDigit || firstLastDigit == thirdLastDigit || secondLastDigit == thirdLastDigit){
            return true;
        }

        return false;
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){

        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

//        The method should return true if there is a digit that appears in both numbers,
//        such as 2 in 12 and 23; otherwise, the method should return false.

        int initialSecondNumber = secondNumber;

        while(firstNumber > 9){
            int digit = firstNumber % 10;
            while (secondNumber>9){
                int secondDigit = secondNumber % 10;
                secondNumber = secondNumber / 10;
                if(digit == secondDigit){
                    return true;
                }
                if(secondNumber<10 && secondNumber ==digit){
                    return true;
                }

            }
            firstNumber = firstNumber / 10;
        }

        if(firstNumber < 10){
            while(initialSecondNumber > 9){
                int lastDigit = initialSecondNumber % 10;
                if(firstNumber == lastDigit){
                    return true;
                }
                initialSecondNumber = initialSecondNumber / 10;
            }

            if(initialSecondNumber < 10 && initialSecondNumber == firstNumber){
                return true;
            }

        }
        return false;
    }


    public static int getEvenDigitSum(int number){

        if(number < 0){
            return -1;
        }

        int sum = 0;

        while(number > 9){
            int digit = number % 10;
            if(digit % 2 == 0){
                sum += digit;
            }

            number = number /10;
        }

        if((number < 10) && (number % 2 == 0)){
            sum += number;
        }
        return sum;

    }

    public static int sumFirstAndLastDigit(int number){

        if(number < 0){
            return -1;
        }

        int firstDigit = number % 10;
        int lastDigit = 0;

        while(number > 9){
            lastDigit = number % 10;
            number = number / 10;
        }

        if(number < 10){
            lastDigit = number;
        }

        return firstDigit + lastDigit;
    }


    public static boolean isPalindrome (int number) {
        int reverese = 0;
        int initValue = number;

        while (abs(number) > 9){
            int digit = number % 10;
            reverese = reverese + digit;
            reverese = reverese * 10;
            number = number/10;
        }
        if (number < 10) {
            reverese += number;
        }

        if(initValue == reverese){
            return true;
        }

        return false;
    }


    public static int sumDigit (int number){
        int sum = 0;

        if (number <= 0){
            return -1;
        }

        while (number > 9) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;

        }

        if (number < 10) {
            sum += number;
        }


        return sum;
    }



    public static boolean isEvenNumber(int number){
        if (number < 0 ) {
            return false;
        }

        if(number % 2 == 0) {
            return true;
        }

        return false;
    }

    public static boolean isOdd(int number){
        if (number < 0 ) {
            return false;
        }

        if(number % 2 != 0) {
            return true;
        }

        return false;

    }

    public static int sumOdd(int start, int end){
        if(start < 0 || end < 0 || start > end){
            return -1;
        }

        int sum = 0;

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }

        return sum;
    }

    public static int primeNumberCounter(int x, int y) {

        int primeNumber = 0;

        for (x = 10; x < y; x++){
            if (isPrime(x)){
                System.out.println("This is a prime number: " + x);
                primeNumber += 1;
                if (primeNumber == 3){
                    break;
                }
            }
        }

        return primeNumber;
    }

    public static boolean isPrime(int number){

        if (number <=2){
            return true;
        }

        for(int i = 2; i <= number / 2; i++){
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate / 100));
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 0 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999){
            return -1;
        }

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(31);
                return 31;
            case 2:
                if (isLeapYear(year)){
                    return 29;
                } else {
                    return 28;
                }
            case 4: case 6: case 9: case 11:
                System.out.println(30);
                return 30;
            default:
                return -1;
        }

    }


    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        } else if (year % 4 == 0 && year % 100 != 0){
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void printNumberInWord(int number ){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static void kotek(){

        char letter = 'A';


        switch (letter){
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;


        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (!summer && (temperature >= 25 && temperature <= 35)){
            return true;
        } else if (summer && (temperature >= 25 && temperature <= 45)){
            return true;
        }

        return false;
    }

    public static void printEqual(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0){
            System.out.println( "Invalid Value");
        } else if (a == b && a == c){
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c){
            System.out.println("All numbers are different");
        } else {
            System.out.println( "Neither all are equal or different");
        }
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            int numberOfMinutesInYear = 1440 * 365;
            int years = (int) ((long) minutes / numberOfMinutesInYear);
            long days = ((minutes % numberOfMinutesInYear) / 60) / 24;
            System.out.println("modulo :" + (minutes % numberOfMinutesInYear));

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

    public static double area (double radius) {
        if (radius < 0) {
            return -1;
        }

        return Math.PI * radius * radius;
    }

    public static double area (double x, double y) {
        if (x < 0 || y < 0){
            return -1;
        }
        return x * y;
    }

    public static String getDurationString(int seconds) {
        //‘XXh YYm ZZs’

        int hour = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int leftOvers = minutes % 60;
        return (hour + "h " + minutes +"m " + leftOvers + "s");

    }

//    public static void getDurationString(int seconds, int minutes) {
//        //‘XXh YYm ZZs’
//
//        int hour = seconds / 3600;
//        int remainingSeconds = seconds % 3600;
//        int minutes = remainingSeconds / 60;
//        int leftOvers = minutes % 60;
//        return System.out.println(hour + "h " + minutes +"m " + leftOvers + "s");
//
//    }


    public static double convertToCentimeters (int inches) {
        return (double) (inches * 2.54);
    }

    public static double convertToCentimeters (int feet, int inches) {

        return convertToCentimeters((feet * 12) + inches);
    }



    public static boolean isTeen (int teen){

        if (teen >= 13 && teen <=19) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int first, int second, int third){
        if (first >= 13 && first <=19) {
            return true;
        } else if (second >= 13 && second <=19) {
            return true;
        }
        else if (third >= 13 && third <=19) {
            return true;
        }

        return false;
    }

    public static boolean hasEqualSum(int first, int second, int third){
        int sum = first + second;

        if (sum == third){
            return  true;
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces  (double first, double second) {
        int firstTemp = (int) (first * 1000.0);
        double firstTrim = ((double) (firstTemp)) / 1000;

        int secondTemp = (int) (second * 1000.0);
        double secondTrim = ((double) (secondTemp)) / 1000;


        if (firstTrim == secondTrim) {
            return true;
        }
        return false;
    }

}