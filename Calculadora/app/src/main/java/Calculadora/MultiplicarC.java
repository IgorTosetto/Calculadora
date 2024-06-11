package Calculadora;
import javax.swing.JOptionPane;

public class MultiplicarC {
    private int valor3;
    private int multiplicacaoC;
    int m;
    
    public MultiplicarC(){
        valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o próximo valor: ", "Multiplicação", JOptionPane.QUESTION_MESSAGE));

        multiplicacaoC = m * valor3;
        
        JOptionPane.showMessageDialog(null, m + " * " + valor3 + " = " + multiplicacaoC, "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int getValor3(){
        return valor3;
    }
    
    public void setValor3(){
        this.valor3 = valor3;
    }
    
    public int getMultiplicacaoC(){
        return multiplicacaoC;
    }
    
    public void setMultiplicacaoC(){
        this.multiplicacaoC = multiplicacaoC;
    }
}