package principal;

public class Fraccion {

        private int numerador;
        private int denominador;


    public Fraccion() {

    }




    // Instancio el objeto de resultado dentro, luego de hacer

    public void multiplicar(Fraccion fraccion1, Fraccion fraccion2) {

        String operacion = "multiplicación";
        Fraccion resultado = new Fraccion();


        resultado.setNumerador(fraccion1.getNumerador() * fraccion2.getNumerador());
        resultado.setDenominador(fraccion1.getDenominador() * fraccion2.getDenominador());


        if (resultado.getNumerador() % Math.min(resultado.getNumerador(), resultado.getDenominador()) == 0 &&
                resultado.getDenominador() % Math.min(resultado.getNumerador(), resultado.getDenominador()) == 0) {

            resultado.setNumerador(resultado.getNumerador() / Math.min(resultado.getNumerador(), resultado.getDenominador()));
            resultado.setDenominador(resultado.getDenominador() / Math.min(resultado.getNumerador(), resultado.getDenominador()));

            System.out.println(mostrarResultado(resultado, operacion));

        }
    }

    public void dividir(Fraccion fraccion1, Fraccion fraccion2){

        String operacion="división";
        Fraccion resultado = new Fraccion();

        resultado.setNumerador(fraccion1.getNumerador() * fraccion2.getDenominador());
        resultado.setDenominador(fraccion1.getDenominador() * fraccion2.getNumerador());

        if (resultado.getNumerador() % Math.min(resultado.getNumerador(), resultado.getDenominador()) == 0 &&
                resultado.getDenominador() % Math.min(resultado.getNumerador(), resultado.getDenominador()) == 0) {

            resultado.setNumerador(resultado.getNumerador() / Math.min(resultado.getNumerador(), resultado.getDenominador()));
            resultado.setDenominador(resultado.getDenominador() / Math.min(resultado.getNumerador(), resultado.getDenominador()));

            System.out.println(mostrarResultado(resultado, operacion));

        }

    }




    public String mostrarResultado(Fraccion resultado, String operacion){

           return  "El resultado de la " + operacion + " es: "  + resultado.getNumerador() + "  y "  + resultado.getDenominador();
    }





    public int getNumerador() {

            return numerador;
    }

    public void setNumerador(int numerador) {

            this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {

            if(denominador>0) {
                this.denominador = denominador;
            }
    }

}
