package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    // spel loop maken in spel.spelen door het array van spelers heen loopen.
    // in het speler object de locaties op het bord bijhouden.
    // speler aan de beurt, gooien, positie veranderen, controleren speciaal vakje of gewonnen
    // en dan volgende speler
    Scanner myObj = new Scanner(System.in);



    public static void main(String[] args) {
        Dobbelsteen dobbelsteen = new Dobbelsteen();
        Spel spel = new Spel(dobbelsteen,new Speler("Erik"), new Speler("Joris"));
        System.out.println("Welkom bij Ganzenbord.");
        System.out.println("Je staat op vak 0. Gooi een dobbelsteen om te beginnen.");
        spel.spelen();


        }
    }


class Speler{

    String naam;

    int positieOpBord = 0;

    public Speler(String naam) {
        this.naam = naam;

        }

    }


class Dobbelsteen{

    int laatsteWorp;

    int gooien(){
        laatsteWorp = (int) (Math.random() * 6) + 1;
        return laatsteWorp;
    }

}
class Spel{

    boolean bezig = true;
    Dobbelsteen dobbelsteen;
    Speler[] spelers = new Speler[2];
    void spelen(){
        while(bezig){
            for(Speler speler : spelers){
                speler.positieOpBord = speler.positieOpBord + dobbelsteen.gooien();
                System.out.println(speler.naam + dobbelsteen.laatsteWorp);
                if(speler.positieOpBord > 63){
                    bezig = false;
                    System.out.println(speler.naam + " heeft gewonnen");
                    break;
                }
            }



    }

    }
    public Spel (Dobbelsteen dobbelsteen, Speler speler1, Speler speler2){
        this.dobbelsteen = dobbelsteen;
        spelers[0] = speler1;
        spelers[1] = speler2;


    }


}
