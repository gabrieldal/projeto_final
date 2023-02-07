import portas.*;

public class Comparador {
    private boolean resultado;
    private PortaXnor Xnor1, Xnor2, Xnor3, Xnor4, Xnor5, Xnor6, Xnor7, Xnor8;
    private PortaAnd And1, And2, And3, And4, And5, And6, And7;
    
    public Comparador(){
        
    }

    public void processamento(char[] operando1, char[] operando2) {
        Xnor1 = new PortaXnor(operando1[7], operando2[7]);
        Xnor2 = new PortaXnor(operando1[6], operando2[6]);
        Xnor3 = new PortaXnor(operando1[5], operando2[5]);
        Xnor4 = new PortaXnor(operando1[4], operando2[4]);
        Xnor5 = new PortaXnor(operando1[3], operando2[3]);
        Xnor6 = new PortaXnor(operando1[2], operando2[2]);
        Xnor7 = new PortaXnor(operando1[1], operando2[1]);
        Xnor8 = new PortaXnor(operando1[0], operando2[0]);
        
        And1 = new PortaAnd(Xnor1.GetSaida(), Xnor2.GetSaida());
        And2 = new PortaAnd(And1.GetSaida(), Xnor3.GetSaida());
        And3 = new PortaAnd(And2.GetSaida(), Xnor4.GetSaida());
        And4 = new PortaAnd(And3.GetSaida(), Xnor5.GetSaida());
        And5 = new PortaAnd(And4.GetSaida(), Xnor6.GetSaida());
        And6 = new PortaAnd(And5.GetSaida(), Xnor7.GetSaida());
        And7 = new PortaAnd(And6.GetSaida(), Xnor8.GetSaida());
        
        if (And7.GetSaida() == '1') {
            resultado = true;
        } else {
            resultado = false;
        }
    } 

    public static void main(String args[]){
        char[] operando1 = {'0', '0', '0', '1', '0', '0', '0', '0'};
        char[] operando2 = {'0', '0', '0', '1', '0', '0', '0', '0'};
        Comparador comparador = new Comparador();
        comparador.processamento(operando1, operando2);
        System.out.println(comparador.resultado);
    }
}
