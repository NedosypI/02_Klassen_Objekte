package com.cc.java;

public class App {

    public static void main(String[] args) {

        // Verweis auf Klassen oder Klassen Großgeschriebenn Variablen klein
//Referenz von Aussen = unser Name -> REFERENZVARIABLE
      Cat cat = new Cat(); // wir bilden aus einer Klasse ein Objekt
      System.out.println("Blick von aussen: " + cat);
      cat.tellYourAdress();


      Cat cat1 = new Cat(); 
      System.out.println("Blick von aussen: " + cat1);
      cat1.tellYourAdress();

        // System.out.println("Hi");
    }
    
   


}

