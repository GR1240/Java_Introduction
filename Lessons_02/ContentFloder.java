// 📌 Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// 📌 Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ContentFloder {

    private static Logger logger = Logger.getLogger(ContentFloder.class.getName());

    public static void main(String[] args) {
        setLogger();

        String[] content = getContentFolder(".");
        writeToFile(content, ".");
    }

    public static String[] getContentFolder(String dir) {
        File folder = new File(dir);
        return folder.list();
    }

    public static void writeToFile(String[] contens, String fileName) {

        try (FileWriter fw = new FileWriter(fileName)) {
            for (String str : contens) {
                fw.write(str);
                fw.write(System.lineSeparator());
            }

        } catch (Exception e) {

            logger.warning("Ошибка записи в файл!");
        }

    }

    public static void setLogger() {
        try {
            FileHandler fileHandler = new FileHandler("loging.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter sf = new SimpleFormatter();
            fileHandler.setFormatter(sf);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}