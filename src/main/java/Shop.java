import java.io.FileNotFoundException;
import java.io.IOException;

public interface Shop {

    void addFruits(String pathToJsonFile) throws IOException;
    /*метод принимает путь к файлу
     внутри которого находится json с фруктами и датой поставки*/

    void save(String pathToJsonFile) throws IOException;
    /*  метод который сохранит всю информацию
     со склада лавки в json файл.*/

    void load(String pathToJsonFile) throws FileNotFoundException;
    /* метод который удаляют текущую информацию из коллекции
     и загружает новую из сохраненной версии*/
}
