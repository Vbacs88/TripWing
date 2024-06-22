/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class FontManager {

    private static final Map<String, Font> fonts = new HashMap<>();

    static {
        loadFont("Poppins-ExtraBold", "/fonts/Poppins-ExtraBold.ttf");
        loadFont("Poppins-Regular", "/fonts/Poppins-Regular.ttf");
        // Add more fonts as needed
    }
    //sample
    //FontManager.getFont("Poppins-Regular").deriveFont(Font.PLAIN, 12)

    private static void loadFont(String fontName, String path) {
        try {
            InputStream fontStream = FontManager.class.getResourceAsStream(path);
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            fonts.put(fontName, font);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
    }

    public static Font getFont(String fontName) {
        return fonts.get(fontName);
    }
}


