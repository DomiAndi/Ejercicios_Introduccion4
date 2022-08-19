public class Main {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.

        int numeroIF = 0;

        if (numeroIF == 0 ){
            System.out.println("Es un numero neutro");
        } else if (numeroIF < 0) {
            System.out.println("El numero es negativo");
        } else
            System.out.println("El numero es positivo");

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //-Incrementar el valor de la variable en uno cada vez que se ejecute.
        //-Mostrarlo por pantalla cada vez que se ejecute.

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

        do {
           System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        for (int numeroFor = 0; numeroIF <= 3; numeroIF = numeroIF + 1){
            System.out.println(numeroIF);
        }

        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

        var estacion = "";

        switch (estacion){
            case "Primavera":
            case "Verano":
            case "Otoño":
            case"Invierno":
                System.out.println("Hoy es: " + estacion);
                break;
            default:
                System.out.println("No es ninguna estacion");
        }
        }
    }
