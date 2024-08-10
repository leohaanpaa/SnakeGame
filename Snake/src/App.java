import javax.swing.*; //creates the window for the game

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;  //defines the width of the window
        int boardHeight = boardWidth; //defines the height of the window(copies it from the width)

        JFrame frame = new JFrame("Snake"); //creates the frame (name) for the program
        frame.setVisible(true); //makes the frame visible
        frame.setSize(boardWidth, boardHeight); //defines the size of the frame
        frame.setLocation(null); //opens the window in the middle of the screen
        frame.setResizable(false); //makes the window unable to be resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the program terminate when close (x) is pressed
        

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        
    }
}
