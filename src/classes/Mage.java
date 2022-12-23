package classes;

public class Mage {
    private String name, type;
    private int level, damage;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }
    public void changeType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return this.name + " ," + this.level + " ," + this.damage + " ," + this.type;
    }

    public String fight(Mage mage) {
        if (this.type.equals("Fire") & mage.type.equals("Ice")) return this.name + " won!";
        else if (this.type.equals("Fire") & mage.type.equals("Earth")) return mage.name + " won!";
        else if (this.type.equals("Ice") & mage.type.equals("Earth")) return this.name + " won!";
        else if (this.type.equals("Ice") & mage.type.equals("Fire")) return mage.name + " won!";
        else if (this.type.equals("Earth") & mage.type.equals("Fire")) return this.name + " won!";
        else if (this.type.equals("Earth") & mage.type.equals("Ice")) return mage.name + " won!";
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