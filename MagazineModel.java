import java.util.List;
import java.util.Random;

public class MagazineModel {
    public void getRandom(List<Toy> listToy){ // возвращает рандомную ирушку с учетом шанса
        int[] c = new int [listToy.size()];        
        int max = 0;
        int imax = 0; 
        for (int i = 0; i < listToy.size(); i++){
            double j = Math.random () * listToy.get(i).getChance();
            c [i] = (int) j;
        }
        for (int i = 0; i < c.length; i++){
            if (max < c[i]){
                max = c[i];
                imax = i;
            }
        }
        
    listToy.get(imax).setQuantity(listToy.get(imax).getQuantity() -1);
System.out.println(listToy.get(imax).getQuantity());
    }

    public static Toy[] getWinList(){  // возвращает список разыгрываемых игрушек
        Toy[] toyList = new Toy[]{};
        return toyList;
    }
}
