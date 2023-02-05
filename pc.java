public class pc {
    private char[] contador = new char[8];
    private char[] contador2 = new char[8];
    private char[] umBinario = {'0', '0', '0', '0', '0', '0', '0', '1'};
    private Somador8bit somador8bit = new Somador8bit(contador, umBinario);

    public pc() {
        for (int i = 0; i < 8; i++) {
            contador[i] = '0';
        }
    }

    public char[] executar(char carregaPC, char incrementaPC, char vetRDM[]){
        if (carregaPC == '1') {
            contador = vetRDM;
            contador2 = contador;
        } else if (incrementaPC == '1') {
           contador2 = contador;
           contador = somador8bit.processamento(contador, contador2);
        }
        return contador;
    }

    public static void main(String[] args) {
        pc pc = new pc();
        char[] contador = pc.executar('0', '1', null);
        for (int i = 0; i < 8; i++) {
            System.out.print(contador[i]);
        }
    }
}
