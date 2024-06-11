package Calculadora;
import javax.swing.JOptionPane;

public class Somar {
    private int valor1;
    private int valor2;
    private int soma;
    
    public Somar(){
        valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor: ", "Soma", JOptionPane.QUESTION_MESSAGE));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor: ", "Soma", JOptionPane.QUESTION_MESSAGE));
        
        soma = valor1 + valor2;
        
        JOptionPane.showMessageDialog(null, valor1 + " + " + valor2 + " = " + soma, "Soma", JOptionPane.INFORMATION_MESSAGE);
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
    
    public int getSoma(){
        return soma;
    }
    
    public void setSoma(){
        this.soma = soma;
    }
}