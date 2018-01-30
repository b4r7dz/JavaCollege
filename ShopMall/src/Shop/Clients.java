package Shop;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Clients {
     private String     name;
     private String     surname;
     private String     address;
     private int        phoneNumber;
     private LocalDate cardTime = LocalDate.now();
     private Scanner    scr;

     private String temp;

     //client needs unique ID;

    Clients(String name, String surname, String address, int phoneNumber, int days){
        this.name       = name;
        this.surname    = surname;
        this.address    = address;
        this.phoneNumber= phoneNumber;
        this.cardTime = cardTime.plusDays(days);
    }

    public void insertNewClient(){
        System.out.print("Input ur Name: ");
            temp = scr.nextLine();
            setName(temp);
        System.out.print("Input ur Surname: "); setSurname(scr.nextLine());
        System.out.print("Input ur Address: "); setAddress(scr.nextLine());
        System.out.print("Input ur Phone number: "); setPhoneNumber(scr.nextInt());
        System.out.print("Input ur entry day/s: "); setCardTime(scr.nextInt());
    }

    public String getClient(){
        return "\nName: " + name +
                "\nSurname: " + surname +
                "\nAddress: " + address +
                "\nPhone Number: " + phoneNumber +
                "\nTime left (day/s): " + getPeriod(cardTime);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCardTime(int days) {
        this.cardTime = cardTime.plusDays(days);
    }

    private static Period getPeriod(LocalDate card) {
        return Period.between(card, LocalDate.now());
    }

}
