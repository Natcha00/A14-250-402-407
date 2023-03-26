
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Image extends JFrame {
    private JPanel imagepanel;
    private JLabel text, pizzaLabel, sandwichLabel, friedriceLabel, cakeLabel, steakLabel, ramenLabel, omeletLabel,
            wasteLabel;
    private JButton backButton;

    public Image() {
        setTitle("CLICK ME BROS");
        setSize(800, 600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imagepanel = new JPanel();
        imagepanel.setSize(800, 600);
        imagepanel.setBackground(Color.GRAY);
        imagepanel.setLayout(null);
        text = new JLabel("MENU");
        text.setForeground(Color.white);
        text.setBounds(380, 0, 100, 100);
        add(text);

        Icon pizza = new ImageIcon("Game/FOODIMG/pizza.png");
        pizzaLabel = new JLabel(pizza);
        pizzaLabel.setBounds(40, 100, 160, 160);
        imagepanel.add(pizzaLabel);

        Icon sandwich = new ImageIcon("Game/FOODIMG/sandwich.png");
        sandwichLabel = new JLabel(sandwich);
        sandwichLabel.setBounds(230, 100, 160, 160);
        imagepanel.add(sandwichLabel);

        Icon friedrice = new ImageIcon("Game/FOODIMG/friedrice.png");
        friedriceLabel = new JLabel(friedrice);
        friedriceLabel.setBounds(420, 100, 160, 160);
        imagepanel.add(friedriceLabel);

        Icon cake = new ImageIcon("Game/FOODIMG/cake.png");
        cakeLabel = new JLabel(cake);
        cakeLabel.setBounds(610, 100, 160, 160);
        imagepanel.add(cakeLabel);

        Icon steak = new ImageIcon("Game/FOODIMG/steak.png");
        steakLabel = new JLabel(steak);
        steakLabel.setBounds(40, 330, 160, 160);
        imagepanel.add(steakLabel);

        Icon ramen = new ImageIcon("Game/FOODIMG/ramen.png");
        ramenLabel = new JLabel(ramen);
        ramenLabel.setBounds(230, 330, 160, 160);
        imagepanel.add(ramenLabel);

        Icon omelet = new ImageIcon("Game/FOODIMG/omelet.png");
        omeletLabel = new JLabel(omelet);
        omeletLabel.setBounds(420, 330, 160, 160);
        imagepanel.add(omeletLabel);

        Icon waste = new ImageIcon("Game/FOODIMG/waste.png");
        wasteLabel = new JLabel(waste);
        wasteLabel.setBounds(610, 330, 160, 160);
        imagepanel.add(wasteLabel);
        add(imagepanel);

        JPanel backPanel = new JPanel();
        backPanel.setBounds(0, 500, 250, 50);
        backPanel.setBackground(Color.gray);
        add(backPanel);
        backButton = new JButton("BACK TO HOME");
        backButton.setFocusPainted(false);
        backButton.setActionCommand("BACK");
        backPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if (e.getSource() == backButton) {
                    Home home = new Home();
                   setVisible(false);
              }
            }
            });
    }
}
