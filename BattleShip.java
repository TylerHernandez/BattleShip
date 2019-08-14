import java.util.Scanner;
import java.util.Random;
public class BattleShip {

    //Tyler Hernandez Java BattleShip :)

    public void printBoard(String [][] board){
        System.out.println(" |  1   2   3   4   5   6   7   8   9   10");
        System.out.println("   _______________________________________");
        int counter=10;
        for(int rows=0; rows < board.length; rows++)
        {
            for(int columns=0; columns < board[rows].length; columns++)
            {

                if (counter==10)
                    System.out.print("A|  ");
                if(counter==20)
                    System.out.print("B|  ");
                if(counter==30)
                    System.out.print("C|  ");
                if(counter==40)
                    System.out.print("D|  ");
                if(counter==50)
                    System.out.print("E|  ");
                if(counter==60)
                    System.out.print("F|  ");
                if(counter==70)
                    System.out.print("G|  ");
                if(counter==80)
                    System.out.print("H|  ");
                if(counter==90)
                    System.out.print("I|  ");
                if(counter==100)
                    System.out.print("J|  ");

                System.out.print(board[rows][columns]+ "   ");

                counter++;
            }

            System.out.println();
            System.out.println();

        }
        System.out.println();
    }



    public void welcome() {
        System.out.println("          ___          ___                        ___     \r\n" +
                "         /  /\\        /  /\\          ___         /  /\\    \r\n" +
                "        /  /:/       /  /::\\        /__/\\       /  /::\\   \r\n" +
                "       /__/::\\      /  /:/\\:\\       \\  \\:\\     /  /:/\\:\\  \r\n" +
                "       \\__\\/\\:\\    /  /:/~/::\\       \\  \\:\\   /  /:/~/::\\ \r\n" +
                "          \\  \\:\\  /__/:/ /:/\\:\\  ___  \\__\\:\\ /__/:/ /:/\\:\\\r\n" +
                "           \\__\\:\\ \\  \\:\\/:/__\\/ /__/\\ |  |:| \\  \\:\\/:/__\\/\r\n" +
                "           /  /:/  \\  \\::/      \\  \\:\\|  |:|  \\  \\::/     \r\n" +
                "          /__/:/    \\  \\:\\       \\  \\:\\__|:|   \\  \\:\\     \r\n" +
                "          \\__\\/      \\  \\:\\       \\__\\::::/     \\  \\:\\    \r\n" +
                "                      \\__\\/           ~~~~       \\__\\/    ");
        System.out.println(" ____       _______ _______ _      ______  _____ _    _ _____ _____  \r\n" +
                "|  _ \\   /\\|__   __|__   __| |    |  ____|/ ____| |  | |_   _|  __ \\ \r\n" +
                "| |_) | /  \\  | |     | |  | |    | |__  | (___ | |__| | | | | |__) |\r\n" +
                "|  _ < / /\\ \\ | |     | |  | |    |  __|  \\___ \\|  __  | | | |  ___/ \r\n" +
                "| |_) / ____ \\| |     | |  | |____| |____ ____) | |  | |_| |_| |     \r\n" +
                "|____/_/    \\_\\_|     |_|  |______|______|_____/|_|  |_|_____|_|     ");
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("******************---Developer: Tyler Hernandez---******************");
        System.out.println("*------------------Fordham Prep | Copyright 2019-------------------*");
        System.out.println("********************************************************************");
        System.out.println();
    }


