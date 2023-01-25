import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButton extends JButton implements ActionListener {

    private ConnectBoard board;

    public PlayButton(String label, ConnectBoard board) {
        super(label);
        this.board = board;
        addActionListener(this);
        setFont(new Font("Ink Free",Font.BOLD,12));
        setPreferredSize(new Dimension(100,50));
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setAlignmentY(Component.CENTER_ALIGNMENT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        board.selectScreen();
    }
}
