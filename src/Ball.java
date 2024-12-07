public class Ball {
    int x,y;
    int radius;
    int diameter;
    int vx,vy;

    final int MIN_SPEED = 18;

    public Ball( int x,int y,int radius){
        this.x = x;
        this.y = y;
        this.radius =radius;
        diameter = 2*radius;
    }

    public Ball(int radius){
        this.radius = radius;
    }

}