    //Method that prints the appropriate ascii heading for the situation
    public void printTitle(int playerNum) {
        if (playerNum == 0) {
            System.out.println("\r\n" +
                    "  ____  _                         _ _       ____                      _ \r\n" +
                    " |  _ \\| | __ _ _   _  ___ _ __  / ( )___  | __ )  ___   __ _ _ __ __| |\r\n" +
                    " | |_) | |/ _` | | | |/ _ \\ '__| | |// __| |  _ \\ / _ \\ / _` | '__/ _` |\r\n" +
                    " |  __/| | (_| | |_| |  __/ |    | | \\__ \\ | |_) | (_) | (_| | | | (_| |\r\n" +
                    " |_|   |_|\\__,_|\\__, |\\___|_|    |_| |___/ |____/ \\___/ \\__,_|_|  \\__,_|\r\n" +
                    "                |___/                                                   \r\n" +
                    "");
        }

        if (playerNum == 1) {
            System.out.println("\r\n" +
                    "  ____  _                         ____  _       ____                      _ \r\n" +
                    " |  _ \\| | __ _ _   _  ___ _ __  |___ \\( )___  | __ )  ___   __ _ _ __ __| |\r\n" +
                    " | |_) | |/ _` | | | |/ _ \\ '__|   __) |// __| |  _ \\ / _ \\ / _` | '__/ _` |\r\n" +
                    " |  __/| | (_| | |_| |  __/ |     / __/  \\__ \\ | |_) | (_) | (_| | | | (_| |\r\n" +
                    " |_|   |_|\\__,_|\\__, |\\___|_|    |_____| |___/ |____/ \\___/ \\__,_|_|  \\__,_|\r\n" +
                    "                |___/                                                       \r\n" +
                    "");
        }

        if (playerNum == 2) {
            System.out.println("  ____       __                                ____                      _ \r\n" +
                    " |  _ \\ ___ / _| ___ _ __ ___ _ __   ___ ___  | __ )  ___   __ _ _ __ __| |\r\n" +
                    " | |_) / _ | |_ / _ | '__/ _ | '_ \\ / __/ _ \\ |  _ \\ / _ \\ / _` | '__/ _` |\r\n" +
                    " |  _ |  __|  _|  __| | |  __| | | | (_|  __/ | |_) | (_) | (_| | | | (_| |\r\n" +
                    " |_| \\_\\___|_|  \\___|_|  \\___|_| |_|\\___\\___| |____/ \\___/ \\__,_|_|  \\__,_|\r\n" +
                    "                                                                           ");
        }

        if (playerNum == 3) {
            System.out.println("\r\n" +
                    " __   __                 ____                      _ \r\n" +
                    " \\ \\ / /__  _   _ _ __  | __ )  ___   __ _ _ __ __| |\r\n" +
                    "  \\ V / _ \\| | | | '__| |  _ \\ / _ \\ / _` | '__/ _` |\r\n" +
                    "   | | (_) | |_| | |    | |_) | (_) | (_| | | | (_| |\r\n" +
                    "   |_|\\___/ \\__,_|_|    |____/ \\___/ \\__,_|_|  \\__,_|\r\n" +
                    "                                                     \r\n" +
                    "");
        }
    }


    public void printTurn(int turnNum) {
        if (turnNum == 0) {
            System.out.println("\r\n" +
                    "  ____   _         _  __   __ _____  ____     _  _  ____    _____  _   _  ____   _   _    \r\n" +
                    " |  _ \\ | |       / \\ \\ \\ / /| ____||  _ \\   / |( )/ ___|  |_   _|| | | ||  _ \\ | \\ | | _ \r\n" +
                    " | |_) || |      / _ \\ \\ V / |  _|  | |_) |  | ||/ \\___ \\    | |  | | | || |_) ||  \\| |(_)\r\n" +
                    " |  __/ | |___  / ___ \\ | |  | |___ |  _ <   | |    ___) |   | |  | |_| ||  _ < | |\\  | _ \r\n" +
                    " |_|    |_____|/_/   \\_\\|_|  |_____||_| \\_\\  |_|   |____/    |_|   \\___/ |_| \\_\\|_| \\_|(_)\r\n" +
                    "                                                                                          \r\n" +
                    "");
            //System.out.println();
        }

        if (turnNum == 1) {
            System.out.println("\r\n" +
                    "  ____   _         _  __   __ _____  ____     ____   _  ____    _____  _   _  ____   _   _    \r\n" +
                    " |  _ \\ | |       / \\ \\ \\ / /| ____||  _ \\   |___ \\ ( )/ ___|  |_   _|| | | ||  _ \\ | \\ | | _ \r\n" +
                    " | |_) || |      / _ \\ \\ V / |  _|  | |_) |    __) ||/ \\___ \\    | |  | | | || |_) ||  \\| |(_)\r\n" +
                    " |  __/ | |___  / ___ \\ | |  | |___ |  _ <    / __/     ___) |   | |  | |_| ||  _ < | |\\  | _ \r\n" +
                    " |_|    |_____|/_/   \\_\\|_|  |_____||_| \\_\\  |_____|   |____/    |_|   \\___/ |_| \\_\\|_| \\_|(_)\r\n" +
                    "                                                                                              \r\n" +
                    "");
            //System.out.println();
        }
    }

