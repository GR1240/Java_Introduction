// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.

// Пример
// n = 4 -> 10

// n = 5 -> 15

public class Answer {
        public static void main(String[] args) {
        // Примеры использования метода
        int n1 = 4;
        int n2 = 5;
        
        System.out.println("n = " + n1 + " -> " + countNTriangle(n1));
        System.out.println("n = " + n2 + " -> " + countNTriangle(n2));
    }
    
    public static int countNTriangle(int n) {
        if (n < 1) {
            return -1; // Возвращаем -1, если n < 1
        }
        // Используем формулу для вычисления треугольного числа
        return n * (n + 1) / 2;
    }
}
