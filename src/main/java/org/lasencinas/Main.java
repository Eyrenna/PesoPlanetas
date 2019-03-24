package org.lasencinas;



public class Main {

    public static void main(String[] args) {

        double peso = 64.0; // kg

        for(Planeta planeta : Planeta.values()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the terrestrial planets: ");
        for(Planeta planeta: Planeta.getPlanetasTerrestres()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the gas giant planets: ");
        for(Planeta planeta: Planeta.getGigantesGaseosos()){
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
    }

}

//CONSOLA
/*Your weight on MERCURY is 24,176487 N
Your weight on VENUS is 57,919942 N
Your weight on EARTH is 64,000000 N
Your weight on MARS is 24,239180 N
Your weight on JUPITER is 161,955682 N
Your weight on SATURN is 68,224994 N
Your weight on URANUS is 57,928141 N
Your weight on NEPTUNE is 72,852997 N

Your weight only on the terrestrial planets:
Your weight on MERCURY is 24,176487 N
Your weight on VENUS is 57,919942 N
Your weight on EARTH is 64,000000 N
Your weight on MARS is 24,239180 N

Your weight only on the gas giant planets:
Your weight on JUPITER is 161,955682 N
Your weight on SATURN is 68,224994 N
Your weight on URANUS is 57,928141 N
Your weight on NEPTUNE is 72,852997 N
*/