    public String[][] generateUserBoard(){// this will use a sequence of steps to generate the user's board.

        int sum=0;
        String board[][]= new String[10][10];

        while(sum<15) {

            sum=0;
            int rows, columns;

            for(rows=0; rows<board.length; rows++){

                for(columns=0; columns<board[rows].length; columns++){

                    //System.out.print(user[i][u] + " ");
                    board[rows][columns]="~";
                }//ends for u loop
                //	System.out.println();
            }


            Random rand = new Random();


            /*now let's decide whether we're using horizontal or vertical for our ships.
             *
             *
             *Each ship is called the number they are representing e.g. ship 2 is 2 units long
             *e.g. #2 ship 3 is 3 units long
             *
             *Now let's decide whether each ship is going to be horizontal or vertical
             *
             *if their decision is =0, its VERTICAL
             *
             *else, it'll be =1, meaning its HORIZONTAL
             *
             *
             */
            //ship 1 is one unit long. it does not go up or down.
            int decision2=rand.nextInt(2);
            int decision3=rand.nextInt(2);
            int decision4=rand.nextInt(2);
            int decision5=rand.nextInt(2);


            {//starts ship 1

                int row=rand.nextInt(10);
                int column=rand.nextInt(10);

                board[row][column]="1";

            }


            {//starts ship 2
                if(decision2==0) {// Decision 2 is vertical, lets get coordinates generated for it then set its location to 1 on the field
                    rows= rand.nextInt(9);
                    columns=rand.nextInt(10);
                    //this is the origin points for our ship to start generating at
                    for (int a=0; a<2; a++)
                    {
                        board[rows][columns]="2";
                        rows++;
                        // it will be increasing the rows as it generates
                    }
                }// ends if statement

                else 		{// Decision 2 is horizontal, now lets set its location on the field
                    rows= rand.nextInt(10);
                    columns=rand.nextInt(9);
                    // this is the origin points for our ship to start generating at
                    for(int b=0; b<2; b++)
                    {
                        board[rows][columns]="2";
                        columns++;
                        // it will be increasing the columns as it generates

                    }
                }//ends else statement

            }// ends ship 2


            {//starts ship 3
                if(decision3==0) {// Decision 3 is vertical, lets get coordinates generated for it then set its location to 1 on the field
                    rows= rand.nextInt(8);
                    columns=rand.nextInt(10);
                    //this is the origin points for our ship to start generating at
                    for (int a=0; a<3; a++)
                    {
                        board[rows][columns]="3";
                        rows++;
                        // it will be increasing the rows as it generates
                    }
                }// ends if statement

                else 		{// Decision 3 is horizontal, now lets set its location on the field
                    rows= rand.nextInt(10);
                    columns=rand.nextInt(8);
                    // this is the origin points for our ship to start generating at
                    for(int b=0; b<3; b++)
                    {
                        board[rows][columns]="3";
                        columns++;
                        // it will be increasing the columns as it generates

                    }

                }//ends else statement

            }// ends ship 3


            {//starts ship 4
                if(decision4==0) {// Decision 4 is vertical, lets get coordinates generated for it then set its location to 1 on the field
                    rows= rand.nextInt(7);
                    columns=rand.nextInt(10);
                    //this is the origin points for our ship to start generating at
                    for (int a=0; a<4; a++)
                    {
                        board[rows][columns]="4";
                        rows++;
                        // it will be increasing the rows as it generates
                    }
                }// ends if statement

                else 		{// Decision 4 is horizontal, now lets set its location on the field
                    rows= rand.nextInt(10);
                    columns=rand.nextInt(7);
                    // this is the origin points for our ship to start generating at
                    for(int b=0; b<4; b++)
                    {
                        board[rows][columns]="4";
                        columns++;
                        // it will be increasing the columns as it generates

                    }

                }//ends else statement

            }// ends ship 4


            {//starts ship 5
                if(decision5==0) {// Decision 5 is vertical, lets get coordinates generated for it then set its location to 1 on the field
                    rows= rand.nextInt(6);
                    columns=rand.nextInt(10);
                    //this is the origin points for our ship to start generating at
                    for (int a=0; a<5; a++)
                    {
                        board[rows][columns]="5";
                        rows++;
                        // it will be increasing the rows as it generates
                    }
                }// ends if statement

                else 		{// Decision 5 is horizontal, now lets set its location on the field
                    rows= rand.nextInt(10);
                    columns=rand.nextInt(6);
                    // this is the origin points for our ship to start generating at
                    for(int b=0; b<5; b++)
                    {
                        board[rows][columns]="5";
                        columns++;
                        // it will be increasing the columns as it generates

                    }
                }//ends else statement

            }// ends ship 5

            /*
             * now we have to check if we have the right amount of pieces on the field,
             * or else this means that one or more ships are overlaying
             */
            //int result = Integer.parseInt(board);
            for (rows=0; rows < board.length; rows++)
            {
                for (columns=0; columns < board[rows].length; columns++)
                {

                    // sum == sum + board[rows][columns];
                    if (board[rows][columns]== "1"||board[rows][columns]=="2"||board[rows][columns]=="3"||board[rows][columns]=="4"||board[rows][columns]=="5")
                    {
                        sum++;
                    }
                }
            }


        }//ends sum while loop


        return board;

    }// ends generateUserBoard


