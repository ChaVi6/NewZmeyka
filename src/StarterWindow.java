import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StarterWindow extends JFrame {

    public StarterWindow() {
        ImageIcon iii = new ImageIcon("image.png");
        Image image = iii.getImage();
        setTitle("Zmeyka");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 750);
        setLocation(500, 150);
        setContentPane(new JLabel(new ImageIcon(image)));
        setVisible(true);
        setResizable(false);
        Container container = this.getContentPane();

        JButton info = new JButton("Information");
        info.setSize(300, 50);
        info.setLocation(70, 400);
        container.add(info);
        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                AboutLevels rules = new AboutLevels();
            }
        });

        JButton start = new JButton("Start");
        start.setSize(300, 50);
        start.setLocation(70, 300);
        container.add(start);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setVisible(false);
                info.setVisible(false);
                repaint();

                JButton easy = new JButton("Easy");
                easy.setSize(300, 50);
                easy.setLocation(60, 280);
                container.add(easy);
                easy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                        MainWindow mw = new MainWindow();
                    }
                });

                JButton medium = new JButton("Medium");
                medium.setSize(300, 50);
                medium.setLocation(80, 360);
                container.add(medium);
                medium.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                        MainWindow mw = new MainWindow();
                    }
                });

                JButton hard = new JButton("Hard");
                hard.setSize(300, 50);
                hard.setLocation(100, 440);
                container.add(hard);
                hard.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                        MainWindow mw = new MainWindow();
                    }
                });

                JButton insane = new JButton("Insane");
                insane.setSize(300, 50);
                insane.setLocation(120, 520);
                container.add(insane);
                insane.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                        MainWindow mw = new MainWindow();
                    }
                });

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
            }
        });

    }

    public static void main(String[] args)  {
        StarterWindow sw = new StarterWindow();
    }
}