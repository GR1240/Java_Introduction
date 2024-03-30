// Напишите программу, представляющую телефонную книгу. 
// Программа должна иметь следующие функции:
// add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
// Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
// Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
// find(String name): Поиск номеров телефона по имени в телефонной книге.
// Если запись с именем name существует, возвращает список номеров телефона для этой записи.
// Если запись с именем name не существует, возвращает пустой список.
// getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Integer>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, Integer phoneNum) {
        List<Integer> phoneNumbers = this.phoneBook.getOrDefault(name, new LinkedList<>());
        phoneNumbers.add(phoneNum);
        this.phoneBook.put(name, phoneNumbers);
    }

    public List<Integer> find(String name) {
        return this.phoneBook.getOrDefault(name, new LinkedList<>());
    }

    public Map<String, List<Integer>> getPhoneBook() {
        return this.phoneBook;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", 123456);
        phoneBook.add("Alice", 789012);
        phoneBook.add("Bob", 789012);

        System.out.println("find(\"Alice\"): " + phoneBook.find("Alice")); // [123456, 789012]
        System.out.println("getPhoneBook(): " + phoneBook.getPhoneBook()); // {Bob=[789012], Alice=[123456, 789012]}
        System.out.println("find(\"Me\"): " + phoneBook.find("Me")); // []
    }
}
