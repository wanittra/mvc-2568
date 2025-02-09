package Model;

public class StealthSuit extends HeroSuit {
    public StealthSuit(String id, String name, int durability) {
        super(id, name, durability);
    }

    //ชุดลอบเร้น ความทนทานห้ามต่ำกว่า 50
    @Override
    public boolean isValid() {
        return getDurability() >= 50;
    }
}







