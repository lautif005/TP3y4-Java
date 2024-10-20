import javax.swing.*;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;

public class ej1 {
    public static void main(String[] args) {
        String estudio_str = JOptionPane.showInputDialog("Carga horaria diaria de estudio:");
        String ejercicio_str = JOptionPane.showInputDialog("Carga horaria diaria de ejercicio:");
        String lectura_str = JOptionPane.showInputDialog("Carga horaria diaria de lectura:");
        String tiempo_libre_str = JOptionPane.showInputDialog("Carga horaria diaria de tiempo libre:");
        int estudio = Integer.parseInt(estudio_str);
        int ejercicio = Integer.parseInt(ejercicio_str);
        int lectura = Integer.parseInt(lectura_str);
        int tiempo_libre = Integer.parseInt(tiempo_libre_str);
        int suma;
        suma = 0;
        List<Integer> lista = Arrays.asList(estudio, ejercicio, lectura, tiempo_libre);
        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Estudio: " + lista.get(i));
            }
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Ejercicio: " + lista.get(i));
            }
            if (i == 2) {
                JOptionPane.showMessageDialog(null, "Lectura: " + lista.get(i));
            }
            if (i == 3) {
                JOptionPane.showMessageDialog(null, "Tiempo libre: " + lista.get(i));
            }
            suma += lista.get(i);
        }

        JOptionPane.showMessageDialog(null, "Suma total: " + suma);
    }
}
