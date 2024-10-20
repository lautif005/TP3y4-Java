import javax.swing.*;

public class ej4 {
    public static void main(String[] args) {
        int contador_dias = 1;
        int suma_total = 0;
        while (contador_dias <= 7) {
            String ventas_str = JOptionPane.showInputDialog("Ingrese la cantidad de ventas del día " + contador_dias);
            int ventas = Integer.parseInt(ventas_str);
            int suma_parcial = 0;
            int contador_ventas = 1;
            contador_dias += 1;
            while (contador_ventas <= ventas) {
                String ingreso_str = JOptionPane.showInputDialog("Ingreso por la " + (contador_ventas) + "º venta");
                int ingreso = Integer.parseInt(ingreso_str);
                suma_total += ingreso;
                suma_parcial += ingreso;
                contador_ventas += 1;
            }
            JOptionPane.showMessageDialog(null, "El día " + (contador_dias-1) + " hubo un ingreso de " + suma_parcial);

        }
        JOptionPane.showMessageDialog(null, "El ingreso total de la semana fue de: " + suma_total);
    }
}
