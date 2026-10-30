import java.util.Random;
import java.util.Scanner;

public class BigMonster extends Monster {
    BigMonster(int sizeBoard) {
        super(sizeBoard);
        setImage(" \uD83D\uDC79 ");
    }
    @Override
    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        Random random = new Random();
        int a = random.nextInt(100 * difficultGame);
        int b = random.nextInt(100 * difficultGame);
        int c = random.nextInt(10 * difficultGame);
        int trueAnswer = a * c + b;

        System.out.println("Реши пример: " + a +" * " + c + " + " + b + " = ?");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        if (trueAnswer == answer) {
            System.out.println("Верно! Ты победил большого монстра");
            return true;
        } else {
            System.out.println("Ты проиграл эту битву!");
            return false;
        }
    }
    }