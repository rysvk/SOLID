package com.oop.solid.lsp;

public class LSPMain {
    public static void main(String args[]){
        Athelete newAgeAthelete = new Gymnast();
        newAgeAthelete.run();
        newAgeAthelete.swim();
        //newAgeAthelete.dive();
        ((Gymnast)newAgeAthelete).dive();
        ((Gymnast)newAgeAthelete).vault();


        Athelete gymnast = new Gymnast();
        Athelete cricketer = new Cricketer();

        makeRun(gymnast);
        makeRun(cricketer);

        makeVault(gymnast);
        makeVault(cricketer);
    }

    public static void makeRun(Athelete a){
        a.run();
    }

    public static void makeVault(Athelete a){
        ((Gymnast)a).vault();
    }
}
