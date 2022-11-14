import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Headphone 
{
    private JFrame frame = new JFrame();
    private JButton hp1, hp2, hp3, hp4;
    private int rentalDays, rentalPrice, yesOption;

    public Headphone(JButton s1Button, JButton s2Button, JButton s3Button, JButton s4Button)
    {
        hp1 = s1Button;
        hp2 = s2Button;
        hp3 = s3Button;
        hp4 = s4Button;

        hp1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                headphone1(e);
            }
        });

        hp2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                headphone2(e);
            }
        });

        hp3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                headphone3(e);
            }
        });

        hp4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                headphone4(e);
            }
        });
    }
    
    protected void headphone1(ActionEvent e)
    {   
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                                  " + "Logitech G" +
            "\nDriver:                                  " + "PRO-G 40mm" +
            "\nFrequency Response:      " + "20 Hz-20Hz" +
            "\nImpedance:                        " + "39 Ohms" +
            "\nSensitivity:                          " + "\t87.5 dB SPL/mW" +
            "\n\nDo you want to rent this headphone for 15PHP per day?", "Logitech G733 LIGHTSPEED Gaming Headset",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Logitech G733 LIGHTSPEED Gaming Headset", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 15;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Logitech G733 LIGHTSPEED Gaming Headset" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "15" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter hpData = new FileWriter("HeadphoneData.txt");
                    hpData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Logitech G733 LIGHTSPEED Gaming Headset" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "15" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    hpData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void headphone2(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                                  " + "Razer Kraken" +
            "\nDriver:                                  " + "Custom-tuned 40mm" +
            "\nFrequency Response:      " + "12 Hz-28 kHz" +
            "\nImpedance:                        " + "32 Ohm" +
            "\nSensitivity:                          " + "109 dB SPL/mW" +
            "\n\nDo you want to rent this headphone for 15PHP per day?", "Razer Kraken X Wired Gaming Headset",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Razer Kraken X Wired Gaming Headset", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 15;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Razer Kraken X Wired Gaming Headset" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "15" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter hpData = new FileWriter("HeadphoneData.txt");
                    hpData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Razer Kraken X Wired Gaming Headset" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "15" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    hpData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void headphone3(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                                  " + "Steelseries Artics 1" +
            "\nDriver:                                  " + "Custom-tuned 40mm" +
            "\nFrequency Response:      " + "20-20000 Hz" +
            "\nImpedance:                        " + "32 Ohm" +
            "\nSensitivity:                          " + "-38 dBV/Pa" +
            "\n\nDo you want to rent this headphone for 15PHP per day?", "Steelseries Arctics 1 Gaming Headset",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Steelseries Arctics 1 Gaming Headset", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 15;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Steelseries Arctics 1 Gaming Headset" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "15" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter hpData = new FileWriter("HeadphoneData.txt");
                    hpData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Steelseries Arctics 1 Gaming Headset" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "15" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    hpData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void headphone4(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                                  " + "FANTECH Captain" +
            "\nDriver:                                  " + "40mm" +
            "\nFrequency Response:      " + "20-20000 Hz" +
            "\nImpedance:                        " + "32 Ohm" +
            "\nSensitivity:                          " + "108+/-3dB" +
            "\n\nDo you want to rent this headphone for 15PHP per day?", "FANTECH HG11 Captain Gaming Headset",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "FANTECH HG11 Captain Gaming Headset", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 15;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "FANTECH HG11 Captain Gaming Headset" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "15" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter hpData = new FileWriter("HeadphoneData.txt");
                    hpData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "FANTECH HG11 Captain Gaming Headset" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "15" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    hpData.close();
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
