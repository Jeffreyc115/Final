import javax.swing.*;

public class Frame
{
    private JFrame window;

    public Frame()
    {
        window = new JFrame();
    }

    public void initializeWindow()
    {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Defeat Covid!");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}
