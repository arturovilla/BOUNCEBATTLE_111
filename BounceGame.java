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

    
    public static void printcube1()
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
    public static void printcube(String[][]ary1,String[][]ary2,String[][]ary3)
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
    public static void Birdseyetictac()
    {
        //TODO
    }
    public static void lucky13()
    {
        //TODO
    }
    public static void greatwall()
    {
        //TODO

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
        printcube1();
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
            printcube(l1,l2,l3);

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
            printcube(l1,l2,l3);

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
        // so here is what im thinking 
        // once we get the choice from the user we break out into these if statements
        // then in each we call a function corrisponding to the game mode
        // everything will be done within the function and return nothings
        // we print the game board to the terminal with the appropriate array
        // then we print out thanks and good bye

        Scanner input = new Scanner(System.in);

        printGameTitle();

        //System.out.println("\nHello! welcome to bounce battle!\nThe game mode you pick will decide what the rules will be.");
        System.out.println("\n(1) BIRD'S EYE TIC-TAC-TOE BATTLE!\n\t2 players -- Be the first to get three balls in-a-row as seen from above the cube;\n\tonly the top balls in any space count (block your opponent!).");
        System.out.println("\n(2) LUCKY 13 BATTLE!\n\t2 players -- Be the first to bounce 13 balls into any location in the cube.");
        System.out.println("\n(3) GREAT WALL BATTLE\n\t2 players -- Be the first to bounce nine balls into the wall closest to you.\n\tIn this battle, it does not matter which ball colors are used.\n\tIf you bounce in your opponent’s wall, however, the ball stays in place.");
        System.out.println("\n(4) POINT BALL BATTLE\n\t2 players -- Be the first to score 21 points.  Points are scored by bouncing balls into the cube.\n\tThe front vertical wall is worth one point per ball, the middle vertical wall is worth two points per ball and \n\tthe back vertical wall is worth three points per ball.\n\tEach player gets to bounce three balls per turn.  Each player gets the same amount of turns.\n\tAfter each round, add up the score and play additional rounds as necessary until there is a winner.");
        System.out.println("\nPlease choose from one of the game modes above. (enter 1-4)");
        int choice  = input.nextInt();
        System.out.println(choice);

        if(choice == 1)
        {
            Birdseyetictac();
        }
        if(choice == 2)
        {
            lucky13();
        }
        if(choice == 3)
        {
            greatwall();
        }
        if(choice == 4)
        {
            pointball(input);
        }



        System.out.println("Thank you for playing bounce battle would you like to play again?");
    }//end main
}//end class

