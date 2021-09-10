
import javax.swing.*;
import java.util.Arrays;

public class Main {
    static boolean programContinue = false;
    public static String[] array = new String[10];
    //public static String[] arrayDiAppoggio = new String[0];


    public static void main(String[] args) {

       /* do {
            String[] fraseInInput = splitFraseInParole();
            if (fraseInInput.length <= array.length) {
                array = fraseInInput;
            } else {
                //Creo un nuovo array, di dimensione maggiore
                String[] newDato = new String[fraseInInput.length];
                //Copio tutti gli elementi nel nuovo array
                System.arraycopy(fraseInInput, 0, newDato, 0, fraseInInput.length);
                // Memorizzo nella variabile array il riferimento al nuovo array
                array = newDato;
            }
            String[] arrayDimezzo = addString(array, arrayDiAppoggio);
            arrayDiAppoggio = arrayDimezzo;
            System.out.println(Arrays.toString(arrayDiAppoggio));
            System.out.println("le parole immagazzinate sono:" + arrayDiAppoggio.length);
            programContinue = true;
        } while (programContinue);*/

        do{
            String[] prova = splitFraseInParole();
            riempiArray(prova);

            programContinue= true;
        }while (programContinue);


    }

    public static String[] splitFraseInParole() {
        String input = JOptionPane.showInputDialog(null, "Inserisci la frase");
        String[] arrayParole = input.split(" ");
        return arrayParole;
    }

    public static String[] riempiArray(String[] arrayParole){
        for(int i=0; i< array.length; i++){
            if(array[i] != null || arrayParole.length > array.length) {
              ingrandisciArray(array);
                }else{
                for (int j = 0; j < arrayParole.length; j++) {
                    array[j] = arrayParole[j];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayParole));
        return array;
    }

    public static void ingrandisciArray(String[] arrayInIngresso){

    }



    /*public static String[] addString(String[] strings, String[] strings1) {
        int currentLenght = strings.length;
        String[] stringArrayNew = Arrays.copyOf(strings, currentLenght + strings1.length);
        System.arraycopy(strings1, 0, stringArrayNew, strings.length, strings1.length);
        return stringArrayNew;
    }*/
}