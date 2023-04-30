import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        List<Voador> listavoadores = new ArrayList<>();

        Random numeros = new Random();

        for(int i = 0; i<9; i++){

            Scanner sc = new Scanner(System.in);
            int tipo = numeros.nextInt(2);
            if(tipo == 0){
                Voador objetovoador = new GalinhaVoadora();
                listavoadores.add(objetovoador);
            } else if (tipo == 1) {
                String tipodedrone = "indefinido";
                Voador objetovoador = new Drone(tipodedrone);
                listavoadores.add(objetovoador);
            } else if (tipo == 2) {
                Voador objetovoador = new AranhaVoadora();
                listavoadores.add(objetovoador);
            }
        }
    }
}
