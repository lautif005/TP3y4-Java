import javax.swing.*;
import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {
        String empleados_str = JOptionPane.showInputDialog("Ingrese la cantidad de empleados:");
        int empleados = Integer.parseInt(empleados_str);
        int salario;
        for (int i = 0; i <= empleados; i++) {
            String horas_str = JOptionPane.showInputDialog("Ingrese las horas trabajadas del empleado " + (i+1));
            int horas = Integer.parseInt(horas_str);
            salario = horas * 15;
            JOptionPane.showMessageDialog(null, "El empleado " + (i+1) + " cobra " + salario);
        }

    }
}