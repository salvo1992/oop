import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class JumpingKitty extends JPanel implements ActionListener, KeyListener {

    Timer timer = new Timer(20, this);
    int kittyY = 250;
    int velocityY = 0;
    int gravity = 1;

    ArrayList<Rectangle> yarns = new ArrayList<>();
    int score = 0;

    ImageIcon kittyIcon;
    ImageIcon yarnIcon;

    public JumpingKitty() {
        JFrame frame = new JFrame("Salta Gattino");
        frame.setSize(800, 500);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addKeyListener(this);
        frame.setVisible(true);

        // Carica e ridimensiona immagini
        kittyIcon = resizeImage("img/kitty.png", 38, 38);
        yarnIcon = resizeImage("img/yarn.png", 38, 38);

        timer.start();
        addYarn();
    }

    // Funzione per ridimensionare immagini
    public ImageIcon resizeImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public void addYarn() {
        int y = (int)(Math.random() * 300 + 100);
        yarns.add(new Rectangle(800, y, 38, 38));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Sfondo
        g.setColor(new Color(230, 240, 255));
        g.fillRect(0, 0, getWidth(), getHeight());

        // Gattino
        kittyIcon.paintIcon(this, g, 100, kittyY);

        // Gomitoli
        for (Rectangle yarn : yarns) {
            yarnIcon.paintIcon(this, g, yarn.x, yarn.y);
        }

        // Punteggio
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Punti: " + score, 10, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        velocityY += gravity;
        kittyY += velocityY;

        for (int i = 0; i < yarns.size(); i++) {
            Rectangle yarn = yarns.get(i);
            yarn.x -= 5;

            if (new Rectangle(100+5, kittyY, 38, 38).intersects(yarn)) {
                score++;
                yarns.remove(i);
                i--;
            }

            if (yarn.x + yarn.width < 0) {
                yarns.remove(i);
                i--;
            }
        }

        if (Math.random() < 0.02) {
            addYarn();
        }

        if (kittyY > getHeight()) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over! Punteggio: " + score);
            System.exit(0);
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            velocityY = -10;
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new JumpingKitty();
    }
}

