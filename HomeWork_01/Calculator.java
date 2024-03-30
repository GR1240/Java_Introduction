// Реализуйте простой калькулятор
// В методе calculate класса Calculator реализовать калькулятор, 
// который будет выполнять математические операции (+, -, *, /) над двумя целыми числами 
// и возвращать результат вещественного типа.

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос первого числа
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        // Запрос оператора
        System.out.print("Введите оператор (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        // Запрос второго числа
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        double result = calculate(a, op, b);
        System.out.println("Результат: " + result);

        scanner.close();
    }

    public static double calculate(int a, char op, int b) {
        double result = 0.0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = (double) a / b;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                }
                break;
            default:
                System.out.println("Некорректный оператор: '" + op + "'");
        }
        return result;
    }
}
