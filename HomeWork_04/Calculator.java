// В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
// Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор 
// должен вывести результат предпоследней операции.


public class Calculator {
    private double result;
    private double prevResult;
    private char prevOperator;

    public Calculator() {
        this.result = 0.0;
        this.prevResult = 0.0;
        this.prevOperator = ' ';
    }

    public double calculate(char operator, double num1, double num2) {
        switch (operator) {
            case '+':
                this.result = num1 + num2;
                break;
            case '-':
                this.result = num1 - num2;
                break;
            case '*':
                this.result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    this.result = num1 / num2;
                } else {
                    System.out.println("Division by zero error!");
                    return 0;
                }
                break;
            case '<':
                this.result = this.prevResult;
                operator = this.prevOperator;
                break;
            default:
                System.out.println("Invalid operator!");
                return 0;
        }
        
        if (operator != '<') {
            this.prevResult = this.result;
            this.prevOperator = operator;
        }

        return this.result;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate('+', 3, 7)); // 10.0
        System.out.println(calc.calculate('+', 4, 7)); // 11.0
        System.out.println(calc.calculate('<', 0, 0)); // 10.0
        System.out.println(calc.calculate('*', 3, 2)); // 6.0
        System.out.println(calc.calculate('-', 7, 4)); // 3.0
        System.out.println(calc.calculate('<', 0, 0)); // 6.0
    }
}
