// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

package Lessons_04;

import java.util.LinkedList;
import java.util.Scanner;

public class TextNum {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку ввида text~num для добавление в список ");
            System.out.println(" print~num для вывода и удаления строки ");
            System.out.println("quit для выхода из программы ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputSplit = input.split("~");
            String text = inputSplit[0];
            int num = Integer.parseInt(inputSplit[1]);
            if (text.equals("print")) {
                if (num >= 0 && num < linkedList.size()) {
                    System.out.println(linkedList.remove(num));
                } else {
                    System.out.println("Введдена некорректная позиция!");
                }
                System.out.println(linkedList);
            } else {
                if (num >= 0 && num <= linkedList.size()) {
                    linkedList.add(num, text);
                } else {
                    System.out.println("Введдена некорректная позиция!");
                }
                System.out.println(linkedList);
            }
        }
    }
}