import java.awt.*;
import java.math.BigInteger;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Robot number1 = new Robot("Бензопила",200, 8, 18, 60);
        Robot number2 = new Robot("ТОПОР", 150, 10, 50, 20);
       while (true){
           doMove(number1, number2);
           if (number2.getHp() <= 0){
               System.out.println("Победил Пила у которого осталось " + number1.getHp() + " жизней");
               break;
           }else if (number1.getHp() <=0){
               System.out.println("Победил Топор у которого осталось " + number2.getHp() + " жизней");
               break;
           }
       }
    }

    public static boolean criticalStrikeChance(int criticalStrikeChance) {
        int result = new Random().nextInt(100) + 1;
        if (result <= criticalStrikeChance) {
            return true;
        } else {
            return false;
        }
    }

    public static void doMove(Robot firstRobot, Robot secondRobot) {
        BodyPart attacked = firstRobot.attack();
        BodyPart defenced2 = secondRobot.defence();
        BodyPart attacked2 = secondRobot.attack();
        BodyPart defenced = firstRobot.defence();
        int hp1 = firstRobot.getHp();
        int hp2 = secondRobot.getHp();
        int damage1 = 0;
        int damage2 = 0;
        if (!attacked.equals(defenced2)) {
            if (criticalStrikeChance(firstRobot.getCriticalStrikeChance())) {
                damage1 = firstRobot.getCriticalStrike();
            } else {
                damage1 = firstRobot.getDamage();
            }
            hp2 = hp2 - damage1;
            secondRobot.setHp(hp2);
        }
        System.out.print(String.format("%s Атакует робота %s,   Атакована %s,   Защищена %s,    ПИЛА-Здоровье %s,    ТОПОР-Здоровье %s,",
                firstRobot.getName(), secondRobot.getName(), attacked, defenced2, firstRobot.getHp(), secondRobot.getHp()));
        if (damage1 == firstRobot.getCriticalStrike()) {
            System.out.println("    Выпал КРИИИТ на " + damage1);
        } else if (damage1 == 0) {
            System.out.println("    БЛОКИРОВАН");
        } else {
            System.out.println("    Прошел урон " + damage1);
        }
        if (!attacked2.equals(defenced)) {
            if (criticalStrikeChance(secondRobot.getCriticalStrikeChance())) {
                damage2 = secondRobot.getCriticalStrike();
            } else {
                damage2 = secondRobot.getDamage();
            }
            hp1 = hp1 - damage2;
            firstRobot.setHp(hp1);
        }
        System.out.print(String.format("%s Атакует робота %s,   Атакована %s,   Защищена %s,    ПИЛА-Здоровье %s,    ТОПОР-Здоровье %s,",
                secondRobot.getName(), firstRobot.getName(), attacked2, defenced, firstRobot.getHp(), secondRobot.getHp()));
        if (damage2 == secondRobot.getCriticalStrike()) {
            System.out.println("    Выпал КРИИТ на " + damage2);
        } else if (damage2 == 0) {
            System.out.println("    БЛОКИРОВАН ");
        } else {
            System.out.println("    Прошел урон " + damage2);
        }


    }


}
