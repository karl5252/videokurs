package com.company;

public class Beczka {
    double ileLitrow;

    Beczka(double ileLitrow){    //pczatkowa pojemnosc
        this.ileLitrow = ileLitrow;
    }

    double getIleLitrow() //getter
    {
        return ileLitrow;
    }

    void wlej(double ile) //setter
    {
        this.ileLitrow += ile;

    }
    boolean wylej(double ile)
    {
        if (ile < ileLitrow)
            this.ileLitrow -= ile;
        else
            return false;
        return true;

    }
    void przelej(double ile, Beczka gdziePrzelac)
    {
        if(this.wylej(ile))
        {
            gdziePrzelac.wlej(ile);

        }
        else
            System.out.println(this + "Za mało żeby przelać");
    }

    public static void main(String[] args) {
        // write your code here
        Beczka[] beczka = new Beczka[3];

        beczka[0] = new Beczka(4);
        beczka[1] = new Beczka(2);
        beczka[2] = new Beczka(7);


        beczka[0].wlej(18); //przydalby sie test
        beczka[2].przelej(52,beczka[1]);


        System.out.println(beczka[0].getIleLitrow());
        System.out.println(beczka[1].getIleLitrow());
        System.out.println(beczka[2].getIleLitrow());

    }

}

