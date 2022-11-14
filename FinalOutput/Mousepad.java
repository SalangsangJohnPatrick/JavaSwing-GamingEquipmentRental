import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Mousepad 
{
    private JFrame frame = new JFrame();
    private JButton mp1, mp2, mp3, mp4;
    private int rentalDays, rentalPrice, yesOption;

    public Mousepad(JButton s1Button, JButton s2Button, JButton s3Button, JButton s4Button)
    {
        mp1 = s1Button;
        mp2 = s2Button;
        mp3 = s3Button;
        mp4 = s4Button;

        mp1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mousepad1(e);
            }
        });

        mp2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mousepad2(e);
            }
        });

        mp3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mousepad3(e);
            }
        });

        mp4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                mousepad4(e);
            }
        });
    }
    
    protected void mousepad1(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:               " + "Logitech G" +
            "\nThickness:       " + "1mm" +
            "\nSurface:           " + "Soft" +
            "\nSize:                  " + "Small" +
            "\nMaterial:           " + "Cloth" +
            "\n\nDo you want to rent this mousepad for 5PHP per day?", "Logitech G240 Mousepad",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Logitech G240 Mousepad", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 5;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Logitech G240 Mousepad" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "5" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter mousepadData = new FileWriter("MousepadData.txt");
                    mousepadData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Logitech G240 Mousepad" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "5" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    mousepadData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void mousepad2(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:               " + "Razer" +
            "\nThickness:       " + "3mm" +
            "\nSurface:           " + "Soft" +
            "\nSize:                  " + "Small" +
            "\nMaterial:           " + "Cloth" +
            "\n\nDo you want to rent this mousepad for 5PHP per day?", "Razer Goliathus Mousepad",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Razer Goliathus Mousepad", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 5;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Razer Goliathus Mousepad" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "5" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter mousepadData = new FileWriter("MousepadData.txt");
                    mousepadData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Razer Goliathus Mousepad" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "5" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    mousepadData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void mousepad3(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:               " + "SteelSeries" +
            "\nThickness:       " + "2mm" +
            "\nSurface:           " + "Soft" +
            "\nSize:                  " + "Small" +
            "\nMaterial:           " + "Cloth" +
            "\n\nDo you want to rent this mousepad for 5PHP per day?", "Steelseries Qck Mousepad",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "Steelseries Qck Mousepad", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 5;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "Steelseries Qck Mousepad" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "5" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter mousepadData = new FileWriter("MousepadData.txt");
                    mousepadData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "Steelseries Qck Mousepad" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "5" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    mousepadData.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Enter a numerical value.", "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    protected void mousepad4(ActionEvent e)
    {
        yesOption = JOptionPane.showConfirmDialog(frame,
            "Brand:               " + "FANTECH" +
            "\nThickness:       " + "4mm" +
            "\nSurface:           " + "Soft" +
            "\nSize:                  " + "Small" +
            "\nMaterial:           " + "Rubber" +
            "\n\nDo you want to rent this mousepad for 5PHP per day?", "FANTECH Sven Mousepad",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        try
        {
            if (yesOption == JOptionPane.YES_OPTION)
            {
                rentalDays = Integer.parseInt(JOptionPane.showInputDialog(frame, 
                "Enter Rental Days: ", "FANTECH Sven Mousepad", 
                JOptionPane.INFORMATION_MESSAGE));
                rentalPrice = rentalDays * 5;
                JOptionPane.showMessageDialog(frame,
                    "GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                    " + Main.customerName +
                    "\nAddress:               " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" +
                    "\nProduct Rented:  " + "FANTECH Sven Mousepad" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "5" + " PHP per day" +
                    "\nTotal Price:           " + rentalPrice + " PHP",
                    "Receipt", JOptionPane.INFORMATION_MESSAGE);

                try 
                {
                    FileWriter mousepadData = new FileWriter("MousepadData.txt");
                    mousepadData.write("GAMING EQUIPMENT RENTAL\n\n" +
                    "Name:                " + Main.customerName +
                    "\nAddress:             " + Main.address +
                    "\nContact No.:         " + Main.contactNumber + "\n" + 
                    "\nProduct Rented:      " + "FANTECH Sven Mousepad" + 
                    "\nRental Days:         " + rentalDays + " days" +
                    "\nRental Price:        " + "5" + " PHP per day" +
                    "\nTotal Price:         " + rentalPrice + " PHP");
                    mousepadData.close();
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