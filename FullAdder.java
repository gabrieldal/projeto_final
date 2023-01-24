import java.util.Scanner;

public class FullAdder {
    private char A, B, Cin;
    private HalfAdder halfAdder2;


    public FullAdder(char A, char B, HalfAdder halfAdder2, char Cin) {
        this.A = A;
        this.B = B;
        this.halfAdder2 = halfAdder2;
        this.Cin = Cin; 
    }

    public int SumOUT(char A, char B, char Cin) {
        return halfAdder2.SumOUT(A, B);
    }

    public int CarryOUT(char A, char B, char Cin) {
        return halfAdder2.CarryOUT(A, B);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        char A = ler.next().charAt(0);
        System.out.print("Digite o valor de B: ");
        char B = ler.next().charAt(0);
        System.out.print("Digite o valor de Cin: ");
        char Cin = ler.next().charAt(0);
        PortaAnd portaAnd = new PortaAnd(A, B);
        PortaXor portaXor = new PortaXor(A, B);
        HalfAdder halfAdder = new HalfAdder(A, B, portaAnd, portaXor);
        FullAdder fullAdder = new FullAdder(A, B, halfAdder, Cin);
        System.out.println("Soma: " + fullAdder.SumOUT(A, B, Cin));
        System.out.println("Carry: " + fullAdder.CarryOUT(A, B, Cin));
        

    }
}

