package Calculadora;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção que queira calcular:" + 
                "\n1 - Somar" + 
                "\n2 - Subtrair" + 
                "\n3 - Dividir" + 
                "\n4 - Multiplicar" +
                "\n0 - Encerrar programa", "Calculadora", JOptionPane.QUESTION_MESSAGE));
        
            if(opcao == 1){
                Somar somar = new Somar();
                
                Continuar continuar = new Continuar();
            }
            else if(opcao == 2){
                Subtrair subtrair = new Subtrair();
                
                Continuar continuar = new Continuar();
            }
            else if(opcao == 3){
                Multiplicar mutiplicar = new Multiplicar();
                
                Continuar continuar = new Continuar();
            }
            else if(opcao == 4){
                Dividir dividir = new Dividir();
                
                Continuar continuar = new Continuar();
            }
            else if(opcao == 0){
                System.exit(0);
            }
    }
}