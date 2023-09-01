import java.util.ArrayList;
import java.util.List;

public class MagazinePresenter {

    private static MagazineModel model;
    private static Magazineview view;

    public MagazinePresenter(MagazineModel model, Magazineview view) {
        this.model = model;
        this.view = view;
    }

    public static void magStart(){
        List<Toy> toyList = new ArrayList<Toy>();
        view.initToy(toyList);
        System.out.println(toyList);
        model.getRandom(toyList);
    }

}
