package Calculadora;
import javax.swing.JOptionPane;

public class SomarC {
    private int valor3;
    private int somaC;
    int s;
    
    public SomarC(){
        valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o próximo valor: ", "Soma", JOptionPane.QUESTION_MESSAGE));

        somaC = s + valor3;
        
        JOptionPane.showMessageDialog(null, s + " + " + valor3 + " = " + somaC, "Soma", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int getValor3(){
        return valor3;
    }
    
    public void setValor3(){
        this.valor3 = valor3;
    }
    
    public int getSomaC(){
        return somaC;
    }
    
    public void setSomaC(){
        this.somaC = somaC;
    }
}