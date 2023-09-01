import java.util.List;

public class Magazineview {
    public static Toy newToy( String nameFull, int chance, int quantity){ // добавление новой игрушки
        return new Toy(nameFull, chance, quantity);
    }

    public void setQuantity(){ // изменение количества

    }

    public void setChance(){ // изменение шанса

    }

    public void printAll(){ // вывести на экран все игрушки

    }

    public void initToy(List<Toy> toyList){
        
        toyList.add(new Toy("Медвеженок", 20,5));
        toyList.add(new Toy("Робот", 30,5));
        toyList.add(new Toy("Кукла", 50,5));
      //  System.out.println(toyList);
    }
}
