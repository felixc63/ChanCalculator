public class Calculator {
    private double number1, number2;
    private String operation;

    public Calculator(double number1, double number2, String operation){
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public double result(){
        if (operation.equals("*")){
            return number1 * number2;
        } else if (operation.equals("/")) {
            return number1/number2;
        } else if (operation.equals("+")){
            return number1 + number2;
        } else if (operation.equals("-")){
            return number1 - number2;
        } else if (operation.equals("%")){
            return number1%number2;
        } else if (operation.equals("^")){
            return Math.pow(number1,number2);
        } else{
            return 0;
        }
    }
}
