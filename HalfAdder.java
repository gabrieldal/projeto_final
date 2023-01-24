import java.util.Scanner;

public class HalfAdder {
    private char A, B;
    private PortaAnd portaAnd;
    private PortaXor portaXor;


    public HalfAdder(char A, char B, PortaAnd portaAnd, PortaXor portaXor) {
        this.A = A;
        this.B = B;
        this.portaAnd = portaAnd;
        this.portaXor = portaXor;
    }

    public int SumOUT(char A, char B) {
        return portaXor.GetSaida();
    }

    public int CarryOUT(char A, char B) {
        return portaAnd.GetSaida();
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        char A = ler.next().charAt(0);
        System.out.print("Digite o valor de B: ");
        char B = ler.next().charAt(0);
        PortaAnd portaAnd = new PortaAnd(A, B);
        PortaXor portaXor = new PortaXor(A, B);
        HalfAdder halfAdder = new HalfAdder(A, B, portaAnd, portaXor);
        System.out.println("Soma: " + halfAdder.SumOUT(A, B));
        System.out.println("Carry: " + halfAdder.CarryOUT(A, B));


    }




}
