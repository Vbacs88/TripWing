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
import javax.swing.*;
import java.awt.datatransfer.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class ImageDropHandler extends TransferHandler {

    @Override
    public boolean canImport(TransferSupport support) {
        // We only import Image data
        return support.isDataFlavorSupported(DataFlavor.imageFlavor);
    }

    @Override
    public boolean importData(TransferSupport support) {
        // If we can't handle the import, bail
        if (!canImport(support)) {
            return false;
        }

        // Fetch the Transferable and its data
        Transferable transferable = support.getTransferable();
        BufferedImage bi;
        try {
            bi = (BufferedImage) transferable.getTransferData(DataFlavor.imageFlavor);
        } catch (UnsupportedFlavorException | IOException e) {
            // Shouldn't happen, we've already checked
            return false;
        }

        // Fetch the drop target and set the image as its icon
        JLabel label = (JLabel) support.getComponent();
        label.setIcon(new ImageIcon(bi));
        return true;
    }
}

