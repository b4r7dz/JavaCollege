package Shop;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ShopCenter {

    private Clients client;
    private Scanner scnr;

    int choice = -1;


    public ShopCenter(){
        scnr = new Scanner(System.in);
        this.menu();

    }


    private void menu(){
            int choice = 0;

            do{
                printMenu();

                try{
                    choice = scnr.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Unidentified operation.");;
                    choice = -1;
                }

                switch(choice){
                    case 1:
                        //add new customer
                }

            }while(choice!=0);

    }

    private static void printMenu(){
        System.out.println("\n__________________________" +
                "\n1) Input new Client" +
                "\n\t 0) EXIT");
    }
}
