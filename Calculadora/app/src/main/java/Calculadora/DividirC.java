package Calculadora;
import javax.swing.JOptionPane;

public class DividirC {
    private int valor3;
    private int dividirC;
    int d;
    
    public DividirC(){
        valor3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o próximo valor: ", "Divisão", JOptionPane.QUESTION_MESSAGE));

        dividirC = d / valor3;
        
        JOptionPane.showMessageDialog(null, d + " / " + valor3 + " = " + dividirC, "Divisão", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int getValor3(){
        return valor3;
    }
    
    public void setValor3(){
        this.valor3 = valor3;
    }
    
    public int getDividirC(){
        return dividirC;
    }
    
    public void setDividirC(){
        this.dividirC = dividirC;
    }
}