package dev.desktop.ide;
import java.io.File;
import javax.swing.*;

public class Ide {
    File f;
    JFrame n;
    public Ide(String filename) {
        f = new File(filename);
        n = new JFrame("IDE Editor");
    }
}
