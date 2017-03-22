package pack3;

/**
 * Created by User_2 on 16.03.2017.
 */
public class Rectangle {
    int x;
    int y;

    public Rectangle(int xValue, int yValue){
        this.x = xValue;
        this.y = yValue;
    }

    public Rectangle(){
        this(2,2);
    }

    public int getVolume(){
        return (x+y)*2;
    }

}
