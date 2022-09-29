import java.lang.reflect.Array;
import java.util.ArrayList;

public class Algorithm {
    int number;


    public Algorithm(int number) {
        this.number = number;
        System.out.println("Números primos:\n" + firstAlgorithm(this.number));
        System.out.println("Sucessión de Fibonacci f:\n" + secondAlgorithm(this.number));
    }

    public ArrayList<Integer> firstAlgorithm(int x) {
        int cantidad = 0;
        int numero = 0;

        ArrayList<Integer> array = new ArrayList<Integer>();

        do {
            if(isNumberPrime(numero)){
                array.add(numero);
                numero++;
                cantidad++;

            } else {
                numero++;
            }
        }while(cantidad < x);

        return array;
    }

    public ArrayList<Integer> secondAlgorithm(int x){
        ArrayList<Integer> array = new ArrayList<Integer>();

        int num1 = 0, num2 = 1, acum = 1;

        for (int i = 1; i < x; i++) {

            array.add(acum);


            acum = num1 + num2;
            num1 = num2;
            num2 = acum;
        }

        return array;
    }

    public static boolean isNumberPrime(int number){
        if (number == 0 || number == 1 || number == 4) {
            return false;
        }
        for (int x = 2; x < number / 2; x++) {
            if (number % x == 0) return false;
        }
        return true;
    }


}
