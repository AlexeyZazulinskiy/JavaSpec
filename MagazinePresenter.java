import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MagazinePresenter {

    private static MagazineModel model;
    private static Magazineview view;
    private static UserInput input;

    public MagazinePresenter(MagazineModel model, Magazineview view, UserInput input) {
        this.model = model;
        this.view = view;
        this.input = input;
    }

    public static void magStart() throws IOException {     // главное меню
        List<Toy> toyList = new ArrayList<Toy>();
        Queue<Toy> toyWinList = new LinkedList<>();
        int i = -1;

        while (i < 0) {
            String c = input.getString("Выберите действие: add, readall, choice, getlist, gettoy, exit");

            switch (c) {
                case "add":
                    view.initToy(toyList); // Доавить игрушку
                    break;
                case "read": // вывести все игрушки в консоль
                    view.printAll(toyList);
                    break;
                case "choice": // выбрать игрушку для изменения
                    view.choiceToy(toyList);
                    break;

                case "getlist": // розыгрыш (создание списка)
                    model.getWinList(toyList, toyWinList);
                    break;

                case "gettoy": // выдача игрушки (запись в фаил)
                    for (i = 0; i<10;i++){
                    model.receiveWinToy(toyWinList);
                }
                    break;

                case "exit":
                    i = 1;
                    break;

                default:
                    System.out.println("Error input");
                    break;

            }

        }
    }

}
