package Model;

import java.util.ArrayList;
import java.util.List;

public class DataRepair {
    private static List<HeroSuit> repairedSuits = new ArrayList<>();

    public static String repairSuit(HeroSuit suit) {
        int originalDurability = suit.getDurability();

        // ตรวจสอบว่าค่าความทนทานน้อยกว่า 100 หรือไม่
        if (suit.getDurability() < 100) {
            int repairedDurability = Math.min(originalDurability + 25, 100);

            // อัปเดตค่าความทนทานของชุดฮีโร่
            suit.setDurability(repairedDurability);
            repairedSuits.add(suit);

            return "Original Durability: " + originalDurability + "\n" +
                    " + 25 Durability Applied\n" +
                    ", Repaired Durability: " +
                    "Hero Suit Repaired: " + suit;
        } else {

            // ถ้าความทนทานเต็มอยู่แล้ว แสดงข้อความว่าชุดฮีโร่ไม่ต้องซ่อม
            return "Hero Suit Durability is already at maximum: " + suit;
        }
    }

    // เมธอดเพื่อดึงข้อมูลชุดฮีโร่ที่ซ่อมแซมแล้วทั้งหมด
    public static List<HeroSuit> getRepairedSuits() {
        return repairedSuits;
    }

    // เมธอดสำหรับรีเซ็ตข้อมูลการซ่อมแซมทั้งหมด
    public static void resetData() {
        repairedSuits.clear();
    }
}
