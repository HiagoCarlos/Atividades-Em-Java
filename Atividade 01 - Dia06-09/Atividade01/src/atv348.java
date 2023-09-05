import javax.swing.JOptionPane;

public class atv348 {
    public static void main(String[] args) throws Exception {
        String[] nome = new String[5]; 
        int[] nota1 = new int[5];
        int[] nota2 = new int[5];
        for (int i = 0; i < 5; i++) {
            
            nome[i] = JOptionPane.showInputDialog("Informe o nome do aluno " + (i + 1));
            nota1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota 1 do aluno " + (i + 1)));
            nota2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota 2 do aluno " + (i + 1)));
        }

        for (int i = 0; i < 5; i++) {
         
            JOptionPane.showMessageDialog(null, "O nome do aluno " + (i + 1) + " é: " + nome[i]);
            JOptionPane.showMessageDialog(null, "A nota 1 do aluno " + (i + 1) + " é: " + nota1[i]);
            JOptionPane.showMessageDialog(null, "A nota 2 do aluno " + (i + 1) + " é: " + nota2[i]);
        }
 
    }
}
