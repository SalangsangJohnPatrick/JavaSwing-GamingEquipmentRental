import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Mouse 
{
    private JFrame frame = new JFrame();
    private JButton ms1, ms2, ms3, ms4;
    private int rentalDays, rentalPrice, yesOption;

    public Mouse(JButton s1Button, JButton s2Button, JButton s3Button, JButton s4Button)
    {
        ms1 = s1Button;
        ms2 = s2Button;
        ms3 = s3Button;
        ms4 = s4Button;

        ms1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mouse1(e);
            }
        });

        ms2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mouse2(e);
            }
        });

        ms3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mouse3(e);
            }
        });

        ms4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mouse4(e);
            }
        });
    }
    
    protected void mouse1(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                     " + "Logitech G" +
            "\nConnectivity:         " + "Wireless" +
            "\nSpecial Feature:   " + "Wireless" +
            "\nColor:                      " + "Black" +
            "\nTechnology:          " + "Optical" +
            "\n\nDo you want to rent this mouse for 10PHP per day?", "Logitech Gaming Mouse G903",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Logitech Gaming Mouse G903", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 10;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Logitech Gaming Mouse G903" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "10" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter mouseData = new FileWriter("MouseData.txt");
                    mouseData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Logitech Gaming Mouse G903" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "10" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    mouseData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void mouse2(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                     " + "Razer" +
            "\nConnectivity:         " + "USB" +
            "\nSpecial Feature:   " + "Ergonomic Design" +
            "\nColor:                      " + "Classic Black" +
            "\nTechnology:          " + "Optical" + 
            "\n\nDo you want to rent this mouse for 10PHP per day?", "Razer Mamba Mouse",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Razer Mamba Mouse", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 10;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Razer Mamba Mouse" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "10" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);
    
                try 
                {
                    FileWriter mouseData = new FileWriter("MouseData.txt");
                    mouseData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Razer Mamba Mouse" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "10" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    mouseData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void mouse3(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                     " + "SteelSeries" +
            "\nConnectivity:         " + "Micro USB" +
            "\nSpecial Feature:   " + "Lighting" +
            "\nColor:                      " + "Black" +
            "\nTechnology:          " + "Optical" + 
            "\n\nDo you want to rent this mouse for 10PHP per day?", "Steelseries Sensei 310 Mouse",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Steelseries Sensei 310 Mouse", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 10;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Steelseries Sensei 310 Mouse" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "10" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);
    
                try 
                {
                    FileWriter mouseData = new FileWriter("MouseData.txt");
                    mouseData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Steelseries Sensei 310 Mouse" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "10" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    mouseData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void mouse4(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                     " + "FANTECH" +
            "\nConnectivity:         " + "Micro USB" +
            "\nSpecial Feature:   " + "Ergonomic Design" +
            "\nColor:                      " + "Black" +
            "\nTechnology:          " + "Optical" + 
            "\n\nDo you want to rent this mouse for 10PHP per day?", "FANTECH X9 Gaming Mouse",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "FANTECH X9 Gaming Mouse", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 10;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "FANTECH X9 Gaming Mouse" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "10" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);
    
                try 
                {
                    FileWriter mouseData = new FileWriter("MouseData.txt");
                    mouseData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "FANTECH X9 Gaming Mouse" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "10" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    mouseData.close();
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