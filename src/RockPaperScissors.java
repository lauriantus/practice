import java.util.HashMap;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(rockPaperScissors("rock", "paper"));
        System.out.println(rockPaperScissors_V2("rock", "paper"));
    }

    /*
    Let's play! You have to return which player won! In case of a draw return Draw!.

    Examples(Input1, Input2 --> Output):

    "scissors", "paper" --> "Player 1 won!"
    "scissors", "rock" --> "Player 2 won!"
    "paper", "paper" --> "Draw!"
    */
    public static String rockPaperScissors(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        if (p1.equals("rock") && p2.equals("scissors")
                || p1.equals("scissors") && p2.equals("paper")
                || p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }

    public static String rockPaperScissors_V2(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else {
            HashMap<String, String> game = new HashMap<>();

            game.put("scissors", "paper");
            game.put("paper", "rock");
            game.put("rock", "scissors");

            String temp = game.get(p2);
            if (temp.equals(game.get(p1))) return "Player 1 won!";
            else return "Player 2 won!";
        }
    }
}