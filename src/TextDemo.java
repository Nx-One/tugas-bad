import javax.swing.*;
import java.awt.*;

public class TextDemo extends JFrame {
    public TextDemo(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        JLabel labelName = new JLabel("Full Name : ");
        JLabel labelAddress = new JLabel("Address : ");
        JLabel labelPassword = new JLabel("Password : ");
        JTextField textName = new JTextField("Janz", 10);
        JTextArea textAddress;
        JScrollPane scrollPane = new JScrollPane(textAddress = new JTextArea("Jl. Kebun Jeruk 27", 5, 20));
        JPasswordField textPassword = new JPasswordField(10);
        textName.setEditable(true);
        textName.setForeground(Color.RED);
        textName.setHorizontalAlignment(SwingConstants.RIGHT);
        textAddress.setLineWrap(true);
        textAddress.setWrapStyleWord(true);
        textAddress.setForeground(Color.BLUE);
        textAddress.setFont(new Font("Courier", Font.BOLD, 14));
        add(labelName);
        add(textName);
        add(labelAddress);
        add(scrollPane);
        add(labelPassword);
        add(textPassword);
    }

    public static void main(String[] args) {
        JFrame frame = new TextDemo();
        frame.setTitle("Text Testing");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
