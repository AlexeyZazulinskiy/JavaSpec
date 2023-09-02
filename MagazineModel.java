import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Queue;


public class MagazineModel {
    public static Toy getRandom(List<Toy> listToy) { // возвращает рандомную ирушку с учетом шанса
        int[] c = new int[listToy.size()];
        int max = 0;
        int imax = 0;
        for (int i = 0; i < listToy.size(); i++) { // умножаем рандомное число на шанс выпадения каждой игрушки и записываем в массив
            double j = Math.random() * listToy.get(i).getChance();
            c[i] = (int) j;
        }
        for (int i = 0; i < c.length; i++) {    // выбераем в массиве самое большое число
            if (max < c[i]) {
                max = c[i];
                imax = i;
            }
        }
        listToy.get(imax).setQuantity(listToy.get(imax).getQuantity() - 1);  
        Toy t = listToy.get(imax);
        if (listToy.get(imax).getQuantity() == 0) {
            listToy.remove(imax);
        }
        return t;
    }

    public static Queue getWinList(List<Toy> toyList, Queue<Toy> toyWinList) { // возвращает список разыгрываемых
                                                                               // игрушек
        int n = UserInput.getInt("Введите количество разыгрываемых игрушек: ");
        for (int i = 0; i < n; i++) {
            toyWinList.add(getRandom(toyList));
        }
        System.out.println(toyList);
        return toyWinList;

    }

    public static void receiveWinToy(Queue<Toy> toyWinList) throws IOException { // записывает в фаил первую игрушку в списке

        FileWriter prizeWriter = new FileWriter("prize.txt", true);    
        String st = toyWinList.remove().getName().toString() + "\n";
        try {
            prizeWriter.write(st);
            System.out.println(st);
            prizeWriter.close();     
        } catch (SecurityException e) {
            System.out.println("secEx");
        } catch (IOException e) {
            System.out.println("IOex");

        }

    }
}
