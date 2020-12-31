import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        showWelcomeMessage();
        choosingMode();
    }

    /**
     * Messages .. Welcome , End.
     */
    public static void showWelcomeMessage() {
        System.out.println("*** Welcome ***");
        System.out.println("---------------\n");
    }

    public static void showEndMessage() {
        System.out.println("---------------------------");
        System.out.println("Thank you for using our App\nBye");
    }

    /**
     * Show Modes .. Scientific , Trigonometric , Rational Number.
     */
    public static void showClacModes() {
        System.out.println("=======================");
        System.out.println("[1] Scientific Mode");
        System.out.println("[2] Trigonometric Mode");
        System.out.println("[3] Rational Number Mode");
    }

    /**
     * Show Operation of Modes .. Scientific , Trigonometric , Rational Number.
     */
    public static void showScientificModeOperation() {
        System.out.println("*** Scientific Mode is Running ***");
        System.out.println("----------------------------------");
        System.out.println("===================================================");
        System.out.println("Scientific Mode Operations :");
        System.out.println("[+]  plus     \t  [-]  minus       \t [*]  times");
        System.out.println("[/]  division \t  [%]  modul       \t [|]  absolute");
        System.out.println("[!]  factorial\t  [^]  power       \t [r]  root  ");
        System.out.println("[p]  Prime or Not");
        System.out.println("===================================================");
    }

    public static void showTrigonometricModeOperation() {
        System.out.println("*** Trigonometric Mode is Running ***");
        System.out.println("-------------------------------------");
        System.out.println("=====================================");
        System.out.println("Trigonometric Mode Operations :");
        System.out.println("[s]  sine \t [c]  cosine \t [t]  tan");
        System.out.println("[S]  sec  \t [C]  csc    \t [N]  cotan");
        System.out.println("======================================");
    }

    public static void showRationalNumberModeOperation() {
        System.out.println("*** Rational Number Mode is Running ***");
        System.out.println("---------------------------------------");
        System.out.println("===================================================");
        System.out.println("Rational Number Mode Operations :");
        System.out.println("[+]  plus     \t  [-]  minus       \t [*]  times       [/]  division");
        System.out.println("===================================================");
    }

    /**
     * Options .. Exit.
     */
    public static void showExitOption() {
        System.out.println("[E] Exit");
        System.out.println("===================");
    }

    /**
     * Running
     */
    public static void choosingMode() {
        showClacModes();
        showExitOption();
        System.out.print("mode : ");
        Scanner input = new Scanner(System.in);
        char num = input.next().charAt(0);
        switch (num) {
            case '1':
                scientificModeOperation();
                exitOrContinue();
                break;
            case '2':
                trigonometricModeOperatioc();
                exitOrContinue();
                break;
            case '3':
                RationalNumberModeOperation();
                exitOrContinue();
                break;
            case 'e':
            case 'E':
                System.out.println("are you sure you want to leave?");
                leaveDecision();
                break;
            default:
                System.out.println("Please, Choose a Correct Mode : ");
                choosingMode();
                break;
        }
    }

    /**
     * BackEnd of choosing Operations of Mode
     */
    public static void scientificModeOperation() {
        showScientificModeOperation();
        Scanner input = new Scanner(System.in);
        System.out.print("Choose an Operation : ");
        char operation = input.next().charAt(0);
        switch (operation) {
            case '+': {
                System.out.println("Enter The numbers");
                try {
                    double firstNum = input.nextDouble();
                    double secondNum = input.nextDouble();
                    double sum = addition(firstNum, secondNum);
                    System.out.println(firstNum + " + " + secondNum + " = " + sum);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter The Numbers !");
                    scientificModeOperation();
                }
                break;
            }
            case '-': {
                System.out.println("Enter The numbers");
                try {
                    double firstNum = input.nextDouble();
                    double secondNum = input.nextDouble();
                    double sub = subtraction(firstNum, secondNum);
                    System.out.println(firstNum + " - " + secondNum + " = " + sub);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter The Numbers !");
                    scientificModeOperation();
                }
                break;
            }
            case '*': {
                System.out.println("Enter The numbers");
                try {
                    double firstNum = input.nextDouble();
                    double secondNum = input.nextDouble();
                    double multi = multiplicaction(firstNum, secondNum);
                    System.out.println(firstNum + " x " + secondNum + " = " + multi);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter The Numbers !");
                    scientificModeOperation();
                }
                break;
            }
            case '/': {
                System.out.println("Enter The numbers");
                try {
                    double firstNum = input.nextDouble();
                    double secondNum = input.nextDouble();
                    double divi = division(firstNum, secondNum);
                    System.out.println(firstNum + " ÷ " + secondNum + " = " + divi);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter The Numbers !");
                    scientificModeOperation();
                }
                break;
            }
            case '^': {
                System.out.println("Enter The number & The number of Power respectively");
                try {
                    double base = input.nextDouble();
                    double power = input.nextDouble();
                    power(base, power);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter The Numbers !");
                    scientificModeOperation();
                }
                break;
            }
            case '!': {
                System.out.println("Enter The number");
                try {
                    int number = input.nextInt();
                    long result = factorial(number);
                    System.out.println(number + "! = " + result);
                } catch (InputMismatchException e) {
                    System.out.println("Enter an Integer Number !");
                    scientificModeOperation();
                }
                break;
            }
            case '|': {
                System.out.println("Enter The number");
                try {
                    double number = input.nextInt();
                    absolute(number);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter a Number !");
                    scientificModeOperation();
                }
                break;
            }
            case 'r':
            case 'R': {
                System.out.println("Enter The number & The number of root respectively ");
                try {
                    int number = input.nextInt();
                    int root = input.nextInt();
                    Roots(number, root);
                } catch (InputMismatchException e) {
                    System.out.println("Enter an Integer Numbers !");
                    scientificModeOperation();
                }
                break;
            }
            case '%': {
                System.out.println("Enter The numbers");
                try {
                    double firstNum = input.nextDouble();
                    double secondNum = input.nextDouble();
                    modul(firstNum, secondNum);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter The Numbers !");
                    scientificModeOperation();
                }
                break;
            }
            case 'p':
            case 'P': {
                System.out.println("Enter The number");
                try {
                    int number = input.nextInt();
                    isPrime(number);
                } catch (InputMismatchException e) {
                    System.out.println("Enter an Integer Number !");
                    scientificModeOperation();
                }
                break;
            }
            default: {
                System.out.println("Choose a Correct Operation : ");
                scientificModeOperation();
                break;
            }
        }
    }

    public static void RationalNumberModeOperation() {
        showRationalNumberModeOperation();
        Scanner input = new Scanner(System.in);
        System.out.print("Choose an Operation : ");
        char operation = input.next().charAt(0);
        switch (operation) {
            case '+': {
                System.out.println("Enter The numbers respectively ");
                try {
                    int numerator1 = input.nextInt();
                    System.out.print("/");
                    int denominator1 = input.nextInt();
                    int numerator2 = input.nextInt();
                    System.out.print("/");
                    int denominator2 = input.nextInt();
                    addRational(numerator1, denominator1, numerator2, denominator2);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter an Integer Number !");
                    RationalNumberModeOperation();
                }
                break;
            }
            case '-': {
                System.out.println("Enter The numbers respectively ");
                try {
                    int numerator1 = input.nextInt();
                    System.out.print("/");
                    int denominator1 = input.nextInt();
                    int numerator2 = input.nextInt();
                    System.out.print("/");
                    int denominator2 = input.nextInt();
                    subRational(numerator1, denominator1, numerator2, denominator2);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter an Integer Number !");
                    RationalNumberModeOperation();
                }
                break;
            }
            case '*': {
                System.out.println("Enter The numbers respectively ");
                try {
                    int numerator1 = input.nextInt();
                    System.out.print("/");
                    int denominator1 = input.nextInt();
                    int numerator2 = input.nextInt();
                    System.out.print("/");
                    int denominator2 = input.nextInt();
                    multiRational(numerator1, denominator1, numerator2, denominator2);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter an Integer Number !");
                    RationalNumberModeOperation();
                }
                break;
            }
            case '/': {
                System.out.println("Enter The numbers respectively ");
                try {
                    int numerator1 = input.nextInt();
                    System.out.print("/");
                    int denominator1 = input.nextInt();
                    int numerator2 = input.nextInt();
                    System.out.print("/");
                    int denominator2 = input.nextInt();
                    divisionRational(numerator1, denominator1, numerator2, denominator2);
                } catch (InputMismatchException e) {
                    System.out.println("try again & Enter an Integer Number !");
                    RationalNumberModeOperation();
                }
                break;
            }
            default: {
                System.out.println("Please, Choose a Correct Operation : ");
                RationalNumberModeOperation();
                break;
            }
        }
    }

    public static void trigonometricModeOperatioc() {
        showTrigonometricModeOperation();
        Scanner input = new Scanner(System.in);
        System.out.print("Choose an Operation : ");
        char operation = input.next().charAt(0);
        switch (operation) {
            case 's': {
                System.out.print("Please, Enter Theta = ");
                try {
                    double theta = input.nextDouble();
                    double res = Sine(theta);
                    System.out.println("Sin ( " + theta + " ) = " + res);
                } catch (InputMismatchException e) {
                    System.out.println("Enter a Number !");
                    trigonometricModeOperatioc();
                }
                break;
            }
            case 'c': {
                System.out.print("Please, Enter Theta = ");
                try {
                    double theta = input.nextDouble();
                    double res = Cosine(theta);
                    System.out.println("Cosin ( " + theta + " ) = " + res);
                } catch (InputMismatchException e) {
                    System.out.println("Enter a Number !");
                    trigonometricModeOperatioc();
                }
                break;
            }
            case 't': {
                System.out.print("Please, Enter Theta = ");
                try {
                    double theta = input.nextDouble();
                    double res = Tan(theta);
                    System.out.println("Tan ( " + theta + " ) = " + res);
                } catch (InputMismatchException e) {
                    System.out.println("Enter a Number !");
                    trigonometricModeOperatioc();
                }
                break;
            }
            case 'S': {
                System.out.print("Please, Enter Theta = ");
                try {
                    double theta = input.nextDouble();
                    double res = Sec(theta);
                    System.out.println("Sec ( " + theta + " ) = " + res);
                } catch (InputMismatchException e) {
                    System.out.println("Enter an Number !");
                    trigonometricModeOperatioc();
                }
                break;
            }
            case 'C': {
                System.out.print("Please, Enter Theta = ");
                try {
                    double theta = input.nextDouble();
                    double res = Csc(theta);
                    System.out.println("Csc ( " + theta + " ) = " + res);
                } catch (InputMismatchException e) {
                    System.out.println("Enter an Number !");
                    trigonometricModeOperatioc();
                }
                break;
            }
            case 'N': {
                System.out.println("Please, Enter Theta = ");
                try {
                    double theta = input.nextDouble();
                    double res = Cot(theta);
                    System.out.println("Cot ( " + theta + " ) = " + res);
                } catch (InputMismatchException e) {
                    System.out.println("Enter an Number !");
                    trigonometricModeOperatioc();
                }
                break;
            }
            default:
                System.out.print("Enter a Correct Operation : ");
                trigonometricModeOperatioc();
                break;
        }
    }

    /**
     * BackEnd of Scientific Operations
     */
    public static double addition(double firstNum, double secondNum) {
        double sum = firstNum + secondNum;
        return sum;
    }

    public static double subtraction(double firstNum, double secondNum) {
        double sub = firstNum - secondNum;
        return sub;
    }

    public static double multiplicaction(double firstNum, double secondNum) {
        double mult = firstNum * secondNum;
        return mult;
    }

    public static double division(double firstNum, double secondNum) {
        double divi = 0;
        if (secondNum != 0) {
            divi = firstNum / secondNum;
            return divi;
        } else {
            System.out.println("Math Error ");
        }
        return divi;
    }

    public static double absolute(double number) {
        if (number >= 0) {
            System.out.println("| " + number + " | = " + number);
        } else {
            number = number * -1;
            System.out.println("| - " + number + " | = " + number);
        }
        return number;
    }

    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else if (number > 1) {
            return number * factorial(number - 1);
        } else {
            long result = number * factorial(number + 1);
            if (result > 0) {
                return result * -1;
            }
        }
        return number;
    }

    public static double power(double base, double power) {
        boolean cond = true;
        if (power < 0) {
            cond = false;
            power = power * -1;
        }
        double res = 1;
        for (int i = 1; i <= power; i++) {
            res = res * base;
        }
        if (cond) {
            System.out.println(base + "^" + power + " = " + res);
        } else {
            res = 1 / res;
            System.out.println(base + "^" + power + " = " + res);
        }
        return res;
    }

    public static int Roots(int number, int root) {
        boolean hasRoot = false;
        for (int j = 1; j < number; j++) {
            int power = 1;
            for (int i = 1; i <= root; i++) {
                power *= j;
            }
            if (power == number) {
                hasRoot = true;
                System.out.println('\u221A' + " " + number + " = " + j);
                return j;
            }
        }
        if (!hasRoot) {
            System.out.println("No " + "(" + root + ")" + " Root For The number  " + number);
        }
        return number;
    }

    public static void modul(double firstNum, double secondNum) {
        if (secondNum != 0) {
            double modul = firstNum % secondNum;
            System.out.println(firstNum + " % " + secondNum + " = " + modul);
        } else {
            System.out.println("Math Error");
        }
    }

    public static void isPrime(int number) {
        if (number == 2) {
            System.out.println("is 2 prime? : true");
        }
        if (number == 0 || number == 1) {
            System.out.println("Math Error");
        }
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                System.out.println("is " + number + " prime? : " + prime);
                break;
            } else if (prime == true) {
                System.out.println("is " + number + " prime? : " + prime);
                break;
            }
        }
    }

    /**
     * BackEnd Of Trigonometric operations
     */
    public static double Sine(double theta) {
        while (theta > 180) {
            theta = theta - 360;
        }
        while (-180 > theta) {
            theta = theta + 360;
        }
        double thetaToRadian = (theta * Math.PI) / 180.0;
        double sum = 0.0;
        char Operation = '+';
        for (int i = 1; i < 10; i = i + 2) {
            // Or  Exeponential
            double numerator = 1;
            for (int j = 0; j < i; j++) {
                numerator = numerator * thetaToRadian;
            }
            // Or Factorial
            double denominator = 1;
            for (int j = 1; j <= i; j++) {
                denominator = denominator * j;
            }
            double fraction = numerator / denominator;

            if (Operation == '+') {
                sum = sum + fraction;
                Operation = '-';
            } else if (Operation == '-') {
                sum = sum - fraction;
                Operation = '+';
            }
        }
        return sum;
    }

    public static double Cosine(double theta) {
        while (theta > 180) {
            theta = theta - 360;
        }
        while (-180 > theta) {
            theta = theta + 360;
        }
        double thetaToRadian = (theta * Math.PI) / 180.0;
        double sum2 = 1.0;
        char Operation = '-';
        for (int i = 2; i <= 10; i = i + 2) {
            // Or  Exeponential
            double numerator = 1;
            for (int j = 0; j < i; j++) {
                numerator = numerator * thetaToRadian;
            }
            // Or Factorial
            double denominator = 1;
            for (int j = 1; j <= i; j++) {
                denominator = denominator * j;
            }
            double fraction = numerator / denominator;

            if (Operation == '+') {
                sum2 = sum2 + fraction;
                Operation = '-';
            } else if (Operation == '-') {
                sum2 = sum2 - fraction;
                Operation = '+';
            }
        }
        return sum2;
    }

    public static double Tan(double theta) {
        double s = Sine(theta);
        double c = Cosine(theta);
        double fraction = s / c;
        return fraction;
    }

    public static double Csc(double theta) {
        double Result = 1 / Sine(theta);
        return Result;
    }

    public static double Sec(double theta) {
        double Result = 1 / Cosine(theta);
        return Result;
    }

    public static double Cot(double theta) {
        double Result = 1 / Tan(theta);
        return Result;

    }

    /**
     * BackEnd Of Rational number Operations
     */
    public static String addRational(int numerator1, int denominator1, int numerator2, int denominator2) {
        int nume1 = numerator1 * denominator2;
        int nume2 = numerator2 * denominator1;
        int numeSum = nume1 + nume2;
        int denomProduct = denominator1 * denominator2;
        int minimum = numeSum;
        if (minimum > denomProduct) {
            minimum = denomProduct;
        }
        if (minimum < 0) {
            minimum = minimum * -1;
            for (int i = minimum; i > 1; i--) {
                if (denomProduct % i == 0 && numeSum % i == 0) {
                    numeSum = numeSum / i;
                    denomProduct = denomProduct / i;
                }
            }
        }
        for (int i = minimum; i > 1; i--) {
            if (denomProduct % i == 0 && numeSum % i == 0) {
                numeSum = numeSum / i;
                denomProduct = denomProduct / i;
            }
        }
        System.out.println(numerator1 + " / " + denominator1 + " + " + numerator2 + " / " + denominator2 + " = " + numeSum + " / " + denomProduct);
        return " = " + numeSum + " / " + denomProduct;
    }

    public static String subRational(int numerator1, int denominator1, int numerator2, int denominator2) {
        int nume1 = numerator1 * denominator2;
        int nume2 = numerator2 * denominator1;
        int numeSum = nume1 - nume2;
        int denomProduct = denominator1 * denominator2;
        int minimum = numeSum;
        if (minimum > denomProduct) {
            minimum = denomProduct;
        }
        if (minimum < 0) {
            minimum = minimum * -1;
            for (int i = minimum; i > 1; i--) {
                if (denomProduct % i == 0 && numeSum % i == 0) {
                    numeSum = numeSum / i;
                    denomProduct = denomProduct / i;
                }
            }
        }
        for (int i = minimum; i > 1; i--) {
            if (denomProduct % i == 0 && numeSum % i == 0) {
                numeSum = numeSum / i;
                denomProduct = denomProduct / i;
            }
        }
        System.out.println(numerator1 + " / " + denominator1 + " - " + numerator2 + " / " + denominator2 + " = " + numeSum + " / " + denomProduct);
        return " = " + numeSum + " / " + denomProduct;
    }

    public static String multiRational(int numerator1, int denominator1, int numerator2, int denominator2) {
        int numeResult = numerator1 * numerator2;
        int denomResult = denominator1 * denominator2;
        int minimum = numeResult;
        if (minimum > denomResult) {
            minimum = denomResult;
        }
        if (minimum < 0) {
            minimum = minimum * -1;
            for (int i = minimum; i > 1; i--) {
                if (denomResult % i == 0 && numeResult % i == 0) {
                    numeResult = numeResult / i;
                    denomResult = denomResult / i;
                }
            }
        }
        for (int i = minimum; i > 1; i--) {
            if (denomResult % i == 0 && numeResult % i == 0) {
                numeResult = numeResult / i;
                denomResult = denomResult / i;
            }
        }
        System.out.println(numerator1 + " / " + denominator1 + " * " + numerator2 + " / " + denominator2 + " = " + numeResult + " / " + denomResult);
        return " = " + numeResult + " / " + denomResult;
    }

    public static String divisionRational(int numerator1, int denominator1, int numerator2, int denominator2) {
        int numeResult = numerator1 * denominator2;
        int denomResult = numerator2 * denominator1;
        int minimum = numeResult;
        if (minimum > denomResult) {
            minimum = denomResult;
        }
        if (minimum < 0) {
            minimum = minimum * -1;
            for (int i = minimum; i > 1; i--) {
                if (denomResult % i == 0 && numeResult % i == 0) {
                    numeResult = numeResult / i;
                    denomResult = denomResult / i;
                }
            }
        }

        for (int i = minimum; i > 1; i--) {
            if (denomResult % i == 0 && numeResult % i == 0) {
                numeResult = numeResult / i;
                denomResult = denomResult / i;
            }
        }
        System.out.println(numerator1 + " / " + denominator1 + " ÷ " + numerator2 + " / " + denominator2 + " = " + numeResult + " / " + denomResult);
        return " = " + numeResult + " / " + denomResult;
    }

    /**
     * Leaving Decision
     */
    public static void exitOrContinue() {
        System.out.println("");
        System.out.println("[B]  Back \n[E]  Exit");
        Scanner input = new Scanner(System.in);
        int Operand = (int) input.next().charAt(0);
        switch (Operand) {
            case 'b':
            case 'B': {
                choosingMode();
                break;
            }
            case 'e':
            case 'E':
                System.out.println("are You Sure You Want To Leave ? ");
                leaveDecision();
                break;
            default: {
                System.out.println("Enter a Correct Answer !");
                exitOrContinue();
                break;
            }
        }
    }

    public static void leaveDecision() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("[y] Yes     \n[n] No");
        int decision = (int) input.next().charAt(0);
        switch (decision) {
            case 'y':
            case 'Y':
                showEndMessage();
                break;
            case 'n':
            case 'N':
                System.out.println("Choose a Mode : ");
                choosingMode();
                break;
            default:
                System.out.println("Enter a Correct Answer !");
                leaveDecision();
                break;
        }
    }
}
