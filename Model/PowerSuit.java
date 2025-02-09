package Model;

public class PowerSuit extends HeroSuit {
    public PowerSuit(String id, String name, int durability) {
        super(id, name, durability);
    }

    //ชุดทรงพลัง ความทนทานห้ามต่ำกว่า 70 
    @Override
    public boolean isValid() {
        return getDurability() >= 70;
    }
}
