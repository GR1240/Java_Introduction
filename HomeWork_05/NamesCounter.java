// Разработать программу, которая принимает на вход пять имен пользователей 
// (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, 
// сколько раз каждое имя встречается.
// Программа должна использовать HashMap для хранения имен и их количества вхождений.
// По завершении, программа выводит результат в виде пар "имя - количество".

import java.util.HashMap;
import java.util.Map;

public class NameCounter {
    public static void main(String[] args) {
        Map<String, Integer> nameCount = new HashMap<>();

        // Проверяем, предоставлены ли аргументы командной строки
        if (args.length > 0) {
            // Если предоставлены аргументы, обрабатываем каждое имя
            for (String name : args) {
                // Проверяем, есть ли уже такое имя в карте
                if (nameCount.containsKey(name)) {
                    // Если имя уже есть, увеличиваем счетчик на 1
                    nameCount.put(name, nameCount.get(name) + 1);
                } else {
                    // Если имя новое, добавляем его в карту со счетчиком 1
                    nameCount.put(name, 1);
                }
            }
        } else {
            // Если аргументы не предоставлены, используем имена по умолчанию
            String[] defaultNames = {"Elena", "Elena", "Elena", "Ivan", "Ivan"};
            for (String name : defaultNames) {
                if (nameCount.containsKey(name)) {
                    nameCount.put(name, nameCount.get(name) + 1);
                } else {
                    nameCount.put(name, 1);
                }
            }
        }

        // Выводим результаты подсчета на экран
        System.out.println(nameCount);
    }
}
