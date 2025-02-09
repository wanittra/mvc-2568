package Model;

public class IdentitySuit extends HeroSuit {
    public IdentitySuit(String id, String name, int durability) {
        super(id, name, durability);
    }

    //ชุดปกปิดตัวตน ความทนทานห้ามลงท้ายด้วยเลข 3 หรือ 7 
    @Override
    public boolean isValid() {
        int lastDigit = getDurability() % 10;
        return lastDigit != 3 && lastDigit != 7;
    }
}







