import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Keyboard 
{
    private JFrame frame = new JFrame();
    private JButton kb1, kb2, kb3, kb4;
    private int rentalDays, rentalPrice, yesOption;
    
    public Keyboard(JButton s1Button, JButton s2Button, JButton s3Button, JButton s4Button)
    {
        kb1 = s1Button;
        kb2 = s2Button;
        kb3 = s3Button;
        kb4 = s4Button;

        kb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                keyboard1(e);
            }
        });

        kb2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                keyboard2(e);
            }
        });

        kb3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                keyboard3(e);
            }
        });

        kb4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                keyboard4(e);
            }
        });
    }
    
    protected void keyboard1(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                    " + "Logitech G" +
            "\nConnectivity:        " + "Micro USB" +
            "\nSpecial Feature:  " + "Lighting" +
            "\nColor:                     " + "Black" +
            "\nNumber of Keys:   " + "90" +
            "\nStyle:                      " + "G Pro Keyboard" +    
            "\nMaterial:                " + "Rubber" +
            "\n\nDo you want to rent this keyboard for 20PHP per day?", "Logitech G Pro Mechanical Keyboard",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Logitech G Pro Mechanical Keyboard", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 20;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Logitech G Pro Mechanical Keyboard" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "20" + " PHP per day" +
                    "\nTotal Price:          " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter keyboardData = new FileWriter("KeyboardData.txt");
                    keyboardData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Logitech G Pro Mechanical Keyboard" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "20" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    keyboardData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void keyboard2(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                    " + "Razer" +
            "\nConnectivity:        " + "Wired - Attached" +
            "\nSpecial Feature:  " + "Tactile and Clicky" +
            "\nColor:                     " + "Black" +
            "\nNumber of Keys:   " + "104" +
            "\nStyle:                      " + "Black Widow Elite" +    
            "\nMaterial:                " + "Aluminum Alloy" +
            "\n\nDo you want to rent this keyboard for 20PHP per day?", "Razer Blackwidow Elite Mechanical Keyboard",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                    "Enter Rental Days: ", "Razer Blackwidow Elite Mechanical Keyboard", 
                    JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 20;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:  " + "Razer Blackwidow Elite Mechanical Keyboard" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "20" + " PHP per day" +
                    "\nTotal Price:          " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);
                
                try
                {
                    FileWriter keyboardData = new FileWriter("KeyboardData.txt");
                    keyboardData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Razer Blackwidow Elite Mechanical Keyboard" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "20" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    keyboardData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void keyboard3(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                    " + "SteelSeries" +
            "\nConnectivity:        " + "Micro USB" +
            "\nSpecial Feature:  " + "Lighting" +
            "\nColor:                     " + "Hybrid Blue" +
            "\nNumber of Keys:   " + "104" +
            "\nStyle:                      " + "Hybrid Mechanical Gaming Keyboard" +    
            "\nMaterial:                " + "Aluminum Alloy" +
            "\n\nDo you want to rent this keyboard for 20PHP per day?", "SteelSeries Apex 5 Hybrid Mechanical Keyboard",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        try
        {    
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                    "Enter Rental Days: ", "SteelSeries Apex 5 Hybrid Mechanical Keyboard", 
                    JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 20;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:  " + "SteelSeries Apex 5 Hybrid Mechanical Keyboard" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "20" + " PHP per day" +
                    "\nTotal Price:          " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);
                try 
                {
                    FileWriter keyboardData = new FileWriter("KeyboardData.txt");
                    keyboardData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "SteelSeries Apex 5 Hybrid Mechanical Keyboard" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "20" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    keyboardData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void keyboard4(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                    " + "FANTECH" +
            "\nConnectivity:        " + "Micro USB" +
            "\nSpecial Feature:  " + "Lighting" +
            "\nColor:                     " + "White" +
            "\nNumber of Keys:   " + "104" +
            "\nStyle:                      " + "MAXPOWER" +    
            "\nMaterial:                " + "Metal" +
            "\n\nDo you want to rent this keyboard for 20PHP per day?", "Fantech MAXPOWER MK853 Mechanical Keyboard",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                    "Enter Rental Days: ", "Fantech MAXPOWER MK853 Mechanical Keyboard", 
                    JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 20;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:  " + "Fantech MAXPOWER MK853 Mechanical Keyboard" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "20" + " PHP per day" +
                    "\nTotal Price:          " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);
                try 
                    {
                    FileWriter keyboardData = new FileWriter("KeyboardData.txt");
                    keyboardData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Fantech MAXPOWER MK853 Mechanical Keyboard" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "20" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    keyboardData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
            JOptionPane.ERROR_MESSAGE);
        }
    }
}
