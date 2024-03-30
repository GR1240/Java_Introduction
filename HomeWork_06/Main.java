import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();
        // Создаем несколько ноутбуков и добавляем их в магазин
        store.addLaptop(new Laptop("ModelA", 8, 512, "Windows 10", "Black"));
        store.addLaptop(new Laptop("ModelB", 16, 1024, "Linux", "Silver"));
        store.addLaptop(new Laptop("ModelC", 4, 256, "FreeDOS", "Red"));
        store.addLaptop(new Laptop("ModelD", 8, 512, "MacOS", "White"));
        store.addLaptop(new Laptop("ModelE", 16, 1024, "Windows 11", "Gray"));
        store.addLaptop(new Laptop("ModelF", 8, 1024, "Windows 10", "Blue"));
        store.addLaptop(new Laptop("ModelG", 32, 2048, "Windows 11", "Silver"));
        store.addLaptop(new Laptop("ModelH", 4, 512, "FreeDOS", "Green"));
        store.addLaptop(new Laptop("ModelI", 16, 2048, "Linux", "Black"));
        store.addLaptop(new Laptop("ModelJ", 8, 512, "MacOS", "Silver"));

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        System.out.println("Введите критерии фильтрации:");
        System.out.println("1 - ОЗУ (RAM)");
        System.out.println("2 - Объем ЖД (HDD)");
        System.out.println("3 - Операционная система (OS)");
        System.out.println("4 - Цвет");

        System.out.print("Введите номер критерия: ");

        int criterion = scanner.nextInt();

        switch (criterion) {
            case 1:
                System.out.print("Введите минимальный объем ОЗУ: ");
                int ram = scanner.nextInt();
                filters.put("ram", ram);
                break;
            case 2:
                System.out.print("Введите минимальный объем ЖД: ");
                int hdd = scanner.nextInt();
                filters.put("hdd", hdd);
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                scanner.nextLine();
                String os = scanner.nextLine();
                filters.put("os", os);
                break;
            case 4:
                System.out.print("Введите цвет: ");
                scanner.nextLine();
                String color = scanner.nextLine();
                filters.put("color", color);
                break;
            default:
                System.out.println("Некорректный номер критерия");
                return;
        }

        // Фильтрация и вывод результатов
        store.filterLaptops(filters);
    }
}
