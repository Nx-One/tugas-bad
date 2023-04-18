import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        this.setTitle("Tugas Binus");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000,1000);

        ImageIcon icon = new ImageIcon(MyFrame.class.getResource("/image/binus.png"));
        this.setIconImage(icon.getImage());
        this.setVisible(true);
    }
}
