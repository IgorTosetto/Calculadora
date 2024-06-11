package Calculadora;
import javax.swing.JOptionPane;

public class Continuar {
    public Continuar(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja continuar a conta: " + 
                "\n1 - Sim" + 
                "\n2 - Não", "Calculadora", JOptionPane.QUESTION_MESSAGE));
        
        if(opcao == 1){
            int opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja continuar com o resultado dessa conta: " + 
                "\n1 - Sim" + 
                "\n2 - Não", "Calculadora", JOptionPane.QUESTION_MESSAGE));
            
            if(opcao2 == 1){
                int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção que queira calcular usando o resultado anterior: " + 
                "\n1 - Somar" + 
                "\n2 - Subtrair" + 
                "\n3 - Dividir" + 
                "\n4 - Multiplicar" +
                "\n0 - Encerrar programa", "Calculadora", JOptionPane.QUESTION_MESSAGE));
                
                if(b == 1){
                    SomarC somarC = new SomarC();
                }
                else if(b == 2){
                    SubtrairC subtrairC = new SubtrairC();
                }
                else if(b == 3){
                    DividirC dividirC = new DividirC();
                }
                else if(b == 4){
                    MultiplicarC multiplicarC = new MultiplicarC();
                }
                else if(b == 0){
                    System.exit(0);
                }
            }
            else if(opcao2 == 2){
                int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção que queira calcular:" + 
                "\n1 - Somar" + 
                "\n2 - Subtrair" + 
                "\n3 - Dividir" + 
                "\n4 - Multiplicar" +
                "\n0 - Encerrar programa", "Calculadora", JOptionPane.QUESTION_MESSAGE));
                
                if(c == 1){
                    Somar somar = new Somar();
                }
                else if(c == 2){
                    Subtrair subtrair = new Subtrair();
                }
                else if(c == 3){
                    Multiplicar mutiplicar = new Multiplicar();
                }
                else if(c == 4){
                    Dividir dividir = new Dividir();
                }
                else if(c == 0){
                    System.exit(0);
                }
            }
        }
        else if(opcao == 2){
            System.exit(0);
        }
    }
}