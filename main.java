import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        
        MagazineModel model = new MagazineModel();
        Magazineview view = new Magazineview();
        UserInput input = new UserInput();
        MagazinePresenter presenter = new MagazinePresenter(model, view, input);

        presenter.magStart();

    }
}