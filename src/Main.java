
import javax.swing.*;
import java.util.Arrays;

public class Main {
    static boolean programContinue = false;
    public static String[] array = new String[10];

    public static void main(String[] args) {

        do{
            String[] fraseInIngresso = splitFraseInParole();
            riempiArray(fraseInIngresso);
            System.out.println(Arrays.toString(array));
            programContinue= true;
        }while (programContinue);


    }

    public static String[] splitFraseInParole() {
        String input = JOptionPane.showInputDialog(null, "Inserisci la frase");
        String[] arrayParole = input.split(" ");
        return arrayParole;
    }

    public static void riempiArray(String[] arrayParoleInput) {
        for (int i = 0; i < arrayParoleInput.length; i++) {
            for (int j = 0; j <= array.length; j++) {
                if (j == array.length) {
                    ingrandisciArray();
                    //Inserisco la stringa nel nuovo array ingrandito
                    array[j] = arrayParoleInput[i];
                    break;
                }
                if (array[j]==null) {
                    array[j]=arrayParoleInput[i];
                    break;
                }
            }
        }
    }

    public static void ingrandisciArray(){
        String[] nuovoArray = new String[array.length + 10];
        System.arraycopy(array, 0, nuovoArray, 0, array.length);
        array = nuovoArray;
    }

}