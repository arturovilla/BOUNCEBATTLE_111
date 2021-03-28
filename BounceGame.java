import java.util.Scanner;
import java.util.Random;
/*
team members: Arturo Villalobos
Date: 3-8-21
Assignment: group project 1
*/
/*Instructions: Refer to the instructions on Canvas.
*/

class BounceBattle
{
    public static void printcube_simran()
    {
        System.out.println("        ___                   ___                  ___                              ");
        System.out.println("       /   /\\               /   /\\               /   /\\                          ");
        System.out.println("      /___/  \\             /___/  \\             /___/  \\                         ");
        System.out.println("     /   /\\  /\\           /   /\\  /\\           /   /\\  /\\                     ");
        System.out.println("    /___/  \\/  \\         /___/  \\/  \\         /___/  \\/  \\                    ");
        System.out.println("   /   /\\  /\\  /\\       /   /\\  /\\  /\\       /   /\\  /\\  /\\                ");
        System.out.println("  /___/  \\/  \\/  \\     /___/  \\/  \\/  \\     /___/  \\/  \\/  \\               ");
        System.out.println("  \\   \\  /\\  /\\  /     \\   \\  /\\  /\\  /     \\   \\  /\\  /\\  /          ");
        System.out.println("   \\___\\/  \\/  \\/       \\___\\/  \\/  \\/       \\___\\/  \\/  \\/           ");
        System.out.println("    \\   \\  /\\  /         \\   \\  /\\  /         \\   \\  /\\  /            ");
        System.out.println("     \\___\\/  \\/           \\___\\/  \\/           \\___\\/  \\/                 ");
        System.out.println("      \\   \\  /             \\   \\  /             \\   \\  /                     ");
        System.out.println("       \\___\\/               \\___\\/               \\___\\/                     ");
    }

    
    public static void printcube_joni()
    {
        System.out.println("        ___                   ___                  ___                              ");
        System.out.println("       /L  /\\               /M  /\\               /R  /\\                          ");
        System.out.println("      /___/  \\             /___/  \\             /___/  \\                         ");
        System.out.println("     /   /\\  /\\           /   /\\  /\\           /   /\\  /\\                     ");
        System.out.println("    /___/  \\/  \\         /___/  \\/  \\         /___/  \\/  \\                    ");
        System.out.println("   /   /\\  /\\  /\\       /   /\\  /\\  /\\       /   /\\  /\\  /\\                ");
        System.out.println("  /___/  \\/  \\/  \\     /___/  \\/  \\/  \\     /___/  \\/  \\/  \\               ");
        System.out.println("  \\   \\  /\\  /\\  /     \\   \\  /\\  /\\  /     \\   \\  /\\  /\\  /          ");
        System.out.println("   \\___\\/  \\/  \\/       \\___\\/  \\/  \\/       \\___\\/  \\/  \\/           ");
        System.out.println("    \\   \\  /\\  /         \\   \\  /\\  /         \\   \\  /\\  /            ");
        System.out.println("     \\___\\/  \\/           \\___\\/  \\/           \\___\\/  \\/                 ");
        System.out.println("      \\   \\  /             \\   \\  /             \\   \\  /                     ");
        System.out.println("       \\___\\/               \\___\\/               \\___\\/                     ");
    }
    public static void printcube_joni(String[][]ary1, String[][]ary2, String[][]ary3)
    {
        System.out.println("        ___                            ___                                ___                                                                              ");
        System.out.println("       /L  /\\                        /M  /\\                             /R  /\\                                                                                   ");
        System.out.println("      /___/  \\                      /___/  \\                           /___/  \\                                                                                                   ");
        System.out.println("     /   /\\"+ary3[0][0]+" /\\                    /   /\\"+ary3[0][1]+" /\\                         /   /\\"+ary3[0][2]+" /\\                                                           ");
        System.out.println("    /___/  \\/  \\                  /___/  \\/  \\                       /___/  \\/  \\                                                                                                 ");
        System.out.println("   /   /\\"+ary3[1][0]+" /\\"+ary2[0][0]+" /\\                /   /\\"+ary3[1][1]+" /\\"+ary2[0][1]+" /\\                     /   /\\"+ary3[1][2]+" /\\"+ary2[0][2]+" /\\                ");
        System.out.println("  /___/  \\/  \\/  \\              /___/  \\/  \\/  \\                   /___/  \\/  \\/  \\                                                                                                ");
        System.out.println("  \\   \\"+ary3[2][0]+" /\\"+ary2[1][0]+" /\\"+ary1[0][0]+" /              \\   \\"+ary3[2][1]+" /\\"+ary2[1][1]+" /\\"+ary1[0][1]+" /                   \\   \\"+ary3[2][2]+" /\\"+ary2[1][2]+" /\\"+ary1[0][2]+" / ");
        System.out.println("   \\___\\/  \\/  \\/                \\___\\/  \\/  \\/                     \\___\\/  \\/  \\/                                                                                                ");
        System.out.println("    \\   \\"+ary2[2][0]+" /\\"+ary1[1][0]+" /                  \\   \\"+ary2[2][1]+" /\\"+ary1[1][1]+" /                       \\   \\"+ary2[2][2]+" /\\"+ary1[1][2]+" /                ");
        System.out.println("     \\___\\/  \\/                    \\___\\/  \\/                         \\___\\/  \\/                                                                                       ");
        System.out.println("      \\   \\"+ary1[2][0]+" /                      \\   \\"+ary1[2][1]+" /                           \\   \\"+ary1[2][2]+" /                                                       ");
        System.out.println("       \\___\\/                        \\___\\/                             \\___\\/                                                                                        ");
    }

