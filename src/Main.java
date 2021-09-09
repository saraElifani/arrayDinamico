
import javax.swing.*;
import java.util.Arrays;

public class Main {
    static boolean programContinue = false;
    public static String[] array = new String[10];
    public static String[] arrayDiAppoggio = new String[0];


    public static void main(String[] args) {

        do {
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
            programContinue= true;
        } while (programContinue);

    }

    public static String[] splitFraseInParole() {
        String input = JOptionPane.showInputDialog(null, "Inserisci la frase");
        String[] arrayParole = input.split(" ");
        return arrayParole;
    }

    public static String[] addString(String[] strings, String[] strings1) {
        int currentLenght = strings.length;
        String[] stringArrayNew = Arrays.copyOf(strings, currentLenght + strings1.length);
        System.arraycopy(strings1, 0, stringArrayNew, strings.length, strings1.length);
        return stringArrayNew;
    }
}