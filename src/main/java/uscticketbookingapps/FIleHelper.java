/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscticketbookingapps;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author niyi
 */
public class FIleHelper {

    public static String readFile(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException ex) {
            Logger.getLogger(FIleHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return content;
    }

    public static String writeToFile(String filePath, String content) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FIleHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "done";
    }
}
