import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main
{
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    
    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    
    private JLabel CustomInvalid1 = new JLabel();
    private JLabel CustomInvalid2 = new JLabel();
    private JLabel CustomInvalid3 = new JLabel();

    private JTextField txt1 = new JTextField();
    private JTextField txt2 = new JTextField();
    private JTextField txt3 = new JTextField();
    
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    protected static String customerName, address, contactNumber;
    
    CustomerInfo customer = new CustomerInfo();
    
    public Main()
    {
        frame.setTitle("Gaming Equipment Rental");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(375,250);
        frame.setLocationRelativeTo(null);
        
        frame.add(panel);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        
        label1.setText("Name: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label1, gbc);
        
        label2.setText("Address: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(label2, gbc);
        
        label3.setText("Contact Number: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(label3, gbc);
        
        txt1.setText("");
        txt1.setColumns(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(txt1, gbc);
        
        txt2.setText("");
        txt2.setColumns(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(txt2, gbc);
        
        txt3.setText("");
        txt3.setColumns(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(txt3, gbc);
        
        button1.setText("START ORDERING");
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(button1, gbc);
        
        button2.setText("EXIT");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(button2, gbc);
        
        CustomInvalid1.setText("");
        CustomInvalid1.setFont(new Font("Serif", Font.BOLD, 15));
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(CustomInvalid1, gbc);
        
        CustomInvalid2.setText("");
        CustomInvalid2.setFont(new Font("Serif", Font.BOLD, 15));
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(CustomInvalid2, gbc);
        
        CustomInvalid3.setText("");
        CustomInvalid3.setFont(new Font("Serif", Font.BOLD, 15));
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(CustomInvalid3, gbc);
        
        button1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                customerName = txt1.getText();
                address = txt2.getText();
                contactNumber = txt3.getText();
                
                customer.setCustomer(customerName, address, contactNumber);
                if (customer.getCustomerName().equals(""))
                {
                    CustomInvalid1.setForeground(Color.RED);
                    CustomInvalid1.setText("Invalid!");
                }
                else
                {
                    CustomInvalid1.setForeground(Color.GREEN);
                    CustomInvalid1.setText("Valid");
                    if (!customer.getAddress().equals("") && (!customer.getContactNumber().equals(""))){
                        gamingER(e);
                    }
                }
                
                if (customer.getAddress().equals(""))
                {
                    CustomInvalid2.setForeground(Color.RED);
                    CustomInvalid2.setText("Invalid!");
                }
                else
                {
                    CustomInvalid2.setForeground(Color.GREEN);
                    CustomInvalid2.setText("Valid");
                }
                
                if (customer.getContactNumber().equals(""))
                {
                    CustomInvalid3.setForeground(Color.RED);
                    CustomInvalid3.setText("Invalid!");
                }
                else
                {
                    CustomInvalid3.setForeground(Color.GREEN);
                    CustomInvalid3.setText("Valid");
                }
            }
        });

        button2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                exit(e);
            }
        });
    }
    
    private void gamingER(ActionEvent e)
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

    private void exit(ActionEvent e)
    {
        System.exit(0);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main();
            }
        });
    }
}