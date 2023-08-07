import javax.swing.*;

public class Main {
    public static void main(String[] args) {
           double a, b, c, x1, x2;

            a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de a:"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de b:"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de c:"));

            x1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            x2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

            JOptionPane.showMessageDialog(null,"O valor de x1 é: "+ x1 +
                    " e o valor de x2 é: "+ x2);

    }
    }
