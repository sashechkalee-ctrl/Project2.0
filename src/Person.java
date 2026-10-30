import java.util.Random;

public class Person{
    Person(int sizeBoard) {
        Random random = new Random();

        x = random.nextInt(sizeBoard - 1);
        y = sizeBoard - 1;
    }

    public boolean isMoveCorrect(int x, int y) {
        return this.x == x && Math.abs(this.y - y) == 1 || this.y == y && Math.abs(this.x - x) == 1;
    }
    Random random = new Random();

    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return  x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getLive(){
        return this.live;
    }
    public void setLive(int live){
        this.live = live;
    }
    public void downLive(){ this.live --;}

    String image  = " \uD83E\uDDD9 ";
    private int live = 3;
    private int x,y;

}
