import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lambda Button Example");
        JButton button = new JButton("Click Me");

        // Add ActionListener using lambda
        button.addActionListener(e -> System.out.println("Button clicked!"));

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
