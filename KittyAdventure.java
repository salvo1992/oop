import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class KittyAdventure extends JPanel implements ActionListener, KeyListener {

    Timer timer = new Timer(20, this);

    int kittyX = 100;
    int kittyY = 250;

    boolean moveLeft = false;
    boolean moveRight = false;
    boolean moveUp = false;
    boolean moveDown = false;

    int speed = 4;
    int score = 0;

    ArrayList<Rectangle> yarns = new ArrayList<>();

    ImageIcon kittyIcon;
    ImageIcon yarnIcon;

    public KittyAdventure() {
        JFrame frame = new JFrame("Kitty Adventure");
        frame.setSize(800, 500);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addKeyListener(this);
        frame.setVisible(true);

        // Carica immagini
        kittyIcon = resizeImage("img/kitty.png", 38, 38);
        yarnIcon = resizeImage("img/yarn.png", 38, 38);

        // Fallback se le immagini non esistono
        if (kittyIcon.getIconWidth() == -1) {
            System.out.println("Immagine GATTINO non trovata!");
        }
        if (yarnIcon.getIconWidth() == -1) {
            System.out.println("Immagine GOMITOLO non trovata!");
        }

        addYarns();
        timer.start();
    }

    public ImageIcon resizeImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public void addYarns() {
        for (int i = 0; i < 6; i++) {
            int x = (int)(Math.random() * 700 + 50);
            int y = (int)(Math.random() * 400 + 50);
            yarns.add(new Rectangle(x, y, 38, 38));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(220, 245, 255));
        g.fillRect(0, 0, getWidth(), getHeight());

        if (kittyIcon != null) {
            kittyIcon.paintIcon(this, g, kittyX, kittyY);
        }

        for (Rectangle yarn : yarns) {
            if (yarnIcon != null) {
                yarnIcon.paintIcon(this, g, yarn.x, yarn.y);
            }
        }

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Punti: " + score, 10, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Movimento continuo
        if (moveLeft) kittyX -= speed;
        if (moveRight) kittyX += speed;
        if (moveUp) kittyY -= speed;
        if (moveDown) kittyY += speed;

        // Limiti schermo
        kittyX = Math.max(0, Math.min(kittyX, getWidth() - 38));
        kittyY = Math.max(0, Math.min(kittyY, getHeight() - 38));

        Rectangle kittyRect = new Rectangle(kittyX, kittyY, 38, 38);
        for (int i = 0; i < yarns.size(); i++) {
            if (kittyRect.intersects(yarns.get(i))) {
                score++;
                yarns.remove(i);
                i--;
            }
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) moveLeft = true;
        if (key == KeyEvent.VK_RIGHT) moveRight = true;
        if (key == KeyEvent.VK_UP) moveUp = true;
        if (key == KeyEvent.VK_DOWN) moveDown = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) moveLeft = false;
        if (key == KeyEvent.VK_RIGHT) moveRight = false;
        if (key == KeyEvent.VK_UP) moveUp = false;
        if (key == KeyEvent.VK_DOWN) moveDown = false;
    }

    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new KittyAdventure();
    }
}

