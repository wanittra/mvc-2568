package Controller;

import Model.*;

import java.util.*;

public class HeroSuitController {

    // Validate Suit ID and manage repair process
    public String validateSuitId(String suitId) {
        HeroSuit suit = DatabaseConnection.getHeroSuitById(suitId);

        // ตรวจสอบความถูกต้องของรูปแบบรหัส
        if (suitId.length() != 6 || suitId.startsWith("0")) {
            return "Error: Hero Suit ID must be exactly 6 digits and cannot start with '0'";
        }

        // ตรวจสอบว่าพบรหัสในฐานข้อมูลหรือไม่
        if (suit == null) {
            return "Hero Suit Not Found: " + suitId;
        }

        // Check special conditions for IdentitySuit
        if (suit instanceof IdentitySuit && !suit.isValid()) {
            return "IdentitySuit Error: Hero Suit from the database cannot end with 3 or 7";
        }

        // ตรวจสอบความถูกต้องทั่วไปของชุดฮีโร่
        if (!suit.isValid()) {
            return "Hero Suit Found but Invalid: " + suit.toString();
        }

        // ซ่อมแซมชุดฮีโร่ถ้าผ่านการตรวจสอบ
        String repairMessage = DataRepair.repairSuit(suit);
        return "Hero Suit Found and Valid: " + repairMessage;
    }

    // Get list of repaired suits
    public List<HeroSuit> getRepairedSuits() {
        return DataRepair.getRepairedSuits();
    }

    // Reset repaired data when needed
    public void resetData() {
        DataRepair.resetData();
    }
}
