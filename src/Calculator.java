public class Calculator {
    int number1;
    int number2;
    int number3;

    public Calculator(int num1, int num2) {
        number1 = num1;
        number2 = num2;
    }

    public Calculator(int num1, int num2, int num3) {
        number1 = num1;
        number2 = num2;
        number3 = num3;
    }

    public void addTwoNumber() {
        System.out.println("Sum of Two number is"+ (number1+number2));
    }

    public void addThreeNumber() {
        System.out.println("Sum of Three number is"+ (number1+number2+number3));

    }
}
