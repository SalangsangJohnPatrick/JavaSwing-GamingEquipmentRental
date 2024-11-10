import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GamingEquipmentRental
{
    private JFrame frame;
    private GridBagConstraints gbc = new GridBagConstraints();
    private GridBagConstraints s6Constraints = new GridBagConstraints();
    
    private JPanel contentPane;
    private JPanel s1, s2, s3, s4, s5, s6;
    private JLabel select;
    
    private JButton keyboardButton, mouseButton, monitorButton, headphoneButton, mousepadButton, editInfoButton, exitButton, backButton;
    protected JButton s1Button, s2Button, s3Button, s4Button;

    ImageIcon keyboard = new ImageIcon("Peripherals\\Keyboard.png");
    ImageIcon mouse = new ImageIcon("Peripherals\\Mouse.png");
    ImageIcon monitor = new ImageIcon("Peripherals\\Monitor.png");
    ImageIcon headphone = new ImageIcon("Peripherals\\Headphone.png");
    ImageIcon mousepad = new ImageIcon("Peripherals\\Mousepad.png");
    
    ImageIcon keyboard1 = new ImageIcon("Keyboards\\Logitech G Pro Mechanical Keyboard.png");
    ImageIcon keyboard2 = new ImageIcon("Keyboards\\Razer Blackwidow Elite Mechanical Keyboard.png");
    ImageIcon keyboard3 = new ImageIcon("Keyboards\\SteelSeries Apex 5 Hybrid Mechanical Keyboard.png");
    ImageIcon keyboard4 = new ImageIcon("Keyboards\\Fantech MAXPOWER MK853 Mechanical Keyboard.png");
    
    ImageIcon mouse1 = new ImageIcon("Mouse\\Logitech Gaming Mouse G903.png");
    ImageIcon mouse2 = new ImageIcon("Mouse\\Razer Mamba Mouse.png");
    ImageIcon mouse3 = new ImageIcon("Mouse\\Steelseries Sensei 310 Mouse.png");
    ImageIcon mouse4 = new ImageIcon("Mouse\\FANTECH X9 Gaming Mouse.png");

    ImageIcon monitor1 = new ImageIcon("Monitor\\Samsung Odyssey G7 Curved Gaming Monitor.png");
    ImageIcon monitor2 = new ImageIcon("Monitor\\Asus ROG STRIX XG27VQ Gaming Monitor.png");
    ImageIcon monitor3 = new ImageIcon("Monitor\\Acer Predator XB273K Gaming Monitor.png");
    ImageIcon monitor4 = new ImageIcon("Monitor\\Gamdias ATLAS Gaming Monitor.png");
    
    ImageIcon headphone1 = new ImageIcon("Headphones\\Logitech G733 LIGHTSPEED Gaming Headset.png");
    ImageIcon headphone2 = new ImageIcon("Headphones\\Razer Kraken X Wired Gaming Headset.png");
    ImageIcon headphone3 = new ImageIcon("Headphones\\Steelseries Arctics 1 Gaming Headset.png");
    ImageIcon headphone4 = new ImageIcon("Headphones\\FANTECH HG11 Captain Gaming Headset.png");
    
    ImageIcon mousepad1 = new ImageIcon("Mousepad\\Logitech G240 Mousepad.png");
    ImageIcon mousepad2 = new ImageIcon("Mousepad\\Razer Goliathus Mousepad.png");
    ImageIcon mousepad3 = new ImageIcon("Mousepad\\Steelseries Qck Mousepad.png");
    ImageIcon mousepad4 = new ImageIcon("Mousepad\\FANTECH Sven Mousepad.png");
    
    public GamingEquipmentRental()
    {
        frame = new JFrame("Gaming Equipment Rental");
        gbc.insets = new Insets(10,10,10,10);
        contentPane = new JPanel();
        contentPane.setLayout(new GridBagLayout());
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        select = new JLabel("SELECT A PRODUCT TYPE:", JLabel.CENTER);
        contentPane.add(select, gbc);
        
        /*
         * Constraints for Keyboard
         */
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 25;
        gbc.weighty = 25;
        gbc.gridx = 0;
        gbc.gridy = 1;
        s1 = new JPanel();
        s1.setOpaque(true);
        s1.setBackground(Color.WHITE);
        s1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        keyboardButton = new JButton(keyboard);
        s1.add(keyboardButton);
        contentPane.add(s1, gbc);
        
        /*
         * Constraints for Mouse
         */
        gbc.gridx = 1;
        gbc.gridy = 1;
        s2 = new JPanel();
        s2.setOpaque(true);
        s2.setBackground(Color.WHITE);
        s2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        mouseButton = new JButton(mouse);
        s2.add(mouseButton);
        contentPane.add(s2, gbc);
        
        /*
         * Constraints for Monitor
         */
        gbc.gridx = 0;
        gbc.gridy = 2;
        s3 = new JPanel();
        s3.setOpaque(true);
        s3.setBackground(Color.WHITE);
        s3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        monitorButton = new JButton(monitor);
        s3.add(monitorButton);
        contentPane.add(s3, gbc);

        /*
         * Constraints for Headphone
         */
        gbc.gridx = 1;
        gbc.gridy = 2;
        s4 = new JPanel();
        s4.setOpaque(true);
        s4.setBackground(Color.WHITE);
        s4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        headphoneButton = new JButton(headphone);
        s4.add(headphoneButton);
        contentPane.add(s4, gbc);
        
        /*
         * Constraints for Mousepad
         */
        gbc.gridx = 2;
        gbc.gridy = 1;
        s5 = new JPanel();
        s5.setOpaque(true);
        s5.setBackground(Color.WHITE);
        s5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        mousepadButton = new JButton(mousepad);
        s5.add(mousepadButton);
        contentPane.add(s5, gbc);

        /*
         * Constraints for Edit Info and Exit
         */
        s6Constraints.anchor = GridBagConstraints.CENTER;
        s6Constraints.fill = GridBagConstraints.BOTH;
        s6Constraints.weightx = 25;
        s6Constraints.weighty = 25;
        s6Constraints.insets = new Insets(10,10,10,10);
        gbc.gridx = 2;
        gbc.gridy = 2;
        s6 = new JPanel(new GridBagLayout());
        s6.setOpaque(true);
        editInfoButton = new JButton("EDIT INFO");
        s6Constraints.gridx = 0;
        s6Constraints.gridy = 0;
        s6.add(editInfoButton, s6Constraints);
        exitButton = new JButton("EXIT");
        s6Constraints.gridx = 0;
        s6Constraints.gridy = 1;
        s6.add(exitButton, s6Constraints);
        contentPane.add(s6, gbc);

        backButton = new JButton("BACK");
        gbc.gridx = 0;
        gbc.gridy = 3;
        s6Constraints.gridx = 0;
        s6Constraints.gridy = 0;

        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700,480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        keyboardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                keyboardMenu(e);
            }
        });
        
        mouseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mouseMenu(e);
            }
        });
        
        monitorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monitorMenu(e);
            }
        });
        
        headphoneButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                headphoneMenu(e);
            }
        });
        
        mousepadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mousepadMenu(e);
            }
        });

        editInfoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                edit(e);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exit(e);
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                back(e);
            }
        });
    }

    private void back(ActionEvent e)
    {
        frame.setVisible(false);
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new GamingEquipmentRental();
            }
        });
    }
    
    private void keyboardMenu(ActionEvent e)
    {
        frame.setSize(480,550);
        frame.setLocationRelativeTo(null);
        select.setText("SELECT A KEYBOARD:");

        s1.remove(keyboardButton);
        s2.remove(mouseButton);
        s3.remove(monitorButton);
        s4.remove(headphoneButton);
        s6.remove(editInfoButton);
        s6.remove(exitButton);
        contentPane.remove(s5);
        contentPane.remove(s6);

        s1Button = new JButton(keyboard1);
        s2Button = new JButton(keyboard2);
        s3Button = new JButton(keyboard3);
        s4Button = new JButton(keyboard4);
        
        s1.add(s1Button);
        s2.add(s2Button);
        s3.add(s3Button);
        s4.add(s4Button);
        s6.add(backButton, s6Constraints);
        contentPane.add(s6, gbc);

        Keyboard inst_kb = new Keyboard(s1Button, s2Button, s3Button, s4Button);
    }
    
    private void mouseMenu(ActionEvent e)
    {
        frame.setSize(480,550);
        frame.setLocationRelativeTo(null);
        select.setText("SELECT A MOUSE:");
        
        s1.remove(keyboardButton);
        s2.remove(mouseButton);
        s3.remove(monitorButton);
        s4.remove(headphoneButton);
        s6.remove(editInfoButton);
        s6.remove(exitButton);
        contentPane.remove(s5);
        contentPane.remove(s6);
        
        JButton s1Button = new JButton(mouse1);
        JButton s2Button = new JButton(mouse2);
        JButton s3Button = new JButton(mouse3);
        JButton s4Button = new JButton(mouse4);
        
        s1.add(s1Button);
        s2.add(s2Button);
        s3.add(s3Button);
        s4.add(s4Button);
        s6.add(backButton, s6Constraints);
        contentPane.add(s6, gbc);

        Mouse inst_mouse = new Mouse(s1Button, s2Button, s3Button, s4Button);
    }
    
    private void monitorMenu(ActionEvent e)
    {
        frame.setSize(480,550);
        frame.setLocationRelativeTo(null);
        select.setText("SELECT A MONITOR:");
        
        s1.remove(keyboardButton);
        s2.remove(mouseButton);
        s3.remove(monitorButton);
        s4.remove(headphoneButton);
        s6.remove(editInfoButton);
        s6.remove(exitButton);
        contentPane.remove(s5);
        contentPane.remove(s6);
        contentPane.remove(s5);
        contentPane.remove(s6);
        
        JButton s1Button = new JButton(monitor1);
        JButton s2Button = new JButton(monitor2);
        JButton s3Button = new JButton(monitor3);
        JButton s4Button = new JButton(monitor4);
        
        s1.add(s1Button);
        s2.add(s2Button);
        s3.add(s3Button);
        s4.add(s4Button);
        s6.add(backButton, s6Constraints);
        contentPane.add(s6, gbc);

        Monitor inst_monitor = new Monitor(s1Button, s2Button, s3Button, s4Button);
    }
    
    private void headphoneMenu(ActionEvent e)
    {
        frame.setSize(480,550);
        frame.setLocationRelativeTo(null);
        select.setText("SELECT A HEADPHONE:");
        
        s1.remove(keyboardButton);
        s2.remove(mouseButton);
        s3.remove(monitorButton);
        s4.remove(headphoneButton);
        s6.remove(editInfoButton);
        s6.remove(exitButton);
        contentPane.remove(s5);
        contentPane.remove(s6);
        
        JButton s1Button = new JButton(headphone1);
        JButton s2Button = new JButton(headphone2);
        JButton s3Button = new JButton(headphone3);
        JButton s4Button = new JButton(headphone4);
        
        s1.add(s1Button);
        s2.add(s2Button);
        s3.add(s3Button);
        s4.add(s4Button);
        s6.add(backButton, s6Constraints);
        contentPane.add(s6, gbc);

        Headphone inst_headphone = new Headphone(s1Button, s2Button, s3Button, s4Button);
    }
    
    private void mousepadMenu(ActionEvent e)
    {
        frame.setSize(480,550);
        frame.setLocationRelativeTo(null);
        select.setText("SELECT A MOUSEPAD:");
        
        s1.remove(keyboardButton);
        s2.remove(mouseButton);
        s3.remove(monitorButton);
        s4.remove(headphoneButton);
        s6.remove(editInfoButton);
        s6.remove(exitButton);
        contentPane.remove(s5);
        contentPane.remove(s6);
        
        JButton s1Button = new JButton(mousepad1);
        JButton s2Button = new JButton(mousepad2);
        JButton s3Button = new JButton(mousepad3);
        JButton s4Button = new JButton(mousepad4);
        
        s1.add(s1Button);
        s2.add(s2Button);
        s3.add(s3Button);
        s4.add(s4Button);
        s6.add(backButton, s6Constraints);
        contentPane.add(s6, gbc);

        Mousepad inst_mousepad = new Mousepad(s1Button, s2Button, s3Button, s4Button);
    }

    private void edit(ActionEvent e)
    {
        frame.setVisible(false);
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main();
            }
        });
    }

    private void exit(ActionEvent e)
    {
        System.exit(0);
    }
}
