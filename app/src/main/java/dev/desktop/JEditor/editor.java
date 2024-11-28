package dev.desktop.JEditor;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import javax.swing.*;
import java.awt.event.*;

public class editor {
    String f;
    JFrame n;
    String content;

    public editor(String filename) throws IOException {
        f = filename;
        content = Files.readString(Paths.get(f));
        n = new JFrame("JEditor " + f);
        n.setSize(1600, 900);
        n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        n.setLayout(null);
        JTextArea a = new JTextArea();
        a.setText(content);
        JScrollPane p = new JScrollPane(a);
        p.setBounds(50, 50, 1500, 200);
        JButton saveButton = new JButton("Save");
        saveButton.setBounds(50, 300, 100, 30);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (FileWriter nm = new FileWriter(f)) {
                    content = a.getText();
                    nm.write(content);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        JButton loadButton = new JButton("Load");
        loadButton.setBounds(200, 300, 100, 30);
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // implement
            }
        });

        n.add(p);
        n.add(saveButton);
        n.add(loadButton);
    }

    public void open() {
        n.setVisible(true);
    }
}
