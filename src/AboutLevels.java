import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutLevels extends JFrame{

    public AboutLevels() {


        setBackground(Color.black);
        setTitle("Rules");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000, 750);
        setLocation(500, 150);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        JLabel levels;
        levels = new JLabel("<html><u><b>Easy:</b></u><br>" +
                "-without borders<br>" +
                "-without bonuses<br>" +
                "-without stones<br>" +
                "-speed up 2 times in a game by 50<br>(if the length of the snake is 10, 20)<br>" +
                "<br>" +
                "<u><b>Medium:</b></u><br>" +
                "-without borders<br>" +
                "-without bonuses<br>" +
                "-with stones x3 (don't redraw after each extension)<br>" +
                "-speed up 3 times in a game by 40<br>(if the length of the snake is 8, 13, 18)<br>" +
                "<br>" +
                "<u><b>Hard:</b></u><br>" +
                "-with borders<br>" +
                "-with bonuses<br>" +
                "-with stones x3 (redrawn after each extension)<br>" +
                "-speed up 4 times in a game by 35<br>(if the length of the snake is 5, 10, 15, 20)<br>" +
                "<br>" +
                "<u><b>Insane:</b></u><br>" +
                "-without borders<br>" +
                "-with bonuses<br>" +
                "-with stones x5 (redrawn after each extension)<br>" +
                "-speed up after each extension</html>");
        levels.setFont(new Font("Arial", Font.PLAIN, 20));
        levels.setSize(1000,750);
        levels.setLocation(50,-30);
        add(levels);

        JLabel bonuses;
        bonuses = new JLabel("<html><u><b>Bonuses:</b></u><br>" +
                "-Blue sphere (Rasengan) is the main food which <br>increases the snake in size by 1<br>" +
                "-Slowdown +10 (icon: hot spring)<br>" +
                "-Reducing the length by 3 (icon: narutomaki)<br>" +
                "<br><b>GOOD GAME! :)</b></html>");
        bonuses.setFont(new Font("Arial", Font.PLAIN, 20));
        bonuses.setSize(1000,750);
        bonuses.setLocation(500,-250);
        add(bonuses);

        Container container = this.getContentPane();

        JButton back = new JButton("Back");
        back.setSize(100, 50);
        back.setLocation(870, 650);
        container.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                StarterWindow sw = new StarterWindow();
            }
        });

        this.add(back);
    }


}
