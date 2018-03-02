import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        Tradeshop tradeshop = new Tradeshop(fruits);
        System.out.println("");
        fruits.add(new Fruit(TypeOfFruit.Apple,"2",3,2));
        tradeshop.save("files/delivery.txt");

        fruits.add(new Fruit(TypeOfFruit.Apple, "20/02/2018", 30, 58));
        fruits.add(new Fruit(TypeOfFruit.Lemon, "20/02/2018", 40, 60));
        fruits.add(new Fruit(TypeOfFruit.Pear, "20/02/2018", 20, 100));
        fruits.add(new Fruit(TypeOfFruit.Apricot, "20/02/2018", 20, 120));
        tradeshop.save("files/delivery2.txt");

        fruits.add(new Fruit(TypeOfFruit.Banana, "21/02/2018", 10, 22));
        fruits.add(new Fruit(TypeOfFruit.Strawberry, "21/02/2018", 20, 70));
        fruits.add(new Fruit(TypeOfFruit.Cherry, "21/02/2018", 25, 55));
        fruits.add(new Fruit(TypeOfFruit.Grapes, "21/02/2018", 40, 40));
        tradeshop.save("files/delivery3.txt");

        fruits.add(new Fruit(TypeOfFruit.Kiwi, "19/02/2018", 15, 60));
        fruits.add(new Fruit(TypeOfFruit.Orange, "19/02/2018", 50, 35));
        tradeshop.save("files/delivery5.txt");
        tradeshop.save("files/delivery6.txt");


    }
}
