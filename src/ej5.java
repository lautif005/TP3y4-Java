import javax.swing.*;

public class ej5 {
    public static void main(String[] args) {
        String empleados_str = JOptionPane.showInputDialog("Ingrese la cantidad de empleados");
        int empleados = Integer.parseInt(empleados_str);
        int contador = 1;
        do {
            String horas_str = JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas por el empleado " + contador);
            int horas = Integer.parseInt(horas_str);
            int extras = horas - 40;
            if (extras > 0) {
                JOptionPane.showMessageDialog(null, "El empleado " + contador + " trabaja " + extras + " horas extras");
            } else {
                JOptionPane.showMessageDialog(null, "El empleado " + contador + " no trabaja horas extras");
            }
            contador += 1;
        } while (contador <= empleados);
    }
}
