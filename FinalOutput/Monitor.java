import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Monitor 
{
    private JFrame frame = new JFrame();
    private JButton mt1, mt2, mt3, mt4;
    private int rentalDays, rentalPrice, yesOption;

    public Monitor(JButton s1Button, JButton s2Button, JButton s3Button, JButton s4Button)
    {
        mt1 = s1Button;
        mt2 = s2Button;
        mt3 = s3Button;
        mt4 = s4Button;

        mt1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                monitor1(e);
            }
        });

        mt2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                monitor2(e);
            }
        });

        mt3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                monitor3(e);
            }
        });

        mt4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                monitor4(e);
            }
        });
    }
    
    protected void monitor1(ActionEvent e)
    {   
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                     " + "Samsung Odyssey" +
            "\nResolution:             " + "2560 x 1440 pixels" +
            "\nSpecial Feature:   " + "Curved, High Dynamic Range" +
            "\nScreen Size:          " + "26.9 inches" +
            "\nRefresh Rate:        " + "240 Hz" +
            "\n\nDo you want to rent this monitor for 50PHP per day?", "Samsung Odyssey G7 Curved Gaming Monitor",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Samsung Odyssey G7 Curved Gaming Monitor", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 50;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Samsung Odyssey G7 Curved Gaming Monitor" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "50" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter monitorData = new FileWriter("MonitorData.txt");
                    monitorData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Samsung Odyssey G7 Curved Gaming Monitor" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "50" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    monitorData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void monitor2(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                     " + "ASUS ROG" +
            "\nResolution:             " + "2560 x 1440 pixels" +
            "\nSpecial Feature:   " + "Adaptive Synch" +
            "\nScreen Size:          " + "27 inches" +
            "\nRefresh Rate:        " + "170 Hz" +
            "\n\nDo you want to rent this monitor for 50PHP per day?", "Asus ROG STRIX XG27VQ Gaming Monitor",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Asus ROG STRIX XG27VQ Gaming Monitor", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 50;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Asus ROG STRIX XG27VQ Gaming Monitor" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "50" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter monitorData = new FileWriter("MonitorData.txt");
                    monitorData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Asus ROG STRIX XG27VQ Gaming Monitor" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "50" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    monitorData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void monitor3(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                     " + "Acer Predator" +
            "\nResolution:             " + "3840 x 2160 pixels" +
            "\nSpecial Feature:   " + "Wide Screen, Wide Gamut" +
            "\nScreen Size:          " + "27 inches" +
            "\nRefresh Rate:        " + "144 Hz" +
            "\n\nDo you want to rent this monitor for 50PHP per day?", "Acer Predator XB273K Gaming Monitor",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Acer Predator XB273K Gaming Monitor", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 50;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Acer Predator XB273K Gaming Monitor" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "50" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter monitorData = new FileWriter("MonitorData.txt");
                    monitorData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Acer Predator XB273K Gaming Monitor" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "50" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    monitorData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void monitor4(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:                     " + "Gamdias ATLAS" +
            "\nResolution:             " + "2560 x 1440 pixels" +
            "\nSpecial Feature:   " + "G-SYNC, Freesync" +
            "\nScreen Size:          " + "31 inches" +
            "\nRefresh Rate:        " + "144 Hz" +
            "\n\nDo you want to rent this monitor for 50PHP per day?", "Gamdias ATLAS Gaming Monitor",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Gamdias ATLAS Gaming Monitor", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 50;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Gamdias ATLAS Gaming Monitor" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "50" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter monitorData = new FileWriter("MonitorData.txt");
                    monitorData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Gamdias ATLAS Gaming Monitor" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "50" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    monitorData.close();
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