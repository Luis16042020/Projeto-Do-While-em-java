package projetodowhile;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ProjetoDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade; 
        String cargo;
        int contador = 1;
        int A=0, B=0, C=0, D=0, E=0, x = 0, y = 0, z = 0;
        float porcentagem = 0;
        double media = 0;
        JOptionPane.showMessageDialog(null,"Obrigado por assistir o filme. Pedimos sua colabora��o"
                + " com a pesquisa de satisfa��o");
        do {
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
        x = x+idade;
        cargo = JOptionPane.showInputDialog("Avalie o filme. Sendo: A - �timo/ B - Bom/ C - Regular/ "
                + "D - Ruim/ E - P�ssimo");
        
        while (!cargo.equals("A")&&!cargo.equals("B")&&!cargo.equals("C")&&!cargo.equals("D")&&!cargo.equals("E")){
        JOptionPane.showMessageDialog(null, "Avalia��o incorreta.");
        cargo = JOptionPane.showInputDialog("Informe novamente. A - �timo/ B - Bom/ C - Regular/ D - Ruim/ E - P�ssimo.");
        }
        if (cargo.equals("A")){
            A = (A+1);
            JOptionPane.showMessageDialog(null,"Obrigado pela avalia��o!");
        }else if(cargo.equals("B")){
            B = (B+1);
            JOptionPane.showMessageDialog(null,"Obrigado pela avalia��o!");
        }else if(cargo.equals("C")){
            C = (C+1);
            JOptionPane.showMessageDialog(null,"Obrigado pela avalia��o!");
        }else if(cargo.equals("D")){
            D = (D+1);
            z = z+idade;
            media = (z/D);
            JOptionPane.showMessageDialog(null,"Obrigado pela avalia��o!");
        }else if(cargo.equals("E")){
            E = (E+1);
            y = y+idade;
            porcentagem = ((E*100)/contador);
            JOptionPane.showMessageDialog(null,"Obrigado pela avalia��o");
           }
        contador++;
        }while(contador<=100);    
        contador--;
        

        JOptionPane.showMessageDialog(null,"A op��o A(�timo) foi escolhida " + A + " vezes");
        JOptionPane.showMessageDialog(null,"A m�dia de idade de pessoas que avaliaram o filme ruim foi:" + media + "anos");
        JOptionPane.showMessageDialog(null,"A porcentagem de pessoas que votaram E(P�ssimo) foi: " + porcentagem + "%");
        JOptionPane.showMessageDialog(null, z + "/" + D);
    }
    
}
