/* 
* Задание №1
* Написать программу, которая запросит пользователя ввести
* <Имя> в консоли.
* Получит введенную строку и выведет в консоль сообщение
* “Привет, <Имя>!” 
*/


import java.util.Scanner;

public class HelloName {
public static void main(String[] args) {
System.out.println("Представьтесь, пожалуйста: ");

Scanner scanner = new Scanner(System.in, "ibm866");
String name = scanner.nextLine();

System.out.println("Привет, " + name + "!");
System.out.printf("Привет, %s!", name);

scanner.close();
}
}