public class Fruit {
    private TypeOfFruit type;
    private int shelfLife;
    private String date;
    private int price;

    public Fruit(TypeOfFruit type,String date, int shelfLife, int price) {
        this.type = type;
        this.date = date;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public TypeOfFruit getType() {
        return type;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }
}
