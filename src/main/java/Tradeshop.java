import com.alibaba.fastjson.JSON;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Tradeshop implements Shop {


    public Tradeshop(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    private ArrayList<Fruit> fruits;



    public void save(String pathToJsonFile) throws IOException {
        FileWriter writer = new FileWriter(pathToJsonFile);
        writer.write(JSON.toJSONString(fruits));
        writer.flush();
        writer.close();
        fruits.clear();

    }

    public void addFruits(String pathToJsonFile) throws IOException {
    ArrayList<Fruit> fruitArrayList = JSON.parseObject(pathToJsonFile,ArrayList.class);
        System.out.println(fruitArrayList);
    }


    public void load(String pathToJsonFile) throws FileNotFoundException {

    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

}


