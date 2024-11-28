package dev.desktop.JEditor;

import java.io.IOException;
import java.awt.event.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws IOException {
        launcher();
    }

    protected static void launcher() throws IOException {
        JFrame launcher = new JFrame("JEditor launcher");
        launcher.setSize(1200, 700);
        launcher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        launcher.setLayout(null);

        JButton select = new JButton("Choose File");
        select.setBounds(50, 50, 200, 50);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser n = new JFileChooser();
                int returnValue = n.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        editor c = new editor(n.getSelectedFile().getAbsolutePath());
                        c.open();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        launcher.add(select);
        launcher.setVisible(true);
    }
}
