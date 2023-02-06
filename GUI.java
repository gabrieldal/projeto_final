import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    
    private GridLayout gridLayout = new GridLayout(1, 3);
    private JPanel panel;
    private JTextArea areaI, areaD;
    private JScrollPane scrollI, scrollD;
    private JLabel ACLabel,PCLabel;
    private JTextField ACField, PCField;
    private JButton botaoADD, botaoSTA, botaoLDA;
    private JLabel dataLabel, registerLabel;
    private JTextField dataField, registerField;


    private int PC = 0;
    private Registrador AC = new Registrador();
    private Conversor conversor = new Conversor();
    private Somador8bit ULA = new Somador8bit();

    MemInstrucoes memInstrucoes = new MemInstrucoes();
    MemDados memDados = new MemDados();

    public GUI(){
        Container janela = getContentPane();
        setTitle("Simulador de Processador Neander");
        setSize(800, 600);
        setLayout(gridLayout);

        areaI = new JTextArea(memInstrucoes.getInstructions());
        scrollI = new JScrollPane(areaI);
        janela.add(scrollI);
        

        panel = new JPanel();
        panel.setLayout(new GridLayout(11, 1));
        
        PCLabel = new JLabel("PC");
        String pcString = Integer.toString(PC);
        PCField = new JTextField(pcString);
        PCField.setEditable(false);
        panel.add(PCLabel);
        panel.add(PCField);

        ACLabel = new JLabel("AC");
        int ac = conversor.binarioParaDecimal(AC.getReg());
        String acString = Integer.toString(ac);
        ACField = new JTextField(acString);
        ACField.setEditable(false);
        panel.add(ACLabel);
        panel.add(ACField);

        botaoADD = new JButton("ADD");
        botaoADD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                int data = Integer.parseInt(dataField.getText()); //converte o valor do campo de texto para decimal
                ULA.processamento(AC.getReg(), conversor.decimalParaBinario(data)); //processa a soma
                AC.setReg(ULA.getResultado()); //seta o resultado no registrador AC
                PC++;
                int register = Integer.parseInt(registerField.getText());

                int result = ac + data;

                AC.setReg(conversor.decimalParaBinario(result));

                //memDados.setMemDados(data, conversor.decimalParaBinario(result));

                String acString = Integer.toString(result);

                ACField.setText(acString);

                areaD.setText(memDados.getDatas());
            	janela.validate();
            }
        });
        botaoSTA = new JButton("STA");
        botaoLDA = new JButton("LDA");
        panel.add(botaoADD);
        panel.add(botaoSTA);
        panel.add(botaoLDA);
        
        registerLabel = new JLabel("Posição da memória de instruções: ");
        registerField = new JTextField();
        panel.add(registerLabel);
        panel.add(registerField);

        dataLabel = new JLabel("Valor");
        dataField = new JTextField();
        panel.add(dataLabel);
        panel.add(dataField);


        janela.add(panel);

        areaD = new JTextArea(memDados.getDatas());
        scrollD = new JScrollPane(areaD);
        janela.add(scrollD);
        
        



        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setVisible(true);
    }

}
