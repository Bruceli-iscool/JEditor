package dev.desktop.JEditor;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.*;
import javax.swing.*;
import java.nio.file.*;
public class editor {
    String f;
    JFrame n;
    String content;
    public editor(String filename) throws IOException {
        n = new JFrame("JEditor " + filename);
        f = filename;
        n.setSize(1600, 900);
        content = Files.readString(Paths.get(filename));
    }
    public void open() {
        n = new JFrame("JEditor " + f);
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileWriter nm;
                try {
                    nm = new FileWriter(f);
                    try {
                        nm.write(content);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        n.add(saveButton);
        JButton load = new JButton("Load");
        // implement load
    }
}
