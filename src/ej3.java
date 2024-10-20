import javax.swing.*;

public class ej3 {
    public static void main(String[] args) {
        String productos_str = JOptionPane.showInputDialog("Ingrese el número de productos: ");
        int productos = Integer.parseInt(productos_str);
        int contador = 0;
        while (contador <= productos) {
            contador += 1;
            String cantidad_productos_str = JOptionPane.showInputDialog("Ingrese la cantidad del producto " + contador);
            int cantidad_productos = Integer.parseInt(cantidad_productos_str);
            if (cantidad_productos < 5) {
                JOptionPane.showMessageDialog(null, "Debe reponer el producto");
            } else {
                JOptionPane.showMessageDialog(null, "No debe reponer el producto aún");
            }

        }
    }
}