    public static void printcube_ruleArt()
    {
      System.out.println("        ___                   ___                  ___                              ");
      System.out.println("       /1  /\\               /2  /\\               /3  /\\                          ");
      System.out.println("      /___/  \\             /___/  \\             /___/  \\                         ");
      System.out.println("     /4  /\\  /\\           /5  /\\  /\\           /6  /\\  /\\                     ");
      System.out.println("    /___/  \\/  \\         /___/  \\/  \\         /___/  \\/  \\                    ");
      System.out.println("   /7  /\\  /\\  /\\       /8  /\\  /\\  /\\       /9  /\\  /\\  /\\                ");
      System.out.println("  /___/  \\/  \\/  \\     /___/  \\/  \\/  \\     /___/  \\/  \\/  \\               ");
      System.out.println("  \\   \\  /\\  /\\  /     \\   \\  /\\  /\\  /     \\   \\  /\\  /\\  /   /_________3-POINTS________        ");
      System.out.println("   \\___\\/  \\/  \\/       \\___\\/  \\/  \\/       \\___\\/  \\/  \\/    \\         ");
      System.out.println("    \\   \\  /\\  /         \\   \\  /\\  /         \\   \\  /\\  /   /_________2-POINTS________         ");
      System.out.println("     \\___\\/  \\/           \\___\\/  \\/           \\___\\/  \\/    \\              ");
      System.out.println("      \\   \\  /             \\   \\  /             \\   \\  /   /_________1-POINTS________                   ");
      System.out.println("       \\___\\/               \\___\\/               \\___\\/    \\                  ");
    }
    public static void printcube_art(String[][]ary1,String[][]ary2,String[][]ary3)
    {
      String s1 = "|";
      System.out.println("        ___                            ___                                ___                                                                              ");
      System.out.println("       /1  /\\                        /2  /\\                             /3  /\\                                                                                   ");
      System.out.println("      /___/  \\                      /___/  \\                           /___/  \\                                                                                                   ");
      System.out.println("     /4  /\\"+ary3[0][0]+" /\\                    /5  /\\"+ary3[0][1]+" /\\                         /6  /\\"+ary3[0][2]+" /\\                                                           ");
      System.out.println("    /___/  \\/  \\                  /___/  \\/  \\                       /___/  \\/  \\                                                                                                 ");
      System.out.println("   /7  /\\"+ary3[1][0]+" /\\"+ary2[0][0]+" /\\                /8  /\\"+ary3[1][1]+" /\\"+ary2[0][1]+" /\\                     /9  /\\"+ary3[1][2]+" /\\"+ary2[0][2]+" /\\                ");
      System.out.println("  /___/  \\/  \\/  \\              /___/  \\/  \\/  \\                   /___/  \\/  \\/  \\                                                                                                ");
      System.out.println("  \\   \\"+ary3[2][0]+" /\\"+ary2[1][0]+" /\\"+ary1[0][0]+" /              \\   \\"+ary3[2][1]+" /\\"+ary2[1][1]+" /\\"+ary1[0][1]+" /                   \\   \\"+ary3[2][2]+" /\\"+ary2[1][2]+" /\\"+ary1[0][2]+" / ");
      System.out.println("   \\___\\/  \\/  \\/                \\___\\/  \\/  \\/                     \\___\\/  \\/  \\/                                                                                                ");
      System.out.println("    \\   \\"+ary2[2][0]+" /\\"+ary1[1][0]+" /                  \\   \\"+ary2[2][1]+" /\\"+ary1[1][1]+" /                       \\   \\"+ary2[2][2]+" /\\"+ary1[1][2]+" /                ");
      System.out.println("     \\___\\/  \\/                    \\___\\/  \\/                         \\___\\/  \\/                                                                                       ");
      System.out.println("      \\   \\"+ary1[2][0]+" /                      \\   \\"+ary1[2][1]+" /                           \\   \\"+ary1[2][2]+" /                                                       ");
      System.out.println("       \\___\\/                        \\___\\/                             \\___\\/                                                                                        ");
    }
    
    public static void printcubejasmine(String[][] ary)
    {
        System.out.println("1   "+ ary[0][0]+"   |2  "+ary[0][1]+"   |3   "+ary[0][2]+"  ");
        System.out.println("        |       |       ");
        System.out.println("________|_______|_______");
        System.out.println("4   "+ ary[1][0]+"   |5  "+ary[1][1]+"   |6   "+ary[1][2]+"  ");
        System.out.println("        |       |       ");
        System.out.println("________|_______|_______");
        System.out.println("7   "+ ary[2][0]+"   |8  "+ary[2][1]+"   |9   "+ary[2][2]+"  ");
        System.out.println("        |       |       ");
    }




