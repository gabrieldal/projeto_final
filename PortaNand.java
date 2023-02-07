package portas;
public class PortaNand {
    private char Entrada1;
    private char Entrada2;

    public PortaNand(char entrada1, char entrada2) {  //construtor da classe
        Entrada1 = entrada1;
        Entrada2 = entrada2;
    }

    public char GetSaida() {
        if(Entrada1 == '0' && Entrada2 == '0') {
            return '1';
        } else if(Entrada1 == '1' && Entrada2 == '0') {
            return '1';
        } else if(Entrada1 == '0' && Entrada2 == '1') {
            return '1';
        } else {
            return '0';
        }
    }
}