    public static int askForRow()	//Asks for row and returns it as an int
    {
        int row = -1;
        do {
            System.out.print("Type in row (A-J): ");

            Scanner rowinput = new Scanner(System.in);
            String userInputRow = rowinput.nextLine();
            row = letterToNum(userInputRow);
            //System.out.println("Row is " + row);

            //Checks to make sure that inputed coordinates are between 0 and 9
            if (row < 0 || row > 9) {
                System.out.println("Sorry, that row is invalid! \n");
                //break;
            }
            //If the input is invalid, it will ask for a new coordinate
        } while (row < 0 || row > 9);
        return row;
    }

    public static int askForCol()	//Asks for col and returns it as an int
    {
        int col = -1;
        do {
            System.out.print("Type in column (1-10): ");
            Scanner colinput = new Scanner(System.in);
            int userInputCol = colinput.nextInt();
            col = userInputCol - 1;
            //System.out.println("Col is " + col);

            //Checks to make sure that inputed coordinates are between 0 and 9
            if (col < 0 || col > 9) {
                System.out.println("Sorry, that column is invalid! \n");
                //break;
            }
            //If the input is invalid, it will ask for a new coordinate
        } while (col < 0 || col > 9);
        return col;
    }

    private static int letterToNum(String val)
    {
        int toReturn = -1;
        switch (val)
        {
            case "A":   toReturn = 0;
                break;
            case "B":   toReturn = 1;
                break;
            case "C":   toReturn = 2;
                break;
            case "D":   toReturn = 3;
                break;
            case "E":   toReturn = 4;
                break;
            case "F":   toReturn = 5;
                break;
            case "G":   toReturn = 6;
                break;
            case "H":   toReturn = 7;
                break;
            case "I":   toReturn = 8;
                break;
            case "J":   toReturn = 9;
                break;
            default:    toReturn = -1;
                break;
        }

        return toReturn;
    }

    public void hitBoard(int column, int row, String[][] player)
    {

        if(player[row][column] == "~")
        {
            player[row][column]="O";
            System.out.println("Sorry, you missed!");

        }

        if (player[row][column] == "X") {
            System.out.println("You already hit his coordinate!");
        }
        if  (player[row][column]=="1"||player[row][column]=="2"||player[row][column]=="3"||player[row][column]=="4"||player[row][column]=="5")
        {
            player[row][column]="X";
            System.out.println("You hit a ship!");
        }
    }

    public void hitDisplay(int column, int row, String[][] regular, String[][] display)
    {
        //this should check what character is placed at the coordinate on the regular board, and then just put the same one here
        if(regular[row][column] == "O") {
            display[row][column]="O";
        }

        if (regular[row][column] == "X") {
            display[row][column]="X";
        }
    }



    public String[][] generateDisplayBoard() {

        String[][] board= new String[10][10];

        for(int rows=0; rows < board.length; rows++)
        {

            for(int columns=0; columns < board[rows].length; columns++)
            {
                board[rows][columns]="~";
            }

        }
        return board;


    }

