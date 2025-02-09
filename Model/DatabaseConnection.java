package Model;

import java.io.*;
import java.util.*;

public class DatabaseConnection {
    private static List<HeroSuit> heroSuits = new ArrayList<>();

    static {
        loadDatabase();
    }

    private static void loadDatabase() {
        String filePath = "database.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // ข้ามบรรทัดแรก (Header)
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 3) {
                    String id = values[0].trim();
                    String type = values[1].trim();
                    int durability = Integer.parseInt(values[2].trim());

                    HeroSuit suit;
                    switch (type) {
                        case "Power Suit":
                            suit = new PowerSuit(id,type, durability);
                            break;
                        case "Stealth Suit":
                            suit = new StealthSuit(id,type, durability);
                            break;
                        case "Identity Suit":
                            suit = new IdentitySuit(id,type, durability);
                            break;
                        default:
                            continue; // ข้ามข้อมูลที่ไม่ถูกต้อง
                    }
                    heroSuits.add(suit);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error parsing durability. Check if your CSV format is correct.");
            e.printStackTrace();
        }
    }
    public static HeroSuit getHeroSuitById(String id) {
        for (HeroSuit suit : heroSuits) {
            if (suit.getId().equals(id)) {
                return suit;
            }
        }
        return null; // ถ้าไม่พบข้อมูล
    }

    public static List<HeroSuit> getHeroSuits() {
        return heroSuits;
    }

    
}













