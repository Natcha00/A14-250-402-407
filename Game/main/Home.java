
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
  // private JFrame frame;
  private JPanel panel,imagepPanel;
  private JButton start, image, credit, starving ;
  private int widthbuttons = 150;
  private int heightbuttons = 60;

  public Home() {
    setTitle("CLICK ME BROS");
    setSize(800, 600);
    imagepPanel = new JPanel();
    imagepPanel.setBackground(Color.PINK);

    panel = new JPanel();
    panel.setBackground(Color.PINK);
    panel.setBounds(220, 350, 350, 600);
    

    Icon icon = new ImageIcon("Game/IMG/Logo.png");
    JLabel logo = new JLabel(icon);
   
    imagepPanel.add(logo);
    add(panel);
    add(imagepPanel);
    // START
    start = new JButton("START");
    start.setPreferredSize(new Dimension(widthbuttons, heightbuttons));
    start.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
          Game game = new Game();
          setVisible(false);
        } else {
          System.out.println("ERROR...");
        }
      }
    });
    panel.add(start);
    // IMAGE

    image = new JButton("MENU");
    image.setPreferredSize(new Dimension(widthbuttons, heightbuttons));
    image.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == image) {
             Image img = new Image();
             setVisible(false);
        } else {
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Loading frame = new Loading();
                setVisible(true);
            }
        });
          System.out.println("ERROR...");
        }
      }
    });
    panel.add(image);

    credit = new JButton("CREDIT");
    credit.setPreferredSize(new Dimension(widthbuttons, heightbuttons));
    credit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == credit) {
          Screen game = new Screen();
          setVisible(false);
        } else {
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Loading frame = new Loading();
                setVisible(true);
            }
        });
          System.out.println("ERROR...");
        }
      }
    });
    panel.add(credit);

    //MY TUMMY IS TALKING TO ME,BROS
    starving = new JButton("MY TUMMY IS TALKING TO ME,BROS");
    starving.setPreferredSize(new Dimension(widthbuttons, heightbuttons));
    starving.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == starving) {
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Loading frame = new Loading();
               setVisible(false);
            }
        });
        }
      }
    });
    panel.add(starving);
    setVisible(true);
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
