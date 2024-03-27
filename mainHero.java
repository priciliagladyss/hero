package tugashero;
import java.util.Scanner;

public class mainHero {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        
        System.out.println("Permainan adu hero");
        System.out.println("Player 1 : Silahkan masukkan hero Anda!" +"\nUntuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("=================================");
        System.out.print("Nama Hero       : " );
        String nama1 = scn.nextLine();
        System.out.print("Health Point    : ");
        double health1 = scn.nextDouble();
        System.out.print("Attack          : ");
        double attack1 = scn.nextDouble();
        System.out.print("Defense         : ");
        double defense1 = scn.nextDouble();
        scn.nextLine();
        System.out.println("");

        System.out.println("Permainan adu hero");
        System.out.println("Player 2 : Silahkan masukkan hero Anda!" +"\nUntuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("=================================");
        System.out.print("Nama Hero       : " );
        String nama2 = scn.nextLine();
        System.out.print("Health Point    : ");
        double health2 = scn.nextDouble();
        System.out.print("Attack          : ");
        double attack2 = scn.nextDouble();
        System.out.print("Defense         : ");
        double defense2 = scn.nextDouble();
        scn.nextLine();
    
        System.out.println("=================================");
        System.out.println("=================================");

        Hero hero1 = new Hero(nama1, health1, attack1, defense1);
        Hero hero2 = new Hero(nama2, health2, attack2, defense2);
        
        for (int i = 1; ;i++){
            System.out.println("Ronde " + i);
            hero1.attack(hero2);
            System.out.println(hero1.getName() + " menyerang " + hero2.getName());
            System.out.println("");
            System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAttack());
            System.out.println(hero2.getName() + " memiliki pertahanan sebesar " + hero2.getDefense());
            System.out.println("Health " + hero2.getName() + " saat ini " + hero2.getHp());
            System.out.println("");

            if (hero2.getHp() <= 0) {
                System.out.println("Pertarungan telah usai!");
                System.out.println(hero2.getName() + " telah kalah!");
                break;
            }

            hero2.attack(hero1);
            System.out.println(hero2.getName() + " menyerang " + hero1.getName());
            System.out.println("");
            System.out.println(hero2.getName() + " menyerang sebesar " + hero2.getAttack());
            System.out.println(hero1.getName() + " memiliki pertahanan sebesar " + hero1.getDefense());
            System.out.println("Health " + hero1.getName() + " saat ini " + hero1.getHp());
            System.out.println("");

            if (hero1.getHp() <= 0) {
                System.out.println("Pertarungan telah usai!");
                System.out.println(hero1.getName() + " telah kalah!");
                break;
            }
            scn.close();
        }


}
}
