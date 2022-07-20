package com.cc.java;

public class Cat {
    
   private String name; //Object von Typ String
   private int age;  //Primitive / Ganze Zahlen

   // belässt die Klasse bzw. Objekt in cat.java und lässt sich nicht in app.java exportieren
   //immer wenn wir null in der Ausgabe sehen dann wird es eine Objecktreferenz 

   // Ein Konstruktor ist immer voraussetzung um ein object zu bilden 
   // Konstruktor hat keinen Rückgabewert (return)
   public Cat(String name, int age) {
    this.name = name;
    this.age = age;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

   


    }

