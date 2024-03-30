// 📌 Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

package Lessons_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooksShopList {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("поэзия", "Бородино", "Руслан и Людмила", "Мцыри"));
        ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("проза", "Война и мир", "Дубровский", "Анна Каренина"));
        ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("документалистика", "Java для чайников", "Python дли cool Pro", "C++ для профессионалов"));
        catalog.addAll(Arrays.asList(genre1, genre2, genre3));
        for (var string : catalog) {
            System.out.println(string);
        }
    }
}