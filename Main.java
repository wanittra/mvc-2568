import View.*;
import Controller.*;

public class Main {
    public static void main(String[] args) {
        HeroSuitController controller = new HeroSuitController();
        HeroSuitView view = new HeroSuitView(controller);
        view.setVisible(true);
    }
}





