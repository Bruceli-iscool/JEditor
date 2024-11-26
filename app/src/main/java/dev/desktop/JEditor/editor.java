package dev.desktop.JEditor;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import java.nio.file.*;
public class editor {
    File f;
    JFrame n;
    String content;
    public editor(String filename) throws IOException {
        n = new JFrame("JEditor " + filename);
        n.setSize(1600, 900);
        content = Files.readString(Paths.get(filename));
    }
}
