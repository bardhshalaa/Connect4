import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton extends JButton implements ActionListener {

    public ExitButton(String label) {
        super(label);
        addActionListener(this);
        setFont(new Font("Ink Free",Font.BOLD,12));
        setPreferredSize(new Dimension(100,50));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setAlignmentY(Component.CENTER_ALIGNMENT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

