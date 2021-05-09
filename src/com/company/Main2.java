package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        double Weight, Height,BodyIndex;
        final double METR=100;

        Scanner input = new Scanner(System.in);
        System.out.println("Это прога рассчитывает индекс массы тела");


        try
        {
            System.out.println("ВВедите вес тела");
            Weight= input.nextDouble();

            System.out.println("ВВедите рост");
            Height=input.nextDouble();


            Height=Height/METR;
            BodyIndex=Weight/(Height*Height);


            if (BodyIndex<16.4){
                System.out.println("Крайний недостаток веса "+BodyIndex);
            }
            if (BodyIndex>=16.5 && BodyIndex<=18.4 ) {
                System.out.println("Недостаток в весе "+BodyIndex);
            }
            if (BodyIndex>=18.5 && BodyIndex<=24.9 ) {
                System.out.println("нормальный вес "+BodyIndex);
            }
            if (BodyIndex>=25 && BodyIndex<=30 ) {
                System.out.println("Избыточный вес "+BodyIndex);
            }
            if (BodyIndex>=30.1 && BodyIndex<=34.9 ) {
                System.out.println( "Ожирение (Класс I) "+BodyIndex);
            }
            if (BodyIndex>=35 && BodyIndex<=40) {
                System.out.println("Ожирение (Класс II - тяжелое "+BodyIndex);
            }
            if (BodyIndex>40 ) {
                System.out.println("Класс III - крайне тяжелое) "+BodyIndex);
            }


        }
        catch (Exception e ){
            System.out.println("Вы слишком худой");

        }





    }
}
