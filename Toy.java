abstract class MagazineItem {
    MagazineItem() {
    }

    public void setChance() {
    }

    public int getChance() {
        return 0;
    }

    public void setQuantity() {
    }

    public int getQuantity() {
        return 0;
    }
}

public class Toy extends MagazineItem {     // добавить хэш для id
    int id;
    String name;
    int chance;
    int quantity;
    static int toyCount = 0;
    static int idCount = 0;

    public Toy(String name, int chance, int quantity) {
        this.id = idCount;
        idCount++;
        this.name = name;
        this.chance = chance;
        this.quantity = quantity;
        toyCount++;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getChance() {
        return chance;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getToyCount() {
        return toyCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id - " + id + " name - " + name + " chance - " + chance + " quantity - " + quantity;
    }
}
