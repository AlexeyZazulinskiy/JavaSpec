

public class main {
public static void main(String[] args) {
    MagazineModel model = new MagazineModel();
    Magazineview view = new Magazineview();
    MagazinePresenter presenter = new MagazinePresenter(model, view);
    presenter.magStart();

}
}