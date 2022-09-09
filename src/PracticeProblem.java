import java.util.Scanner;

public class PracticeProblem {
    static int val1;
    static float val2;
    static double val3;
    static long val4;
    static String value;
    public static void main(String[] args) {
        PracticeProblem practiceProblem = new PracticeProblem();
        practiceProblem.displayMessage();
        practiceProblem.defaultValueOfProgram();
        practiceProblem.twoStringEqalOrNot();
        practiceProblem.method(4);
        practiceProblem.leapYearOrNot();
    }
    public void displayMessage(){
        System.out.println("Hello World");
    }
    public void defaultValueOfProgram(){
        System.out.println("print default value :" + val1);
        System.out.println("print default value :" +val2);
        System.out.println("print default value :" +val3);
        System.out.println("print default value :" +val4);
        System.out.println("print default value :" +value);
    }
    public void twoStringEqalOrNot(){
        String str1 = "Aditya";
        String str2 = "Aditya";
        System.out.println(str1.equals(str2));
    }
    public void method(int x){
        System.out.println("x = " +x);
        System.out.println("val1 = " +val1);
    }
    static {
        System.out.println("hello friend");
    }
    public void leapYearOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }else {
            System.out.println("The no is nt more tham 1582");
        }
    }
}
