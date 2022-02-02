package principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);



        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion();



        Fraccion resultado = new Fraccion();

        System.out.println("Introduce el numerador de la primera fraccion");
        fraccion1.setNumerador(sc.nextInt());

        System.out.println("Introduce el denominador de la primera fraccion");
        fraccion1.setDenominador(sc.nextInt());

        System.out.println("Introduce el numerador de la segunda fraccion");
        fraccion2.setNumerador(sc.nextInt());

        System.out.println("Introduce el denominador de la segunda fraccion");
        fraccion2.setDenominador(sc.nextInt());



        resultado.multiplicar(fraccion1, fraccion2);
        resultado.dividir(fraccion1, fraccion2);



    }
}
