import processing.core.PApplet;

public class FourBalls extends PApplet {
    public final int WINDOW_WIDTH = 700;
    public final int WINDOW_HEIGHT = 500;
    public final int BALL_RADIUS = 10;
    public final int DIV_FACTOR = 5;

    int startPosOfBall1 = 0, startPosOfBall2 = 0, startPosOfBall3 = 0, startPosOfBall4 = 0;
    int speedOfBall1 = 1, speedOfBall2 = 2, speedOfBall3 = 3, speedOfBall4 = 4;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void draw() {
        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();
    }

    private void drawBall1() {
        ellipse(startPosOfBall1, WINDOW_HEIGHT * speedOfBall1 / DIV_FACTOR, BALL_RADIUS, BALL_RADIUS);
        startPosOfBall1 += speedOfBall1;
    }

    private void drawBall2() {
        ellipse(startPosOfBall2, WINDOW_HEIGHT * speedOfBall2 / DIV_FACTOR, BALL_RADIUS, BALL_RADIUS);
        startPosOfBall2 += speedOfBall2;
    }

    private void drawBall3() {
        ellipse(startPosOfBall3, WINDOW_HEIGHT * speedOfBall3 / DIV_FACTOR, BALL_RADIUS, BALL_RADIUS);
        startPosOfBall3 += speedOfBall3;
    }

    private void drawBall4() {
        ellipse(startPosOfBall4, WINDOW_HEIGHT * speedOfBall4 / DIV_FACTOR, BALL_RADIUS, BALL_RADIUS);
        startPosOfBall4 += speedOfBall4;
    }

}
