package operations;

import models.Hero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Operation {
    public static void saveHero(Hero newHero)
    {
        try {
            FileWriter escribir = new FileWriter("heros.csv",true);
            escribir.write(newHero.hero2CSV());
            escribir.write("\n");
            escribir.close();
            System.out.println("Heroe Almacenado");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }


        //TODO Leer todos los heroes
        //TODO Leer un solo heroe
        //TODO modificar un heroe
        //TODO eliminar un heroe
    }
    public static void readHeroes()
    {
        try{
            FileReader lector = new FileReader("heros.csv");
            BufferedReader buffer = new BufferedReader(lector);

            String heroReaded;

            while ((heroReaded = buffer.readLine())!=null)
            {
                System.out.println(heroReaded);
            }
            buffer.close();
            System.out.println("Ya mostre todo");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
