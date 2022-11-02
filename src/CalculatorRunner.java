import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();
        String operation = "";

        if (expression.contains("*")){
            operation = "*";
        } else if (expression.contains("/")){
            operation = "/";
        } else if (expression.contains("+")){
            operation = "+";
        } else if (expression.contains("-")){
            operation = "-";
        } else if (expression.contains("%")) {
            operation = "%";
        } else if (expression.contains("^")) {
            operation = "^";
        } else{
            System.out.println("Please enter an accepted operation.");
            System.exit(0);
        }

        double number1 = Double.parseDouble(expression.substring(0,expression.indexOf(operation)));
        double number2 = Double.parseDouble(expression.substring(expression.indexOf(operation)+1));

        Calculator calc = new Calculator(number1, number2, operation);
        System.out.println("Result: " + calc.result());
    }
}
