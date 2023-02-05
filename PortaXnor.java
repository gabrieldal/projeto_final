public class PortaXnor {
    private char Entrada1;
    private char Entrada2;

    public PortaXnor(char entrada1, char entrada2) {  //construtor da classe
        Entrada1 = entrada1;
        Entrada2 = entrada2;
    }

    public int GetSaida()
    {
        if (Entrada1 == '0' && Entrada2 == '0') {
            return 1;
        } else if (Entrada1 == '1' && Entrada2 == '0'){
            return 0;
        } else if (Entrada1 == '0' && Entrada2 == '1'){
            return 0;
        } else {
            return 1;
        }
    }
    
}