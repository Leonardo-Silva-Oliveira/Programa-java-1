
package exercicio1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* author Leo */
public class Exercicio1 extends JFrame implements ActionListener{
JLabel lbllargura, lblprofundidade, lblcomprimento,lblresultado;
JTextField txtlargura, txtprofundidade, txtcomprimento,txtresultado;
JButton btnresultado, btnlimpar, btnsair;

    public static void main(String[] args) {
        JFrame janela = new Exercicio1();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    Exercicio1()
    {
        setTitle("Calculo do preço da obra");
        setBounds(300,50,350,90);
        getContentPane().setBackground(new Color(192,192,192));
        getContentPane().setLayout(new GridLayout(3,4));
        
        lbllargura = new JLabel("Largura");
        lbllargura.setForeground(Color.black);
        lbllargura.setFont(new Font(" ",Font.BOLD, 14));
        lblprofundidade = new JLabel ("profundidade");
        lblprofundidade.setForeground(Color.black);
        lblprofundidade.setFont(new Font(" ",Font.BOLD, 14));
        lblcomprimento = new JLabel ("comprimento");
        lblcomprimento.setForeground(Color.black);
        lblcomprimento.setFont(new Font(" ",Font.BOLD, 14));
        lblresultado = new JLabel("Preço");
        lblresultado.setForeground(Color.black);
        lblresultado.setFont(new Font(" ",Font.BOLD, 14));
        
        btnresultado = new JButton("Calcular");  btnresultado.addActionListener(this);
        btnlimpar = new JButton("Limpar");  btnlimpar.addActionListener(this);
        btnsair = new JButton("Sair"); btnsair.addActionListener(this);
        
        txtlargura = new JTextField();
        txtprofundidade = new JTextField();
        txtcomprimento = new JTextField();
        txtresultado = new JTextField();
        txtresultado.setEditable(false);
        
        getContentPane().add(lbllargura);
        getContentPane().add(lblprofundidade);
        getContentPane().add(lblcomprimento);
        getContentPane().add(lblresultado);
        getContentPane().add(txtlargura);
        getContentPane().add(txtprofundidade);
        getContentPane().add(txtcomprimento);
        getContentPane().add(txtresultado);
        getContentPane().add(btnresultado);
        getContentPane().add(btnlimpar);
        getContentPane().add(btnsair);   
    }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==btnsair)
            {
                System.exit(0);
            }
            if(e.getSource()==btnlimpar)
            {
                txtlargura.setText("");
                txtprofundidade.setText("");
                txtcomprimento.setText("");
                txtresultado.setText("");
                return;
            }
            double largura=0, profundidade=0, comprimento=0,resultado=0;
            try
            {
                largura = Double.parseDouble(txtlargura.getText());
                profundidade = Double.parseDouble(txtprofundidade.getText());
                comprimento = Double.parseDouble(txtcomprimento.getText());
            }
            catch(NumberFormatException erro)
            {
                txtresultado.setText("Só números");
                return;
            }
            if(e.getSource()==btnresultado) resultado = ((largura*comprimento*profundidade)*300);
            txtresultado.setText(" " + resultado );
        }
}
