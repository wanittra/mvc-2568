package Model;

public class HeroSuit {
    private String id;
    private String name;
    private int durability;

    public HeroSuit(String id, String name, int durability) {
        this.id = id;
        this.name = name;
        this.durability = durability;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public boolean isValid() {
        return true;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Type: " + name + ", Durability: " + durability;
    }
}
