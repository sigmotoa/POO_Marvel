import models.Hero;
import operations.Operation;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
       /* Scanner leer = new Scanner(System.in);
        Hero h1 = new Hero();

        //Ingresar datos con los getter y setter
        System.out.println("Ingrese el nombre del Hero");
        h1.setName(leer.nextLine());

        System.out.println("Ingrese el nombre secreto");
        h1.setSecretName(leer.nextLine());

        System.out.println("Ingrese el ID");
        h1.setId(leer.nextInt());

        System.out.println("Ingrese los poderes");
        String [] tempPowers = new String[3];
        tempPowers[0]= leer.nextLine();
        tempPowers[1]= leer.nextLine();
        tempPowers[2]= leer.nextLine();
        h1.setPowers(tempPowers);

        h1.setTeam(true);

        Operation.saveHero(h1);

        */
        Operation.readHeroes();

    }
}
