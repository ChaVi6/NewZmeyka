import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Stones extends JPanel {
    public Image stone1;
    public Image stone2;
    public Image stone3;
    public int stone1X;
    public int stone1Y;
    public int stone2X;
    public int stone2Y;
    public int stone3X;
    public int stone3Y;
    boolean inGame = true;
    public int[] x = new int[GameField.MAX_DOTS];
    public int[] y = new int[GameField.MAX_DOTS];

    public Stones() {
        createStones();
        loadImages();
        checkStones();
    }

    public void createStones() {
        stone1X = new Random().nextInt(21) * GameField.DOT_SIZE;
        stone1Y = new Random().nextInt(21) * GameField.DOT_SIZE;
        stone2X = new Random().nextInt(21) * GameField.DOT_SIZE;
        stone2Y = new Random().nextInt(21) * GameField.DOT_SIZE;
        stone3X = new Random().nextInt(21) * GameField.DOT_SIZE;
        stone3Y = new Random().nextInt(21) * GameField.DOT_SIZE;
    }

    public void loadImages() {
        ImageIcon iis1 = new ImageIcon("block.png");
        stone1 = iis1.getImage();
        ImageIcon iis2 = new ImageIcon("block.png");
        stone2 = iis2.getImage();
        ImageIcon iis3 = new ImageIcon("block.png");
        stone3 = iis3.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(stone1, stone1X, stone1Y, this);
        g.drawImage(stone2, stone2X, stone2Y, this);
        g.drawImage(stone3, stone3X, stone3Y, this);
    }

    public void checkStones() {
        if (x[0] == stone1X && y[0] == stone1Y) {
            inGame = false;
        }
        if (x[0] == stone2X && y[0] == stone2Y) {
            inGame = false;
        }
        if (x[0] == stone3X && y[0] == stone3Y) {
            inGame = false;
        }
    }
}