    public static void printGameTitle()
    {
        System.out.println("                    ___           ___           ___           ___           ___                         ___                                                 ___     ");
        System.out.println("     _____         /  /\\         /__/\\         /__/\\         /  /\\         /  /\\         _____         /  /\\          ___         ___                      /  /\\    ");
        System.out.println("    /  /::\\       /  /::\\        \\  \\:\\        \\  \\:\\       /  /:/        /  /:/_       /  /::\\       /  /::\\        /  /\\       /  /\\                    /  /:/_   ");
        System.out.println("   /  /:/\\:\\     /  /:/\\:\\        \\  \\:\\        \\  \\:\\     /  /:/        /  /:/ /\\     /  /:/\\:\\     /  /:/\\:\\      /  /:/      /  /:/    ___     ___    /  /:/ /\\  ");
        System.out.println("  /  /:/~/::\\   /  /:/  \\:\\   ___  \\  \\:\\   _____\\__\\:\\   /  /:/  ___   /  /:/ /:/_   /  /:/~/::\\   /  /:/~/::\\    /  /:/      /  /:/    /__/\\   /  /\\  /  /:/ /:/_ ");
        System.out.println(" /__/:/ /:/\\:| /__/:/ \\__\\:\\ /__/\\  \\__\\:\\ /__/::::::::\\ /__/:/  /  /\\ /__/:/ /:/ /\\ /__/:/ /:/\\:| /__/:/ /:/\\:\\  /  /::\\     /  /::\\    \\  \\:\\ /  /:/ /__/:/ /:/ /\\");
        System.out.println(" \\  \\:\\/:/~/:/ \\  \\:\\ /  /:/ \\  \\:\\ /  /:/ \\  \\:\\~~\\~~\\/ \\  \\:\\ /  /:/ \\  \\:\\/:/ /:/ \\  \\:\\/:/~/:/ \\  \\:\\/:/__\\/ /__/:/\\:\\   /__/:/\\:\\    \\  \\:\\  /:/  \\  \\:\\/:/ /:/");
        System.out.println("  \\  \\::/ /:/   \\  \\:\\  /:/   \\  \\:\\  /:/   \\  \\:\\  ~~~   \\  \\:\\  /:/   \\  \\::/ /:/   \\  \\::/ /:/   \\  \\::/      \\__\\/  \\:\\  \\__\\/  \\:\\    \\  \\:\\/:/    \\  \\::/ /:/ ");
        System.out.println("   \\  \\:\\/:/     \\  \\:\\/:/     \\  \\:\\/:/     \\  \\:\\        \\  \\:\\/:/     \\  \\:\\/:/     \\  \\:\\/:/     \\  \\:\\           \\  \\:\\      \\  \\:\\    \\  \\::/      \\  \\:\\/:/  ");
        System.out.println("    \\  \\::/       \\  \\::/       \\  \\::/       \\  \\:\\        \\  \\::/       \\  \\::/       \\  \\::/       \\  \\:\\           \\__\\/       \\__\\/     \\__\\/        \\  \\::/   ");
        System.out.println("     \\__\\/         \\__\\/         \\__\\/         \\__\\/         \\__\\/         \\__\\/         \\__\\/         \\__\\/                                               \\__\\/    ");
    }
    public static void Birdseyetictac(Scanner input)
    {
        //TODO
        Random rand = new Random();
        System.out.println("Hello welcome to tik-tak-toe!\nPlayer 1 will go first and be denoted by (X),Player 2 will be denoted (O).");
        int counter1 =0;
        int counter2 =0;
        int counter3 =0;
        int counter4 =0;
        int counter5 =0;
        int counter6 =0;
        int counter7 =0;
        int counter8 =0;
        int counter9 =0;
        int chance = 0;
        String [][]gameboard = new String[3][3];
        boolean gamestate = true;
        for(int i =0 ; i< gameboard.length;i++)
        {
            for(int j = 0; j <gameboard.length;j++)
            {
                gameboard[i][j] = " ";
            }
        }
        System.out.println("Choose a column (1-9)");
        printcubejasmine(gameboard);
        int choice = 0;
        while(gamestate)
        {
            System.out.println("Player 1: ");
            choice = input.nextInt(); 
            if(choice == 1){//ary[0][0]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[0][0] = "X";
                    counter1++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 2){//ary[0][1]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[0][1] = "X";
                    counter2++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 3){//ary[0][2]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[0][2] = "X";
                    counter3++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 4){//ary[1][0]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[1][0] = "X";
                    counter4++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 5){//ary[1][1]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[1][1] = "X";
                    counter5++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 6){//ary[1][2]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[1][2] = "X";
                    counter6++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 7){//ary[2][0]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[2][0] = "X";
                    counter7++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 8){//ary[2][1]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[2][1] = "X";
                    counter8++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 9){//ary[2][2]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[2][2] = "X";
                    counter9++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            printcubejasmine(gameboard);

            System.out.println("Player 2: ");
            choice = input.nextInt();
            if(choice == 1){//ary[0][0]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[0][0] = "O";
                    counter1++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 2){//ary[0][1]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[0][1] = "O";
                    counter2++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 3){//ary[0][2]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[0][2] = "O";
                    counter3++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 4){//ary[1][0]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[1][0] = "O";
                    counter4++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 5){//ary[1][1]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[1][1] = "O";
                    counter5++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 6){//ary[1][2]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[1][2] = "O";
                    counter6++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 7){//ary[2][0]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[2][0] = "O";
                    counter7++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 8){//ary[2][1]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[2][1] = "O";
                    counter8++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            if(choice == 9){//ary[2][2]
                chance = rand.nextInt(10);
                if(chance >=5 && counter1 <=2)
                {
                    System.out.println("You made it!");
                    gameboard[2][2] = "O";
                    counter9++;
                }
                else{
                    System.out.println("You missed!!!");
                }
            }
            printcubejasmine(gameboard);
            //plauyer 1 winning block
            if( (gameboard[0][0].equals("X") && gameboard[0][1].equals("X") && gameboard[0][2].equals("X")) ){
                System.out.println("Player 1 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[1][0].equals("X") && gameboard[1][1].equals("X") && gameboard[1][2].equals("X")) ){
                System.out.println("Player 1 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[2][0].equals("X") && gameboard[2][1].equals("X") && gameboard[2][2].equals("X")) ){
                System.out.println("Player 1 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][0].equals("X") && gameboard[1][0].equals("X") && gameboard[2][0].equals("X")) ){
                System.out.println("Player 1 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][1].equals("X") && gameboard[1][1].equals("X") && gameboard[2][1].equals("X")) ){
                System.out.println("Player 1 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][2].equals("X") && gameboard[1][2].equals("X") && gameboard[2][2].equals("X")) ){
                System.out.println("Player 1 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][2].equals("X") && gameboard[1][1].equals("X") && gameboard[2][0].equals("X")) ){
                System.out.println("Player 1 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][0].equals("X") && gameboard[1][1].equals("X") && gameboard[2][2].equals("X")) ){
                System.out.println("Player 1 has won !!!!!");
                gamestate = false;
            }
            //player 2 winning block
            if( (gameboard[0][0].equals("O") && gameboard[0][1].equals("O") && gameboard[0][2].equals("O")) ){
                System.out.println("Player 2 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[1][0].equals("O") && gameboard[1][1].equals("O") && gameboard[1][2].equals("O")) ){
                System.out.println("Player 2 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[2][0].equals("O") && gameboard[2][1].equals("O") && gameboard[2][2].equals("O")) ){
                System.out.println("Player 2 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][0].equals("O") && gameboard[1][0].equals("O") && gameboard[2][0].equals("O")) ){
                System.out.println("Player 2 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][1].equals("O") && gameboard[1][1].equals("O") && gameboard[2][1].equals("O")) ){
                System.out.println("Player 2 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][2].equals("O") && gameboard[1][2].equals("O") && gameboard[2][2].equals("O")) ){
                System.out.println("Player 2 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][2].equals("O") && gameboard[1][1].equals("O") && gameboard[2][0].equals("O")) ){
                System.out.println("Player 2 has won !!!!!");
                gamestate = false;
            }
            if( (gameboard[0][0].equals("O") && gameboard[1][1].equals("O") && gameboard[2][2].equals("O")) ){
                System.out.println("Player 2 has won !!!!!");
                gamestate = false;
            }
        }//end of while 
    }//end of ticktaktoe


    public static void lucky13(Scanner input)
    {
        //TODO
        Random rand = new Random();
        int chance = 0;
        boolean gamestate = true;
        int choice = 0;
        String[][] l1 = new String[3][3];
        String[][] l2 = new String[3][3];
        String[][] l3 = new String[3][3];
        for(int i =0 ; i< l1.length;i++)
        {
            for(int j = 0; j <l1.length;j++)
            {
                l1[i][j] = " ";
                l2[i][j] = " ";
                l3[i][j] = " ";
            }
        }
        int p1score = 0;
        int p2score = 0;
        System.out.println("You've chosen the Lucky 13 Battle!\n");
          System.out.println("Be the first to bounce 13 balls into any location on the cube!");
          System.out.println();
          System.out.println("Player 1 will be 'X' and Player 2 will be 'O.' Bounce the ball by typing '1-9' into the command line. Good luck!");
          System.out.println();
        printcube_simran();
        while(gamestate)
        {
            System.out.println("Player 1: ");
            choice = input.nextInt();
            if(choice == 1){//only checking arrays ar pos [0][0]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[0][0]== " "){
                        l1[0][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] == " "){
                        l2[0][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] != " " && l3[0][0] == " "){
                        l3[0][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] != " " && l3[0][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 2){//only checking arrays ar pos [0][1]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[0][1]== " "){
                        l1[0][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] == " "){
                        l2[0][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] != " " && l3[0][1] == " "){
                        l3[0][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] != " " && l3[0][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 3){//only checking arrays ar pos [0][2]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[0][2]== " "){
                        l1[0][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] == " "){
                        l2[0][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] != " " && l3[0][2] == " "){
                        l3[0][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] != " " && l3[0][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 4){//only checking arrays ar pos [1][0]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[1][0]== " "){
                        l1[1][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] == " "){
                        l2[1][0] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] != " " && l3[1][0] == " "){
                        l3[1][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] != " " && l3[1][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 5){//only checking arrays ar pos [1][1]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[1][1]== " "){
                        l1[1][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] == " "){
                        l2[1][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] != " " && l3[1][1] == " "){
                        l3[1][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] != " " && l3[1][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 6){//only checking arrays ar pos [1][2]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[1][2]== " "){
                        l1[1][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] == " "){
                        l2[1][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] != " " && l3[1][2] == " "){
                        l3[1][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] != " " && l3[1][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 7){//only checking arrays ar pos [2][0]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[2][0]== " "){
                        l1[2][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] == " "){
                        l2[2][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] != " " && l3[2][0] == " "){
                        l3[2][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] != " " && l3[2][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 8){//only checking arrays ar pos [2][1]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[2][1]== " "){
                        l1[2][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] == " "){
                        l2[2][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] != " " && l3[2][1] == " "){
                        l3[2][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] != " " && l3[2][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 9){//only checking arrays ar pos [2][2]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[2][2]== " "){
                        l1[2][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] == " "){
                        l2[2][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] != " " && l3[2][2] == " "){
                        l3[2][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] != " " && l3[2][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            printcube_art(l1,l2,l3);

            System.out.println("Player 2: ");
            choice = input.nextInt();
            if(choice == 1){//only checking arrays ar pos [0][0]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[0][0]== " "){
                        l1[0][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] == " "){
                        l2[0][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] != " " && l3[0][0] == " "){
                        l3[0][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] != " " && l3[0][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 2){//only checking arrays ar pos [0][1]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[0][1]== " "){
                        l1[0][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] == " "){
                        l2[0][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] != " " && l3[0][1] == " "){
                        l3[0][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] != " " && l3[0][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 3){//only checking arrays ar pos [0][2]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[0][2]== " "){
                        l1[0][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] == " "){
                        l2[0][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] != " " && l3[0][2] == " "){
                        l3[0][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] != " " && l3[0][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 4){//only checking arrays ar pos [1][0]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[1][0]== " "){
                        l1[1][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] == " "){
                        l2[1][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] != " " && l3[1][0] == " "){
                        l3[1][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] != " " && l3[1][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 5){//only checking arrays ar pos [1][1]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[1][1]== " "){
                        l1[1][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] == " "){
                        l2[1][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] != " " && l3[1][1] == " "){
                        l3[1][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] != " " && l3[1][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 6){//only checking arrays ar pos [1][2]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[1][2]== " "){
                        l1[1][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] == " "){
                        l2[1][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] != " " && l3[1][2] == " "){
                        l3[1][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] != " " && l3[1][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 7){//only checking arrays ar pos [2][0]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[2][0]== " "){
                        l1[2][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] == " "){
                        l2[2][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] != " " && l3[2][0] == " "){
                        l3[2][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] != " " && l3[2][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 8){//only checking arrays ar pos [2][1]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[2][1]== " "){
                        l1[2][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] == " "){
                        l2[2][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] != " " && l3[2][1] == " "){
                        l3[2][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] != " " && l3[2][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 9){//only checking arrays ar pos [2][2]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it
                    if(l1[2][2]== " "){
                        l1[2][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] == " "){
                        l2[2][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] != " " && l3[2][2] == " "){
                        l3[2][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] != " " && l3[2][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            printcube_art(l1,l2,l3);

            if(p1score>=13){
                gamestate=false;
                System.out.println("Congrats Player 1 is the winner!!!!");
            }
            if(p2score>=13){
                gamestate=false;
                System.out.println("Congrats Player 2 is the winner!!!!");
            }


        }//end of while loop
    }


    public static void greatwall(Scanner input)
    {
      // be the first to bounce nine balls into the wall closest to you.
      // it doesnt matter which ball colors are used
      // if you bounce in your opponents wall, the ball stays in place.
        Random rand = new Random();
        int shot = 0;
        int p1numShots = 0;
        int p2numShots = 0;
        boolean playingGame = true;
        int wallChoice = 0;
        int key = 0;
        String[][] layer1 = new String[3][3];
        String[][] layer2 = new String[3][3];
        String[][] layer3 = new String[3][3];
        for(int i=0 ; i< layer1.length;i++){
          for(int j=0; j <layer1.length;j++){
            layer1[i][j] = " ";
            layer2[i][j] = " ";
            layer3[i][j] = " ";
          }
        }
        int p1Score = 0;
        int p2Score = 0;

        System.out.println("You've chosen the Great Wall Battle!\n");
        System.out.println("Be the first to bounce nine balls into the wall closest to you!");
        System.out.println("Player 1 is closest to the left wall and Player 2 is closest to the right wall.");
        System.out.println("Don't worry, you won't accidentally make it into the middle wall. ");
        System.out.println("(If the boxes look weird, you may have to make the terminal window larger)");
        System.out.println();
        System.out.println("Player 1 will be 'X' and Player 2 will be 'O.' Bounce the ball by typing '1' into the command line. Good luck!");
        System.out.println();
        printcube_joni();
        System.out.println("Player 1 goes first! ");
        System.out.println();
        while(playingGame){ // game beginning.
          System.out.println("Player 1's turn. Press the 1 key to make a shot: ");
          key = input.nextInt();
          while(key!=1){
            System.out.println("Invalid input. Press the 1 key to make a shot: ");
            key = input.nextInt();
          }
          System.out.println();
          shot = rand.nextInt(10);
          if(shot>=5){
            if(layer1[0][0]==" "){
              layer1[0][0] = "X";
              p1numShots += 1;
              p1Score += p1numShots;
              System.out.println("You made it! You now have " + p1numShots + " balls in.");
            }
            else if(layer1[0][0]!=" " && layer2[0][0]==" "){
              layer2[0][0] = "X";
              p1numShots += 1;
              p1Score += p1numShots;
              System.out.println("You made it! You now have " + p1numShots + " balls in.");
            }
            else if(layer1[0][0]!=" " && layer2[0][0]!=" " && layer3[0][0]==" "){
              layer3[0][0] = "X";
              p1numShots += 1;
              p1Score += p1numShots;
              System.out.println("You made it! You now have " + p1numShots + " balls in.");
            }
            else if(layer1[0][0]!=" " && layer2[0][0]!=" " && layer3[0][0]!=" "
            && layer1[1][0] == " "){
              layer1[1][0] = "X";
              p1numShots += 1;
              p1Score += p1numShots;
              System.out.println("You made it! You now have " + p1numShots + " balls in.");
            }
            else if(layer1[0][0]!=" " && layer2[0][0]!=" " && layer3[0][0]!=" "
            && layer1[1][0] != " " && layer2[1][0]==" "){
              layer2[1][0] = "X";
              p1numShots += 1;
              p1Score += p1numShots;
              System.out.println("You made it! You now have " + p1numShots + " balls in.");
            }
            else if(layer1[0][0]!=" " && layer2[0][0]!=" " && layer3[0][0]!=" "
            && layer1[1][0] != " " && layer2[1][0]!=" " && layer3[1][0]==" "){
              layer3[1][0] = "X";
              p1numShots += 1;
              p1Score += p1numShots;
              System.out.println("You made it! You now have " + p1numShots + " balls in.");
            }
            else if(layer1[0][0]!=" " && layer2[0][0]!=" " && layer3[0][0]!=" "
            && layer1[1][0] != " " && layer2[1][0]!=" " && layer3[1][0]!=" "
            && layer1[2][0]==" "){
              layer1[2][0] = "X";
              p1numShots += 1;
              p1Score += p1numShots;
              System.out.println("You made it! You now have " + p1numShots + " balls in.");
            }
            else if(layer1[0][0]!=" " && layer2[0][0]!=" " && layer3[0][0]!=" "
            && layer1[1][0] != " " && layer2[1][0]!=" " && layer3[1][0]!=" "
            && layer1[2][0]!=" " && layer2[2][0] == " "){
              layer2[2][0] = "X";
              p1numShots += 1;
              p1Score += p1numShots;
              System.out.println("You made it! You now have " + p1numShots + " balls in.");
            }
            else if(layer1[0][0]!=" " && layer2[0][0]!=" " && layer3[0][0]!=" "
            && layer1[1][0] != " " && layer2[1][0]!=" " && layer3[1][0]!=" "
            && layer1[2][0]!=" " && layer2[2][0] != " " && layer3[2][0]==" "){
              layer3[2][0] = "X";
              p1numShots += 1;
              p1Score += p1numShots;
              System.out.println("You made it! You now have " + p1numShots + " balls in.");
            }
          } // shot counter else
          else{
            System.out.println("You missed! You're still at " + p1numShots + " balls in.");
          }
          printcube_joni(layer1, layer2, layer3);

          if(p1numShots >=9){
            playingGame = false;
            System.out.println("Player 1 Wins!");
            break;
          }

          // player 2 turn.
          System.out.println("Player 2's turn. Press the 1 key to make a shot: ");
          key = input.nextInt();
          while(key!=1){
            System.out.println("Invalid input. Press the 1 key to make a shot: ");
            key = input.nextInt();
          }
          shot = rand.nextInt(10);
          System.out.println();
          if(shot>=5){
            if(layer1[0][2]==" "){
              layer1[0][2] = "O";
              p2numShots += 1;
              p2Score += p2numShots;
              System.out.println("You made it! You now have " + p2numShots + " balls in.");
            }
            else if(layer1[0][2]!=" " && layer2[0][2]==" "){
              layer2[0][2] = "O";
              p2numShots += 1;
              p2Score += p2numShots;
              System.out.println("You made it! You now have " + p2numShots + " balls in.");
            }
            else if(layer1[0][2]!=" " && layer2[0][2]!=" " && layer3[0][2]==" "){
              layer3[0][2] = "O";
              p2numShots += 1;
              p2Score += p2numShots;
              System.out.println("You made it! You now have " + p2numShots + " balls in.");
            }
            else if(layer1[0][2]!=" " && layer2[0][2]!=" " && layer3[0][2]!= " "
            && layer1[1][2]==" "){
              layer1[1][2] = "O";
              p2numShots += 1;
              p2Score += p2numShots;
              System.out.println("You made it! You now have " + p2numShots + " balls in.");
            }
            else if(layer1[0][2]!=" " && layer2[0][2]!=" " && layer3[0][2]!=" "
            && layer1[1][2]!=" " && layer2[1][2] == " "){
              layer2[1][2] = "O";
              p2numShots += 1;
              p2Score += p2numShots;
              System.out.println("You made it! You now have " + p2numShots + " balls in.");
            }
            else if(layer1[0][2]!=" " && layer2[0][2]!=" " && layer3[0][2]!=" "
            && layer1[1][2]!=" " && layer2[1][2] != " " && layer3[1][2]== " "){
              layer3[1][2] = "O";
              p2numShots += 1;
              p2Score += p2numShots;
              System.out.println("You made it! You now have " + p2numShots + " balls in.");
            }
            else if(layer1[0][2]!=" " && layer2[0][2]!=" " && layer3[0][2]!=" "
            && layer1[1][2]!=" " && layer2[1][2] != " " && layer3[1][2]!= " "
            && layer1[2][2] == " "){
              layer1[2][2] = "O";
              p2numShots += 1;
              p2Score += p2numShots;
              System.out.println("You made it! You now have " + p2numShots + " balls in.");
            }
            else if(layer1[0][2]!=" " && layer2[0][2]!=" " && layer3[0][2]!=" "
            && layer1[1][2]!=" " && layer2[1][2] != " " && layer3[1][2]!= " "
            && layer1[2][2] != " " && layer2[2][2] == " "){
              layer2[2][2] = "O";
              p2numShots += 1;
              p2Score += p2numShots;
              System.out.println("You made it! You now have " + p2numShots + " balls in.");
            }
            else if(layer1[0][2]!=" " && layer2[0][2]!=" " && layer3[0][2]!=" "
            && layer1[1][2]!=" " && layer2[1][2] != " " && layer3[1][2]!= " "
            && layer1[2][2] != " " && layer2[2][2] != " " && layer3[2][2]== " "){
              layer3[2][2] = "O";
              p2numShots += 1;
              p2Score += p2numShots;
              System.out.println("You made it! You now have " + p2numShots + " balls in.");
            }
          }
          // shot counter else
          else{
            System.out.println("You missed! You're still at " + p2numShots + " balls in.");
          }
          printcube_joni(layer1, layer2, layer3);

          if(p1numShots >=9){
            playingGame = false;
            System.out.println("Player 1 Wins!");
          }
          else if(p2numShots >=9){
            playingGame = false;
            System.out.println("Player 2 Wins!");
          }
        } // while loop end
        // System.out.println();
        // String answer = "";
        // answer = in.nextLine();
        // System.out.println("Would you like to play again? Press Y for yes, any key for no: ");
        // answer = in.nextLine();
        // if(answer.equals("y") || answer.equals("Y")){
        //   greatwall();
        // }
        // else{
        //   System.out.println();
        //   System.out.println("Thanks for playing!");
        // }
        System.out.println("Thanks for playing!");
    }
    
    public static void pointball(Scanner input)
    {
        //TODO
        Random rand = new Random();
        int chance = 0;
        boolean gamestate = true;
        int choice = 0;
        String[][] l1 = new String[3][3];
        String[][] l2 = new String[3][3];
        String[][] l3 = new String[3][3];
        for(int i =0 ; i< l1.length;i++)
        {
            for(int j = 0; j <l1.length;j++)
            {
                l1[i][j] = " ";
                l2[i][j] = " ";
                l3[i][j] = " ";
            }
        }
        int p1score = 0;
        int p2score = 0;
        System.out.println("Hello, below is how points are given the back 'wall' is 3 points, \nthe middle 'wall' is worth 2 points and so on.");
        System.out.println("Player 1 will go first denoted by (X) , then player 2 denoted by (O), the first person two get 21 points wins!! \nPick enter a number 1-9 to 'aim' for that column ");
        printcube_ruleArt();
        while(gamestate)
        {
            System.out.println("Player 1: ");
            choice = input.nextInt();
            if(choice == 1){//only checking arrays ar pos [0][0]  3POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[0][0]== " "){
                        l1[0][0] = "X";
                        p1score+=3;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] == " "){
                        l2[0][0] = "X";
                        p1score+=3;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] != " " && l3[0][0] == " "){
                        l3[0][0] = "X";
                        p1score+=3;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] != " " && l3[0][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 2){//only checking arrays ar pos [0][1]  3POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[0][1]== " "){
                        l1[0][1] = "X";
                        p1score+=3;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] == " "){
                        l2[0][1] = "X";
                        p1score+=3;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] != " " && l3[0][1] == " "){
                        l3[0][1] = "X";
                        p1score+=3;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] != " " && l3[0][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 3){//only checking arrays ar pos [0][2]  3POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[0][2]== " "){
                        l1[0][2] = "X";
                        p1score+=3;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] == " "){
                        l2[0][2] = "X";
                        p1score+=3;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] != " " && l3[0][2] == " "){
                        l3[0][2] = "X";
                        p1score+=3;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] != " " && l3[0][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 4){//only checking arrays ar pos [1][0]  2POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[1][0]== " "){
                        l1[1][0] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] == " "){
                        l2[1][0] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] != " " && l3[1][0] == " "){
                        l3[1][0] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] != " " && l3[1][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 5){//only checking arrays ar pos [1][1]  2POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[1][1]== " "){
                        l1[1][1] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] == " "){
                        l2[1][1] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] != " " && l3[1][1] == " "){
                        l3[1][1] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] != " " && l3[1][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 6){//only checking arrays ar pos [1][2]  2POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[1][2]== " "){
                        l1[1][2] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] == " "){
                        l2[1][2] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] != " " && l3[1][2] == " "){
                        l3[1][2] = "X";
                        p1score+=2;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] != " " && l3[1][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 7){//only checking arrays ar pos [2][0]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[2][0]== " "){
                        l1[2][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] == " "){
                        l2[2][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] != " " && l3[2][0] == " "){
                        l3[2][0] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] != " " && l3[2][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 8){//only checking arrays ar pos [2][1]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[2][1]== " "){
                        l1[2][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] == " "){
                        l2[2][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] != " " && l3[2][1] == " "){
                        l3[2][1] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] != " " && l3[2][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 9){//only checking arrays ar pos [2][2]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[2][2]== " "){
                        l1[2][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] == " "){
                        l2[2][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] != " " && l3[2][2] == " "){
                        l3[2][2] = "X";
                        p1score+=1;
                        System.out.println("Player 1 score is now: " + p1score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] != " " && l3[2][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            printcube_art(l1,l2,l3);

            System.out.println("Player 2: ");
            choice = input.nextInt();
            if(choice == 1){//only checking arrays ar pos [0][0]  3POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[0][0]== " "){
                        l1[0][0] = "O";
                        p2score+=3;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] == " "){
                        l2[0][0] = "O";
                        p2score+=3;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] != " " && l3[0][0] == " "){
                        l3[0][0] = "O";
                        p2score+=3;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][0] != " " && l2[0][0] != " " && l3[0][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 2){//only checking arrays ar pos [0][1]  3POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[0][1]== " "){
                        l1[0][1] = "O";
                        p2score+=3;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] == " "){
                        l2[0][1] = "O";
                        p2score+=3;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] != " " && l3[0][1] == " "){
                        l3[0][1] = "O";
                        p2score+=3;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][1] != " " && l2[0][1] != " " && l3[0][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 3){//only checking arrays ar pos [0][2]  3POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[0][2]== " "){
                        l1[0][2] = "O";
                        p2score+=3;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] == " "){
                        l2[0][2] = "O";
                        p2score+=3;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] != " " && l3[0][2] == " "){
                        l3[0][2] = "O";
                        p2score+=3;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[0][2] != " " && l2[0][2] != " " && l3[0][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 4){//only checking arrays ar pos [1][0]  2POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[1][0]== " "){
                        l1[1][0] = "O";
                        p2score+=2;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] == " "){
                        l2[1][0] = "O";
                        p2score+=2;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] != " " && l3[1][0] == " "){
                        l3[1][0] = "O";
                        p2score+=2;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][0] != " " && l2[1][0] != " " && l3[1][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 5){//only checking arrays ar pos [1][1]  2POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[1][1]== " "){
                        l1[1][1] = "O";
                        p2score+=2;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] == " "){
                        l2[1][1] = "O";
                        p2score+=2;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] != " " && l3[1][1] == " "){
                        l3[1][1] = "O";
                        p2score+=2;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][1] != " " && l2[1][1] != " " && l3[1][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 6){//only checking arrays ar pos [1][2]  2POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[1][2]== " "){
                        l1[1][2] = "O";
                        p2score+=2;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] == " "){
                        l2[1][2] = "O";
                        p2score+=2;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] != " " && l3[1][2] == " "){
                        l3[1][2] = "O";
                        p2score+=2;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[1][2] != " " && l2[1][2] != " " && l3[1][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 7){//only checking arrays ar pos [2][0]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[2][0]== " "){
                        l1[2][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] == " "){
                        l2[2][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] != " " && l3[2][0] == " "){
                        l3[2][0] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][0] != " " && l2[2][0] != " " && l3[2][0] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 8){//only checking arrays ar pos [2][1]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[2][1]== " "){
                        l1[2][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] == " "){
                        l2[2][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] != " " && l3[2][1] == " "){
                        l3[2][1] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][1] != " " && l2[2][1] != " " && l3[2][1] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            if(choice == 9){//only checking arrays ar pos [2][2]  1POINTS
                chance = rand.nextInt(10);
                if(chance>=6){//33% chance of making it 
                    if(l1[2][2]== " "){
                        l1[2][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] == " "){
                        l2[2][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] != " " && l3[2][2] == " "){
                        l3[2][2] = "O";
                        p2score+=1;
                        System.out.println("Player 2 score is now: " + p2score);
                    }
                    else if(l1[2][2] != " " && l2[2][2] != " " && l3[2][2] != " "){
                        System.out.println("Sorry this column is full!!!");
                    }
                }
                else{
                    System.out.println("Sorry looks like you missed!!!");
                }
            }
            printcube_art(l1,l2,l3);

            if(p1score>=21){
                gamestate=false;
                System.out.println("Congrats Player 1 is the winner!!!!");
            }
            if(p2score>=21){
                gamestate=false;
                System.out.println("Congrats Player 2 is the winner!!!!");
            }


        }//end of while loop
    }//end of function

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        printGameTitle();
        int playagain = 1;
        while(playagain == 1)
        {
        //System.out.println("\nHello! welcome to bounce battle!\nThe game mode you pick will decide what the rules will be.");
            System.out.println("\n(1) BIRD'S EYE TIC-TAC-TOE BATTLE!\n\t2 players -- Be the first to get three balls in-a-row as seen from above the cube;\n\tonly the top balls in any space count (block your opponent!).");
            System.out.println("\n(2) LUCKY 13 BATTLE!\n\t2 players -- Be the first to bounce 13 balls into any location in the cube.");
            System.out.println("\n(3) GREAT WALL BATTLE\n\t2 players -- Be the first to bounce nine balls into the wall closest to you.\n\tIn this battle, it does not matter which ball colors are used.\n\tIf you bounce in your opponent’s wall, however, the ball stays in place.");
            System.out.println("\n(4) POINT BALL BATTLE\n\t2 players -- Be the first to score 21 points.  Points are scored by bouncing balls into the cube.\n\tThe front vertical wall is worth one point per ball, the middle vertical wall is worth two points per ball and \n\tthe back vertical wall is worth three points per ball.\n\tEach player gets to bounce three balls per turn.  Each player gets the same amount of turns.\n\tAfter each round, add up the score and play additional rounds as necessary until there is a winner.");
            System.out.println("\nPlease choose from one of the game modes above. (enter 1-4)");
            int choice  = input.nextInt();
        
       
            if(choice == 1)
            {
                Birdseyetictac(input);
            }
            if(choice == 2)
            {
                lucky13(input);
            }
            if(choice == 3)
            {
                greatwall(input);
            }
            if(choice == 4)
            {
                pointball(input);
            }
            System.out.println("Thank you for playing bounce battle would you like to play again? (1 = yes / 0 = no)");
            playagain = input.nextInt();
        }//endof while loop
    }//end main
}//end class

