
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;

public class Foodframe extends JPanel {
    private JFrame f;
    private JLabel logoIcon,text;
    private JPanel p;
    private ImageIcon icon;
    public String menu;

    Foodframe(String menu) {
        f = new JFrame("COOKING GENT");
        f.setSize(500, 525);
        f.setDefaultCloseOperation(1);
        f.setVisible(false);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        Image(menu);
    }

    public void Image(String action) {
        ArrayList<PopupImage> popupImageList = new ArrayList<>();
        popupImageList.add(new PopupImage("Game/FOODIMG/cake.png", "Cake"));
        popupImageList.add(new PopupImage("Game/FOODIMG/steak.png", "Steak"));
        popupImageList.add(new PopupImage("Game/FOODIMG/sandwich.png", "Sandwich"));
        popupImageList.add(new PopupImage("Game/FOODIMG/omelet.png", "Omelet"));
        popupImageList.add(new PopupImage("Game/FOODIMG/firedrice.png", "FriedRice"));
        popupImageList.add(new PopupImage("Game/FOODIMG/ramen.png", "Ramen"));
        popupImageList.add(new PopupImage("Game/FOODIMG/pizza.png", "Pizza"));
        popupImageList.add(new PopupImage("Game/FOODIMG/waste.png", "Waste"));

        String tempImage = "Game/FOODIMG/waste.png";

        for (PopupImage popupImage : popupImageList) {
            if (popupImage.getAction().equals(action)) {
                tempImage = popupImage.getImageName();
                f.setVisible(true);
            }
        }
        icon = new ImageIcon(tempImage);
        logoIcon = new JLabel(icon);
        logoIcon.setPreferredSize(new Dimension(500, 500));
        p = new JPanel();
        p.setSize(500,500);
        text =new JLabel("GOOD JOB");
        text.setBounds(100,50,500,200);
        p.add(text);
        p.add(logoIcon);
        f.add(p);

    }
}