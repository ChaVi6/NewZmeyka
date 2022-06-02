import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Bonuses extends JPanel{
    private Image bonus1;
    private Image bonus2;
    private int bonus1X;
    private int bonus1Y;
    private int bonus2X;
    private int bonus2Y;
    public static int dots;
    private Timer timer;
    boolean inGame = true;
    public int[] x = new int[GameField.MAX_DOTS];
    public int[] y = new int[GameField.MAX_DOTS];

    public Bonuses() {
        loadImages();
        createBonusShort();
        createBonusSlow();
        checkBonusShort();
        checkBonusSlow();
    }

    public void createBonusShort() {
        if (dots > 9 && dots % 5 == 0) {
            bonus1X = new Random().nextInt(21) * GameField.DOT_SIZE;
            bonus1Y = new Random().nextInt(21) * GameField.DOT_SIZE;
        } else {
            bonus1X = -100;
            bonus1Y = -100;
        }
    }

    public void createBonusSlow() {
        if (dots > 9 && (dots % 5 == 0 || dots % 10 == 2 || dots % 10 == 7)) {
            bonus2X = new Random().nextInt(21) * GameField.DOT_SIZE;
            bonus2Y = new Random().nextInt(21) * GameField.DOT_SIZE;
        } else {
            bonus2X = -100;
            bonus2Y = -100;
        }
    }

    public void loadImages() {
        ImageIcon iib1 = new ImageIcon("bonus1.png");
        bonus1 = iib1.getImage();
        ImageIcon iib2 = new ImageIcon("bonus2.png");
        bonus2 = iib2.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bonus1, bonus1X, bonus1Y, this);
        g.drawImage(bonus2, bonus2X, bonus2Y, this);
    }

    public void checkBonusShort(){
        if (x[0] == bonus1X && y[0] == bonus1Y) {
            dots = dots - 3;
            bonus1X = -100;
            bonus1Y = -100;
        }
    }

    public void checkBonusSlow() {
        if (x[0] == bonus2X && y[0] == bonus2Y) {
            timer.setDelay(timer.getDelay() + 15);
            bonus2X = -100;
            bonus2Y = -100;
        }
    }
}
