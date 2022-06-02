import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Zmeyka");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(GameField.SIZE + 30,GameField.SIZE + 60);
        setLocation(500, 150);
        add(new GameField());
        setResizable(false);
        setVisible(true);
    }
}