    public void Satisfied(String[][]player) {
        String response;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Are you satisfied with your board? \n type Yes or No\n");

            response= input.nextLine();

            if(response.equals("No")||response.equals("NO")||response.equals("no")||response.equals("nO"))
            {
                player=generateUserBoard();
                printBoard(player);
            }
        }
        while (response.equalsIgnoreCase("no"));
    }


    public static void noCheating()
    {
        for (int i=0; i<10000; i++)
        {
            System.out.println("NO CHEATING!!!");
        }
    }

    public boolean allShipsGone(String player[][])
    {
        for(int rows=0; rows<player.length; rows++)
        {
            for(int columns=0; columns<player[rows].length; columns++)
            {
                if (player[rows][columns]=="1"||player[rows][columns]=="2"||player[rows][columns]=="3"||player[rows][columns]=="4"||player[rows][columns]=="5")
                    return false;
            }
        }

        return true;

    }


    public static void checkIfSunk(String[][]player)
    {
        //String[][] player= new String[10][10];

        int one=0;
        int two=0;
        int three=0;
        int four=0;
        int five=0;

        for(int rows=0; rows < player.length; rows++)
        {

            for(int columns=0; columns < player[rows].length; columns++)
            {
                if (player[rows][columns]=="1") {
                    one=1;
                }
                if(player[rows][columns]=="2")
                {
                    two++;
                }
                if(player[rows][columns]=="3") {
                    three++;
                }
                if(player[rows][columns]=="4") {
                    four++;
                }
                if(player[rows][columns]=="5") {
                    five++;
                }
            }

        }
        if(one==0)
        {
            System.out.println("Ship 1 has been sunk");
        }
        if(two==0)
        {
            System.out.println("Ship 2 has been sunk");
        }
        if (three==0)
        {
            System.out.println("Ship 3 has been sunk");
        }
        if(four==0)
        {
            System.out.println("Ship 4 has been sunk");
        }
        if(five==0)
        {
            System.out.println("Ship 4 has been sunk");
        }
    }

    public static void pressEnter(int player) {
        if (player == 0) {
            Scanner keyIn = new Scanner(System.in);
            System.out.print("Player 2, press enter to continue...");
            keyIn.nextLine();
        }

        if (player == 1) {
            Scanner keyIn = new Scanner(System.in);
            System.out.print("Player 1, press enter to continue...");
            keyIn.nextLine();
        }
    }






    public static void main(String []args) {

        BattleShip server  = new BattleShip();
        //server.welcome();

        //initializing parameters for printTitle method
        int playerOne = 0;
        int playerTwo =1;
        int displayBoard = 2;
        int yourBoard = 3;
        int player1Turn = 0;
        int player2Turn = 1;

        String [][] player1 = server.generateUserBoard();
        String [][] player1Display = server.generateDisplayBoard();
        //  System.out.println("BOARDS SHOWN FOR DEBUGGING PURPOSES:");
        server.printTitle(playerOne);
        server.printBoard(player1);
        server.Satisfied(player1);
        server.pressEnter(playerTwo);
        server.noCheating();
        server.pressEnter(playerOne);

        String [][] player2 = server.generateUserBoard();
        String [][] player2Display = server.generateDisplayBoard();

        server.printTitle(playerTwo);
        server.printBoard(player2);
        server.Satisfied(player2);
        server.pressEnter(playerOne);
        server.noCheating();
        server.pressEnter(playerTwo);


        //Player 1's Turn: show player 1 board (so he can see how many of his ships are hit) and player 2 reference board
        int player = 1;
        boolean player1wins;
        boolean player2wins;
        while (true) {
            if (player == 1) {
                server.printTurn(player1Turn);
                server.printTitle(yourBoard);
                server.printBoard(player1);
                server.printTitle(displayBoard);
                server.printBoard(player2Display);
                int newRow = server.askForRow();
                int newCol = server.askForCol();
                server.hitBoard(newCol, newRow, player2);
                server.hitDisplay(newCol, newRow, player2, player2Display);
                server.printTitle(playerOne);
                server.printBoard(player1);
                server.printTitle(displayBoard);
                server.printBoard(player2Display);
                server.checkIfSunk(player2);
                server.pressEnter(playerTwo);
                server.noCheating();
                server.pressEnter(playerOne);
                player = 2;
            }


            if (player == 2) {
                server.printTurn(player2Turn);
                server.printTitle(yourBoard);
                server.printBoard(player2);
                server.printTitle(displayBoard);
                server.printBoard(player1Display);
                int newRow = server.askForRow();
                int newCol = server.askForCol();
                server.hitBoard(newCol, newRow, player1);
                server.hitDisplay(newCol, newRow, player1, player1Display);
                server.printTitle(playerTwo);
                server.printBoard(player2);
                server.printTitle(displayBoard);
                server.printBoard(player1Display);
                server.checkIfSunk(player1);
                server.pressEnter(playerOne);
                server.noCheating();
                server.pressEnter(playerTwo);
                player = 1;
            }
            player1wins= server.allShipsGone(player2);
            player2wins= server.allShipsGone(player1);
            if(player1wins)
                break;
            System.out.println("\n\n\nPlayer 1 has won!\n\n\n");
            if(player2wins)
                break;
            System.out.println("\n\n\nPlayer 2 has won!\n\n\n");

        }


    }
}






