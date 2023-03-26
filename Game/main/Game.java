
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JFrame {
    String food;
    Foodframe menu = new Foodframe(food);
    JLabel counterLabel, perSecLabel;
    public JLabel itemmenu;
    public JPanel shopPanel;
    public JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    private JButton bakeButton, backButton;
    public static int cookieCounter;
    public static ArrayList<String> item = new ArrayList<>();
    Font font1, font2;
    CookieHandler cHandler = new CookieHandler();
    
    JButton cookieButton = new JButton();
    ImageIcon cookie = new ImageIcon("Game/IMG/num.png");
    
    // Basket b1 = new Basket();
    public Game() {
        Image imgCookie = cookie.getImage();
        Image newimgCookie = imgCookie.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        cookie  = new ImageIcon(newimgCookie);
        cookieButton.setIcon(cookie);
        cookieButton.setBorderPainted(true);
        // cookieButton.setContentAreaFilled(false);
        // cookieButton.setFocusPainted(false);
        // cookieButton.setOpaque(false);
        // cookieButton.setFocusPainted(false);

        cookieCounter = 99990;
        createFont();
        createUI();
    }

    public void createFont() {
        font1 = new Font("Comic Sans MS", Font.PLAIN, 30);
        font2 = new Font("Comic Sans MS", Font.PLAIN, 13);
    }

    public void createUI() {
        setSize(800, 600);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shopPanel = new JPanel();
        shopPanel.setBounds(350, 420, 400, 50);
        shopPanel.setBackground(Color.white);
        add(shopPanel);
        // JPanel is used to group and oragnize main panel
        JPanel cookiePanel = new JPanel();
        cookiePanel.setBounds(40, 175 , 350, 350);
        cookiePanel.setBackground(Color.black);
        add(cookiePanel);

        JPanel bakePanel = new JPanel();
        bakePanel.setBounds(670, 30, 80, 50);
        bakePanel.setBackground(Color.black);
        add(bakePanel);
        bakeButton = new JButton();
        ImageIcon a = new ImageIcon("Game/bott/bake.png");
        Image imgb = a.getImage();
        Image newimgb = imgb.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
        a = new ImageIcon(newimgb);
        bakeButton.setIcon(a);
        bakeButton.setBorderPainted(false);
        bakeButton.setContentAreaFilled(false);
        bakeButton.setFocusPainted(false);
        bakeButton.setOpaque(false);
        bakeButton.setFont(font2);
        bakeButton.setFocusPainted(false);
        bakeButton.addActionListener(cHandler);
        bakePanel.add(bakeButton);
        bakeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bakeButton) {
                    // getfood();
                    itemmenu.setVisible(false);
                    removeList();
                    new MM(item);

                }
            }
        });

        JPanel backPanel = new JPanel();
        backPanel.setBounds(0, 500, 250, 50);
        backPanel.setBackground(Color.black);
        add(backPanel);
        backButton = new JButton();
        ImageIcon b = new ImageIcon("Game/bott/back.png");
        Image imgba = b.getImage();
        Image newimgba = imgba.getScaledInstance(120, 45, Image.SCALE_SMOOTH);
        b = new ImageIcon(newimgba);
        backButton.setIcon(b);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setFocusPainted(false);
        backButton.setOpaque(false);
        backButton.setFont(font2);
        backButton.setFocusPainted(false);
        backButton.addActionListener(cHandler);
        backPanel.add(backButton);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == backButton) {
                    Home home = new Home();
                    setVisible(false);
                }
            }
        });
        
        cookieButton.setBackground(Color.black);
        cookieButton.setFocusPainted(false);
        cookieButton.setBorder(null);
        // cookieButton.setIcon(cookie);
        cookieButton.addActionListener(cHandler);
        cookieButton.setActionCommand("cookie");
        cookiePanel.add(cookieButton);

        JPanel counterPanel = new JPanel();
        counterPanel.setBounds(40, 50, 250, 100);
        counterPanel.setBackground(Color.black);
        counterPanel.setLayout(new GridLayout(2, 1));
        add(counterPanel);

        counterLabel = new JLabel(cookieCounter + " points ");
        counterLabel.setForeground(Color.white);
        counterLabel.setFont(font1);
        counterPanel.add(counterLabel);
        add(counterPanel);

        perSecLabel = new JLabel();
        perSecLabel.setForeground(Color.white);
        perSecLabel.setFont(font2);
        counterPanel.add(perSecLabel);

        JPanel itemPanel = new JPanel();
        itemPanel.setBounds(430, 100, 250, 300);
        itemPanel.setBackground(Color.black);
        itemPanel.setLayout(new GridLayout(5, 2));
        add(itemPanel);

        button1 = new JButton();
        ImageIcon i = new ImageIcon("Game/bott/fL.png");
        Image img = i.getImage();
        Image newimg = img.getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        i = new ImageIcon(newimg);
        button1.setIcon(i);
        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
        button1.setFocusPainted(false);
        button1.setOpaque(false);
        button1.setFont(font2);
        button1.setFocusPainted(false);
        button1.addActionListener(cHandler);
        button1.setActionCommand("FLOUR");
        itemPanel.add(button1);

        button2 = new JButton();
        ImageIcon i2 = new ImageIcon("Game/bott/SUGAR.png");
        Image img2 = i2.getImage();
        Image newimg2 = img2.getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        i2 = new ImageIcon(newimg2);
        button2.setIcon(i2);
        button2.setBorderPainted(false);
        button2.setContentAreaFilled(false);
        button1.setFocusPainted(false);
        button2.setOpaque(false);
        button2.setFont(font2);
        button2.setFocusPainted(false);
        button2.addActionListener(cHandler);
        button2.setActionCommand("SUGAR");
        itemPanel.add(button2);
        /*
         * button2 = new JButton("SUGAR = 20");
         * button2.setFont(font2);
         * button2.setFocusPainted(false);
         * button2.addActionListener(cHandler);
         * button2.setActionCommand("SUGAR");
         * itemPanel.add(button2);
         */

        button3 = new JButton();
        ImageIcon i3 = new ImageIcon("Game/bott/EGG.png");
        Image img3 = i3.getImage();
        Image newimg3 = img3.getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        i3 = new ImageIcon(newimg3);
        button3.setIcon(i3);
        button3.setBorderPainted(false);
        button3.setContentAreaFilled(false);
        button3.setFocusPainted(false);
        button3.setOpaque(false);
        button3.setFont(font2);
        button3.setFocusPainted(false);
        button3.addActionListener(cHandler);
        button3.setActionCommand("EGG");
        itemPanel.add(button3);
        /*
         * button3 = new JButton("EGG = 5");
         * button3.setFont(font2);
         * button3.setFocusPainted(false);
         * button3.addActionListener(cHandler);
         * button3.setActionCommand("EGG");
         * itemPanel.add(button3);
         */

        button4 = new JButton();
        ImageIcon i4 = new ImageIcon("Game/bott/MEAT.png");
        Image img4 = i4.getImage();
        Image newimg4 = img4.getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        i4 = new ImageIcon(newimg4);
        button4.setIcon(i4);
        button4.setBorderPainted(false);
        button4.setContentAreaFilled(false);
        button4.setFocusPainted(false);
        button4.setOpaque(false);
        button4.setFont(font2);
        button4.setFocusPainted(false);
        button4.addActionListener(cHandler);
        button4.setActionCommand("MEAT");
        itemPanel.add(button4);
        /*
         * button4 = new JButton("MEAT = 30");
         * button4.setFont(font2);
         * button4.setFocusPainted(false);
         * button4.addActionListener(cHandler);
         * button4.setActionCommand("MEAT");
         * itemPanel.add(button4);
         */
        button5 = new JButton();
        ImageIcon i5 = new ImageIcon("Game/bott/MILK.png");
        Image img5 = i5.getImage();
        Image newimg5 = img5.getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        i5 = new ImageIcon(newimg5);
        button5.setIcon(i5);
        button5.setBorderPainted(false);
        button5.setContentAreaFilled(false);
        button5.setFocusPainted(false);
        button5.setOpaque(false);
        button5.setFont(font2);
        button5.setFocusPainted(false);
        button5.addActionListener(cHandler);
        button5.setActionCommand("MILK");
        itemPanel.add(button5);
        /*
         * button5 = new JButton("MILK = 10");
         * button5.setFont(font2);
         * button5.setFocusPainted(false);
         * button5.addActionListener(cHandler);
         * button5.setActionCommand("MILK");
         * itemPanel.add(button5);
         */

        button6 = new JButton();
        ImageIcon i6 = new ImageIcon("Game/bott/RICE.png");
        Image img6 = i6.getImage();
        Image newimg6 = img6.getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        i6 = new ImageIcon(newimg6);
        button6.setIcon(i6);
        button6.setBorderPainted(false);
        button6.setContentAreaFilled(false);
        button6.setFocusPainted(false);
        button6.setOpaque(false);
        button6.setFont(font2);
        button6.setFocusPainted(false);
        button6.addActionListener(cHandler);
        button6.setActionCommand("RICE");
        itemPanel.add(button6);
        /*
         * button6 = new JButton("RICE = 60");
         * button6.setFont(font2);
         * button6.setFocusPainted(false);
         * button6.addActionListener(cHandler);
         * button6.setActionCommand("RICE");
         * itemPanel.add(button6);
         */

        button7 = new JButton();
        ImageIcon i7 = new ImageIcon("Game/bott/NOO.png");
        Image img7 = i7.getImage();
        Image newimg7 = img7.getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        i7 = new ImageIcon(newimg7);
        button7.setIcon(i7);
        button7.setBorderPainted(false);
        button7.setContentAreaFilled(false);
        button7.setFocusPainted(false);
        button7.setOpaque(false);
        button7.setFont(font2);
        button7.setFocusPainted(false);
        button7.addActionListener(cHandler);
        button7.setActionCommand("NOODLE");
        itemPanel.add(button7);
        

        button8 = new JButton();
        ImageIcon i8 = new ImageIcon("Game/bott/LET.png");
        Image img8 = i8.getImage();
        Image newimg8 = img8.getScaledInstance(120, 40, Image.SCALE_SMOOTH);
        i8 = new ImageIcon(newimg8);
        button8.setIcon(i8);
        button8.setBorderPainted(false);
        button8.setContentAreaFilled(false);
        button8.setFocusPainted(false);
        button8.setOpaque(false);
        button8.setFont(font2);
        button8.setFocusPainted(false);
        button8.addActionListener(cHandler);
        button8.setActionCommand("LETTUCE");
        itemPanel.add(button8);
        

        button9 = new JButton();
        ImageIcon i9 = new ImageIcon("Game/bott/BREAD.png");
        Image img9 = i9.getImage();
        Image newimg9 = img9.getScaledInstance(120, 40, Image.SCALE_SMOOTH);
        i9 = new ImageIcon(newimg9);
        button9.setIcon(i9);
        button9.setBorderPainted(false);
        button9.setContentAreaFilled(false);
        button9.setFocusPainted(false);
        button9.setOpaque(false);
        button9.setFont(font2);
        button9.setFocusPainted(false);
        button9.addActionListener(cHandler);
        button9.setActionCommand("BREAD");
        itemPanel.add(button9);
        
        button10 = new JButton();
        ImageIcon i10 = new ImageIcon("Game/bott/BUTTER.png");
        Image img10 = i10.getImage();
        Image newimg10 = img10.getScaledInstance(120, 50, Image.SCALE_SMOOTH);
        i10 = new ImageIcon(newimg10);
        button10.setIcon(i10);
        button10.setBorderPainted(false);
        button10.setContentAreaFilled(false);
        button10.setFocusPainted(false);
        button10.setOpaque(false);
        button10.setFont(font2);
        button10.setFocusPainted(false);
        button10.addActionListener(cHandler);
        button10.setActionCommand("BUTTER");
        itemPanel.add(button10);
        

        setVisible(true);
    }
    

    public int cur_num_of_cookie(int cookieCounter) {
        return cookieCounter;
    }

    public class CookieHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String action = event.getActionCommand();

            switch (action) {
                case "cookie":
                    if(cookieCounter %2 ==0){
                        cookie = new ImageIcon("Game/IMG/nom.png");
                        Image imgCookie = cookie.getImage();
                        Image newimgCookie = imgCookie.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
                        cookie  = new ImageIcon(newimgCookie);
                        cookieButton.setIcon(cookie);
                        cookieButton.setBorderPainted(false);
                        
                    }else{
                        cookie = new ImageIcon("Game/IMG/num.png");
                        Image imgCookie = cookie.getImage();
                        Image newimgCookie = imgCookie.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
                        cookie  = new ImageIcon(newimgCookie);
                        cookieButton.setIcon(cookie);
                        cookieButton.setBorderPainted(false);
                        
                    }
                    cookieCounter++;
                    cur_num_of_cookie(cookieCounter);
                    counterLabel.setText(cookieCounter + " points ");

                    break;
                case "FLOUR":
                    if (cur_num_of_cookie(cookieCounter) >= 10) {
                        int i = 0;
                        cookieCounter -= 10;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("FLOUR");

                        
                        break;
                    }
                    
                    break;
                case "SUGAR":
                    if (cur_num_of_cookie(cookieCounter) >= 20) {
                        cookieCounter -= 20;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("SUGAR");

                        break;
                    }
                    
                    break;
                case "EGG":
                    if (cur_num_of_cookie(cookieCounter) >= 5) {
                        cookieCounter -= 5;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("EGG");

                        break;
                    }
                    
                    break;
                case "MEAT":
                    if (cur_num_of_cookie(cookieCounter) >= 30) {
                        cookieCounter -= 30;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("MEAT");
                        break;
                    }
                    
                    break;
                case "MILK":
                    if (cur_num_of_cookie(cookieCounter) >= 10) {
                        cookieCounter -= 10;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("MILK");

                        break;
                    }
                    
                    break;
                case "RICE":
                    if (cur_num_of_cookie(cookieCounter) >= 60) {
                        cookieCounter -= 60;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("RICE");

                        break;
                    }
                    
                    break;
                case "NOODLE":
                    if (cur_num_of_cookie(cookieCounter) >= 400) {
                        cookieCounter -= 400;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("NOODLE");

                        break;
                    }
                    
                    break;
                case "LETTUCE":
                    if (cur_num_of_cookie(cookieCounter) >= 80) {
                        cookieCounter -= 80;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("LETTUCE");

                        break;
                    }
                    
                    break;
                case "BREAD":
                    if (cur_num_of_cookie(cookieCounter) >= 300) {
                        cookieCounter -= 300;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("BREAD");
                        break;
                    }
                    
                    break;
                case "BUTTER":
                    if (cur_num_of_cookie(cookieCounter) >= 400) {
                        cookieCounter -= 400;
                        cur_num_of_cookie(cookieCounter);
                        counterLabel.setText(cookieCounter + " points ");
                        item.add("BUTTER");

                        break;
                    }
                    
                    break;
            }
            getList();

        }
    }

    public void getList() {
        if (item.size() == 5) {
            String listString = String.join(", ", item);
            itemmenu = new JLabel();
            itemmenu.setText(listString);
            shopPanel.add(itemmenu);
        }

        
    }

    public void removeList() {
        //
        item.clear();
        itemmenu.setText("");
        shopPanel.add(itemmenu);
        System.out.println(item);

    }

    
}