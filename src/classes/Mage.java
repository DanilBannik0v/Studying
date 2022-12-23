package classes;

import java.lang.reflect.Type;

public class Mage {
    private String name, type;
    private int level, damage;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        String result = this.name + " ," + this.level + " ," + this.damage + " ," + this.type;
        return result;
    }

    public String fight(Mage mage) {
        if (this.type == "Fire" & mage.type == "Ice") return this.name + " won!";
        else if (this.type.equals("Fire") & mage.type == "Earth") return mage.name + " won!";
        else if (this.type.equals("Ice") & mage.type == "Earth") return this.name + " won!";
        else if (this.type.equals("Ice") & mage.type == "Fire") return mage.name + " won!";
        else if (this.type.equals("Earth") & mage.type == "Fire") return this.name + " won!";
        else if (this.type.equals("Earth") & mage.type == "Ice") return mage.name + " won!";
        else {
            if (this.level > mage.level) return this.name;
            else if (this.level < mage.level) return mage.name;
            else {
                if (this.damage > mage.damage) return this.name;
                else if (this.damage < mage.damage) return mage.name;
                else return "draw";
            }
        }
    }
}