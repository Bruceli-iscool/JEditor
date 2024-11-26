package dev.desktop.JEditor;
import java.io.IOException;
import java.awt.event.*;
import javax.swing.*;
public class App {
    public static void main(String args[]) {
        
    }
    protected static void launcher() throws IOException {
        JFrame launcher = new JFrame("JEditor launcher");
        launcher.setSize(1200, 700);
        JButton select = new JButton("Choose File");
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser n = new JFileChooser();
                try {
                    editor c = new editor(n.getSelectedFile().getAbsolutePath());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        launcher.add(select);
        // add default close operation
    }
}