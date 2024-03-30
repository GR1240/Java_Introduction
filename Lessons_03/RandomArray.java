// 📌 Заполнить список десятью случайными числами.
// 📌 Отсортировать список методом sort() класса Collections 
// и вывести его на экран.

package Lessons_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomArray {

public static void main(String[] args) {
int size = 10;
List<Integer> list = getListRndNumber(size);
System.out.println(list);

Collections.sort(list);
System.out.println(list);
}

private static List<Integer> getListRndNumber(int size) {
List<Integer> list = new ArrayList<>();
Random rnd = new Random();
for (int i = 0; i < size; i++) {
list.add(rnd.nextInt(100));
}
return list;
}

}