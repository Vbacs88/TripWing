/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author KANYE YEAST
 */
import javax.swing.JButton;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class CustomButton extends JButton {

    public CustomButton(String text) {
        super(text); // Call the constructor of the JButton class with the text
        // Set default properties
        this.setOpaque(true);
        this.setBorderPainted(false);
    }

    // Method to set the background color
    public void setBackgroundColor(Color color) {
        this.setBackground(color);
    }

    // Method to set the text color
    public void setTextColor(Color color) {
        this.setForeground(color);
    }

    // Method to set the font
    public void setButtonFont(Font font) {
        this.setFont(font);
    }

    // Method to set the border
    public void setButtonBorder(Border border) {
        this.setBorder(border);
    }

    // Add more customization methods as needed
}

// Usage example:
// CustomButton myButton = new CustomButton("Click Me!");
// myButton.setBackgroundColor(Color.BLUE);
// myButton.setTextColor(Color.WHITE);
// myButton.setButtonFont(new Font("Arial", Font.BOLD, 16));
// myButton.setButtonBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

