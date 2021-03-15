import java.util.Scanner;
/*
team members: Arturo Villalobos
Date: 3-8-21
Assignment: group project 1
*/

/*Instructions: Refer to the instructions on Canvas.
*/

class BounceBattle
{
    public static void main(String[] args)
    {
        //lets hold off on the actual coding part 
        // i want to gwt our rules down then kinda spread the work
        // if you already cloned the repo you can delete that from your machine 
        // it would probably be helpful if we all met on some day soon and talked about 
        // how working together is actually going to work and then we can get everyone set up and 
        // on the same page.


        Scanner input = new Scanner(System.in);
        System.out.println("\nHello! welcome to bounce battle!\nThe game mode you pick will decide what the rules will be.");
        System.out.println("\n(1) BIRD'S EYE TIC-TAC-TOE BATTLE!\n\t2 players -- Be the first to get three balls in-a-row as seen from above the cube;\n\tonly the top balls in any space count (block your opponent!).");
        System.out.println("\n(2) LUCKY 13 BATTLE!\n\t2 players -- Be the first to bounce 13 balls into any location in the cube.");
        System.out.println("\n(3) GREAT WALL BATTLE\n\t2 players -- Be the first to bounce nine balls into the wall closest to you.\n\tIn this battle, it does not matter which ball colors are used.\n\tIf you bounce in your opponent’s wall, however, the ball stays in place.");
        System.out.println("\n(4) POINT BALL BATTLE\n\t2 players -- Be the first to score 21 points.  Points are scored by bouncing balls into the cube.\n\tThe front vertical wall is worth one point per ball, the middle vertical wall is worth two points per ball and \n\tthe back vertical wall is worth three points per ball.\n\tEach player gets to bounce three balls per turn.  Each player gets the same amount of turns.\n\tAfter each round, add up the score and play additional rounds as necessary until there is a winner.");
        System.out.println("\nPlease choose from one of the game modes above. (enter 1-4)");
        int choice  = input.nextInt();
        System.out.println(choice);






    }//end main
}//end class

