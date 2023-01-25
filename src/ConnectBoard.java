import javax.swing.*;
import java.awt.*;

public class ConnectBoard extends JFrame {

    private int rows;
    private int columns;
    private Tile[][] tiles;

    Container screen;


    public ConnectBoard(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.tiles = new Tile[rows][columns];
        mainScreen();
    }

    public void placeTile(int row, int column){

    }

    public void mainScreen(){
        getContentPane().removeAll();
        screen = getContentPane();
        JPanel labelPanel = new JPanel(new BorderLayout());
        labelPanel.setBackground(Color.white);
        JLabel label = new JLabel("Connect 4");
        label.setForeground(Color.black);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Ink Free",Font.BOLD,74));
        labelPanel.add(label, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.white);
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(new PlayButton("Play", this));
        buttonPanel.add(new ExitButton("Exit"));
//
        screen.setLayout(new GridLayout(2,1));
        screen.add(labelPanel);
        screen.add(buttonPanel);
//
//
//        JPanel playerSettings = new JPanel();
//        playerSettings.setBackground(Color.white);
//        playerSettings.setLayout(new BoxLayout(playerSettings,BoxLayout.X_AXIS));
//        playerSettings.setBounds(40,0,getWidth()-80,getHeight());
//
//        JPanel player1Settings = new JPanel(new BorderLayout());
//        player1Settings.setBackground(Color.white);
//        player1Settings.add(inputP1Name, BorderLayout.NORTH);
//        player1Settings.add(scrollP1, BorderLayout.CENTER);
//
//
//        JPanel player2Settings = new JPanel(new BorderLayout());
//        player2Settings.setBackground(Color.white);
//        player2Settings.add(inputP2Name, BorderLayout.NORTH);
//        player2Settings.add(scrollP2, BorderLayout.CENTER);
//
//        playerSettings.add(player1Settings);
//        playerSettings.add(player2Settings);
//        c.add(playerSettings);

        setSize(rows * 100, columns * 100);
        setTitle("Connect 4");
        setVisible(true);
        repaint();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void gameScreen(){

    }

    public void endScreen(){

    }

    public void selectScreen() {

    }
}
