// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// -Создать множество ноутбуков.
// -Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// -Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.*;

public class LaptopStore {
    private Set<Laptop> laptops = new HashSet<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void filterLaptops(Map<String, Object> filters) {
        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            boolean match = true;
            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                switch (key) {
                    case "ram":
                        if (laptop.getRam() < (int) value) {
                            match = false;
                        }
                        break;
                    case "hdd":
                        if (laptop.getHdd() < (int) value) {
                            match = false;
                        }
                        break;
                    case "os":
                        if (!laptop.getOs().equalsIgnoreCase((String) value)) {
                            match = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equalsIgnoreCase((String) value)) {
                            match = false;
                        }
                        break;
                }
            }
            if (match) {
                filteredLaptops.add(laptop);
            }
        }
        if (filteredLaptops.isEmpty()) {
            System.out.println("Нет ноутбуков, удовлетворяющих вашим критериям.");
        } else {
            System.out.println("Найденные ноутбуки:");
            for (Laptop laptop : filteredLaptops) {
                System.out.println(laptop);
            }
        }
    }
}
