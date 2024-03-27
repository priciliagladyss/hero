package tugashero;

public class Hero {
    private String name;
    private double hp;
    private double attack;
    private double defense; 

    public Hero() {
    }

    public Hero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double attack(Hero enemy) {
        double damage = this.attack - enemy.getDefense();
        if (damage < 0) {
            damage = 0;
        }
        enemy.setHp(enemy.getHp() - damage);
        return damage;
    }
    
    

}
