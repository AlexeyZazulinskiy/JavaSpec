import java.util.List;
import java.util.Scanner;

public class Magazineview {
    public static Toy newToy(String nameFull, int chance, int quantity) { // добавление новой игрушки
        return new Toy(nameFull, chance, quantity);

    }

    public void choiceToy(List toyList) { // меню выбора конкретной игрушки для изменения
        printAll(toyList);
        int c = UserInput.getInt("Выберите номер: ");
        editToy((Toy) toyList.get(c));
    }

    public void editToy(Toy toy) { // меню изменения параметров игрушки
        int i = -1;
        System.out.println(toy);
        while (i < 0) {
            String c = UserInput.getString(
                    "Выберите действие:\n Изменить количество - setq \n Изменить шанс - setc \n exit - exit");
            switch (c) {
                case "setq":
                    setQuantity(toy);
                    break;

                case "setc":
                    setChance(toy);
                    break;

                case "exit":
                    i = 1;
                    break;

                default:
                    System.out.println("error input");
                    break;
            }
        }
    }

    public void setQuantity(Toy t) { // изменение количества
        int n = UserInput.getInt("Введите количество:");
        t.setQuantity(n);
    }

    public void setChance(Toy t) { // изменение шанса
        int n = UserInput.getInt("Введите шанс:");
        t.setChance(n);
    }

    public void printAll(List<Toy> toyList) { // вывести на экран все игрушки
        System.out.println("number, id, name, chance, quantity");
        int count = 0;
        for (Toy a : toyList) {
            System.out.println("N_" + count + " " + a);
            count++;
        }
    }

    public void initToy(List<Toy> toyList) { // заполнение магазина игрушками

       // String name = UserInput.getString("Введите наименование");
       // int qt = UserInput.getInt("Введите количество");
       // int ch = UserInput.getInt("Введите шанс");
       // toyList.add(newToy(name, ch, qt));

        
          // для отладки
          toyList.add(newToy("Медвеженок", 20, 105));
          toyList.add(newToy("Робот", 20, 105));
          toyList.add(newToy("Кукла", 30, 105));
          System.out.println(toyList);
         
    }
}

class UserInput {

    public static String getString(String n) { // получение строки от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print(n);
        String s = scanner.next();
        return s;
    }

    public static int getInt(String s) { // получение числа от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print(s);
        int i;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        } else {
            System.out.print("Ошибка, ");
            scanner.next();
            i = getInt(s);
        }
        return i;
    }
}