package aplicacao;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        metodo1();
        System.out.println("Fim do programa");


    }


    public static void metodo1(){
        System.out.println("METODO1");
        metodo2();
        System.out.println("METODO1");
    }

    public static  void metodo2(){
        System.out.println("METODO2");
        Scanner ler = new Scanner(System.in);

        try {
            String[] vetor = ler.nextLine().split(" ");
            int posicao = ler.nextInt();
            System.out.println(vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException erro){
            System.out.println("posicao invalida");
        }catch (InputMismatchException erro){
            System.out.println("Valor do tipo String entre com valor Inteiro");
        }
        System.out.println("METODO2");
        ler.close();

    }
}
