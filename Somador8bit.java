public class Somador8bit {
    private char Operando1[], Operando2[];
    private char Resultado[];
    private Registrador registrador;
    private FullAdder fullAdder, fullAdder2, fullAdder3, fullAdder4, fullAdder5, fullAdder6, fullAdder7, fullAdder8;

    public Somador8bit(char[] operando1, char[] operando2) {
        Operando1 = operando1;
        Operando2 = operando2;
        Resultado = new char[8];
    }

    public void processamento(char[] operando1, char[] operando2) {
        fullAdder = new FullAdder(operando1[0], operando2[0], '0');
        Resultado[0] = fullAdder.SumOUT();
        fullAdder2 = new FullAdder(operando1[1], operando2[1], fullAdder.CarryOUT());
        Resultado[1] = fullAdder2.SumOUT();
        fullAdder3 = new FullAdder(operando1[2], operando2[2], fullAdder2.CarryOUT());
        Resultado[2] = fullAdder3.SumOUT();
        fullAdder4 = new FullAdder(operando1[3], operando2[3], fullAdder3.CarryOUT());
        Resultado[3] = fullAdder4.SumOUT();
        fullAdder5 = new FullAdder(operando1[4], operando2[4], fullAdder4.CarryOUT());
        Resultado[4] = fullAdder5.SumOUT();
        fullAdder6 = new FullAdder(operando1[5], operando2[5], fullAdder5.CarryOUT());
        Resultado[5] = fullAdder6.SumOUT();
        fullAdder7 = new FullAdder(operando1[6], operando2[6], fullAdder6.CarryOUT());
        Resultado[6] = fullAdder7.SumOUT();
        fullAdder8 = new FullAdder(operando1[7], operando2[7], fullAdder7.CarryOUT());
        Resultado[7] = fullAdder8.SumOUT();

    }

    public char[] GetResultado() {
        return Resultado;
    }

    public static void main(String[] args) {
        char[] operando1 = {'0', '0', '1', '1', '0', '0', '0', '0'};
        char[] operando2 = {'0', '0', '0', '1', '0', '0', '0', '0'};
        Somador8bit somador8bit = new Somador8bit(operando1, operando2);
        somador8bit.processamento(operando1, operando2);
       //System.out.println(somador8bit.GetResultado());


        Registrador registrador = new Registrador();
        registrador.setReg(somador8bit.GetResultado());
        System.out.println(registrador.getReg()); //printa o resultado do somador usando o regitrador
    }



}
