import java.util.Random;
import java.util.Scanner;

public class SmartMonster extends Monster {
    SmartMonster(int sizeBoard) {
        super(sizeBoard);
        setImage(" 🐉 ");
    }
    @Override
    public boolean taskMonster(int difficultGame) {
        Random random = new Random();
        System.out.println("🐉: Найди один из корней этого уравнения, и я пропущу тебя дальше.");
        int Dsqrt = random.nextInt(100);
        if (Dsqrt % 2 == 1) Dsqrt ++;
        int D = Dsqrt * Dsqrt;
        int b = random.nextInt(50); if (b % 2 == 1) b ++;
        int c = (b * b - D) / 4;
        int trueAns1 = (-b - Dsqrt) / 2;
        int trueAns2 = (-b + Dsqrt) / 2;
        if (c >= 0)
            System.out.println("x^2 + " + b + "x + " + c);
        else
            System.out.println("x^2 + " + b + "x " + c);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        if (trueAns1 == answer || trueAns2 == answer) {
            System.out.println("Дракон оценил твои умственные способности и пропустил дальше.");
            return true;
        } else {
            System.out.println("Дракон поджарил тебя!");
            return false;
        }
    }
}
