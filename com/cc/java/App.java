package com.cc.java;

public class App {  // wir bilden von App kein Objekt = App bleibt klasse

    public static void main(String[] args) {

        // Verweis auf Klassen oder Klassen Großgeschriebenn Variablen klein
//Referenz von Aussen = unser Name -> REFERENZVARIABLE
    Cat cat = new Cat("Grizabela", 29); // wir bilden aus einer Klasse ein Objekt    
    output(cat.getName());
    //    cat.setName("Grizabella"); 
    // System.out.println(cat.getName());

    output("hi");
    output(String.valueOf(cat.getAge()));

    System.out.println("----------------");
    //       System.out.println("Blick von aussen: " + cat);
    //   cat.tellYourAdress();

    Cat cat1 = new Cat( "Alonzo", 35); // wir bilden aus einer Klasse ein Objekt
     output(cat1.getName());
     System.out.println(cat1.getAge());
     System.out.println("----------------");


    //   Cat cat1 = new Cat(); 
    //   System.out.println("Blick von aussen: " + cat1);
    //   cat1.tellYourAdress();

    //     System.out.println("Hi");

    }

private static void output(String inputStr) {
    System.out.println(inputStr);
    
}

//überladende Methode
// private static void output(int inputNum) {
//     System.out.println(inputNum);
    
// }


}

