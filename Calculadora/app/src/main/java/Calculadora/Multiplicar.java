package Calculadora;
import javax.swing.JOptionPane;

public class Multiplicar {
    private int valor1;
    private int valor2;
    private int multiplicacao;
    
    public Multiplicar(){
        valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor: ", "Multiplicação", JOptionPane.QUESTION_MESSAGE));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor: ", "Multiplicação", JOptionPane.QUESTION_MESSAGE));
        
        multiplicacao = valor1 * valor2;
        
        JOptionPane.showMessageDialog(null, valor1 + " * " + valor2 + " = " + multiplicacao, "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int getValor1(){
        return valor1;
    }
    
    public void setValor1(){
        this.valor1 = valor1;
    }
    
    public int getValor2(){
        return valor2;
    }
    
    public void setValor2(){
        this.valor2 = valor2;
    }
    
    public int getMultiplicacao(){
        return multiplicacao;
    }
    
    public void setMultiplicacao(){
        this.multiplicacao = multiplicacao;
    }
}