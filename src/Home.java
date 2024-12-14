package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements MouseListener {
    
    public Home() {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1400, 600);
        add(image);
        
        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        heading.setBounds(500, 40, 1000, 40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
        image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        // Flight Details Menu
        JMenu flightDetails = new JMenu("Flight Details");
        flightDetails.addMouseListener(this);
        menubar.add(flightDetails);
        
        // Customer Details Menu
        JMenu customerDetails = new JMenu("Add Customer Details");
        customerDetails.addMouseListener(this);
        menubar.add(customerDetails);
        
        // Book Flight Menu
        JMenu bookFlight = new JMenu("Book Flight");
        bookFlight.addMouseListener(this);
        menubar.add(bookFlight);
        
        // Journey Details Menu
        JMenu journeyDetails = new JMenu("Journey Details");
        journeyDetails.addMouseListener(this);
        menubar.add(journeyDetails);
        
        // Ticket Cancellation Menu
        JMenu ticketCancellation = new JMenu("Cancel Ticket");
        ticketCancellation.addMouseListener(this);
        menubar.add(ticketCancellation);
        
        // Boarding Pass Menu
        JMenu boardingPass = new JMenu("Boarding Pass");
        boardingPass.addMouseListener(this);
        menubar.add(boardingPass);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        JMenu source = (JMenu) me.getSource();
        String text = source.getText();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        } else if (text.equals("Boarding Pass")) {
            new BoardingPass();
        }
    }
    
    @Override
    public void mousePressed(MouseEvent me) {}
    @Override
    public void mouseReleased(MouseEvent me) {}
    @Override
    public void mouseEntered(MouseEvent me) {}
    @Override
    public void mouseExited(MouseEvent me) {}
    
    public static void main(String[] args) {
        new Home();
    }
}
    

