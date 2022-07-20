package com.cc.java;

public class Cat {
    
   public String name; //Object von Typ String
   public int age;  //Primitive / Ganze Zahlen
   public char huhu;
   //immer wenn wir null in der Ausgabe sehen dann wird es eine Objecktreferenz 

   // Ein Konstruktor ist immer voraussetzung um ein object zu bilden 
   // Konstruktor hat keinen Rückgabewert (return)
   public Cat(String name, int age) {
    this.name = name;
    this.age = age;
}

   
    public void tellYourAdress() {
        System.out.println("Blick von innen: " + this); //this= Selbstreferenz
    // //Referenz von innen = das "Ich" = Selbstreferenz -> INSTANZVARIABLE
    }



    public String tellYourName() { 
       return this.name;
    }
 
    public int tellYourAge() {
        return age;

    }

    }

