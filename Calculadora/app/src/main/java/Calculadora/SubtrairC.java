package Calculadora;
import javax.swing.JOptionPane;

public class SubtrairC {
    private int valor3;
    private int subtracaoC;
    int s;
    
    public SubtrairC(){
        valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o próximo valor: ", "Subtração", JOptionPane.QUESTION_MESSAGE));

        subtracaoC = s - valor3;
        
        JOptionPane.showMessageDialog(null, s + " - " + valor3 + " = " + subtracaoC, "Subtração", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int getValor3(){
        return valor3;
    }
    
    public void setValor3(){
        this.valor3 = valor3;
    }
    
    public int getSubtracaoC(){
        return subtracaoC;
    }
    
    public void setSubtracaoC(){
        this.subtracaoC = subtracaoC;
    }
}